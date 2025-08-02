my_num= input("Enter the numbers to the list:").split(",")
sum=0
for i in my_num:
    sum+=int(i)
print("The sum of the numbers in the list is:", sum)