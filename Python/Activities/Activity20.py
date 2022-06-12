import pandas

dataframe = pandas.read_excel("SampleData.xlsx", sheet_name="Sheet1")
print("All Data from excel : ")
print(dataframe)
print("***********************************************************")
print("No. of Rows and Columns : ", dataframe.shape)
print("***********************************************************")
print("Emails : ")
print(dataframe['Email'])
print("***********************************************************")
print("First Names in ascending order : ")
print(dataframe.sort_values('FirstName'))
print("***********************************************************")