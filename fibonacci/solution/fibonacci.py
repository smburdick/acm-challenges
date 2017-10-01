# Naive solution.
def fib(n):
  if n == 0 or n == 1:
      return n
  return fib(n-1) + fib(n-2)

# Better solution if we know the upper bound of n
upperBound = 1000
precomputedFibs = [1,1]
for k in range(2, upperBound):
    precomputedFibs.append(precomputedFibs[k-1] + precomputedFibs[k-2])

def better_fib(n):
    return precomputedFibs[n - 1] #

print better_fib(5)  # 8
print better_fib(10) # 89
print better_fib(37) # 39088169
