package F_DATASTRUCTURE
/*
类型可以不一样
格式：
创建
  val/var NAME=(e1,e2...)
  val/var NAME=e1->e2
index
  元组名._i
遍历
 */
object datastructure_03_tuple {
  def main(args: Array[String]): Unit = {
    //创建
    val tuple1=("gmwang",23,10.0)
    val tuple2="gmwang"->(24,"hello")
    println(tuple1)
    println(tuple2)

    //index
    println(tuple2._2)
    //遍历迭代器遍历
    val it=tuple1.productIterator
    for (i<- it) println(i)
  }

}
