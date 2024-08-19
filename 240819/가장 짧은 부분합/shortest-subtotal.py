MX = 987_654_321

n, s = map(int, input().split())
arr = list(map(int, input().split()))

ans = MX 
sum_val = 0
for st in range(n):
    for en in range(st, n):
        sum_val += arr[en]

        if sum_val >