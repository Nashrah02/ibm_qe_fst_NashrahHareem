while True:
    a = input("enter your choice from R,P,S: ").lower()
    b = input("enter your suitable choice from R,P,S: ").lower()

    if a == b:
        print("It's a tie")
    elif (a == "r" and b == "s") or (a == "s" and b == "p") or (a == "p" and b == "r"):
        print("A is the winner")
    else:
        print("B is the winner")

    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if repeat != "yes":
        print("Game over  ")
        break
