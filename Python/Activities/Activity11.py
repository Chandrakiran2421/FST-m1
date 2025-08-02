my_fruits=input("enter the fruits and prices:").split(",")
print("The fruits and prices are:", my_fruits)

fruit_search=input("Please check what fruit you are looking for: ")
if fruit_search in my_fruits:
    print("The fruit is available in the list.")
else:
    print("The fruit is not available in the list.")