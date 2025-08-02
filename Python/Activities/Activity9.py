my_numlist1= input("Enter the numbers to the first list:").split(",")
print("The first list is:", my_numlist1)
my_numlist2= input("Enter the numbers to the second list:").split(",")
print("The second list is:", my_numlist2)
my_numlist3=[]

for i in my_numlist1:
    if int(i)% 2 != 0:
        my_numlist3.append(i)
for j in my_numlist2:
    if int(j)% 2 == 0:
        my_numlist3.append(j)

print("The new list with odd numbers from the first list and even numbers from the second list is:", my_numlist3)
