package segundo.parcial

class UrlMappings {

    static mappings = {
        "/api/"(view:"index")
        "/" (view:"index")
        "500"(view:'/error')
        "404"(view:'/notFound')
        //"401"(controller:'login')
        "/login/$action?"(controller: "login")
"/logout/$action?"(controller: "logout")
        //"/login"(resources:"login")
        
        "/divisasActivas"(controller:"activas", action:"consultar")
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
    }
}
