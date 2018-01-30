<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script>var ctx = '${ctx}';</script>
<article class="excerpt excerpt-1" style="">
    <header><a class="cat" href="#" title="$cmsTopic.title$" >$cmsTopic.title$<i></i></a>
        <h2><a href="${ctx}/article/articleContent/$cmsArticle.articleId$" title="$cmsArticle.title$" target="_blank" >$cmsArticle.title$</a>
        </h2>
    </header>
    <p class="meta">
        <time class="time"><i class="glyphicon glyphicon-time"></i> $cmsArticle.ctime$</time>
        <span class="views"><i class="glyphicon glyphicon-eye-open"></i> $cmsArticle.readnumber$</span> <a class="comment" href="##comment" title="评论" target="_blank" ><i class="glyphicon glyphicon-comment"></i> $cmsArticle.allowcomments$</a>
    </p>
    <p class="note">$cmsArticle.description$</p>
</article>  