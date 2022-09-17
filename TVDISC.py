ans_list=[]
def takeans(ans):
    global ans_list
    ans_list.append(ans)
    

for _ in range(int(input())):
    a, b, c, d = map(int, input().split())
    if a-c<b-d:
        takeans("First")
    elif a-c>b-d:
        takeans("Second")
    else:
        takeans("Any")

for a in ans_list:
    print(a)

