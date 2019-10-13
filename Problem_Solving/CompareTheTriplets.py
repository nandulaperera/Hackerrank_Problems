#!/bin/python

import math
import os
import random
import re
import sys

# Complete the compareTriplets function below.
def compareTriplets(a, b):
    counterA=0
    counterB=0

    for x in range(3):
        if a[x] > b[x]:
            counterA=counterA+1
        elif a[x] < b[x]:
            counterB=counterB+1
    array=[counterA,counterB]
    return array

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = map(int, raw_input().rstrip().split())

    b = map(int, raw_input().rstrip().split())

    result = compareTriplets(a, b)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
