n, q = map(int, input().split())
array = list(map(int, input().split()))
res = []
for _ in range(q):
    l1, r1, l2, r2 = map(int, input().split())
    count = 0
    for value in array:
        if l1 <= value <= r1 or l2 <= value <= r2:
            count += 1
    
    res.append(count)

for i in res:
    print(i)