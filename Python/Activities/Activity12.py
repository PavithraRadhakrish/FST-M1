def calculate_recursive_sum (number):
    if number >= 0:
        return number + calculate_recursive_sum (number - 1)
    else:
        return 0

recursive_sum = calculate_recursive_sum (10)
print ("Recursive sum of numbers from  0 to 10 : ",recursive_sum)