
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
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="material-lite">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Material Lite Angular Admin Theme">
    <meta name="author" content="Theme Guys - The Netherlands">

    <title>Material Lite</title>

    <link href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!-- build:css css/vendors.min.css -->
    """),format.raw/*17.29*/("""
    """),format.raw/*18.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*18.50*/routes/*18.56*/.Assets.versioned("bower_components/angular-ui-select/dist/select.css")),format.raw/*18.127*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*19.50*/routes/*19.56*/.Assets.versioned("stylesheets/select2.css")),format.raw/*19.100*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*21.50*/routes/*21.56*/.Assets.versioned("bower_components/ng-wig/dist/css/ng-wig.css")),format.raw/*21.120*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*23.50*/routes/*23.56*/.Assets.versioned("bower_components/ng-table/dist/ng-table.css")),format.raw/*23.120*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*25.50*/routes/*25.56*/.Assets.versioned("bower_components/pikaday/css/pikaday.css")),format.raw/*25.117*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*27.50*/routes/*27.56*/.Assets.versioned("bower_components/c3/c3.css")),format.raw/*27.103*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*28.50*/routes/*28.56*/.Assets.versioned("bower_components/font-awesome/css/font-awesome.css")),format.raw/*28.127*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*30.50*/routes/*30.56*/.Assets.versioned("bower_components/animate.css/animate.css")),format.raw/*30.117*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*32.50*/routes/*32.56*/.Assets.versioned("stylesheets/material-lite-blank.css")),format.raw/*32.112*/("""">

    <link rel="stylesheet" media="screen" href=""""),_display_(/*34.50*/routes/*34.56*/.Assets.versioned("stylesheets/helpers.css")),format.raw/*34.100*/("""">


      <!-- IE Compatibility shims -->
      <!--[if lt IE 9]>
  <script app="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
  <![endif]-->
      <!--[if IE]>
  <script app="//cdnjs.cloudflare.com/ajax/libs/es5-shim/4.1.7/es5-shim.min.js"></script>
  <script app="//cdnjs.cloudflare.com/ajax/libs/classlist/2014.01.31/classList.min.js"></script>
  <script app="//cdnjs.cloudflare.com/ajax/libs/selectivizr/1.0.2/selectivizr-min.js"></script>
  <script app="//cdnjs.cloudflare.com/ajax/libs/flexie/1.0.3/flexie.min.js"></script>
  <![endif]-->
      <!-- end shims -->

  </head>

  <body ng-controller="MainController">
    <div id="app" class="app" ng-include="'assets/app/tpl/demo/app.html'"></div>

    <script src=""""),_display_(/*54.19*/routes/*54.25*/.Assets.versioned("bower_components/material-design-lite/material.js")),format.raw/*54.95*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*55.19*/routes/*55.25*/.Assets.versioned("bower_components/angular/angular.js")),format.raw/*55.81*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("bower_components/angular-route/angular-route.js")),format.raw/*56.93*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*57.19*/routes/*57.25*/.Assets.versioned("bower_components/angular-animate/angular-animate.js")),format.raw/*57.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*58.19*/routes/*58.25*/.Assets.versioned("bower_components/angular-ui-select/dist/select.js")),format.raw/*58.95*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*59.19*/routes/*59.25*/.Assets.versioned("bower_components/angular-sanitize/angular-sanitize.js")),format.raw/*59.99*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*60.19*/routes/*60.25*/.Assets.versioned("bower_components/angular-local-storage/dist/angular-local-storage.js")),format.raw/*60.114*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*61.19*/routes/*61.25*/.Assets.versioned("bower_components/lodash/dist/lodash.min.js")),format.raw/*61.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("bower_components/angular-simple-logger/dist/angular-simple-logger.js")),format.raw/*62.114*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*63.19*/routes/*63.25*/.Assets.versioned("bower_components/angular-google-maps/dist/angular-google-maps.js")),format.raw/*63.110*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*64.19*/routes/*64.25*/.Assets.versioned("bower_components/ng-file-upload/ng-file-upload.js")),format.raw/*64.95*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*65.19*/routes/*65.25*/.Assets.versioned("bower_components/ng-table/dist/ng-table.js")),format.raw/*65.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("bower_components/ng-wig/dist/ng-wig.js")),format.raw/*66.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("bower_components/moment/moment.js")),format.raw/*67.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("bower_components/pikaday/pikaday.js")),format.raw/*68.81*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("bower_components/pikaday-angular/pikaday-angular.js")),format.raw/*69.97*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("bower_components/d3/d3.js")),format.raw/*70.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.versioned("bower_components/c3/c3.js")),format.raw/*71.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*72.19*/routes/*72.25*/.Assets.versioned("bower_components/c3-angular/c3-angular.min.js")),format.raw/*72.91*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("bower_components/angulargrid/angulargrid.js")),format.raw/*73.89*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("bower_components/ngSmoothScroll/dist/angular-smooth-scroll.min.js")),format.raw/*74.111*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*75.19*/routes/*75.25*/.Assets.versioned("bower_components/ngSmoothScroll/dist/angular-smooth-scroll.min.js")),format.raw/*75.111*/("""" type="text/javascript"></script>


    <script src=""""),_display_(/*78.19*/routes/*78.25*/.Assets.versioned("app/js/vendors/angular-placeholders.js")),format.raw/*78.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*79.19*/routes/*79.25*/.Assets.versioned("app/js/vendors/angular-mdl.js")),format.raw/*79.75*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("app/js/demo/app.js")),format.raw/*80.64*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("app/js/demo/app.route.js")),format.raw/*81.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*82.19*/routes/*82.25*/.Assets.versioned("app/js/demo/app.config.js")),format.raw/*82.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*83.19*/routes/*83.25*/.Assets.versioned("app/js/app.constants.js")),format.raw/*83.69*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*84.19*/routes/*84.25*/.Assets.versioned("app/js/demo/controllers/main.js")),format.raw/*84.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("app/js/demo/controllers/dashboard.js")),format.raw/*85.82*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*86.19*/routes/*86.25*/.Assets.versioned("app/js/demo/controllers/todo.js")),format.raw/*86.77*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*87.19*/routes/*87.25*/.Assets.versioned("app/js/demo/controllers/ui-elements/loading.js")),format.raw/*87.92*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*88.19*/routes/*88.25*/.Assets.versioned("app/js/demo/controllers/gallery.js")),format.raw/*88.80*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("app/js/demo/controllers/forms/advanced-elements/select.js")),format.raw/*89.103*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*90.19*/routes/*90.25*/.Assets.versioned("app/js/demo/controllers/forms/advanced-elements/upload.js")),format.raw/*90.103*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*91.19*/routes/*91.25*/.Assets.versioned("app/js/demo/controllers/forms/advanced-elements/text-editor.js")),format.raw/*91.108*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*92.19*/routes/*92.25*/.Assets.versioned("app/js/demo/controllers/maps/clickable-map.js")),format.raw/*92.91*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*93.19*/routes/*93.25*/.Assets.versioned("app/js/demo/controllers/maps/searchable-map.js")),format.raw/*93.92*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*94.19*/routes/*94.25*/.Assets.versioned("app/js/demo/controllers/maps/zoomable-map.js")),format.raw/*94.90*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*95.19*/routes/*95.25*/.Assets.versioned("app/js/demo/controllers/maps/styled-map.js")),format.raw/*95.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*96.19*/routes/*96.25*/.Assets.versioned("app/js/demo/controllers/maps/full-map.js")),format.raw/*96.86*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("app/js/demo/controllers/charts.js")),format.raw/*97.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("app/js/demo/controllers/tables-data.js")),format.raw/*98.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*99.19*/routes/*99.25*/.Assets.versioned("app/js/demo/directives/dynamic-color.js")),format.raw/*99.85*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*100.19*/routes/*100.25*/.Assets.versioned("app/js/demo/directives/header.js")),format.raw/*100.78*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*101.19*/routes/*101.25*/.Assets.versioned("app/js/demo/directives/sidebar.js")),format.raw/*101.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*102.19*/routes/*102.25*/.Assets.versioned("app/js/modules/chat.js")),format.raw/*102.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*103.19*/routes/*103.25*/.Assets.versioned("app/js/modules/menu.js")),format.raw/*103.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*104.19*/routes/*104.25*/.Assets.versioned("app/js/modules/svg-map.js")),format.raw/*104.71*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*105.19*/routes/*105.25*/.Assets.versioned("app/js/modules/todo.js")),format.raw/*105.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*106.19*/routes/*106.25*/.Assets.versioned("app/js/directives/sticky.js")),format.raw/*106.73*/("""" type="text/javascript"></script>

      <!-- endbuild -->
  </body>
