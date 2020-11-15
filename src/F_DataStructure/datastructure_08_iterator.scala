package F_DataStructure
/*
每一类的集合都提供了迭代器Iterator
1.方法：
  hasNext:查询是否有下一个元素
  next:返回下一个元素，如果没有，抛出NoSuchElementException
 */
object datastructure_08_iterator {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4)

    //1.while
    val it=list.iterator
    while(it.hasNext) println(it.next())

    //2.for
    val it2=list.iterator
    for (item <- it2) println(item)
  }

}
