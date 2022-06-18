import sys
n=int(sys.stdin.readline())
num=n
cnt=0
while 1:
    if num<10:
        num=num*11
    else:
        temp = num%10 # 1의자리
        num = temp*10 + (temp+int(num/10))%10
    cnt=cnt+1
    if num==n:
        print(cnt)
        break