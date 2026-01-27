# def my_function():
#   print("Hello from a function")
  
# my_function() 
def my_function(*pets):
  print("The youngest pet is " + pets[1])

my_function("Timmy", "Chippy") 
def my_function(country = "India"):
  print("I am from " + country)

my_function("Turkey")
my_function("Japan")
my_function()