class UrlMappings {

	static mappings = {
//		"/$controller/$action?/$id?"{
//			constraints {
//				// apply constraints here
//			}
//		}
		
		
		"/g/$controller/$action?/$id?"{
			constraints {
			// apply constraints here
			}
		}
		
		"/css/*"(controller: "css")
		 "/images/*"(controller: "images")
		 "/js/*"(controller: "js")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
