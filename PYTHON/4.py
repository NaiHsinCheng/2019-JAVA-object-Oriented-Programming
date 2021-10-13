for i in range(1,10001):
    a=0
    for j in range(1,i):
        if (i%j == 0):
            a+=j
    if i==a:
        print(i)
