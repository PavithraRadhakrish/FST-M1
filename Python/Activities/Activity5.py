while True:
    number = int(input ("Enter a number to create multiplication table : "))

    for a in range (1,11):
        print (number, " x " ,a, " = " ,(number * a))

    runagain = str (input("Want to run again with different number - Yes or No: ").capitalize().strip())

    if (runagain == "Yes"):
        continue
    elif (runagain == "No"):
        raise SystemExit
    else:
        raise SystemExit