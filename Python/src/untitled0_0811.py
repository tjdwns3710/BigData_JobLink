# -*- coding: utf-8 -*-
"""
Created on Fri Aug 11 09:29:58 2017

@author: cse
"""

price = [2000,3000,5000,1000,1000,2000,4000]
name = [
        'apple','charry',
        'apple','charry',
        'charry','apple','charry']
city = [
        'seoul','daejeon',
        'seoul','daejeon',
        'seoul','daejeon', 'daejeon'
        ]
f_dic={
       'name':name,
       'price':price,
       'city':city
       }

from pandas import DataFrame
import pandas

f_df = DataFrame(f_dic,columns=['city','name','price'])
f_dic
f_df

f_group = f_df['price'].groupby(f_df['name'])

f_group.count()
f_group.sum()
f_group.mean()
f_group.max()
f_group.min()

f_group = f_df['price'].groupby(
        [
                f_df['city'],
                f_df['name']
                ]
        )

