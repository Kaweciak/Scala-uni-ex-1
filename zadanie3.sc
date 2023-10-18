def sumOfDivisors (n: Int, i: Int, s: Int): Int =
{
    if i*i >= n then
    {
        if i*i == n then s+i
        else s
    }
    else
    {
        if n%i == 0 then sumOfDivisors (n, i+1, s + i + n/i)
        else sumOfDivisors(n, i+1, s)
    }
}

val isPerfect = (n: Int) =>
{
  if n < 2 then false
  else if sumOfDivisors(n, 2, 1) == n then true
  else false
}

//tests
isPerfect(6)
isPerfect(12)
isPerfect(1)
isPerfect(-10)
isPerfect(28)
isPerfect(8128)
isPerfect(1000)