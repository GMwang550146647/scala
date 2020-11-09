package A_Projects

import java.io.{BufferedWriter, FileWriter}

import scala.io.Source
/*
对乱序文件按总分排序再写回文件中
 */
object I_readwrite {


  def main(args: Array[String]): Unit = {
    //1.read
    val input_file = "src/A_Projects/I_readwrite_read.txt"
    val source=Source.fromFile(input_file, "utf-8")
    val lines = source.getLines().toList
    //切分 -> 类型转换 -> 构建Student 对象 -> 用求和函数排序
    val persons = lines.map(_.split("""\s+""")).
      map(linei => Student(linei(0), linei(1).toInt, linei(2).toInt, linei(3).toInt)).
      sortWith(_.getSum()>_.getSum())
    print(persons)
    source.close()
    //2.write
    val output_file="src/A_Projects/I_readwrite_write.txt"
    val bw=new BufferedWriter(new FileWriter(output_file))
    for (personi <- persons){
        bw.write(s"${personi.name}\t${personi.chinese}\t${personi.math}\t${personi.english}\n")
    }
    bw.close()
  }

  case class Student(var name: String, var chinese: Int, var math: Int, var english: Int) {
    def getSum() = chinese + math + english
  }

}
