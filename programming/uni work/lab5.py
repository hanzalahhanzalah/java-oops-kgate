##a=int(input("enter number :"))
##b=int(input("enter another number :"))
##t=a+b
##c=input("if you want to add another no type 'y'")
##while c=='y':
##    d=int(input("enter number;  "))
##    t+=d
##    c=input("if you want to add another no type 'y'")
##print("the total is: ",t)    
##    
##
##a=int(input("enter number b/w 1o and 20 ; "))
##while a < 10 or a > 20:
##    if a < 10:
##       print("too low")
##    else:
##       print("too high")
##    a=int(input("try again :  "))   
##
##print("thank you")
num = int(input("Enter a number: "))
factorial = 1

while num > 0:
    factorial *= num
    num -= 1

print("The factorial is", factorial)
