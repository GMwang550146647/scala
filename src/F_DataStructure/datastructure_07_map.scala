package F_DataStructure
/*
map
不可变/可变 map
  元素和长度都不可变
  val/var map=Map(key->value,key->value...)
  val/var map=Map((key,value),(key,value)...)

修改
  map(key)=value

基本操作
  1.map(key) 得到key 对应的 value， 若无，返回None
  2.map.keys 得到所有的keys
  3.map.values 得到宿友的values
  4.遍历map 操作 for
  5.getOrElse 如果存在返回对应的值，如果不存在，返回默认值
  6.+，-/增加、删除键值对，并生成新的map
    Noted: 如果是可变Map，可以通过+=，++=直接往Map中添加元素
 */
import scala.collection.mutable.{Map => mMap}
object datastructure_07_map {
  def main(args: Array[String]): Unit = {
  //1.不可变map
    //1.1.创建
    val map11=Map("gmwang"->25,"feifei"->25,"feifei"->26) //由于有两个相同键值，所以取最新的，同样适用于++
    val map12=Map(("gmwang1",25),("feifei1",26))

    //1.2.修改
    //map11("gmwang")=100 //不能修改，这个报错
    //map11("newlkey")=100

  //2.可变map
    //2.1.创建
    val map21=mMap("gmwang"->25,"feifei"->25,"feifei"->26)
    val map22=mMap(("gmwang1",25),("feifei1",26))
    //2.2.修改
    map21("gmwang")=100
    map21("newkey")=10
    println(map21)

  //3.基本操作
    //3.1.基本
    println(map11("gmwang"))
//    println(map11("gmwanggmwang"))  //这样不安全，会报错
    println(map11.keys)
    println(map11.values)
    //3.2.遍历
    for ((a,b) <- map11) println(s"${a}->${b}")
    //3.3.取值（如果空则返回默认值）
    println(map11.getOrElse("gmwang",10000))
    println(map11.getOrElse("gmwanggmwang",10000))
    //3.4.键值对增删
    //+= -=
    map21 += "stranger" -> 999
    map21 -= "gmwang"
    //++= --= += -=
    map21++=map22
    map21--=map11.keys  //不能-- map 要-- key
    for ((a,b) <- map21) println(s"${a}->${b}")






  }
//  def print_map(x : mMap[String])= for ((a,b) <- x) println(s"${a}->${b}")
//  def print_map(x : Map[String])= for ((a,b) <- x) println(s"${a}->${b}")
}
