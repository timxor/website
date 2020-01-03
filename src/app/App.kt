package app

import react.*
import react.dom.*
import logo.*
import ticker.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("App-header") {
            logo()
            h1 {
                +"tschess"
            }
        }
        p("App-intro") {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }
        p("App-ticker") {
            ticker()
        }
        div("App-contrib") {
            h2 {
                +"open source contributors"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
