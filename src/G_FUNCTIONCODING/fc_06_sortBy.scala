package G_FUNCTIONCODING
/*
SortBy
格式
  def sortBy(f:(A)=> B):List[A]
简化
  def sortBy(函数对象)
 */
object fc_06_sortBy {
  def main(args: Array[String]): Unit = {
    val list=List("01 Hadoop","02 Flume","03 Hive","04 Hive")
    //完整版
    val list1=list.sortBy((x:String)=>x.split(" ")(1))
    println(list1)
    //简化版本
    val list2=list.sortBy(_.split(" ")(1))
    println(list2)
  }
}
