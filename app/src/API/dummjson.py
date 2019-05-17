import json

dic = {}
dic['name'] = "name mcnameson"
dic['phone_number'] = "0527239292"
dic['depart_time'] = "12:30#18:30"
dic['origin_address'] = "דרך החורש 55, ירושלים"
dic['destination_address'] = "עזרא הסופר 15, אפרת"
dic['comment'] = "בחור נאה וחייכני מחפש את ההסעה האחת שלו"

# dic['name'] = "hitch mChiker"
# dic['phone_number'] = "0506223930"
# dic['depart_time'] = "14:30#21:30"
# dic['origin_address'] = "המגלית 6"
# dic['destination_address'] = "יהונתן 52, אלעזר"
# dic['comment'] = "בחורונות כובשת ומצחיקולית עם לב מיצי"


jsonarray = json.dumps(dic, ensure_ascii=False)
print(jsonarray)
with open('driver.json', 'w') as outfile:
    json.dump(dic, outfile,ensure_ascii=False)
