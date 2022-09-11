
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import play.api.libs.json.Json
/*2.2*/import scala.collection.JavaConverters._

object author_list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(author: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">


        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />

        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
        crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js" integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
        crossorigin=""></script>

    </head>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0">
                <strong>Productive authors</strong>
            </h1>
        </header>


        <script>
              let authors = """),_display_(/*34.30*/Html(author.toString())),format.raw/*34.53*/(""";

              for(let f = 0; f < authors.length; f++) """),format.raw/*36.55*/("""{"""),format.raw/*36.56*/("""
                  """),format.raw/*37.19*/("""document.write(JSON.stringify(authors[f]));
                  document.write("<br>")
                  document.write("<br>")
              """),format.raw/*40.15*/("""}"""),format.raw/*40.16*/("""
        """),format.raw/*41.9*/("""</script>

    </body>
</html>
"""))
      }
    }
  }

  def render(author:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(author)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (author) => apply(author)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-12T20:39:50.980
                  SOURCE: C:/NationSwitch/Frontend/app/views/author_list.scala.html
                  HASH: 53a2b695ecb0b81d52bd8ee22357583b366a3365
                  MATRIX: 611->1|649->33|1006->75|1122->98|2572->1523|2616->1546|2701->1603|2730->1604|2777->1623|2945->1763|2974->1764|3010->1773
                  LINES: 23->1|24->2|29->3|34->4|64->34|64->34|66->36|66->36|67->37|70->40|70->40|71->41
                  -- GENERATED --
              */
          