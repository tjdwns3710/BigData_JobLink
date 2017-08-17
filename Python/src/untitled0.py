# -*- coding: utf-8 -*-
"""
Created on Thu Aug 10 11:31:53 2017

@author: cse
"""

import pandas as pd
from pandas import Series, DataFrame

user_dic = {
        'user':['kim','park','lee','kim'],
        'feedback':[
                'hello java',
                'how do you',
                'call back',
                'my cat']
        }


user_df = pd.DataFrame(user_dic)
user_df

a = [2500,1500,3500]
b = Series(
        a,
        index=['apple','peer','charry']
        )

a[0]
b['apple']

print(b.values)
print(b.index)

user_dic = {
        'user':['kim','park','lee','kim'],
        'feedback':[
                'hello java',
                'how do you',
                'call back',
                'my cat']
        }


c = Series(user_dic)
c
c.values
c.index
c['user']
c['feedback']
type(c['feedback'])

d = [2500,1500,3000]
e = Series(
        d,
        index=['apple','peer','charry']
        )

e.name = 'price'
print(e)

e.index.name = 'name'
print(e)












