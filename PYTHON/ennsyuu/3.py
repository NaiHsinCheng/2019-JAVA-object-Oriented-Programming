p = input("principal:")
r = input("rate:")
p = int(p)
r = float(r)
i = 1
count = p
while i<=20:
    count += count*r
    if i%5==0 :
        print(str(i)+":"+str(count))
    i=i+1

