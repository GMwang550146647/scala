package C_TRAIT

object trait_05_zhiZeLianMoShi {
  def main(args: Array[String]): Unit = {
    val p=new Payment
    p.pay("最后，买了一头猪，给支付宝转账10块钱")
  }
  trait Handler{
    def handle(data:String)={
      println("具体的处理数据")
      println(data)
    }
  }
  trait DataValidHandler extends Handler{
    override def handle(data: String): Unit = {
      println("验证数据")
      super.handle(data)
    }
  }
  trait SignatureValidHandler extends Handler{
    override def handle(data: String): Unit = {
      println("检查签名")
      super.handle(data)
    }
  }
  class Payment extends DataValidHandler with SignatureValidHandler{//叠加特质
    def pay(data:String): Unit ={
      println("用户发起支付请求")
      super.handle(data)
    }
  }
}
