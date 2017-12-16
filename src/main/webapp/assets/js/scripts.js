
$('.version').text(NProgress.version);
NProgress.start();
setTimeout(function () {
    NProgress.done();
    $('.fade').removeClass('out')
}, 1000);
(function () {
    $('img').attr('draggable', 'false');
    $('a').attr('draggable', 'false')
})();

function setCookie(name, value, time) {
    var strsec = getsec(time);
    var exp = new Date();
    exp.setTime(exp.getTime() + strsec * 1);
    document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString()
}
function getCookie(name) {
    var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
    if (arr = document.cookie.match(reg)) {
        return unescape(arr[2])
    } else {
        return null
    }
}
$.fn.navSmartFloat = function () {
    var position = function (element) {
        var top = element.position().top,
                pos = element.css("position");
        $(window).scroll(function () {
            var scrolls = $(this).scrollTop();
            if (scrolls > top) {
                $('.header-topbar').fadeOut(0);
                if (window.XMLHttpRequest) {
                    element.css({
                        position: "fixed",
                        top: 0
                    }).addClass("shadow")
                } else {
                    element.css({
                        top: scrolls
                    })
                }
            } else {
                $('.header-topbar').fadeIn(500);
                element.css({
                    position: pos,
                    top: top
                }).removeClass("shadow")
            }
        })
    };
    return $(this).each(function () {
        position($(this))
    })
};
$("#navbar").navSmartFloat();
$("#gotop").hide();
$(window).scroll(function () {
    if ($(window).scrollTop() > 100) {
        $("#gotop").fadeIn()
    } else {
        $("#gotop").fadeOut()
    }
});
$("#gotop").click(function () {
    $('html,body').animate({
        'scrollTop': 0
    }, 500)
});
$("img.thumb").lazyload({
    placeholder: "../images/occupying.png",
    effect: "fadeIn"
});
$(".single .content img").lazyload({
    placeholder: "../images/occupying.png",
    effect: "fadeIn"
});
$('[data-toggle="tooltip"]').tooltip();

$(window).scroll(function () {
    var sidebar = $('.sidebar');
    var sidebarHeight = sidebar.height();
    var windowScrollTop = $(window).scrollTop();
    if (windowScrollTop > sidebarHeight - 60 && sidebar.length) {
        $('.fixed').css({
            'position': 'fixed',
            'top': '70px',
            'width': '360px'
        })
    } else {
        $('.fixed').removeAttr("style")
    }
});


(function () {
    var startDay = new Date(1511067860622).Format("yyyy-MM-dd hh:mm:ss");
    var now = new Date().Format("yyyy-MM-dd hh:mm:ss");
    $("#sitetime").html($.InterVal(now, startDay) + "天");
    var pageCount = 0;
    var target = $('#article_list');
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
    pageCount++;
    jQuery.ias({
        history: false,
        container: '.content',
        item: '.excerpt',
        pagination: '.pagination',
        next: '.next-page a',
        trigger: '查看更多',
        loader: '<div class="pagination-loading"><img src="../assets/images/loading.gif" /></div>',
        triggerPageThreshold: 5,
        beforePageChange: function (curScrOffset) {
            pageCount++;
        },
        onPageChange: function (pageNum, scrollOffset) {

        },
        onRenderComplete: function (pagenum) {
            htmlTemp = $("#article_list").html();
            $.ajax({
                url: ctx + '/article/article_list',
                type: 'POST',
                data: {pageNum: pageCount, pageSize: '5'},
                success: function (returnData) {
                    var htmlList = '';
                    returnData.forEach(function (object) {
                        var text = $.ajax({url: ctx + "/views/front/front-common/article_model.html",async:false}).responseText;
                        htmlList += text.tmp(object);
                    });
                    $("#article_list").append(htmlList);
                }
            })
            $('.excerpt .thumb').lazyload({
                placeholder: '../assets/images/occupying.png',
                threshold: 400
            });
            $('.excerpt img').attr('draggable', 'false');
            $('.excerpt a').attr('draggable', 'false');
        }
    });
})();

/*function datainit(pageCount,category){
    //console.log(pageCount + category);
    var temp_category;
    if(category != temp_category){
        $('#article_list').empty();
        temp_category = category;
    }
    $.ajax({
        url: ctx + '/article/article_list',
        type: 'POST',
        data: {pageNum: pageCount, pageSize: '5', category: category},
        success: function (returnData) {
                var htmlList = '';
                returnData.forEach(function (object) {
                        var text = $.ajax({url: ctx + "/views/front-common/article_model.html",async:false}).responseText;
                        htmlList += text.tmp(object);
                        console.log(text.tmp(object));
                    })
                pageCount++;
                $("#article_list").html(htmlList);
            }
    });

    jQuery.ias({
        history: false,
        container: '.content',
        item: '.excerpt',
        pagination: '.pagination',
        next: '.next-page a',
        trigger: '查看更多',
        loader: '<div class="pagination-loading"><img src="../assets/images/loading.gif" /></div>',
        triggerPageThreshold: 5,
        beforePageChange: function (curScrOffset) {
            pageCount++;
        },
        onPageChange: function (pageCount, category) {
            //console.log(pageCount + category);
        },
        onRenderComplete: function () {
            //console.log(pageCount + temp_category);
            $.ajax({
                url: ctx + '/article/article_list',
                type: 'POST',
                data: {pageNum: pageCount, pageSize: '5',category:category},
                success: function (returnData) {
                    var htmlList = '';
                    returnData.forEach(function (object) {
                        var text = $.ajax({url: ctx + "/views/front-common/article_model.html",async:false}).responseText;
                        htmlList += text.tmp(object);
                    });
                    $("#article_list").append(htmlList);
                }
            })
        }
    });
}

(function () {
    var startDay = new Date(1511067860622).Format("yyyy-MM-dd hh:mm:ss");
    var now = new Date().Format("yyyy-MM-dd hh:mm:ss");
    $("#sitetime").html($.InterVal(now, startDay) + "天");
    var pageCount = 0;
    datainit(0,"");
    $('.more a').bind('click',function(){
        var category = this.innerHTML;
        datainit(0,category);
    })
})();*/

document.onkeydown = function (event) {
    var e = event || window.event || arguments.callee.caller.arguments[0];
    if (e.keyCode === 67 || e.keyCode === 86 || e.keyCode === 13)
        return true;
    if ((e.keyCode === 123) || (e.ctrlKey) || (e.ctrlKey) && (e.keyCode === 85)) {
        return false
    }
};

