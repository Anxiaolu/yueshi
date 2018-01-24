var pageCount = 1,pageSize = 5;
var url = decodeURI(window.location.pathname);
var locate = url.split("/");
        (function(){
            $.ajax({
                url: ctx + '/article/article_list',
                type: 'POST',
                data: {pageNum: pageCount, pageSize: '5', category: locate[locate.length-1] ,tag:locate[locate.length-1]},
                success: function (returnData) {
                    var htmlList = '',
                    htmlTemp = $.ajax({url: ctx + "/views/front/front-common/article_model.jsp",async:false}).responseText;
                    returnData.forEach(function (object) {
                        htmlList += htmlTemp.tmp(object);
                    });
                    $("#article_list").html(htmlList);
                }
            })
            $.ajax({
                url:ctx + '/article/article_num',
                type: 'POST',
                data: {category:locate[locate.length-1]},
                success: function (returnData) {
                    pageNum = Math.ceil(returnData / pageSize);
                    $('.pagination').append("<li><a href=\"#\" id=\"pre\">&laquo;</a></li>");
                    if (pageNum > 8) {
                        //
                    }else{
                        for (var i = 1; i < pageNum+1; i++) {
                            $('.pagination').append("<li><a href=\"#\">" + i + "</a></li>");
                        }
                    }
                    $('.pagination').append("<li><a href=\"#\" id=\"next\">&raquo;</a></li>");
                }
            })
        })();
        $('.pagination').on('click','li > a',function(){
            if (this.id == 'pre') {
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
            else if (this.id == 'next') {
                pageCount += 1;
                if (pageCount > pageNum) {
                    $.confirm({
                        theme: 'dark',
                        animation: 'rotateX',
                        closeAnimation: 'rotateX',
                        title: false,
                        content: '已经是最后一页',
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
            else{
                pageCount = this.text;
            }
            $.ajax({
                url: ctx + '/article/article_list',
                type: 'POST',
                data: {pageNum: pageCount, pageSize: '5',category: locate[locate.length-1] ,tag:locate[locate.length-1]},
                success: function (returnData) {
                    var htmlList = '',
                    htmlTemp = $.ajax({url: ctx + "/views/front/front-common/article_model.jsp",async:false}).responseText;
                    returnData.forEach(function (object) {
                        htmlList += htmlTemp.tmp(object);
                    });
                    $("#article_list").html(htmlList);
                }
            })
        })