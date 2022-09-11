
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Nation Switch App
        </title>
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
        crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js" integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
        crossorigin=""></script>
        <style>
                #mapid """),format.raw/*15.24*/("""{"""),format.raw/*15.25*/(""" """),format.raw/*15.26*/("""height: 360px; """),format.raw/*15.41*/("""}"""),format.raw/*15.42*/("""
                """),format.raw/*16.17*/("""body """),format.raw/*16.22*/("""{"""),format.raw/*16.23*/("""
                    """),format.raw/*17.21*/("""font-family: Helvetica, Arial, sans-serif;
                    font-size: 15px;
                    color: #333;
                    background-color: #eee;
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/("""
                """),format.raw/*22.17*/("""body """),format.raw/*22.22*/("""{"""),format.raw/*22.23*/(""" """),format.raw/*22.24*/("""font-size: 12px; """),format.raw/*22.41*/("""}"""),format.raw/*22.42*/("""
        """),format.raw/*23.9*/("""</style>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0; text-align: center;">
                <strong>Nation Switch App</strong>
            </h1>

            <h6 style = "text-align: center">Press GO to start</h6>
            <br></br>
        </header>
        <div id="main-container">
            <div id="flag-container">
                <img src="" alt="">
            </div>
            <div id="mapid"></div>
            <br></br>
            <div id="info-container">

                <form action=""""),_display_(/*52.32*/routes/*52.38*/.HomeController.locationRequestForm()),format.raw/*52.75*/("""" method="GET">
                    <div class="row">
                        <button id="api-search-button" style="color: #4cc9f0; background: #031628;" class="btn col s4 offset-s4" type="submit">GO</button>
                    </div>
                </form>

            </div>
            <script>
                        var mymap = L.map('mapid').setView([51.505, -0.09], 2);
                        console.log("After");
                        console.log(mymap);
                        L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*63.71*/("""{"""),format.raw/*63.72*/("""id"""),format.raw/*63.74*/("""}"""),format.raw/*63.75*/("""/tiles/"""),format.raw/*63.82*/("""{"""),format.raw/*63.83*/("""z"""),format.raw/*63.84*/("""}"""),format.raw/*63.85*/("""/"""),format.raw/*63.86*/("""{"""),format.raw/*63.87*/("""x"""),format.raw/*63.88*/("""}"""),format.raw/*63.89*/("""/"""),format.raw/*63.90*/("""{"""),format.raw/*63.91*/("""y"""),format.raw/*63.92*/("""}"""),format.raw/*63.93*/("""?access_token="""),format.raw/*63.107*/("""{"""),format.raw/*63.108*/("""accessToken"""),format.raw/*63.119*/("""}"""),format.raw/*63.120*/("""', """),format.raw/*63.123*/("""{"""),format.raw/*63.124*/("""
                        """),format.raw/*64.25*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
                        maxZoom: 18,
                        id: 'mapbox/streets-v11',
                        tileSize: 512,
                        zoomOffset: -1,
                        accessToken: 'pk.eyJ1IjoiZ2lhbjk4OTgiLCJhIjoiY2t0cmlnNHo5MHVuMzJ3bGF3Mjh4YmRvYSJ9.EZv305bKMKlHKdk6ufMIBg'
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/(""").addTo(mymap);
            </script>
        </div>

    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-12T20:39:51.059
                  SOURCE: C:/NationSwitch/Frontend/app/views/login.scala.html
                  HASH: c91b4ed3d68e0321a5917b493adfe980f98cb72e
                  MATRIX: 908->1|1028->28|1737->711|1766->712|1795->713|1838->728|1867->729|1912->746|1945->751|1974->752|2023->773|2224->946|2253->947|2298->964|2331->969|2360->970|2389->971|2434->988|2463->989|2499->998|4111->2585|4126->2591|4184->2628|4753->3169|4782->3170|4812->3172|4841->3173|4876->3180|4905->3181|4934->3182|4963->3183|4992->3184|5021->3185|5050->3186|5079->3187|5108->3188|5137->3189|5166->3190|5195->3191|5238->3205|5268->3206|5308->3217|5338->3218|5370->3221|5400->3222|5453->3247|5966->3732|5995->3733
                  LINES: 27->1|32->2|45->15|45->15|45->15|45->15|45->15|46->16|46->16|46->16|47->17|51->21|51->21|52->22|52->22|52->22|52->22|52->22|52->22|53->23|82->52|82->52|82->52|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|93->63|94->64|100->70|100->70
                  -- GENERATED --
              */
          