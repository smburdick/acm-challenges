# Naive solution.
def fib(n):
  if n == 0 or n == 1:
      return n
  return fib(n-1) + fib(n-2)

# Better solution, if we know the upper bound of n
upperBound = 1000
precomputedFibs = [0,1]
for k in range(2, upperBound): # memoize the first 1000 values
    precomputedFibs.append(precomputedFibs[k-1] + precomputedFibs[k-2])

def better_fib(n):
    return precomputedFibs[n - 1] # switch from 1-based indexing to 0-based

print better_fib(7)  # 8
print better_fib(12) # 89
print better_fib(39) # 39088169
