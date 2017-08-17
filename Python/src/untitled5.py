# -*- coding: utf-8 -*-
"""
Created on Thu Aug 10 15:40:47 2017

@author: cse
"""

import pandas as pd
from pandas import Series, DataFrame

a_dic = {
        'fruit_name':[
                'apple','peer',
                'banana','charry'
                ],
        'old_price':[1500,2000,3500,2000]
        }

b_dic = {
        'fruit_name':[
                'apple','peer',
                'banana','charry'
                ],
        'new_price':[100,200,-450,130]
        }

a_dic

a_dic.old_price + b_dic.new_price

a_df = DataFrame(a_dic)
b_df = DataFrame(b_dic)
d_df = a_df['old_price'] + b_df['new_price']
d_df['fruit_name'] = a_df['fruit_name']
d_df

a_se = Series(
        a_dic['old_price'],
        index=a_dic['fruit_name']
        )

b_se = Series(
        b_dic['new_price'],
        index=a_dic['fruit_name']
        )

a_se
b_se

c_se = a_se + b_se
c_se

c_df = DataFrame(
        c_se,
        columns = [
                'sun_price']
        )

