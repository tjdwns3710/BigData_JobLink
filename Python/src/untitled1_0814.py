# -*- coding: utf-8 -*-
"""
Created on Mon Aug 14 14:14:47 2017

@author: cse
"""

student = {
        "name":"Mark",
        "student_id":15163,
        "feedback":None
        }

print(student['name'])
print(student['student_id'])
print(student['feedback'])

all_student = [
        {"name":"Mark","student_id":15163},
        {"name":"John","student_id":10784},
        {"name":"Lucy","student_id":30213}
        ]
all_student

all_student[0]['name']
all_student[1]['name']
all_student[2]['name']

all_student[0]['student_id']
all_student[1]['student_id']
all_student[2]['student_id']

all_student = {
        "name":["Mark","John","Lucy"],
        "student_id":[15163,10784,30213]
        }
all_student.keys()

ls = [1,2,2,2,2,2,1,1,3,4,5,3,6,7]
type(ls)

x = set(ls)
print(x)

print(student['name'])
print(all_student['name'])

print(student.get("name"))
print(all_student.get("name"))

print(student.keys())
print(all_student.keys())

print(student.values())
print(all_student.values())

del student['name']
del all_student['name']
print(student)
print(all_student)


tuple1 = (1,3,5,6)
tuple2 = (3,5,6.2,6.2,6.2,5.7,'string')
list1 = [1,3,5,6]

tuple1[0]
list1[0]

tuple1[0] = 5
list1[0] = 5

tuple1[0]
list1[0]

print(tuple2.count(3))
print(tuple2.count(6.2))
print(tuple2.count(5.7))