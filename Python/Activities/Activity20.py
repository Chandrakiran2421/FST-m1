import pandas as pd
from pandas import ExcelWriter

dataframe = pd.read_excel("Activity19.xlsx", sheet_name="sheet1")
print(dataframe)
print("=====================================================")
print("Number of rows and columns in the DataFrame:", dataframe.shape)
print("=====================================================")
print("Emails: ")
print(dataframe["Email"])
print("=====================================================")
print("Print the first name in assending order:", dataframe.sort_values("FirstName"))