import sys, json, distances_from_address


def main():
    with open(sys.argv[1]) as json_file:
        driver = json.load(json_file)
    with open(sys.argv[2]) as json_file:
        hitchhiker = json.load(json_file)
    # print(hitchhiker)
    dri_org = driver['origin_address']
    hitch_org = hitchhiker['origin_address']
    dri_dest = driver['destination_address']
    hitch_dest = hitchhiker['destination_address']
    org_list_names = [dri_org, hitch_org, hitch_dest]
    dest_list_names = [hitch_dest, hitch_org, dri_dest]
    org_list = list(map(distances_from_address.from_address_to_coordinates, org_list_names))
    dest_list = list(map(distances_from_address.from_address_to_coordinates, dest_list_names))
    return(distances_from_address.distances(org_list, dest_list, org_list_names, dest_list_names))


if __name__ == "__main__":
    print(main())
