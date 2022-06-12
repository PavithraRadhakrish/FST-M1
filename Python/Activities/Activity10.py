num_tuple = tuple(int(x) for x in input ("Enter the tuple of numbers :  ").split(","))
print ("Tuple of numbers given by user : ",num_tuple)
print ("Numbers divisible by 5 from tuple are : ")
for num in num_tuple:
    if(num % 5 == 0):
        print (num)
    else:
        continue
 # Method 2 - return all numbers divisible by 5 as a  new tuple
#num_tuple = tuple(int(x) for x in input ("Enter the tuple of numbers :  ").split(","))
#print ("Tuple of numbers given by user : ",num_tuple)
#num_divisible_by_5_tuple = ()
#for num in num_tuple:
#    if(num % 5 == 0):
#        num_divisible_by_5_tuple = num_divisible_by_5_tuple+(num,)
#    else:
#        continue
#print ("Numbers divisible by 5 from original tuple are : ",num_divisible_by_5_tuple)