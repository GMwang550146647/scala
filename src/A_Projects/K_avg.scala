package A_Projects

object K_avg {
  //1.定义RichList类，给普通的List添加avg方法
  class RichList(list:List[Int]){
    //2.定义avg方法，获取平均值
    def avg()={
      if(list.size==0) None
      else Some(list.sum/list.size)
    }
  }
  def main(args: Array[String]): Unit = {
    //3.核心步骤，定义隐式转换方法，将普通的List转换为->RichList对象
    implicit def convert(list:List[Int]) =new RichList(list)
    //4.定义List列表，并获取元素平均值
    val list=List(1,2,3,4,5)
    println(list.avg())
  }
}
