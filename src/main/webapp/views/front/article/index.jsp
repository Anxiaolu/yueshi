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
    </head>
    <body class="user-select">
        <jsp:include page="/views/front/front-common/nav.jsp" flush="true"/>
        <section class="container">
            <div class="content-wrap">
                <div class="content">
                    <div id="focusslide" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#focusslide" data-slide-to="0" class="active"></li>
                            <li data-target="#focusslide" data-slide-to="1"></li>
                        </ol>
                        <div class="carousel-inner" role="listbox">
                            <div class="item active">
                                <a href="#" target="_blank" title="木庄网络博客源码" >
                                    <img src="${ctx}/assets/images/banner_01.jpg" alt="木庄网络博客源码" class="img-responsive"></a>
                            </div>
                            <div class="item">
                                <a href="#" target="_blank" title="专业网站建设" >
                                    <img src="${ctx}/assets/images/banner_02.jpg" alt="专业网站建设" class="img-responsive"></a>
                            </div>
                        </div>
                        <a class="left carousel-control" href="#focusslide" role="button" data-slide="prev" rel="nofollow"> <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span class="sr-only">上一个</span> </a> <a class="right carousel-control" href="#focusslide" role="button" data-slide="next" rel="nofollow"> <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> <span class="sr-only">下一个</span> </a> </div>
                    <article class="excerpt-minic excerpt-minic-index">
                        <h2><span class="red">【推荐】</span><a target="_blank" href="#" title="${hottestArticle.title}" >${hottestArticle.title}</a>
                        </h2>
                        <p class="note">${hottestArticle.description}</p>
                    </article>
                    <div class="title">
                        <h3>最新发布</h3>
                        <div class="more">                
                            <!-- <a href="#" title="MZ-NetBlog主题" >MZ-NetBlog主题</a>                
                            <a href="#" title="IT技术笔记" >IT技术笔记</a>                
                            <a href="#" title="源码分享" >源码分享</a>                
                            <a href="#" title="靠谱网赚" >靠谱网赚</a>                
                            <a href="#" title="资讯分享" >资讯分享</a> -->
                            <c:forEach items="${articleCategory}" var="c">
                                <a href="#" title="${c.name}" >${c.name}</a> 
                            </c:forEach>                
                        </div>
                    </div>
                    <div id="article_list">

                    </div>
                    <nav class="pagination" style="display: none;">
                        <ul>
                            <li class="prev-page"></li>
                            <li class="active"><span>1</span></li>
                            <li><a href="?page=2">2</a></li>
                            <li class="next-page"><a href="?page=2">下一页</a></li>
                            <li><span>共 2 页</span></li>
                        </ul>
                    </nav>
                </div>
            </div>
            <jsp:include page="/views/front/front-common/right.jsp" flush="true"/>
        </section>
        <jsp:include page="/views/front/front-common/front-footer.jsp" flush="true"/>
    </body>
</html>
