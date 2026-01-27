a=input("enter your choice from R,P,S: ")
b=input("enter your suitable choice from R,P,S: ")
a=a.lower()
b=b.lower()
if a==b:
    print("its a tie")
elif a=="R" and b=="S":
    print("a is a winner")
elif a=="S" and b=="P":
    print("a is a winner")
elif a=="P" and b=="R":
    print("a is a winner")
else:
    print("b is a winner")