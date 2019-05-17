import sys, distances_from_address, googlemaps, requests, datetime

key = "AIzaSyAEHTSZEzQwESBwfytqs2LT2Q699SSolVg"
gmaps = googlemaps.Client(key=key)
GOOGLE_MAPS_API_URL = "https://www.google.com/maps/dir/?api=1"


# GOOGLE_MAPS_API_URL="http://com.google.android.apps.maps"

# https://www.google.com/maps/dir/?api=1&parameters
def timeparsing(time):
    now = datetime.date.today()
    time=datetime.datetime(now.year,now.month,now.day,int(time[0:2]),int(time[3:]))
    return time


def main():
    org = sys.argv[1]
    final_destination = sys.argv[2]
    hitch_orig = sys.argv[3]
    hitch_dest = sys.argv[4]
    points = sys.argv[1:5]
    # print(points)
    latlng_pints = list(map(distances_from_address.from_address_to_coordinates, points))
    # print(gmaps,tesk.directions(origin=points[0],destination=points[1],waypoints=[points[2],points[3]]))
    # params = {
    #     'waypoints': [points[2], points[1]],
    #     'origin': points[0],
    #     'destination': points[3],
    # }
    params = {
        'origin': latlng_pints[0],
        'destination': latlng_pints[3],
        'waypoints': [latlng_pints[1] + "|" + latlng_pints[2]],
        "departure_time": timeparsing(sys.argv[5])
    }
    # end="31.7792358%2C+35.2233658"
    req = requests.get(GOOGLE_MAPS_API_URL, params=params)
    return req.url
    # str=str.replace("&","%26")
    # return str


if __name__ == "__main__":
    print(main())
