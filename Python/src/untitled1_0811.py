# -*- coding: utf-8 -*-
"""
Created on Fri Aug 11 10:14:20 2017

@author: cse
"""

import numpy as np

a = [1,2,3,4]
b = np.array(a)

a
b

a[0]
b[0]
a[:2]
b[:2]
a*0.3
b*0.3

c = np.ones([5,10])
c
d = np.zeros([10,50])
d

e=np.array([
        [1,2,3],
        [4,5,6]
        ])

e.shape
e.ndim
e.dtype

e*0.3

a = np.array([100,500,300,250])
b = np.array([2,1.2,0.4,0.5])
a*b

a=np.array([1,2,3,4])
a.dtype

b=a*1.0
b.dtype

c = a.astype(np.float32)
c.dtype

d = np.array(['1','2','3'])
d.dtype
e = d.astype(np.int64)
e.dtype
e


arr1 = np.array([[1,2],[3,4]])
arr2 = np.array([[5,6],[7,8]])
arr1
arr2
arr1 + arr2
np.add(arr1,arr2)

arr1 * arr2
np.dot(arr1,arr2)