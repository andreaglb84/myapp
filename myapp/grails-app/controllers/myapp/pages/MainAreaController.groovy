package myapp.pages

import info.magnolia.module.blossom.annotation.Area
import info.magnolia.module.blossom.annotation.AvailableComponentClasses
import it.openmindonline.maglev.ForTemplate
import myapp.components.SomeContentController
import myapp.components.TextController


@Area("mainArea")
@AvailableComponentClasses([SomeContentController.class, TextController.class])
@ForTemplate([ProductTemplateController.class,DemoTemplateController.class])
class MainAreaController {
	def index() {
		render view: "/productTemplate/mainArea"
	}
}
