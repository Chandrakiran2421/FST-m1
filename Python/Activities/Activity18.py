import pandas as pd

data ={
    "username":["Admin", "Charles", "Deku"],
    "password":["APassword", "OCharl13", "FAllmight"]
}
df = pd.DataFrame(data)
df.to_csv("./activity.17.csv", index=False)
input_data = pd.read_csv("./activity.17.csv")
print("=================Printing the input_data=======================")
print(input_data)
print("=================Printing the username column=======================")
print(input_data["username"])
print("=================Printing the 2nd row=======================")
print(input_data["username"][2], input_data["password"][2])
print("=================Printing the ascending username=======================")
print(input_data.sort_values("username"))
print("=================Printing the decending passwords=======================")
print(input_data.sort_values("password", ascending=False))  # Corrected sort_values usage