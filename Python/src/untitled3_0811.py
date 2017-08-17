# -*- coding: utf-8 -*-
"""
Created on Fri Aug 11 13:40:55 2017

@author: cse
"""

https://archive.ics.uci.edu/ml/machine-learning-databases/wine-quality/winequality-red.csv

import pandas as pd
a = pd.read_csv(
        'https://archive.ics.uci.edu/ml/machine-learning-databases/wine-quality/winequality-red.csv',
        delimiter=';'
        )
type(a)

import numpy as np
b = np.array(a)
b.shape
b[:10]

print('a : '+str(a.shape))
print('b : '+str(b.shape))

C:\Users\cse\Desktop\FinalProject\DBcsvData\SVC_INDUTY.csv

svc = pd.read_csv(
        'C:/test/sales.txt',
        delimiter='\t',
        encoding='utf-8'
        )
svc.shape
svc[:10]


type(b)
b.sum()
b.mean()
b.mean(axis=0)
b[:10].mean()
b.max(axis=0)
b.min(axis=0)