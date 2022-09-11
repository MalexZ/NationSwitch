
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

object conference_locations_list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(locations: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">


        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        -->
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
        crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js" integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
        crossorigin=""></script>
        <style>
                #mapid """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/(""" """),format.raw/*23.26*/("""height: 360px; """),format.raw/*23.41*/("""}"""),format.raw/*23.42*/("""
        """),format.raw/*24.9*/("""</style>
    </head>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0">
                <strong>Conference Locations</strong>
            </h1>
        </header>
        <p class="focused" style="font-size: 20px;
            color: #3F51B5">"""),_display_(/*34.30*/locations),format.raw/*34.39*/("""</p>
        <div id="mapid"></div>
        <script>

                var mymap = L.map('mapid').setView([51.505, -0.09], 2);
                console.log("After");
                console.log(mymap);
            L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*41.59*/("""{"""),format.raw/*41.60*/("""id"""),format.raw/*41.62*/("""}"""),format.raw/*41.63*/("""/tiles/"""),format.raw/*41.70*/("""{"""),format.raw/*41.71*/("""z"""),format.raw/*41.72*/("""}"""),format.raw/*41.73*/("""/"""),format.raw/*41.74*/("""{"""),format.raw/*41.75*/("""x"""),format.raw/*41.76*/("""}"""),format.raw/*41.77*/("""/"""),format.raw/*41.78*/("""{"""),format.raw/*41.79*/("""y"""),format.raw/*41.80*/("""}"""),format.raw/*41.81*/("""?access_token="""),format.raw/*41.95*/("""{"""),format.raw/*41.96*/("""accessToken"""),format.raw/*41.107*/("""}"""),format.raw/*41.108*/("""', """),format.raw/*41.111*/("""{"""),format.raw/*41.112*/("""
                """),format.raw/*42.17*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
                maxZoom: 18,
                id: 'mapbox/streets-v11',
                tileSize: 512,
                zoomOffset: -1,
                accessToken: 'pk.eyJ1IjoiZ2lhbjk4OTgiLCJhIjoiY2t0cmlnNHo5MHVuMzJ3bGF3Mjh4YmRvYSJ9.EZv305bKMKlHKdk6ufMIBg'
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""").addTo(mymap);

                var locations= """),_display_(/*50.33*/Html(locations.toString())),format.raw/*50.59*/(""";
                console.log(locations[0]);
                //var lon;
                //console.log();
                //for(location of locations)"""),format.raw/*54.45*/("""{"""),format.raw/*54.46*/("""
                """),format.raw/*55.17*/("""//add logic
                //"""),format.raw/*56.19*/("""}"""),format.raw/*56.20*/("""
                """),format.raw/*57.17*/("""for(let f = 0; f < locations.length; f++) """),format.raw/*57.59*/("""{"""),format.raw/*57.60*/("""
                    """),format.raw/*58.21*/("""fetch(location.protocol + '//nominatim.openstreetmap.org/search?format=json&q=' + locations[f])
                            .then(response => response.json())
                            .then(data => """),format.raw/*60.43*/("""{"""),format.raw/*60.44*/("""
                                """),format.raw/*61.33*/("""console.log(data[0].lon);
                                console.log(data[0].lat);
                                var popup = new L.marker([data[0].lat, data[0].lon]).bindPopup(locations[f]).addTo(mymap);
                            """),format.raw/*64.29*/("""}"""),format.raw/*64.30*/(""");
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""
        """),format.raw/*66.9*/("""</script>

    </body>
</html>
"""))
      }
    }
  }

  def render(locations:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(locations)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (locations) => apply(locations)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-12T20:39:51.027
                  SOURCE: C:/NationSwitch/Frontend/app/views/conference_locations_list.scala.html
                  HASH: 75912138fa9e07660fdd21f6a4c329e4c4dd93d4
                  MATRIX: 611->1|649->33|1020->75|1139->101|2363->1299|2392->1300|2421->1301|2464->1316|2493->1317|2529->1326|2879->1649|2909->1658|3195->1916|3224->1917|3254->1919|3283->1920|3318->1927|3347->1928|3376->1929|3405->1930|3434->1931|3463->1932|3492->1933|3521->1934|3550->1935|3579->1936|3608->1937|3637->1938|3679->1952|3708->1953|3748->1964|3778->1965|3810->1968|3840->1969|3885->1986|4350->2423|4379->2424|4455->2473|4502->2499|4679->2648|4708->2649|4753->2666|4811->2696|4840->2697|4885->2714|4955->2756|4984->2757|5033->2778|5262->2979|5291->2980|5352->3013|5615->3248|5644->3249|5691->3268|5720->3269|5756->3278
                  LINES: 23->1|24->2|29->3|34->4|53->23|53->23|53->23|53->23|53->23|54->24|64->34|64->34|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|71->41|72->42|78->48|78->48|80->50|80->50|84->54|84->54|85->55|86->56|86->56|87->57|87->57|87->57|88->58|90->60|90->60|91->61|94->64|94->64|95->65|95->65|96->66
                  -- GENERATED --
              */
          