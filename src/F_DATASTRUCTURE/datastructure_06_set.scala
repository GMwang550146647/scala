package F_DATASTRUCTURE
import scala.collection.mutable.{Set => mSet}
/*
集合：
不可变集
创建：
  val/var 变量名=Set[类型]()
  val/var 变量名=Set(e1,e2,e3...)

可变集
  val/var 变量名=Set[类型]()
  val/var 变量名=Set(e1,e2,e3...)
 */
object datastructure_06_set {
  def main(args: Array[String]): Unit = {
  //1.不可变集
    //1.1.创建
    val set1 = Set[Int]()
    val set2 = Set(1,3,2,4,5,2)
    println(set1)
    println(set2)
    //1.2.集大小
    println(set2.size)
    //1.3.添加 + ++
    val set_1=Set(1,2,3,4,5)
    val set_2=Set(3,4,5,6,7)
    println(set_1++set_2)
    println(set_1+1000)
    //1.4.删除 - --
    println(set_1 -1)
    println(set_1 --set_2)

    //1.5.集合和列表的交互
    println(set_1 -- List(1,2,3))

  //2.可变集(与不可变集的唯一不同就是要导包)
    //2.1.创建
    val mset1 = mSet[Int]()
    val mset2 = mSet(1,3,2,4,5,2)
    println(mset1)
    println(mset2)
    //2.2.集大小
    println(mset2.size)
    //2.3.添加 + ++
    val mset_1=mSet(1,2,3,4,5)
    val mset_2=mSet(3,4,5,6,7)
    println(mset_1++mset_2)
    println(mset_1+1000)
    //2.4.删除 - --
    println(mset_1 -1)
    println(mset_1 --mset_2)

    //2.5.集合和列表的交互
    println(mset_1 -- List(1,2,3))
  }
}
