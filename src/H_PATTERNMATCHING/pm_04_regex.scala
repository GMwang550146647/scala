package H_PATTERNMATCHING

object pm_04_regex {
  def main(args: Array[String]): Unit = {
    //1.findAllMatchIn 返回iterator 可以转换成list再使用
    val regex1 =
      """[0-9]+?@.+?\.com""".r
    val emails = "sdj550146647@qq.com&&550146648@qq.com&&550146649@qq.com"
    val result = regex1.findAllMatchIn(emails).toList
    if (result.size != 0) println(s"legal mail: ${result}")
    else println("illegal mail")

    //2.过滤不合法邮箱(留下合法的)
    val regex2 =
      """^([0-9a-zA-Z]+?)@(.+?)\.com$""".r
    val emailList = List("2342344@qq.com", "alada2343@gmail.com", "zhangsan@163.com", "123dfasjk.com")
    val filterList = emailList.filter(regex2.findAllMatchIn(_).size != 0)
    println(filterList)

    //3.获取正则中的某些内容
    val list2=emailList.map{
      case x@ regex2(user,company) => x->(user,company)
      case x=> x->(None,None)
    }
    println(list2)
    val map1=list2.toMap
    println(map1("2342344@qq.com"))
  }
}
