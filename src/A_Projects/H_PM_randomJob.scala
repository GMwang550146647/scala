package A_Projects

import scala.io.StdIn

object H_PM_randomJob {
  def main(args: Array[String]): Unit = {
    println("please input integers 1-5 to get your job")
    val rand_int=StdIn.readInt()
    val occupation= rand_int match{
      case 1=> "聪明人"
      case 2=> "傻佬"
      case 3=> "傻仔"
      case 4=> "萌炳"
      case 5=> "儍X"
      case _=> "其他"
    }
  }
}
