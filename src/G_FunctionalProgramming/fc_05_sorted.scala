package G_FunctionalProgramming
/*

 */
object fc_05_sorted {
  def main(args: Array[String]): Unit = {
    val list=List(2,4,8,1,3,6)
    //1.排序（升序）
    val list1=list.sorted
    println(list1)
    //2.排序（降序）
    val list2=list.sorted.reverse
    println(list2)
  }
}
