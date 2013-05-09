package myapp.pages

import info.magnolia.module.blossom.annotation.Area
import info.magnolia.module.blossom.annotation.AvailableComponentClasses
import info.magnolia.module.blossom.annotation.ComponentInheritanceMode
import info.magnolia.module.blossom.annotation.Inherits
import info.magnolia.module.blossom.annotation.TabFactory
import info.magnolia.module.blossom.dialog.TabBuilder
import it.openmindonline.maglev.ForTemplate
import myapp.components.SomeContentController
import myapp.components.TextController


@Area("rightColumn")
@Inherits(components = ComponentInheritanceMode.ALL)
@AvailableComponentClasses([SomeContentController.class,TextController.class])
@ForTemplate([DemoTemplateController.class])

class RightColumnController {

	def index = {
		render(view: "/demoTemplate/rightColumn")
    }

    @TabFactory("Info")
    public void propertiesDialog(TabBuilder builder) {
		builder.addEdit("test","Test","")
    }
	
	@TabFactory("Tab prova")
	public void tabDiProva(TabBuilder builder) {
		builder.addEdit("prova","Prova","")
	}
}