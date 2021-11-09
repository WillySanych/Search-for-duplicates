import scala.io.StdIn

object Main extends App{

  val ArrSize = StdIn.readInt()
  if (ArrSize < 0 | ArrSize > 100000) {
    throw new IllegalArgumentException("The number must be in 0 to 100 000.")
  }

  val arr = StdIn.readLine().split(",").map(_.toInt)
  if (arr.length < ArrSize) {
    throw new IllegalArgumentException("Entered less numbers than you indicated")
  } else if (arr.length > ArrSize) {
    throw new IllegalArgumentException("Entered more numbers than you indicated")
  }

  for (i <- arr) {
    if (i < 0 | i > 100000) {
      throw new IllegalArgumentException("The numbers must be in 0 to 100 000.")
    }
  }

  val arrgroup = arr.groupBy(identity).map(i => (i._1, i._2.size - 1))
  var count = 0
  for (( k, v) <- arrgroup) {
    count += arrgroup (k)
  }

  println(count)

}