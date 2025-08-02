my_tuple=input("Enter the numbers to the tuple:").split(",")
print("The tuple is:", my_tuple)
my_new_tuple = ()
for i in my_tuple:
    if int(i)%5==0:
        print(i)
