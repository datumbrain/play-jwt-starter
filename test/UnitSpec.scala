import org.scalatestplus.play._

class UnitSpec extends PlaySpec {

//  "CountController" should {
//
//    "return a valid result with action" in {
//      val counter: Counter = new Counter {
//        override def nextCount(): Int = 49
//      }
//      val controller = new CountController(stubControllerComponents(), counter)
//      val result = controller.count(FakeRequest())
//      contentAsString(result) must equal("49")
//    }
//  }
//
//  "AsyncController" should {
//
//    "return a valid result on action.async" in {
//      // actor system will create threads that must be cleaned up even if test fails
//      val actorSystem = ActorSystem("test")
//      try {
//        implicit val ec = actorSystem.dispatcher
//        val controller = new AsyncController(stubControllerComponents(), actorSystem)
//        val resultFuture = controller.message(FakeRequest())
//        contentAsString(resultFuture) must be("Hi!")
//      } finally {
//        // always shut down actor system at the end of the test.
//        actorSystem.terminate()
//      }
//    }
//
//  }

}