
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

object nation_switch_app extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Nation Switch App</title>
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
                """),format.raw/*24.17*/("""* """),format.raw/*24.19*/("""{"""),format.raw/*24.20*/("""
                    """),format.raw/*25.21*/("""box-sizing: border-box;
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/("""
                """),format.raw/*27.17*/("""body """),format.raw/*27.22*/("""{"""),format.raw/*27.23*/("""
                    """),format.raw/*28.21*/("""font-family: Helvetica, Arial, sans-serif;
                    font-size: 15px;
                    color: #333;
                    background-color: #eee;
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""h1 """),format.raw/*33.20*/("""{"""),format.raw/*33.21*/("""
                    """),format.raw/*34.21*/("""text-align: center;
                """),format.raw/*35.17*/("""}"""),format.raw/*35.18*/("""
                """),format.raw/*36.17*/("""h3 """),format.raw/*36.20*/("""{"""),format.raw/*36.21*/("""
                    """),format.raw/*37.21*/("""text-allign: center;
                """),format.raw/*38.17*/("""}"""),format.raw/*38.18*/("""
                """),format.raw/*39.17*/("""#main-container """),format.raw/*39.33*/("""{"""),format.raw/*39.34*/("""
                    """),format.raw/*40.21*/("""width: 502px;
                    margin: 30px auto;
                    padding: 0;
                """),format.raw/*43.17*/("""}"""),format.raw/*43.18*/("""
                """),format.raw/*44.17*/("""#flag-container """),format.raw/*44.33*/("""{"""),format.raw/*44.34*/("""
                    """),format.raw/*45.21*/("""height: 252px;
                    background-color: #fff;
                    border: 1px solid #333;
                """),format.raw/*48.17*/("""}"""),format.raw/*48.18*/("""
                """),format.raw/*49.17*/("""#flag-container img """),format.raw/*49.37*/("""{"""),format.raw/*49.38*/("""
                    """),format.raw/*50.21*/("""display: block;
                    width: 100%;
                    height: 100%;
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/("""
                """),format.raw/*54.17*/("""#info-container select """),format.raw/*54.40*/("""{"""),format.raw/*54.41*/("""
                    """),format.raw/*55.21*/("""display: block;
                    margin: 20px auto;
                    padding: 5px;
                    min-width: 100%;
                    color: #333;
                    font-size: 15px;
                    font-weight: 900;
                    text-align-last: center;
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/("""
                """),format.raw/*64.17*/("""#info-container p """),format.raw/*64.35*/("""{"""),format.raw/*64.36*/("""
                    """),format.raw/*65.21*/("""padding: 0 10px;
                    font-weight: 600;
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""
                """),format.raw/*68.17*/("""#info-container p span """),format.raw/*68.40*/("""{"""),format.raw/*68.41*/("""
                    """),format.raw/*69.21*/("""font-weight: normal;
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/("""


                """),format.raw/*73.17*/("""body """),format.raw/*73.22*/("""{"""),format.raw/*73.23*/(""" """),format.raw/*73.24*/("""font-size: 12px; """),format.raw/*73.41*/("""}"""),format.raw/*73.42*/("""
                """),format.raw/*74.17*/("""#main-container """),format.raw/*74.33*/("""{"""),format.raw/*74.34*/(""" """),format.raw/*74.35*/("""width: 342px; """),format.raw/*74.49*/("""}"""),format.raw/*74.50*/("""
                """),format.raw/*75.17*/("""#flag-container """),format.raw/*75.33*/("""{"""),format.raw/*75.34*/(""" """),format.raw/*75.35*/("""height: 172px; """),format.raw/*75.50*/("""}"""),format.raw/*75.51*/("""
                """),format.raw/*76.17*/("""#info-container select """),format.raw/*76.40*/("""{"""),format.raw/*76.41*/(""" """),format.raw/*76.42*/("""font-size: 12px; font-weight: 600; """),format.raw/*76.77*/("""}"""),format.raw/*76.78*/("""

        """),format.raw/*78.9*/("""</style>
    </head>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #4cc9f0">
                <strong>Nation Switch App</strong>
            </h1>
            <h3 style = "text-align: center">Pave your own journey.</h3>
            <br>
            </br>
            <h3 style = "text-align: center">Beginning at your current location, begin adding nation stops on the map from dropdown.</h3>
            <br>
            </br>
        </header>
        <header>

        </header>
        <div id="mapid"></div>
        <div id="main-container">
            <div id="flag-container">
                <img src="" alt="">
            </div>
            <div id="info-container">
                <select id="countries"></select>
                <p>Capital: <span id="capital"></span></p>
                <p>Dialing Code: <span id="dialing-code"></span></p>
                <p>Language: <span id="language"></span></p>
                <p>Population: <span id="population"></span></p>
                <p>Currencies: <span id="currencies"></span></p>
                <p>Region: <span id="region"></span></p>
                <p>Subregion: <span id="subregion"></span></p>
                <button onclick="window.location='https://translate.google.com/?sl=auto&tl=ch&op=translate';">Translate</button>
            </div>
        </div>
        <script>

                var mymap = L.map('mapid').setView([51.505, -0.09], 2);
                console.log("After");
                console.log(mymap);
                L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*118.63*/("""{"""),format.raw/*118.64*/("""id"""),format.raw/*118.66*/("""}"""),format.raw/*118.67*/("""/tiles/"""),format.raw/*118.74*/("""{"""),format.raw/*118.75*/("""z"""),format.raw/*118.76*/("""}"""),format.raw/*118.77*/("""/"""),format.raw/*118.78*/("""{"""),format.raw/*118.79*/("""x"""),format.raw/*118.80*/("""}"""),format.raw/*118.81*/("""/"""),format.raw/*118.82*/("""{"""),format.raw/*118.83*/("""y"""),format.raw/*118.84*/("""}"""),format.raw/*118.85*/("""?access_token="""),format.raw/*118.99*/("""{"""),format.raw/*118.100*/("""accessToken"""),format.raw/*118.111*/("""}"""),format.raw/*118.112*/("""', """),format.raw/*118.115*/("""{"""),format.raw/*118.116*/("""
                    """),format.raw/*119.21*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
                    maxZoom: 18,
                    id: 'mapbox/streets-v11',
                    tileSize: 512,
                    zoomOffset: -1,
                    accessToken: 'pk.eyJ1IjoiZ2lhbjk4OTgiLCJhIjoiY2t0cmlnNHo5MHVuMzJ3bGF3Mjh4YmRvYSJ9.EZv305bKMKlHKdk6ufMIBg'
                """),format.raw/*125.17*/("""}"""),format.raw/*125.18*/(""").addTo(mymap);

                var locations = 'China';

                // Global Variables
                var language;

                //Dropdown asynchronous control of webpage
                const countriesList = document.getElementById("countries");
                let countries; // will contain "fetched" data

                // Event Listeners


                countriesList.addEventListener("change", newCountrySelection);

                function newCountrySelection(event) """),format.raw/*141.53*/("""{"""),format.raw/*141.54*/("""
                    """),format.raw/*142.21*/("""displayCountryInfo(event.target.value);

                """),format.raw/*144.17*/("""}"""),format.raw/*144.18*/("""



                """),format.raw/*148.17*/("""fetch("https://restcountries.com/v2/all")
                        .then(res => res.json())
                        .then(data => initialize(data))
                        .catch(err => console.log("Error:", err));


                function error(err) """),format.raw/*154.37*/("""{"""),format.raw/*154.38*/("""
                    """),format.raw/*155.21*/("""console.warn(`ERROR($"""),format.raw/*155.42*/("""{"""),format.raw/*155.43*/("""err.code"""),format.raw/*155.51*/("""}"""),format.raw/*155.52*/("""): $"""),format.raw/*155.56*/("""{"""),format.raw/*155.57*/("""err.message"""),format.raw/*155.68*/("""}"""),format.raw/*155.69*/("""`);
                """),format.raw/*156.17*/("""}"""),format.raw/*156.18*/(""";

                navigator.geolocation.getCurrentPosition(success, error, getPosition);

                function initialize(countriesData) """),format.raw/*160.52*/("""{"""),format.raw/*160.53*/("""

                    """),format.raw/*162.21*/("""countries = countriesData;
                    let options = "";
                    let findSelectedText = 0;
                    let textse;
                    for(let i=0; i<countries.length; i++) """),format.raw/*166.59*/("""{"""),format.raw/*166.60*/("""

                        """),format.raw/*168.25*/("""if(countries[i].name === "United States of America")"""),format.raw/*168.77*/("""{"""),format.raw/*168.78*/("""
                            """),format.raw/*169.29*/("""findSelectedText=i;
                        """),format.raw/*170.25*/("""}"""),format.raw/*170.26*/("""
                    """),format.raw/*171.21*/("""}"""),format.raw/*171.22*/("""
                    """),format.raw/*172.21*/("""countries.forEach(country => options+=`<option value="$"""),format.raw/*172.76*/("""{"""),format.raw/*172.77*/("""country.alpha3Code"""),format.raw/*172.95*/("""}"""),format.raw/*172.96*/("""">$"""),format.raw/*172.99*/("""{"""),format.raw/*172.100*/("""country.name"""),format.raw/*172.112*/("""}"""),format.raw/*172.113*/("""</option>`);

                    countriesList.innerHTML = options;

                    countriesList.selectedIndex = findSelectedText;
                    displayCountryInfo(countriesList[countriesList.selectedIndex].value);
                """),format.raw/*178.17*/("""}"""),format.raw/*178.18*/("""

                """),format.raw/*180.17*/("""function displayCountryInfo(countryByAlpha3Code) """),format.raw/*180.66*/("""{"""),format.raw/*180.67*/("""
                    """),format.raw/*181.21*/("""const countryData = countries.find(country => country.alpha3Code === countryByAlpha3Code);
                    document.querySelector("#flag-container img").src = countryData.flag;
                    document.querySelector("#flag-container img").alt = `Flag of $"""),format.raw/*183.83*/("""{"""),format.raw/*183.84*/("""countryData.name"""),format.raw/*183.100*/("""}"""),format.raw/*183.101*/("""`;
                    document.getElementById("capital").innerHTML = countryData.capital;
                    document.getElementById("dialing-code").innerHTML = `+$"""),format.raw/*185.76*/("""{"""),format.raw/*185.77*/("""countryData.callingCodes[0]"""),format.raw/*185.104*/("""}"""),format.raw/*185.105*/("""`;
                    document.getElementById("language").innerHTML = `$"""),format.raw/*186.71*/("""{"""),format.raw/*186.72*/("""countryData.languages[0].name"""),format.raw/*186.101*/("""}"""),format.raw/*186.102*/("""(Primary Language)`;
                    document.getElementById("population").innerHTML = countryData.population.toLocaleString("en-US");
                    document.getElementById("currencies").innerHTML = countryData.currencies.filter(c => c.name).map(c => `$"""),format.raw/*188.125*/("""{"""),format.raw/*188.126*/("""c.name"""),format.raw/*188.132*/("""}"""),format.raw/*188.133*/(""" """),format.raw/*188.134*/("""($"""),format.raw/*188.136*/("""{"""),format.raw/*188.137*/("""c.code"""),format.raw/*188.143*/("""}"""),format.raw/*188.144*/(""")`).join(", ");
                    document.getElementById("region").innerHTML = countryData.region;
                    document.getElementById("subregion").innerHTML = countryData.subregion;

                    fetch(location.protocol + '//nominatim.openstreetmap.org/search?format=json&q=' + countryData.name)
                            .then(response => response.json())
                            .then(data => """),format.raw/*194.43*/("""{"""),format.raw/*194.44*/("""
                                """),format.raw/*195.33*/("""console.log(countryData.latlng);
                                var popup = new L.marker(countryData.latlng).bindPopup(countryData.name).addTo(mymap);
                            """),format.raw/*197.29*/("""}"""),format.raw/*197.30*/(""");
                """),format.raw/*198.17*/("""}"""),format.raw/*198.18*/("""

        """),format.raw/*200.9*/("""</script>

    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-12-12T20:39:51.101
                  SOURCE: C:/NationSwitch/Frontend/app/views/nation_switch_app.scala.html
                  HASH: 97d387b080fde783bcbdc25d35db5c10d743bb26
                  MATRIX: 611->1|649->33|1088->75|2318->1279|2347->1280|2376->1281|2419->1296|2448->1297|2493->1314|2523->1316|2552->1317|2601->1338|2669->1378|2698->1379|2743->1396|2776->1401|2805->1402|2854->1423|3055->1596|3084->1597|3129->1614|3160->1617|3189->1618|3238->1639|3302->1675|3331->1676|3376->1693|3407->1696|3436->1697|3485->1718|3550->1755|3579->1756|3624->1773|3668->1789|3697->1790|3746->1811|3875->1912|3904->1913|3949->1930|3993->1946|4022->1947|4071->1968|4218->2087|4247->2088|4292->2105|4340->2125|4369->2126|4418->2147|4545->2246|4574->2247|4619->2264|4670->2287|4699->2288|4748->2309|5071->2604|5100->2605|5145->2622|5191->2640|5220->2641|5269->2662|5368->2733|5397->2734|5442->2751|5493->2774|5522->2775|5571->2796|5636->2833|5665->2834|5712->2853|5745->2858|5774->2859|5803->2860|5848->2877|5877->2878|5922->2895|5966->2911|5995->2912|6024->2913|6066->2927|6095->2928|6140->2945|6184->2961|6213->2962|6242->2963|6285->2978|6314->2979|6359->2996|6410->3019|6439->3020|6468->3021|6531->3056|6560->3057|6597->3067|8256->4697|8286->4698|8317->4700|8347->4701|8383->4708|8413->4709|8443->4710|8473->4711|8503->4712|8533->4713|8563->4714|8593->4715|8623->4716|8653->4717|8683->4718|8713->4719|8756->4733|8787->4734|8828->4745|8859->4746|8892->4749|8923->4750|8973->4771|9463->5232|9493->5233|10015->5726|10045->5727|10095->5748|10181->5805|10211->5806|10260->5826|10541->6078|10571->6079|10621->6100|10671->6121|10701->6122|10738->6130|10768->6131|10801->6135|10831->6136|10871->6147|10901->6148|10950->6168|10980->6169|11151->6311|11181->6312|11232->6334|11462->6535|11492->6536|11547->6562|11628->6614|11658->6615|11716->6644|11789->6688|11819->6689|11869->6710|11899->6711|11949->6732|12033->6787|12063->6788|12110->6806|12140->6807|12172->6810|12203->6811|12245->6823|12276->6824|12549->7068|12579->7069|12626->7087|12704->7136|12734->7137|12784->7158|13076->7421|13106->7422|13152->7438|13183->7439|13378->7605|13408->7606|13465->7633|13496->7634|13598->7707|13628->7708|13687->7737|13718->7738|14011->8001|14042->8002|14078->8008|14109->8009|14140->8010|14172->8012|14203->8013|14239->8019|14270->8020|14719->8440|14749->8441|14811->8474|15020->8654|15050->8655|15098->8674|15128->8675|15166->8685
                  LINES: 23->1|24->2|34->4|53->23|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|56->26|56->26|57->27|57->27|57->27|58->28|62->32|62->32|63->33|63->33|63->33|64->34|65->35|65->35|66->36|66->36|66->36|67->37|68->38|68->38|69->39|69->39|69->39|70->40|73->43|73->43|74->44|74->44|74->44|75->45|78->48|78->48|79->49|79->49|79->49|80->50|83->53|83->53|84->54|84->54|84->54|85->55|93->63|93->63|94->64|94->64|94->64|95->65|97->67|97->67|98->68|98->68|98->68|99->69|100->70|100->70|103->73|103->73|103->73|103->73|103->73|103->73|104->74|104->74|104->74|104->74|104->74|104->74|105->75|105->75|105->75|105->75|105->75|105->75|106->76|106->76|106->76|106->76|106->76|106->76|108->78|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|148->118|149->119|155->125|155->125|171->141|171->141|172->142|174->144|174->144|178->148|184->154|184->154|185->155|185->155|185->155|185->155|185->155|185->155|185->155|185->155|185->155|186->156|186->156|190->160|190->160|192->162|196->166|196->166|198->168|198->168|198->168|199->169|200->170|200->170|201->171|201->171|202->172|202->172|202->172|202->172|202->172|202->172|202->172|202->172|202->172|208->178|208->178|210->180|210->180|210->180|211->181|213->183|213->183|213->183|213->183|215->185|215->185|215->185|215->185|216->186|216->186|216->186|216->186|218->188|218->188|218->188|218->188|218->188|218->188|218->188|218->188|218->188|224->194|224->194|225->195|227->197|227->197|228->198|228->198|230->200
                  -- GENERATED --
              */
          