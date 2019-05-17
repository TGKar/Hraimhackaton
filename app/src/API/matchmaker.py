import sys, json, distances_from_address, datetime


def main():
    # print(hitchhiker)
    dri_org = sys.argv[1]
    hitch_org = sys.argv[2]
    hitch_dest = sys.argv[3]
    dri_dest = sys.argv[4]
    time = timeparsing(sys.argv[5])
    org_list_names = [dri_org, hitch_org, hitch_dest]
    dest_list_names = [hitch_dest, hitch_org, dri_dest]
    org_list = list(map(distances_from_address.from_address_to_coordinates, org_list_names))
    dest_list = list(map(distances_from_address.from_address_to_coordinates, dest_list_names))
    return distances_from_address.distances(org_list, dest_list, org_list_names, dest_list_names, departure_time=time)


def timeparsing(time):
    now = datetime.date.today()
    time = datetime.datetime(now.year, now.month, now.day, int(time[0:2]), int(time[3:]))
    return time


if __name__ == "__main__":
    print(main())
