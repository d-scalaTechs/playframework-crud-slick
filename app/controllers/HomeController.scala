package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import services.GraySystemService
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class HomeController @Inject()(graySystem: GraySystemService) extends Controller {

  def index = Action.async { implicit request =>

    println("All gray systems")
    graySystem.listAllGraySystems map { graySystems =>
      Ok(views.html.index.render(graySystems))
    }
  }
}
