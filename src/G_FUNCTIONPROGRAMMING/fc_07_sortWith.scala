package G_FUNCTIONPROGRAMMING
/*
sortWith
格式
  def sortWith(f:(A,B) => Boolean): List[A]
简写
  def sortWith(函数对象:自定义排序顺序)
 */
object fc_07_sortWith {
  def main(args: Array[String]): Unit = {
    val list=List(3,4,2,1,6,7,8,3)
    //1.完整 x：前面的元素 y：后面的元素
    val list1=list.sortWith((x,y) => x>y)
    println(list1)
    //2.简化
    val list2=list.sortWith(_>_)
    println(list2)
  }
}
