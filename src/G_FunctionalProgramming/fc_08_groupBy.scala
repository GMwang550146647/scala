package G_FunctionalProgramming
/*
格式
  def groupBy[K](f:(A) =>K): Map[K,List[A]]
简化
  def groupBy(F:(A) => 具体的分组代码
 */
object fc_08_groupBy {
  def main(args: Array[String]): Unit = {
    val list=List("gmwang"->"男","feifei"->"女","nobody"->"男")
    //完整
    val groupby1=list.groupBy(x=>x._2)
    println(groupby1)
    val agg1=groupby1.map(x => x._1->x._2.size)
    println(agg1)
    //简化
    val groupby2=list.groupBy(_._2)
    println(groupby2)
    val agg2=groupby2.map(x => x._1->x._2.size) //这个不能简化，因为出现两次
    println(agg2)
  }
}
