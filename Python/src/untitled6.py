# -*- coding: utf-8 -*-
"""
Created on Thu Aug 10 16:14:03 2017

@author: cse
"""

import pandas as pd
from pandas import Series, DataFrame

a = [2500,1200,5000,4000]
index = [
        'apple','peer',
        'charry','banana'
        ]
a_se = Series(a, index=index)
a_se.sort_index()
a_se.sort_values()

데이터프레임 정렬
price = [2500,1200,5000,4000]
name = [
        'apple','peer',
        'charry','banana'
        ]
dic = {
       'name':name,
       'price':price
       }

df = DataFrame(dic, index=name)
df
df.sort_index()
df.sort_index(axis=1)

df.sort_values(by=['price'])


price = [2500,1200,5000,4000]
name = [
        'apple','peer',
        'charry','banana'
        ]
dic = {
       'name':name,
       'price':price
       }
p_df = DataFrame(dic, index=name)
p_df.price.sum()
p_df['price'].sum()

p_df['price'].min()
p_df['price'].max()
p_df['price'].mean()

예제5.
a = [2500,3000,4000]
b = [1500,1800,3200]
index = ['apple','peer','charry']
ex_dic={
       'seoul':a,
       'daejeon':b
       }
ex_df = DataFrame(ex_dic,index=index)
ex_df

ex1 = ex_df['seoul']['apple'] - ex_df['daejeon']['apple']
ex1

ex2 = ex_df['seoul'].mean() - ex_df['daejeon'].mean()
ex2

ex3 = ex_df['seoul'].max() - ex_df['daejeon'].max()
ex3

ex4 = ex_df['seoul'][0:2].max() - ex_df['daejeon'][0:2].max()
ex4

ex_df['seoul'][0:2].max()
ex_df['seoul'][:2]

from sklearn.datasets import fetch_california_housing
import pandas as pd