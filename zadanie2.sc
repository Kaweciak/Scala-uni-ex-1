def sumWithLimit (lowerBound: Int, upperBound: Int) : Int =
{
  if lowerBound == upperBound then 0
  else lowerBound + sumWithLimit(lowerBound+1, upperBound)
}

def prodWithLimit (lowerBound: Int, upperBound: Int) : Int =
{
  if lowerBound == upperBound then 1
  else lowerBound * prodWithLimit(lowerBound+1, upperBound)
}

val sumProd = (s: Int, e: Int) =>
{
  if s >= e then (0, 0)
  else (sumWithLimit(s, e), prodWithLimit(s, e))
}


//tests
sumProd(4, 6)
sumProd(-3, 2)
sumProd(0, 1)
sumProd(10, 8)
sumProd(2, 2)