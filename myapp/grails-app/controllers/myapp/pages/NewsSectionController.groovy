package myapp.pages

import info.magnolia.module.blossom.annotation.TabFactory
import info.magnolia.module.blossom.annotation.Template
import info.magnolia.module.blossom.dialog.TabBuilder

@Template(id="grailsModule:pages/news_section", title="Sezione News")
class NewsSectionController {

    def index() { }
	
	@TabFactory("Content")
	void gestioneListaNews(TabBuilder tab){
		tab.addEdit("titolo", "Titolo pagina", "Titolo della pagina con la lista news")
	}
}
