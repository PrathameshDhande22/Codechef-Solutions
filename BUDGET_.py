ans_list=[]

for _ in range(int(input())):
    x,y=map(int,input().split())
    if 30*y<=x:
        ans_list.append("Yes")
    else:
        ans_list.append("No")

for ans in ans_list:
    print(ans)