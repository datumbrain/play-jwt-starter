package models

import play.api.libs.json.{Json, OFormat}

case class User(firstName: String, lastName: String, isAdmin: Boolean)

object User {
  implicit val format: OFormat[User] = Json.format[User]
}