MX = 987_654_321

n, s = map(int, input().split())
arr = list(map(int, input().split()))

ans = MX
sum_val = 0
en = 0
for st in range(n):
    while en < n and sum_val + arr[en] < s:
        sum_val += arr[en]
        en += 1

    ans = min(ans, en - st + 1)

    sum_val -= arr[st]

print(ans)