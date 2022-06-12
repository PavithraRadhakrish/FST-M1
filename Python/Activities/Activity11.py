fruits_dict = {"Apple" : 200, "Orange" : 100, "Sweet Lime": 80, "Grapes" : 120, "Pomegranate" : 90}
fruit_name_check = input("Enter the Fruit name to be checked in Fruits Dictionary : ").capitalize().strip()
if (fruit_name_check in fruits_dict):
    print("Given fruit is present in the dictionary")
else:
    print("Given fruit is not present in the dictionary")

