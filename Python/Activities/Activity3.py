
player1 = str(input("Enter the Player1 Name : "))
player2 = str(input("Enter the Player2 Name : "))

player1_choice = str(input("Rock, Paper or Scissor - Player1 Choice : ").capitalize().strip())
player2_choice = str(input("Rock, Paper or Scissor - Player2 Choice : ").capitalize().strip())

if (player1_choice != "Rock" and player1_choice != "Paper" and player1_choice != "Scissor"):
    print ("Player1 not selected any valid choice among Rock, Paper and Scissor")
    if (player2_choice != "Rock" and player2_choice != "Paper" and player2_choice != "Scissor"):
        print ("Player2 not selected any valid choice among Rock, Paper and Scissor")

elif (player1_choice == "Rock"):
    if (player2_choice == "Paper"):
        print ("Player 2 wins by choosing "+player2_choice+" when Player1 chose "+player1_choice)
    elif (player2_choice == "Scissor"):
        print ("Player 1 wins by choosing "+player1_choice+" when Player2 chose "+player2_choice)
    elif (player2_choice == "Rock"):
        print ("Game is a tie since both players selected same choice : "+player1_choice)
    else:
        print ("Player2 not selected any valid choice among Rock, Paper and Scissor")

elif (player1_choice == "Paper"):
    if (player2_choice == "Scissor"):
        print ("Player 2 wins by choosing "+player2_choice+" when Player1 chose "+player1_choice)
    elif (player2_choice == "Rock"):
        print ("Player 1 wins by choosing "+player1_choice+" when Player2 chose "+player2_choice)
    elif (player2_choice == "Paper"):
        print ("Game is a tie since both players selected same choice : "+player1_choice)
    else:
        print ("Player2 not selected any valid choice among Rock, Paper and Scissor")

elif (player1_choice == "Scissor"):
    if (player2_choice == "Rock"):
        print ("Player 2 wins by choosing "+player2_choice+" when Player1 chose "+player1_choice)
    elif (player2_choice == "Paper"):
        print ("Player 1 wins by choosing "+player1_choice+" when Player2 chose "+player2_choice)
    elif (player2_choice == "Scissor"):
        print ("Game is a tie since both players selected same choice : "+player1_choice)
    else:
        print ("Player2 not selected any valid choice among Rock, Paper and Scissor")