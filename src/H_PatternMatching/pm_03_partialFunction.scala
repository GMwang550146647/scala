package H_PatternMatching
/*
  可以简化函数定义,配合集合的函数式编程,令代码更优雅
 */
object pm_03_partialFunction {
  def main(args: Array[String]): Unit = {
    //1.定义与使用
    val pf:PartialFunction[Int,String]={
      case 1=> "一"
      case 2=> "二"
      case 3=> "三"
      case _=> "未匹配"
    }
    println(pf(1))
    println(pf(100))

    //2.偏函数结合集合函数式编程
    val list1=(-1 to 10).toList
    val list2=list1.map{
      case x if x<1 =>"[*-1)"
      case x if x>=1 && x<=3 =>"[1-3]"
      case x if x>=4 && x<=8 =>"[4-8]"
      case _ =>"(8-*]"
    }
    println(list2)
  }
}
