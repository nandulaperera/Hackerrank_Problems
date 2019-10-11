def plusMinus(arr):
    pluscount = 0
    minuscount = 0
    zerocount = 0

    for x in arr:
        if x > 0:
            pluscount += 1
        elif x < 0:
            minuscount += 1
        else:
            zerocount += 1

    pluscount = pluscount/len(arr)
    minuscount = minuscount/len(arr)
    zerocount = zerocount/len(arr)

    print(pluscount)
    print(minuscount)
    print(zerocount)

if __name__ == '__main__':
    n = int(input())
    
    arr = list(map(int,input().rstrip().split()))
    
    plusMinus(arr)