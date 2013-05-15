package myapp.pages

import info.magnolia.module.blossom.annotation.TabFactory
import info.magnolia.module.blossom.annotation.Template
import info.magnolia.module.blossom.dialog.TabBuilder

@Template(id="grailsModule:pages/newsPage", title="Pagina singola news")
class NewsPageController {

    def index() { }
	
	@TabFactory("Content")
	public void propertiesDialog(TabBuilder builder) {
		builder.addEdit("title", "Title", "");
	}
}

