package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

class Application extends Controller {

  def index = Action {
    //Ok(views.html.index("Your new application is ready."))

    //Add comment   branch l-001
    Ok(JsObject(Seq("message" ->JsString("It Works!"))))
  }

}
