package F_DATASTRUCTURE

import scala.collection.mutable.ArrayBuffer
/*
sum()
max()
min()
sorted()  排序
reverse() 翻转
 */
object datastructure_02_arrayFunctions {
  def main(args: Array[String]): Unit = {
    var arr= ArrayBuffer(6,5,4,3,2,1,1000)
    //sum
    println(s"sum:${arr.sum}")
    //max & min
    println(s"max:${arr.max},min:${arr.min}")
    //sorted
    println(s"sorted:${arr.sorted}")
    //reverse
    println(s"reverse:${arr.reverse}")
  }
}
