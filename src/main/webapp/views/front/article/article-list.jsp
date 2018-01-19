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
                    <!-- <c:forEach items="${articleList}" var="a">
                        <li><a href="${ctx}/article/article-content/${a.articleId}" draggable="false">${a.title}</a></li> 
                    </c:forEach> -->
                    <div id="article_list">

                    </div>
                    <ul class="pagination">
                    </ul>
                </div>
            </div>
            <jsp:include page="/views/front/front-common/right.jsp" flush="true"/>
        </section>
        <jsp:include page="/views/front/front-common/front-footer.jsp" flush="true"/>
    </body>
    <script type="text/javascript">
        var pageCount = 1,pageSize = 5;
        (function(){
            $.ajax({
                url: ctx + '/article/article_list',
                type: 'POST',
                data: {pageNum: pageCount, pageSize: '5'},
                success: function (returnData) {
                    var htmlList = '',
                    htmlTemp = $.ajax({url: ctx + "/views/front/front-common/article_model.html",async:false}).responseText;
                    returnData.forEach(function (object) {
                        htmlList += htmlTemp.tmp(object);
                    });
                    $("#article_list").html(htmlList);
                }
            })
            $.ajax({
                url:ctx + '/article/article_num',
                type: 'POST',
                data: {},
                success: function (returnData) {
                    pageNum = Math.ceil(returnData / pageSize);
                    $('.pagination').append("<li><a href=\"#\">&laquo;</a></li>");
                    if (pageNum > 8) {
                        //
                    }else{
                        for (var i = 1; i < pageNum+1; i++) {
                            $('.pagination').append("<li><a href=\"#\">" + i + "</a></li>");
                        }
                    }
                    $('.pagination').append("<li><a href=\"#\">&raquo;</a></li>");
                }
            })
        })();
        $('.pagination').on('click','li > a',function(){
            if (this.text == '«') {
                pageCount -= 1;
                if (pageCount < 1) {
                    $.confirm({
                        theme: 'dark',
                        animation: 'rotateX',
                        closeAnimation: 'rotateX',
                        title: false,
                        content: '已经是第一页',
                        buttons: {
                            cancel: {
                                text: '取消',
                                btnClass: 'waves-effect waves-button'
                            }
                        }
                    })
                    pageCount = 1;
                }
            }
            if (this.text == '»') {
                pageCount += 1;
                if (pageCount > pageNum) {
                    $.confirm({
                        theme: 'dark',
                        animation: 'rotateX',
                        closeAnimation: 'rotateX',
                        title: false,
                        content: '已经是第一页',
                        buttons: {
                            cancel: {
                                text: '取消',
                                btnClass: 'waves-effect waves-button'
                            }
                        }
                    })
                    pageCount = pageNum;
                }
            }
            $.ajax({
                url: ctx + '/article/article_list',
                type: 'POST',
                data: {pageNum: pageCount, pageSize: '5'},
                success: function (returnData) {
                    var htmlList = '',
                    htmlTemp = $.ajax({url: ctx + "/views/front/front-common/article_model.html",async:false}).responseText;
                    returnData.forEach(function (object) {
                        htmlList += htmlTemp.tmp(object);
                    });
                    $("#article_list").html(htmlList);
                }
            })
        })
    </script>
</html>

