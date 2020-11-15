package G_FunctionalProgramming
/*
fold:与reduce 的区别只是 其有初始值
格式
  def fold[A1 >: A](z:A1)(op:(A1,A1) => A1): A1
简写
  def fold(初始值)(opL(A1,A1) => A1)

fold ==foldLeft
还有foldRight
 */
object fc_10_fold {
  def main(args: Array[String]): Unit = {
    val list=(1 to 10).toList
    //完整
    val list1=list.fold(100)((x,y)=>x+y)
    //简化
    val list2=list.fold(100)(_+_)
    print(list2)
  }
}
