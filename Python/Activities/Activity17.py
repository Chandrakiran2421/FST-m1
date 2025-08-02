import pandas as pd

data ={
    "username":["Admin", "Charles", "Deku"],
    "password":["Password", "Charl13", "Allmight"]
}
df = pd.DataFrame(data)
df.to_csv("./activity.17.csv", index=False)
