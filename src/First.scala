/**
 * Created by krish on 9/27/2016.
 */
object First {
  def main(args: Array[String]) {
    def fact(x: BigInt): BigInt =
      if (x == 0) 1 else x * fact(x - 1)
    println("welcome :"+ fact(10))
  }
}
