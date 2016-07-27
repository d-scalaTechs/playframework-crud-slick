package pojos

import play.api.data.Form
import play.api.data.Forms._

/**
 *
 * @author Eric on 2016/7/21 15:51
 */
case class GrayServerFormData(name: String, description: String, entrance: String, serverType:Int,nonEmptyText:String,status:Int)
object GraySystemForm {

  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "description" -> nonEmptyText,
      "entrance" -> nonEmptyText,
      "serverType" -> number,
      "subSystem" -> nonEmptyText,
      "status" -> number
    )(GrayServerFormData.apply)(GrayServerFormData.unapply)
  )
}