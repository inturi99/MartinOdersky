def mul (x: Int, y: Int) = x * y
mul(2,3)

def fact(x: BigInt): BigInt =
  if (x == 0) 1 else x * fact(x - 1)
fact(30)