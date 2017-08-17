# -*- coding: utf-8 -*-
"""
Created on Thu Aug 10 13:23:24 2017

@author: cse
"""

데이타 프레임
네임 리스트
a = ['apple','peer','charry']
가격 리스트
b = [2500,1500,3000]
번호 리스트
c = [10,8,3]

데이타딕셔너리 구성

dic = {
       "name":a,
       "price":b,
       "num":c
       }

dic

import pandas as pd
from pandas import Series, DataFrame
df = DataFrame(dic)
print(df)

df = DataFrame(
        dic,
        columns=[
                'price',
                'name',
                'num'
                ]
        )

df

user_dic = {
        'user':['kim','park','lee','kim'],
        'feedback':[
                'hello java',
                'how do you',
                'call back',
                'my cat']
        }

user_df = DataFrame(user_dic)
print(user_df)

len(user_df['feedback'])

flag = False
for i in user_df['feedback']:
    if(len(i)>6):
        flag = True
if(flag):
    print('high')
else:
    print('low')
    


user_df = DataFrame(
        user_dic,
        columns=['user','feedback']
        )

user_df['datetime'] = '2017-06-08'
user_df


num = [2,3,4]
user_se = Series(
        num,
        index=[1,2,3]
        )
user_df['number'] = user_se
user_df












