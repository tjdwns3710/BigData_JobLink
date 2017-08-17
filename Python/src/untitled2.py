# -*- coding: utf-8 -*-
"""
Created on Thu Aug 10 14:21:47 2017

@author: cse
"""

import pandas as pd
from pandas import Series, DataFrame

a = [2500,1500,2000]
i = ['apple','peer','charry']

s = Series(a, index=i)
s

키삭제
s.drop('apple')

s

co = s.drop('apple')
co2 = s.drop('charry')

s
co
co2

s.drop('apple',inplace=True)
s

user_dic = {
        'user':['kim','park','lee','kim'],
        'feedback':[
                'hello java',
                'how do you',
                'call back',
                'my cat']
        }
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

df2 = user_df.drop(
        'datetime',axis=1
        )
df2

user_df.drop(
        'datetime',
        axis=1,
        inplace=True
        )
user_df


