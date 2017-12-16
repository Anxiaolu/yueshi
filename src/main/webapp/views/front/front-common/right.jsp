<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<aside class="sidebar">
    <div class="fixed">
        <div class="widget widget-tabs">
            <ul class="nav nav-tabs" role="tablist">
                <li role="presentation" class="active"><a href="#notice" aria-controls="notice" role="tab" data-toggle="tab" >统计信息</a></li>
                <li role="presentation"><a href="#contact" aria-controls="contact" role="tab" data-toggle="tab" >联系站长</a></li>
            </ul>
            <div class="tab-content">
                <div role="tabpanel" class="tab-pane contact active" id="notice">
                    <h2>日志总数:
                        ${articleNum}篇
                    </h2>
                    <h2>网站运行:
                        <span id="sitetime"> </span></h2>
                </div>
                <div role="tabpanel" class="tab-pane contact" id="contact">
                    <h2>QQ:
                        <a href="" target="_blank" rel="nofollow" data-toggle="tooltip" data-placement="bottom" title=""  data-original-title="QQ:"></a>
                    </h2>
                    <h2>Email:
                        <a href="#" target="_blank" data-toggle="tooltip" rel="nofollow" data-placement="bottom" title=""  data-original-title="#"></a></h2>
                </div>
            </div>
        </div>
        <div class="widget widget_search">
            <form class="navbar-form" action="/Search" method="post">
                <div class="input-group">
                    <input type="text" name="keyword" class="form-control" size="35" placeholder="请输入关键字" maxlength="15" autocomplete="off">
                    <span class="input-group-btn">
                        <button class="btn btn-default btn-search" name="search" type="submit">搜索</button>
                    </span> </div>
            </form>
        </div>
    </div>
    <div class="widget widget_hot">
        <h3>最新评论文章</h3>
        <ul>
            <c:forEach items="${articleCommentTimeDesc}" var="actd">            
                <li><a title="用DTcms做一个独立博客网站（响应式模板）" href="#" >
                        <span class="thumbnail">
                            <img class="thumb" data-original="${ctx}/assets/images/201610181739277776.jpg" src="${ctx}/assets/images/201610181739277776.jpg" alt="用DTcms做一个独立博客网站（响应式模板）"  style="display: block;">
                        </span><span class="text">${actd.title}</span>
                        <span class="muted"><i class="glyphicon glyphicon-time"></i>${actd.ctime}</span>
                        <span class="muted"><i class="glyphicon glyphicon-eye-open"></i>${actd.allowcomments}</span>
                    </a>
                </li>
            </c:forEach>
        </ul>
    </div>
    <div class="widget widget_sentence">    

    </div>
    <div class="widget widget_sentence">    

    </div>
    <div class="widget widget_sentence">
        <h3>友情链接</h3>
        <div class="widget-sentence-link">
            <a href="#" title="网站建设" target="_blank" >网站建设</a>&nbsp;&nbsp;&nbsp;
        </div>
    </div>
</aside>