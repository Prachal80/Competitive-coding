num = int(input())
lines = list()

def solution(s:str):
	N = len(s)

	print(s[int((N/2)-1)::-1] + s[int(N-1):int(N/2)-1:-1]) 


for i in range (0,num):
	
	ele = str(input())

	lines.append(ele)

for i in range (0, num):
	solution(lines[i])


