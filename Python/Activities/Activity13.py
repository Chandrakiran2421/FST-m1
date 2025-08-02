def sum(num):
    total =0
    for i in num:
        total += i
    return total    

num_list = [1,2,3,4,5]  
print("List of numbers is:", num_list)

result = sum(num_list)
print("Sum of numbers in the list is:", + result)