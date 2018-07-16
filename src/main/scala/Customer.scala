/**
  * Created by tiwarim on 7/12/2018.
  */
class Customer(val name: String, val address: String) {
  var id="" // if no access modifiers is given
  def id_=(value:String): Unit ={ // compiler complains as scala already provides this method
    if(id.isEmpty) {
      this.id=value
    }
  }
}

object Customer {
  def main(args: Array[String]): Unit = {
    val eric=new Customer("Eric","Baner Pashan Link Road, Sus Road")
    eric.id_=("000001")// default setter screated by scala

  }
}
