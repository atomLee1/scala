trait SpecialException extends Throwable

object Test {
  def run(): Unit = {
    try {
      ???
    } catch {
      case e: SpecialException => e.isInstanceOf[SpecialException]
      case e =>
    }

    // OKAY
    // (null: Throwable) match {
    //   case e: SpecialException => e.isInstanceOf[SpecialException]
    //   case e =>
    // }
  }
}
