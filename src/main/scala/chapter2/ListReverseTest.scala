package chapter2

object ListReverseTest {
   def main(args: Array[String]) {
      val animal: List[String] = List("cat", "dog", "rabbit")
      println( " animal list before reversing : " + animal )
      println( " animal list after reversing : " + animal.reverse )
   }
}