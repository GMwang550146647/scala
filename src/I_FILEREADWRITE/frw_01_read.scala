package I_FILEREADWRITE
/*
1.从文件读取（行）
2.从文件中读取（字符）
3.读取并处理数据
4.从url或其他圆获取数据
5.读取二进制文件
 */
import java.io.{File, FileInputStream}

import scala.io.{BufferedSource, Source}

object frw_01_read {
  def main(args: Array[String]): Unit = {
    //1.行读取
    val source1: BufferedSource =Source.fromFile("src/I_FILEREADWRITE/frw_01_read.txt","utf-8")
    val line_iter:Iterator[String]=source1.getLines()
    //1.1.迭代器读取
    for (linei <-line_iter) println(linei)
    //1.2.转成list再读取
//    val list=lines1.toList
    source1.close()


    //2.按字符读取
    val source2:BufferedSource=Source.fromFile("src/I_FILEREADWRITE/frw_01_read.txt","utf-8")

    //2.1.迭代器读取
    val byte_iter:Iterator[Char]=source2.buffered
    while(byte_iter.hasNext) print(byte_iter.next())
    println()
    //2.2.直接读取
//    val str=source2.mkString
//    println(str)
    source2.close()

    //3.读取文件并提取内容
    val source3:BufferedSource=Source.fromFile("src/I_FILEREADWRITE/frw_01_read2.txt","utf-8")
    val str3=source3.mkString
    val strArray:Array[String]=str3.split("""\s+""")
    for (stri <- strArray) println(stri)
    val intArray=strArray.map(_.toInt +1)
    for (stri <- intArray) println(stri)
    source3.close()

    //4.从url获取数据
    val source4:BufferedSource=Source.fromURL("https://www.baidu.com")
    val str4=source4.mkString
    println(str4.slice(0,40))

    //*4.1.从字符串读取
    val source41:Source=Source.fromString("这是一个字符串")
    val str41=source41.mkString
    println(str41)

    //5.读取二进制文件(scala没有，要从java读取)
    val file=new File("src/I_FILEREADWRITE/frw_01_read.png")
    val fis=new FileInputStream(file)
    val bys=new Array[Byte](666666)
    val len=fis.read(bys)
    println(s"读取到的字节数:${len}")
    println(s"使用的缓存区大小:${bys.length}")
  }
}
