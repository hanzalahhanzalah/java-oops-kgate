
## Ask the user to enter a
##number between 10 and
##20 (inclusive). of they enter a
##number with in this range,
##display the message " Thank you",
##Otherwise display message
##Incorrect answer

##i=int(input("enter number between 10 and 20  : "))
##
##if i>=10 and i<=20:
##    print("thank you")
##else:
##    ("incorrect answer")

##Ask the user's age. If they are 18
##or over, display the message "you can vote"
##if they aged 17, display
##the message " you can learn to
##drive", if they are aged 16, display
##buy a Lottery ticket "if they are under 16, display
##"you can trick"
##
##a=int(input("enter your age:   "))
##if a>=18:
##      print("you can vote")
##elif a==17:
##    print("you can learn to drive")
##elif a==16:
##    print("you can buy a lottrey ticket")
##else:
##    print("you can go trick")
##    

##a=int(input("enter number b/w 1 2 and 3 :  "))
##if a==1:
##    print("thank you")
##elif a==2:
##    print("well done")
##elif a==3:
##    print("correct")
##else:
##    print("error")

    

##Object #4 Develops Sindent's Grading system:
##ILAUALL
##890/1100
##'
##Take name as input
##2, input Five Subjects marks
##31
##Sum Five Subjects marks.
##41 Find out the percentage
##51 Check where the percentage lies
##5)
##te A+, A, B, C, D, F
##
##
##
##
##name = input("Enter your name: ")
##marks = []
##for i in range(5):
##    marks.append(int(input(f"Enter marks for subject {i+1}: ")))
##
##total_marks = sum(marks)
##percentage = (total_marks / 550) * 100
##
##if percentage >= 90:
##    grade = "A+"
##elif percentage >= 80:
##    grade = "A"
##elif percentage >= 70:
##    grade = "B"
##elif percentage >= 60:
##    grade = "C"
##elif percentage >= 50:
##    grade = "D"
##else:
##    grade = "F"
##
##print(f"Name: {name}")
##print(f"Total marks: {total_marks}")
##print(f"Percentage: {percentage:.2f}%")
##print(f"Grade: {grade}")
##
a=input("enter you name:   " )
a1=int(input("enter 1st sub marks:   " ))
a2=int(input("enter 2nd sub marks:   " ))
a3=int(input("enter 3rd sub marks:   " ))
a4=int(input("enter 4th sub marks:   " ))
a5=int(input("enter 5th sub marks:   " ))
b=int(a1+a2+a3+a4)
c=int(b*100/500)
print("name :  " , a)
print("total marks:  " , b)
print("your percentage :      " , c)
if c >=90:
    print("you grade is A+")        
elif c >=80:
    print("you grade is A")
elif c >=70:
    print("you grade is B")
elif c >=60:
    print("you grade is C")
elif c >=50:
    print("you grade is D")    
else:
    print("you are fail")
    







