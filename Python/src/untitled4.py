# -*- coding: utf-8 -*-
"""
Created on Thu Aug 10 15:26:13 2017

@author: cse
"""

import pandas as pd
from pandas import Series, DataFrame

fruit1 = Series(
        [5,9,10],
        index = [
                'apple',
                'charry',
                'peer'
                ]
        )
fruit2 = Series(
        [3,2,7,5],
        index = [
                'apple',
                'banana',
                'charry',
                'peer'
                ]
        )
print(fruit1)
print(fruit2)

fruit1 + fruit2


a_dic = {'fruit_price':[1500,2000,3500,2000]}
b_dic = {'fruit_price':[100,200,-450,130]}


a_df = DataFrame(
        a_dic,
        index=[
                'apple',
                'peer',
                'charry',
                'banana'
                ]
        )
b_df = DataFrame(
        b_dic,
        index=[
                'apple',
                'peer',
                'charry',
                'banana'
                ]
        )

c_df = a_df + b_df
c_df

