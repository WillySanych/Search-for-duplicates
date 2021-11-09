import scala.io.StdIn

object Main extends App{

  var x = amount
  var arr = Array

  val arrgroup = arr.groupBy(identity).map(i => (i._1, i._2.size - 1))
  var count = 0
  for (( k, v) <- arrgroup) {
    count += (arrgroup (k))
  }

  println("Numbers of repetitions: " + count)


  def amount: Int = {
    print("Enter the amount of elements of collection: ")
    val x = StdIn.readInt()
    if (x < 0 | x > 100000) {
      println("The number must be in 0 to 100 000.")
      amount
    } else x
  }

  def Array: Array[Int]  = {
    println("Enter the numbers separated with commas: ")
    val arr = StdIn.readLine().split(",").map(_.toInt)
    if (arr.length < x) {
      println("Entered less numbers than you indicated")

      Array
    } else if (arr.length > x){
      println("Entered more numbers than you indicated")

      Array
    } else {
      for (i <- arr) {
        if (i < 0 | i > 100000) {
          println("The numbers must be in 0 to 100 000.")

          Array
        }
      }

      arr
    }
  }

}