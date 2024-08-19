MX = 987_654_321

n, s = map(int, input().split())
arr = list(map(int, input().split()))

ans = MX
sum_val = 0
en = 0
for st in range(n):
    # [st, en)
    while en < n and sum_val < s:
        sum_val += arr[en]
        en += 1

    if sum_val < s:
        break

    ans = min(ans, en - st)
    sum_val -= arr[st]

if ans == MX:
    ans = -1
print(ans)