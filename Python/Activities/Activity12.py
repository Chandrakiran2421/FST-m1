def sum(n):

    if n<=1:
        return n
    else:
        return n+sum(n-1)
    
n= int(input("Enter a number: "))
print("Sum of numbers from 0 to", n, "is:", sum(n))
    