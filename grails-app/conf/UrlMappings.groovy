class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/rest/texto"(resources:"Texto")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
