# -*- coding: utf-8 -*-
"""
Created on Mon Aug 14 13:14:00 2017

@author: cse
"""

num=23
type(num)

num = 'seoul'
type(num)


python_course = True
java_course = False

print(int(python_course))
print(int(java_course))

print(str(python_course))
print(str(java_course))

name = 'LEE'
machine = 'PYTHON'

print('Nice to meet you {0} i am {1}')
print('Nice to meet you {0} i am {1}'.format(name,machine))
print('Nice to meet you {0} i am {1}'.format(machine,name))

number = 5
if number == 5:
    print("Number is 5")
else:
    print("Number is not 5")
    
if number !=5:
    print("This will not execute")
    
python_course = True
if python_course:
    print("This will execute")
if not python_course:
    print("This will execute")
    
if number == 5 and python_course:
    print("this will execute")
    
if number == 7 or python_course:
    print("This will also execute")
    
a = 1
b = 2
print("bigger" if a > b else "smaller")

student_names = []
student_names = ["Mark","John","Lucy"]
student_names[0]
student_names[2]
student_names[-3]
student_names[-1]

student_names[0] = "James"
student_names
student_names.append("Tom")
"John" in student_names
len(student_names)
del student_names[2]
student_names
student_names[1:]
student_names[1:-1]








for index in range(10):
    x = index
    print("The value of x is {0}".format(x))


x = 0
while(x<10):
    print("x is {0}".format(x))
    x += 1


