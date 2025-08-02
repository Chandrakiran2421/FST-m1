def fibonacci(number):
    if number <=1:
        return number
    else:
        return fibonacci(number-1) + fibonacci(number-2)
    
n = int(input("Enter a number: "))
if n < 0:
    print("Please enter a non-negative integer.")
else: 
    print(f"Fibonacci sequence up to {n} terms:")
    for i in range(n):
     print(fibonacci(i))

    