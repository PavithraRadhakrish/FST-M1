def sum(numbers):
    sum = 0
    for num in numbers:
        sum = sum + num
    return sum
numbers_list = [100,200,300,400]
sum_of_all_elements = sum(numbers_list)
print ("Sum of all elements in list : ", sum_of_all_elements)