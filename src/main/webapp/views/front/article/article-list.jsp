<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>article_list</title>
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
                    <div class="location">
                    </div>
                    <div id="article_list">
                    </div>
                    <ul class="pagination">
                    </ul>
                </div>
            </div>
            <jsp:include page="/views/front/front-common/right.jsp" flush="true"/>
        </section>
        <jsp:include page="/views/front/front-common/front-footer.jsp" flush="true"/>
        <script type="text/javascript" src="${ctx}/assets/js/front/article-list.js"></script>
        <script type="text/javascript">
            //初始化当前位置
            if (locate[locate.length - 3] == 'articleTag') {
                    $('.location').append( '<a href=\"${ctx}/articleTag\">'+"标签页"+'</a>' + '>>' + '<a href=\"# \">'+locate[locate.length - 1]+'</a>');
                }
                if (locate[locate.length - 3] == 'category') {
                    $('.location').append( '<a href=\"${ctx}/category\">'+"分类类型"+ '</a>' + '>>' + '<a href=\"# \">'+locate[locate.length - 1]+'</a>');
                }
        </script>
    </body>
</html>

