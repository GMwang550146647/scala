package B_OOP
/*
静态方法
 */
import java.text.SimpleDateFormat
import java.util.Date

object oop_02_staticMethods {
  def main(args: Array[String]): Unit = {
    println(DateUtils.date2String(new Date(), "HH:mm:ss"))
    println(DateUtils.string2Date("1314年5月21日", "yyyy年MM月dd日"))
  }

  object DateUtils {
    var sdf: SimpleDateFormat = null

    def date2String(date: Date, template: String) = {
      sdf = new SimpleDateFormat(template)
      sdf.format(date)
    }

    def string2Date(dateString: String, template: String) = {
      sdf = new SimpleDateFormat(template)
      sdf.parse(dateString)
    }
  }
}
