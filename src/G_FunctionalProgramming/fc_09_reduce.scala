package G_FunctionalProgramming
/*
格式
  def reduce[A1 >: A](op:(A1,A1) => A1):A1
简化
  def reduce(op:(A1:A1) =>A1)

Noted:
  reduce ==reduceLeft
  reduceRight
 */
object fc_09_reduce {
  def main(args: Array[String]): Unit = {
    val list=(1 to 10 ).toList
    //1.reduce (reduceLeft)
    //完整
    val list1=list.reduce((x,y)=> x+y)
    println(list1)
    //简化
    val list2=list.reduce(_+_)
    println(list2)

    //2.reduceRight
    val list4=list.reduce(_-_)
    println(list4)
    val list5=list.reduceRight(_-_)
    println(list5)
    val list6=list.reduceRight(-_+_)
    println(list6)
    val list7=list.reduceRight((x,y) => y-x)
    println(list7)
  }
}
