package G_FunctionalProgramming
/*
foreach
（与map唯一不一样的就是foreach只操作，不返回）
格式：
  def foreach(f:(A) => unit):unit   //该函数无返回值
简化：
  def foreach(函数)
 */
object fc_01_foreach {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4)
    //函数格式: () => {}
    //1.最详细版本
    list.foreach((x:Int) => {println(x)})

    //2.初步简化
    list.foreach(x=> println(x))

    //3.最简化: 函数参数在{}结构体中只出现一次，且无循环嵌套，用"_"表示
    list.foreach(println(_))
  }
}
