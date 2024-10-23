def can_steal_all_gold(K, bags, H):
    hours = 0
    for gold in bags:
        hours += (gold + K - 1) // K 
    return hours <= H

def find_minimum_K(N, H, bags):
    left = 1
    right = max(bags)
    
    while left < right:
        mid = (left + right) // 2
        if can_steal_all_gold(mid, bags, H):
            right = mid  
        else:
            left = mid + 1 
            
    return left


N, H = map(int, input().split())
bags = list(map(int, input().split()))

print(find_minimum_K(N, H, bags))