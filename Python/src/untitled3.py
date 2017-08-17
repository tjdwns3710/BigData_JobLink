# -*- coding: utf-8 -*-
"""
Created on Thu Aug 10 14:34:35 2017

@author: cse
"""

import pandas as pd
from pandas import Series, DataFrame

a = {
     'fruit_name':[
             'apple',
             'peer',
             'charry',
             'banana'
             ],
     'fruit_price':[
             1500,
             2000,
             1000,
             3000
             ]
     }

a_df = DataFrame(
        a,
        columns=[
                'fruit_name',
                'fruit_price'
                ]
        )
a_df

a_df['new_price'] = [
        2000,
        5000,
        500,
        1500
        ]
a_df

a_df.drop(
        'fruit_price',
        axis=1,
        inplace=True
        )
a_df

시리즈 slice 실습
price = [2500,3500,1500,2000]
p_index = [
        'apple','peer',
        'banana','charry'
        ]
p_series = Series(
        price, index=p_index
        )
p_series

p_series['peer':'banana']

실습용 p_series를 데이퍼프레임 적용

p_dataframe = DataFrame(p_series)
p_dataframe


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
user_df

user_df[2:]
user_df[:2]

slice를 이용하여
user의 park과 lee를 출력

user_df['user'][1:3]

a = [1,2,3,4]
b = [5,6,7,8]
c = a+b
c


i = [0,1,2,3]
a_se = Series(a,index=i)


print(c_se)
print(b_se)
i2 = [3,1,0,2]
b_se = Series(b,index=i2)

c_se = a_se+b_se




