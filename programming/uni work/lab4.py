num1=int(input("enter 1st no:" ))
num2=int(input("enter 2nd no:" ))
total=num1+num2
while q == 'y':
    q=input("if you to add another type 'y'")

    c=int(input("enter another number:"))
    total+=c
    print(total)
if q != 'y':
    print("programs stops")