</html>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 09:38:09 BRT 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototypeplay/app/views/index.scala.html
                  HASH: 19a92c1d937db660bb9a70bf3d1d5cada18f07cf
                  MATRIX: 941->1|1037->4|1064->5|1778->715|1810->720|1882->765|1897->771|1990->842|2069->894|2084->900|2150->944|2230->997|2245->1003|2331->1067|2411->1120|2426->1126|2512->1190|2592->1243|2607->1249|2690->1310|2770->1363|2785->1369|2854->1416|2933->1468|2948->1474|3041->1545|3121->1598|3136->1604|3219->1665|3299->1718|3314->1724|3392->1780|3472->1833|3487->1839|3553->1883|4334->2637|4349->2643|4440->2713|4520->2766|4535->2772|4612->2828|4692->2881|4707->2887|4796->2955|4876->3008|4891->3014|4984->3086|5064->3139|5079->3145|5170->3215|5250->3268|5265->3274|5360->3348|5440->3401|5455->3407|5566->3496|5646->3549|5661->3555|5745->3618|5825->3671|5840->3677|5951->3766|6031->3819|6046->3825|6153->3910|6233->3963|6248->3969|6339->4039|6419->4092|6434->4098|6518->4161|6598->4214|6613->4220|6693->4279|6773->4332|6788->4338|6863->4392|6943->4445|6958->4451|7035->4507|7115->4560|7130->4566|7223->4638|7303->4691|7318->4697|7385->4743|7465->4796|7480->4802|7547->4848|7627->4901|7642->4907|7729->4973|7809->5026|7824->5032|7909->5096|7989->5149|8004->5155|8112->5241|8192->5294|8207->5300|8315->5386|8397->5441|8412->5447|8492->5506|8572->5559|8587->5565|8658->5615|8738->5668|8753->5674|8813->5713|8893->5766|8908->5772|8974->5817|9054->5870|9069->5876|9136->5922|9216->5975|9231->5981|9296->6025|9376->6078|9391->6084|9464->6136|9544->6189|9559->6195|9637->6252|9717->6305|9732->6311|9805->6363|9885->6416|9900->6422|9988->6489|10068->6542|10083->6548|10159->6603|10239->6656|10254->6662|10354->6740|10434->6793|10449->6799|10549->6877|10629->6930|10644->6936|10749->7019|10829->7072|10844->7078|10931->7144|11011->7197|11026->7203|11114->7270|11194->7323|11209->7329|11295->7394|11375->7447|11390->7453|11474->7516|11554->7569|11569->7575|11651->7636|11731->7689|11746->7695|11821->7749|11901->7802|11916->7808|11996->7867|12076->7920|12091->7926|12172->7986|12253->8039|12269->8045|12344->8098|12425->8151|12441->8157|12517->8211|12598->8264|12614->8270|12679->8313|12760->8366|12776->8372|12841->8415|12922->8468|12938->8474|13006->8520|13087->8573|13103->8579|13168->8622|13249->8675|13265->8681|13335->8729
                  LINES: 28->1|33->2|34->3|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|52->21|54->23|54->23|54->23|56->25|56->25|56->25|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|63->32|63->32|63->32|65->34|65->34|65->34|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|127->96|127->96|127->96|128->97|128->97|128->97|129->98|129->98|129->98|130->99|130->99|130->99|131->100|131->100|131->100|132->101|132->101|132->101|133->102|133->102|133->102|134->103|134->103|134->103|135->104|135->104|135->104|136->105|136->105|136->105|137->106|137->106|137->106
                  -- GENERATED --
              */
          