import bisect

n, q = map(int, input().split())
array = list(map(int, input().split()))
results = []
array.sort()
def count_in_range(low, high):
    return bisect.bisect_right(array, high) - bisect.bisect_left(array, low)
for _ in range(q):
    l1, r1, l2, r2 = map(int, input().split())
    count_range1 = count_in_range(l1, r1)
    count_range2 = count_in_range(l2, r2)
    
    overlap_count = count_in_range(max(l1, l2), min(r1, r2)) if l1 <= r2 and l2 <= r1 else 0
    
    result = count_range1 + count_range2 - overlap_count
    results.append(result)
for i in results:
    print(i)

