<%@ taglib prefix="cms" uri="http://magnolia-cms.com/taglib/templating-components/cms" %>
<%@ taglib prefix="cmsfn" uri="http://magnolia-cms.com/taglib/templating-components/cmsfn" %>
<%@ taglib prefix="media" uri="http://net.sourceforge.openutils/mgnlMedia" %>

<g:set var="mediaEl" value="${net.sourceforge.openutils.mgnlmedia.media.tags.el.MediaEl}" />
<div>
    <h1>${content.title}</h1>
    <p>${content.body}</p>
    
    <g:set var="mediaNode" value="${mediaEl.node(content.immagine)}" />
    <img src="${request.contextPath}${mediaEl.urlres(mediaNode, 'p400x200')}" />
</div>