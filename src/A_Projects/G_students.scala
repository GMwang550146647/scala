package A_Projects

object G_students {
  def main(args: Array[String]): Unit = {
    val stuList=List(("gmwang",90,73,23),("feifei",99,88,70),("nobody",100,9,90),("someone",100,0,20))
    //1.获取语文成绩大于等于70
    val chineseList=stuList.filter(_._2 >= 60)
    println(chineseList)
    //2.获取每个学生的总成绩
    val scoreList=stuList.map(x=> x._1 -> (x._2+x._3+x._4))
    println(scoreList)
    //3.按最高成绩（降序）进行排序
    val sortedList1=scoreList.sortBy(_._2).reverse
    val sortedList2=scoreList.sortWith(_._2>_._2)
    println(sortedList1)
    println(sortedList2)
  }
}
