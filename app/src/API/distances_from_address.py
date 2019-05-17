import datetime, googlemaps, requests, json, directions, distance_matrix, sys

# include google-maps-services-python-master/googlemaps/directions.py
key = "AIzaSyAEHTSZEzQwESBwfytqs2LT2Q699SSolVg"
GOOGLE_MAPS_API_URL = 'https://maps.googleapis.com/maps/api/geocode/json'
NUM_OF_OPTION = 3
gmaps = googlemaps.Client(key=key)
NUM_OF_ORIGINS = 2


def usuful():
    params = {
        'address': "address",
        'sensor': 'false',
        'language': 'en',
        'region': 'il',
        'key': key
    }
    req = requests.get(GOOGLE_MAPS_API_URL, params=params)
    res = req.json()


# input: latitude and longitude coordinates
# output: address using Google API
def from_coordinates_to_address(latlng):
    params = {
        'latlng': latlng,
        'sensor': 'false',
        'language': 'iw',
        'region': 'il',
        'key': key,
        'submit': "Reverse Geocode"
    }
    req = requests.get(GOOGLE_MAPS_API_URL, params=params)
    res = req.json()
    res = (res['results'][0])
    res = res.get('address_components')
    for i in res:
        print(i)


# Should i add meta-data, s.a address, to the tuple?
def from_address_to_coordinates(address, rtype=str, first_pick=True):
    params = {
        'address': address,
        'sensor': 'false',
        'language': 'iw',
        'region': 'il',
        'key': key
    }
    req = requests.get(GOOGLE_MAPS_API_URL, params=params)
    res = req.json()
    # if ~first_pick:
    #     # return list with 3 best options
    #     lst = []
    #     for i in range(min(NUM_OF_OPTION, len(res['results']))):
    #         loc = res['results'][i].get('geometry').get('location')
    #         if rtype == str:
    #             lst.append(str(loc["lat"]) + ", " + str(loc["lng"]))
    #         else:
    #             lst.append((loc["lat"], loc["lng"]))
    #     return lst
    res = (res['results'][0])
    geomtry = res.get('geometry')
    loc = geomtry.get('location')
    if rtype == str:
        return str(loc["lat"]) + ", " + str(loc["lng"])
    return loc["lat"], loc["lng"]


# from_coordinates_to_address("31.807726, 35.200620")
# addresses = ["האוניברסיטה העברית גבעת רם", "הרצל 114, ירושלים", "בן מימון 7, ירושלים", "ברל כצנלסון 47, כפר סבא",
#              "עזרא הסופר 15, אפרת"]
# coords = map(from_address_to_coordinates, addresses)
# print(list(addresses))
# num_of_dest = len(addresses) - NUM_OF_ORIGINS
#
# orig_list = addresses[0:NUM_OF_ORIGINS]
# dest_list = addresses[NUM_OF_ORIGINS:]
# x = distance_matrix.distance_matrix(gmaps, origins=orig_list, destinations=dest_list)
#
# for i in range(len(orig_list)):
#     for j in range(len(dest_list)):
#         dist = x['rows'][i]['elements'][j]['distance']['value'] / 1000
#         time = round(x['rows'][i]['elements'][j]['duration']['value'] / 60)
#         print("the distance between ", addresses[i], "and", addresses[len(dest_list) - 1 +j], " is:", time, "minutes")

def distances(orig_list, dest_list, org_names, dest_names, departure_time=0):
    """

    :param orig_list: origin destination, a list with 2 parameters in (lat,lng) format
    :param dest_list: same, with destination
    :param departure_time: self explanatory
    :return: list of tuples, in 0 place: distance and time for solo driving. in 1, the time with the detour,
     in 3- the time with transit for the hitchhiker
    """
    matrix_driving = distance_matrix.distance_matrix(gmaps, origins=orig_list, destinations=dest_list)
    matrix_transit = distance_matrix.distance_matrix(gmaps, origins=orig_list, destinations=dest_list, mode='transit')
    return from_matrix_get_timing(matrix_driving)[0], from_matrix_get_timing(matrix_driving)[1], \
           from_matrix_get_timing(matrix_transit)[0]


def from_matrix_get_timing(matrix):
    """
    Return relevant information
    :param matrix:  distances matrix
    :return: tuple: solo driving timing, and timing with a passanger
    """
    solo_time = round(matrix['rows'][0]['elements'][2]['duration']['value'] / 60)
    driver_time_to_hitchker = round(matrix['rows'][0]['elements'][1]['duration']['value'] / 60)
    time_from_hitchker_to_dest = round(matrix['rows'][1]['elements'][0]['duration']['value'] / 60)
    time_from_hitchker_org_to_dest = round(matrix['rows'][2]['elements'][2]['duration']['value'] / 60)
    time_with_hitchker = driver_time_to_hitchker + time_from_hitchker_to_dest + time_from_hitchker_org_to_dest
    return solo_time, time_with_hitchker

# def to_string(matrix,orig_list, dest_list, org_names, dest_names, departure_time=0):
#     for i in range(len(orig_list)):
#         for j in range(len(dest_list)):
#             dist = matrix_driving['rows'][i]['elements'][j]['distance']['value'] / 1000
#             time = round(matrix_driving['rows'][i]['elements'][j]['duration']['value'] / 60)
#             print("the distance between ", org_names[i], "and", dest_names[j], " is:", dist,
#                   "and should take about", time, "minutes. also ", i, j)
