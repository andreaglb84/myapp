package myapp.pages

import info.magnolia.module.blossom.annotation.AvailableComponentClasses
import info.magnolia.module.blossom.annotation.Template

@Template(id = "grailsModule:pages/productTemplate", title = "Productpage template")
class ProductTemplateController {

    def index() {
        def productName = params.article ?: ""
        render view: "productTemplate"
    }

}
