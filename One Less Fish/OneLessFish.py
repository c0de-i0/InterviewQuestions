import math
n = int(input())
weights = input().split()
bowl_weight = math.inf
for i in range(n):
	weights[i] = int(weights[i])
	if weights[i]<bowl_weight:
		bowl_weight = weights[i]

for i in range(n):
	fish_weight = weights[i]-bowl_weight
	if fish_weight !=0:
		print(fish_weight,end=" ")
