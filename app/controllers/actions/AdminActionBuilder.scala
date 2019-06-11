package controllers.actions


import javax.inject.Inject
import models.User
import pdi.jwt.JwtSession._
import play.api.Configuration
import play.api.mvc.Results._
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}

class AdminActionBuilder @Inject()(parser: BodyParsers.Default)(implicit ec: ExecutionContext, conf: Configuration)
  extends ActionBuilderImpl(parser) {
  override def invokeBlock[A](request: Request[A], block: Request[A] => Future[Result]): Future[Result] = {
    request.jwtSession.getAs[User]("user") match {
      case Some(user) if user.isAdmin =>
        block(new AuthenticatedRequest(user, request)).map(_.refreshJwtSession(request))
      case Some(_) =>
        Future(Forbidden.refreshJwtSession(request))
      case _ =>
        Future(Unauthorized("Not allowed to go ahead."))
    }
  }
}