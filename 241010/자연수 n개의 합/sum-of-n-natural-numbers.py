s = int(input())


st = 1
en = 2_000_000_001

while st < en:
    half = (st + en) // 2
    sum = (1 + half) * half // 2
    if sum <= s:
        st = half + 1
    else:
        en = half
    
print(st - 1)