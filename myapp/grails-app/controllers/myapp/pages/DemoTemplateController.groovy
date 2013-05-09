package myapp.pages


import info.magnolia.module.blossom.dialog.TabBuilder
import myapp.components.PageLinkController
import myapp.components.SomeContentController
import myapp.components.TextController
import info.magnolia.module.blossom.annotation.*

@Template(id = "grailsModule:pages/demoTemplate", title = "Demo template")
class DemoTemplateController {

    def index = {
        println "Pagetitle:"+content.title?:""
        render view: "demoTemplate"
    }

    @TabFactory("Content")
    public void propertiesDialog(TabBuilder builder) {
        builder.addEdit("title", "Title", "");
    }
}
