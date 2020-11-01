package G_FUNCTIONCODING
/*
flatmap： flat->map
格式
  def flatMap[B](f:(A)=> GentraversableOnce[B]: TraversableOnce[B]
简化
  def flatMap(F:(A)=> 把A换成B的扁平集合）
 */
object fc_03_flatmap {
  def main(args: Array[String]): Unit = {
    val list1=List("hadoop hive spark flink flume","kudu hbase sqoop sotrm")

    //1.分解flatten(map(...))
    val list_map=list1.map((s:String) => {s.split(" ").toList})
    println(list_map)
    val list_flat_map=list_map.flatten
    println(list_flat_map)

    //2.合成
    //2.1.复杂版本
    val list_flatmap1=list1.flatMap((s:String)=> {s.split(" ")})
    println(list_flatmap1)
    //2.2.初步简化
    val list_flatmap2=list1.flatMap(s=> s.split(" "))
    println(list_flatmap2)
    //2.3.最精简
    val list_flatmap3=list1.flatMap({_.split(" ")})
    println(list_flatmap3)
  }
}
