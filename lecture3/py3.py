a = int(input())
array = list(map(str, input().split()))
n, m = map(int, input().split())

mydic = {}

for i in range(n):
    values = list(map(str, input().split()))
    for j in range(m):
        mydic[values[j]] = (i, j) 


for i in range(len(array)):
    if array[i] in mydic:
        print(f"{mydic[array[i]][0]} {mydic[array[i]][1]}")
    else:
        print(-1)
