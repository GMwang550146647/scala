package G_FUNCTIONPROGRAMMING
/*
filter 过滤出需要的元素
格式
  def filter(f:(A)=>Boolean) : TraversableOnce[A]
简化
  def filter(f:(A)=>筛选条件)
 */
object fc_04_filter {
  def main(args: Array[String]): Unit = {
    val list1 = (1 to 9).toList
    //初步简化
    val list2 = list1.filter(x => x % 2 == 0)
    print(list2)
    val list3 = list1.filter(_ % 2 == 0)
    print(list3)
  }
}
