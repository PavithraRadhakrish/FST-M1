#nums = [10,20,30,40,50]
nums = list(input("Enter the sequence of numbers separated by comma without any space : ").split(","))
sum = 0
for num in nums:
    sum = sum + int(num)
print ("Sum of given numbers in list - ",nums, " : ",sum)
