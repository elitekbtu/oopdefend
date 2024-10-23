def binary_search(lst, item):
    low = 0
    high = len(lst) - 1
    while low <= high:
        mid = (low + high) // 2
        guess = lst[mid]
        if guess == item:
            return True
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    return False 

n = int(input())
array = list(map(int, input().split()))

array.sort()

value = int(input())

if binary_search(array, value):
    print("Yes")
else:
    print("No")
