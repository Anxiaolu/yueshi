<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script>var ctx = '${ctx}';</script>
<link rel="stylesheet" type="text/css" href="${ctx}/assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${ctx}/assets/css/nprogress.css">
<link rel="stylesheet" type="text/css" href="${ctx}/assets/css/style.css">
<link rel="stylesheet" type="text/css" href="${ctx}/assets/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="${ctx}/assets/images/icon.png">
<link rel="shortcut icon" href="${ctx}/assets/images/favicon.ico">
<script src="${ctx}/assets/js/jquery-2.1.4.min.js"></script>
<script src="${ctx}/assets/js/nprogress.js"></script>
<script src="${ctx}/assets/js/jquery.lazyload.min.js"></script>
<!--[if gte IE 9]>
  <script src="${ctx}/assets/js/jquery-1.11.1.min.js" type="text/javascript"></script>
  <script src="${ctx}/assets/js/html5shiv.min.js" type="text/javascript"></script>
  <script src="${ctx}/assets/js/respond.min.js" type="text/javascript"></script>
  <script src="${ctx}/assets/js/selectivizr-min.js" type="text/javascript"></script>
<![endif]-->
<!--[if lt IE 9]>
  <script>window.location.href='upgrade-browser.html';</script>
<![endif]-->