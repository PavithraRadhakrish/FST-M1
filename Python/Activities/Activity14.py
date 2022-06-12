def fibonnaci (num):
    if (num > 1):
        return (fibonnaci(num-1) + fibonnaci(num-2))
    else:
        return num


fibonnaci_numbers_count = int(input("How many fibonnaci numbers to be generated : ").strip())

if fibonnaci_numbers_count > 0:
    print ("Fibonnaci numbers : ")
    for a in range (1, (fibonnaci_numbers_count + 1)):
        print(fibonnaci(a))



