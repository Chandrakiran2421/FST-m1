player1=input("Enter player 1's name: ")
player2=input("Enter player 2's name: ")

while True: 
 player1_answer=(input(player1+" Do you want to choose rock or paper or scissors? "))
 player2_answer=(input(player2+" Do you want to choose rock or paper or scissors? "))

 if player1_answer == player2_answer:
     print("Its a tie!")
 elif player1_answer == "rock" and player2_answer == "scissors":
     print(player1+" wins!")
 elif player1_answer == "paper" and player2_answer == "rock":
     print(player1+" wins!")
 elif player1_answer == "scissors" and player2_answer == "paper":
     print(player1+" wins!")
 elif player2_answer == "rock" and player1_answer == "scissors":
     print(player2+" wins!")
 elif player2_answer == "paper" and player1_answer == "rock":
     print(player2+" wins!")
 elif player2_answer == "scissors" and player1_answer == "paper":
     print(player2+" wins!")
 else:
     print("Invalid input! Please choose rock, paper, or scissors.")

 repeat = input("Do you want to play the game again? (Yes/no):")

 if repeat == "Yes":
     pass 
 elif repeat == "no":
     raise SystemExit
 else:
     print("Invalid input! Please enter 'Yes' or 'no'.")
     raise SystemExit