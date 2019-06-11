package controllers

import controllers.actions.{AdminActionBuilder, AuthenticatedActionBuilder, SecuredControllerComponents}
import javax.inject.Inject
import play.api.mvc._

import scala.concurrent.Future

class SecuredController @Inject()(scc: SecuredControllerComponents) extends AbstractController(scc) {
  def AuthenticatedAction: AuthenticatedActionBuilder = scc.authenticatedActionBuilder

  def myFirstJwtSecuredActionAsync: Action[AnyContent] = AdminAction.async {
    Future.successful(Ok("Hey!"))
  }

  def myFirstJwtSecuredAction: Action[AnyContent] = AdminAction {
    Ok("Hey!")
  }

  def AdminAction: AdminActionBuilder = scc.adminActionBuilder
}