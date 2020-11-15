package F_DataStructure
/*
isEmpty  是否空
++       list拼接
head     第一个元素
tail     最后一个元素
reverse  翻转
take     前n个元素
drop     丢掉前n个元素剩下的
flatten  扁平化操作
zip      两个列表合成一个（拉链）
unzip    一个列表拆成两个（拆链）
toString 转换成字符串
mkString 转换为指定字符串格式
union    并集
interset 交集
diff     差集
 */

object datastructure_05_listFunctions {
  def main(args: Array[String]): Unit = {
    val list1=List(1,1,2,3,4,5,6,6)
    //1.isEmpty  是否空
    println(s"isEmpty:${list1.isEmpty}")
    //2.++       list拼接
    val list2=List(4,5,6)++List(6,7,8)
    println(s"++:${list2}")
    //3.head     第一个元素
    println(s"head:${list1.head}")
    //4.tail     最后一个元素
    println(s"tail:${list1.tail}")
    //5.reverse  翻转
    println(s"reverse:${list1.reverse}")
    //6.take     前n个元素
    println(s"take:${list1.take(3)}")
    //7.drop     丢掉前n个元素剩下的
    println(s"drop:${list1.drop(3)}")
    //8.flatten  扁平化操作
    val list_nested=List(List(1,2,3),List(List(4,5,6),List(7,8,9)),List(7,8,9)) //必须全为list的列表，不能list和其他value
    print(list_nested)
    println(s"flatten : origin(${list_nested})\t->\tflattened(${list_nested.flatten})")
    //9.zip      两个列表合成一个（拉链）
    val lt1=List(1,2,3,4,5)
    val lt2=List(11,22,33,44,55)
    val list9=lt1.zip(lt2)
    println(s"zip:${list9}")
    //10.unzip    一个列表拆成两个（拆链）
    val tuple1=list9.unzip
    println(s"unzip:${tuple1}")
    //11.toString 转换成字符串
    println(s"toString:${list1.toString()}")
    //12.mkString 转换为指定字符串格式
    println(s"mkString:${list1.mkString(";")}")
    //13.union    并集
    val unionList=list1.union(list2).distinct
    println(s"unionList:${unionList}")
    //14.intersect 交集
    val intersectList=list1.intersect(list2).distinct
    println(s"intersectList:${intersectList}")
    //15.diff     差集
    val diffList1=list1.diff(list2).distinct
    val diffList2=list2.diff(list1).distinct
    println(s"diff 1 - 2:${diffList1}")
    println(s"diff 2 - 1:${diffList2}")
  }
}
