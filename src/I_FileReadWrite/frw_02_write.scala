package I_FileReadWrite
/*
1.写入文件
2.读写 scala对象
  1.一个类要实现序列化与反序列化就要继承Serializable特质
  2.其中样例类 case已经自动继承Serializable
 */
import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

object frw_02_write {
  def main(args: Array[String]): Unit = {
    //1.文件不存在会自动创建,目录不存在就报错
    val pw=new FileOutputStream("I_FileReadWrite/frw_02_write.txt")
    for (i <- 1 to 10) pw.write(s"${i}.gmwang is a good man and feifei is a good girl.\n".getBytes())
    pw.close()

    //2.序列化与反序列化（某对象）
    //2.1.无继承Serializable特质 ->报错
//    val file1="src/I_FILEREADWRITE/frw_02_write_obj1.txt"
//    val p1 =new Person_common("gmwang",23)
//      //序列化
//    val oos1=new ObjectOutputStream(new FileOutputStream(file1))
//    oos1.writeObject(p1)
//    oos1.close()
//      //反序列化
//    val ois1=new ObjectInputStream(new FileInputStream(file1))
//    val p11:Person_common=ois1.readObject().asInstanceOf[Person_common]
//    println(s"Person_common:${p11.name},${p11.age}")
//    ois1.close()
      //关闭文件

    //2.2.case 类 （默认继承了Serializable)
    val file2= "I_FileReadWrite/frw_02_write_obj2.txt"
    val p2 =new Person_case("gmwang",23)
    //序列化
    val oos2=new ObjectOutputStream(new FileOutputStream(file2))
    oos2.writeObject(p2)
    oos2.close()
    //反序列化
    val ois2=new ObjectInputStream(new FileInputStream(file2))
    val p21:Person_case=ois2.readObject().asInstanceOf[Person_case]
    println(s"Person_common:${p21.name},${p21.age}")
    ois2.close()

    //2.3.
  }
  class Person_common(name:String,age:Int)
  case class Person_case(name:String,age:Int)
}
