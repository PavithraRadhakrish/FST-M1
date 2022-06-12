#numlist1 = [1,2,3,4,5,6,7,8,9,10]
#numlist2 = [11,12,13,14,15,16,17,18,19,20]

numlist1 = tuple(int(a) for a in input ("Enter the List1 of numbers separted by comma without spaces : ").split(","))
numlist2 = tuple(int(b) for b in input ("Enter the List2 of numbers separted by comma without spaces : ").split(","))
print ("Numbers in List 1 : ",numlist1)
print ("Numbers in List 2 : ",numlist2)

numlist3 = []

for num in numlist1:
    if (num % 2 != 0) :
        numlist3.append(num) #Adding only odd numbers from list1 in list3
    else:
        continue
for num in numlist2:
    if (num % 2 == 0) :
        numlist3.append(num) #Adding only even numbers from list2 in list3
    else:
        continue

print ("Numbers in List 3 which contains odd numbers from List1 & even numbers from List2 are : ",numlist3)

