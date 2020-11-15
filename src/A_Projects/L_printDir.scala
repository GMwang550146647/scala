package A_Projects

import java.io.File
object L_printDir {
  //打印指定目录下所有的文件路径
  def printFile(dir:File,depth:Int=0):Unit={
    if (depth>=3) print("")
    //1.不是文件夹，直接退出
    else if(!dir.isDirectory) println("Not Dir!")
    //2.是文件夹，遍历
    else{
      //2.1.找出该文件夹里面所有目录
      val dir_list=dir.listFiles()
//      print(dir_list.toList)
      for (filei <- dir_list){
        println("\t"*depth +filei.getName)
        if (filei.isDirectory) printFile(filei,depth+1)
      }
    }
  }
  def main(args: Array[String]): Unit = {
    printFile(new File("/Users/gm/Desktop/scala"))
  }
}
