package app

import react.*
import react.dom.*
import logo.*
import ticker.*


@JsModule("src/contrib/propaganda.png")
external val sme: dynamic



class App : RComponent<RProps, RState>() {


    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h1 {
                +"tschess"
            }
        }
        p("App-ticker") {
            iframe {
                attrs {
                    width="560"
                    height="315"
                    src="https://www.youtube.com/embed/CtEyGuC_LCs"

                }
            }
        }
        div("App-contrib") {
            h1 {
                +"open source contributions"
            }
            div {

                a(href = "https://github.com/tschess") {
                    img(src = sme){}
                }


            }
        }
    }
}



fun RBuilder.app() = child(App::class) {}

