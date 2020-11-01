package G_FUNCTIONCODING
/*
map
格式：
  def map[B]f:(A) =>B) TraversableOnce[B]
简写：
  def map(函数对象）
 */
object fc_02_map {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4,5)
    //1.最详细版本
    val list1=list.map((x:Int) => {x+1})
    println(list1)
    //2.初步简化
    val list2=list.map(x=> x+1)
    println(list2)
    //3.最简化: 函数参数在{}结构体中只出现一次，且无循环嵌套，用"_"表示
    val list3=list.map(_+1)
    println(list3)
  }
}
