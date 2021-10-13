count = 0.0
a = input("Enter a data:")
i = 0
while a:
    count+=int(a)
    i = i + 1
    a=input("Enter a data:")
print("Average = "+str(count/i))
