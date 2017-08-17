# -*- coding: utf-8 -*-
"""
Created on Fri Aug 11 15:18:22 2017

@author: cse
"""

from sklearn.neural_network import MLPClassifier

import pandas as pd
red = pd.read_csv(
        'https://archive.ics.uci.edu/ml/machine-learning-databases/wine-quality/winequality-red.csv',
        delimiter=';'
        )

white = pd.read_csv(
        'https://archive.ics.uci.edu/ml/machine-learning-databases/wine-quality/winequality-white.csv',
        delimiter=';'
        )

red
white

red['type'] = 0
white['type'] = 1


red_y = red['type']
red_y

white_y = white['type']
white_y

red_x = red.drop(['type'],axis=1)
white_x = white.drop(['type'],axis=1)


red_x.shape
white_x.shape
test_data_red = red_x[1001:]
test_data_white = white_x[4501:]
train_data_red = red_x[:1000]
train_data_white = white_x[:1000]


test_label_red = red_y[1001:]
test_label_white = white_y[4501:]
train_label_red = red_y[:1000]
train_label_white = white_y[:1000]

test_data = pd.concat(
        [test_data_red,test_data_white],
        axis=0
        )
test_data.shape

train_data = pd.concat(
        [train_data_red,train_data_white],
        axis=0
        )
train_data.shape

test_label = pd.concat(
        [test_label_red,test_label_white],
        axis=0
        )

train_label = pd.concat(
        [train_label_red,train_label_white],
        axis=0
        )
train_label.shape
test_label.shape

mlp = MLPClassifier(hidden_layer_sizes=(50,30))
mlp.fit(train_data,train_label)
print("Training score:%s" % mlp.score(train_data,train_label))


test_data.shape
test_data[-5:]
test_label[-3:]
result = mlp.predict(test_data[:100])
list(result[:])
test_label[:100]
test_label.shape

--------------------------------------

mlp = MLPClassifier(hidden_layer_sizes=(50,30))
mlp.fit(train_data,train_label)
result = mlp.predict(test_data)
confusion_matrix = pd.crosstab(test_label,result,rownames=['True'],
                               colnames=['Predicted'],margins=True)
print(confusion_matrix)

total = confusion_matrix[0][0] + confusion_matrix[0][1] + confusion_matrix[1][0] + confusion_matrix[1][1]
accuracy = (confusion_matrix[0][0]+confusion_matrix[1][1]) / total
print(accuracy)












