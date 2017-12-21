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
        <link rel="stylesheet" type="text/css" href="${ctx}/assets/css/article/article-list-style.css">
    </head>
    <body class="user-select">
        <jsp:include page="/views/front/front-common/nav.jsp" flush="true"/>
        <section class="container content-page">
            <div class="content-wrap">
                <div class="content">
                    <c:forEach items="${articleList}" var="a">
                        <li><a href="${ctx}/article/article-content/${a.articleId}" draggable="false">${a.title}</a></li> 
                    </c:forEach>
                </div>  
            </div>
            <jsp:include page="/views/front/front-common/right.jsp" flush="true"/>
        </section>
        <jsp:include page="/views/front/front-common/front-footer.jsp" flush="true"/>
    </body>
    <script type="text/javascript">
        
    </script>
</html>
