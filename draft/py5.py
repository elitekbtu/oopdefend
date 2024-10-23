def binary_search(array, value):
    low = 0
    high = len(array) - 1
    while low <= high:
        mid = (low + high) // 2
        if array[mid] <= value:
            low = mid + 1
        else:
            high = mid - 1
    return high

n = int(input())
enemies = list(map(int, input().split()))
enemies.sort() 
p = int(input())
powers = [int(input()) for i in range(p)]

for power in powers:
    max_index = binary_search(enemies, power)
    if max_index == -1:
        print(0, 0)
    else:
        count = max_index + 1
        total_strength = sum(enemies[:count])
        print(count, total_strength)
