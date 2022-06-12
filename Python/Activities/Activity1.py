from datetime import datetime
name = str(input("Enter your Name : "))
age = int(input("Enter your Age : "))
currentYear = datetime.today().year
yearAtAgeOf100 = int(currentYear - age)+100
print("Age of "+name+ " at the age of 100 : "+str(yearAtAgeOf100))