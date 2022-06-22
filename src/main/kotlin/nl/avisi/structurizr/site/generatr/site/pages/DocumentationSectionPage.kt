package nl.avisi.structurizr.site.generatr.site.pages

import kotlinx.html.HTML
import nl.avisi.structurizr.site.generatr.site.components.contentDiv
import nl.avisi.structurizr.site.generatr.site.components.page
import nl.avisi.structurizr.site.generatr.site.components.renderedMarkdown
import nl.avisi.structurizr.site.generatr.site.context.DocumentationSectionPageContext

fun HTML.documentationSectionPage(context: DocumentationSectionPageContext) {
    page(context = context) {
        contentDiv {
            renderedMarkdown(context = context, markdown = context.section.content)
        }
    }
}