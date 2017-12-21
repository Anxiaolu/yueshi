<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html lang="zh-CN">
    <head>
        <meta charset="utf-8">
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Home</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <jsp:include page="/views/front/front-common/front-header.jsp" flush="true"/>
        <link rel="stylesheet" type="text/css" href="${ctx}/assets/css/article/article-list-show-style.css">
    </head>
    <body class="user-select">
        <jsp:include page="/views/front/front-common/nav.jsp" flush="true"/>
        <section class="container content-page">
            <div class="content-wrap">
                <div class="content">
                    <div>
                        <header class="article-header">
                            <h1 class="article-tag-title">文章类型</h1>
                        </header>
                        <ul class="plinks tag-list ptags">
                            <c:forEach items="${categorys}" var="c">
                             <li><a href="${ctx}/category/articleList/${c.name}" draggable="false">${c.name}<span class="badge">${c.type}</span></a></li> 
                            </c:forEach>
                        </ul>
                    </div>
                </div>
            </div>
            <jsp:include page="/views/front/front-common/right.jsp" flush="true"/>
        </section>
        <jsp:include page="/views/front/front-common/front-footer.jsp" flush="true"/>
    </body>
</html>
