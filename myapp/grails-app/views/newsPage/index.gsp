<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib prefix="cms" uri="http://magnolia-cms.com/taglib/templating-components/cms" %>
<%@ taglib prefix="cmsfn" uri="http://magnolia-cms.com/taglib/templating-components/cmsfn" %>

<g:set var="cmsfn" value="${info.magnolia.templating.jsp.cmsfn.JspTemplatingFunction}" scope="request" />

<!DOCTYPE html>
<head>
    <meta name="layout" content="base"/>
    <title>${content?.title ?: ""}</title>
    <cms:init/>
</head>

<body>

<div class="page-header">
    <h1>${content?.title ?: ""}</h1>
</div>

<div class="row">
    <cms:area name="areaNewsBody"/>
</div>


</body>
</html>
