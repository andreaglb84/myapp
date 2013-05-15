package myapp.pages

import info.magnolia.module.blossom.annotation.Area
import info.magnolia.module.blossom.annotation.AvailableComponentClasses
import it.openmindonline.maglev.ForTemplate
import myapp.components.ArticleController


@Area("areaNewsBody")
@AvailableComponentClasses([ArticleController.class])
@ForTemplate([NewsPageController.class])
class AreaNewsBodyController {

    def index() { }
}
