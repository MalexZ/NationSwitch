
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

object coauthor_list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[String],List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(author: List[String],coauthor: List[String]):play.twirl.api.HtmlFormat.Appendable = {
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
                <strong>Coauthors of productive authors</strong>
            </h1>
        </header>


        <script>
              let authors = """),_display_(/*34.30*/Html(author.toString())),format.raw/*34.53*/(""";
              let coauthors = """),_display_(/*35.32*/Html(coauthor.toString())),format.raw/*35.57*/(""";

              for(let f = 0; f < coauthors.length; f++) """),format.raw/*37.57*/("""{"""),format.raw/*37.58*/("""
                  """),format.raw/*38.19*/("""document.write(JSON.stringify(authors[f])+":");
                  document.write(JSON.stringify(coauthors[f]));
                  document.write("<br>")
                  document.write("<br>")
              """),format.raw/*42.15*/("""}"""),format.raw/*42.16*/("""


        """),format.raw/*45.9*/("""</script>

    </body>
</html>
"""))
      }
    }
  }

  def render(author:List[String],coauthor:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(author,coauthor)

  def f:((List[String],List[String]) => play.twirl.api.HtmlFormat.Appendable) = (author,coauthor) => apply(author,coauthor)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-12T20:39:50.997
                  SOURCE: C:/NationSwitch/Frontend/app/views/coauthor_list.scala.html
                  HASH: c99f5e08e98c5966a427673128a74105edc925f4
                  MATRIX: 611->1|649->33|1021->75|1160->121|2623->1559|2667->1582|2727->1615|2773->1640|2860->1699|2889->1700|2936->1719|3172->1927|3201->1928|3239->1939
                  LINES: 23->1|24->2|29->3|34->4|64->34|64->34|65->35|65->35|67->37|67->37|68->38|72->42|72->42|75->45
                  -- GENERATED --
              */
          