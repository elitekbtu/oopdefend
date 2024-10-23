def can_divide(a, n, k, max_sum):
    current_sum = 0
    blocks = 1
    for i in range(n):
        if current_sum + a[i] > max_sum:
            blocks += 1
            current_sum = a[i]
            if blocks > k:
                return False
        else:
            current_sum += a[i]
    return True

def find_min_max_sum(n, k, a):
    low, high = max(a), sum(a)
    while low < high:
        mid = (low + high) // 2
        if can_divide(a, n, k, mid):
            high = mid
        else:
            low = mid + 1
    return low

n, k = map(int, input().split())
a = list(map(int, input().split()))

print(find_min_max_sum(n, k, a))