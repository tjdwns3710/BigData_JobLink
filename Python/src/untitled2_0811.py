# -*- coding: utf-8 -*-
"""
Created on Fri Aug 11 11:13:50 2017

@author: cse
"""

import numpy as np

d = np.array([
        [1,2,3],
        [4,5,6],
        [7,8,9]
        ])
d

d[:2,1:3]

d[2:,:2]

d[0,2]

d[[0,1,2],[2,0,1]]


e = np.array([[1,2,3],[4,5,6]])
e

d = e >= 2
d



f = np.array([[4,6,3],[1,5,2]])
g = f>3
g













