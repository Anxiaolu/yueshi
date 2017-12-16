(function () {
    Date.prototype.Format = function (format) {
        var date = {
            "M+": this.getMonth() + 1,
            "d+": this.getDate(),
            "h+": this.getHours(),
            "m+": this.getMinutes(),
            "s+": this.getSeconds(),
            "q+": Math.floor((this.getMonth() + 3) / 3),
            "S+": this.getMilliseconds()
        };
        if (/(y+)/i.test(format)) {
            format = format.replace(RegExp.$1, (this.getFullYear() + '').substr(4 - RegExp.$1.length));
        }
        for (var k in date) {
            if (new RegExp("(" + k + ")").test(format)) {
                format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? date[k] : ("00" + date[k]).substr(("" + date[k]).length));
            }
        }
        return format;
    }
    String.prototype.tmp = function (obj) {
        return this.replace(/\$\w+[^%&',;=?$\x22]+\$/g, function (matchs) {
            //var returns = obj[matchs.replace(/\$/g, "")];
            //return (returns + "") == "undefined" ? "" : returns;
            return eval("obj." + matchs.replace(/\$/g, ""));
        });
    };

})();
(function ($) {
    $.extend({
        progress: function () {
            /*面板样式*/
            var style = '<style type="text/css">\n' +
                    '#progress{-webkit-pointer-events:none;}\n' +
                    '#progress #progress_bar{position:fixed;z-index:9;top:0;left:0;width:0;height:2px;background:#00bfff;color:#00bfff;-webkit-transition-duration:.1s;}}\n' +
                    '#progress #progress_peg{display:block;position:absolute;right:0;width:100px;height:100%;box-shadow:0 0 10px, 0 0 5px;-webkit-transform:rotate(3deg) translate(0px, -4px);}\n' +
                    '</style>';
            $('head').append(style);

            //页面插入空下拉列表html
            var $progress = $('<div id="progress"><div id="progress_bar"><div id="progress_peg"></div></div></div>');
            $('body').append($progress);
        },
        InterVal: function (sDate1, sDate2) {
            var aDate, oDate1, oDate2, iDays;
            aDate = sDate1.split("-");
            oDate1 = new Date(aDate[1] + '-' + aDate[2] + '-' + aDate[0]);  //转换为yyyy-MM-dd格式
            aDate = sDate2.split("-");
            oDate2 = new Date(aDate[1] + '-' + aDate[2] + '-' + aDate[0]);
            iDays = parseInt(Math.abs(oDate1 - oDate2) / 1000 / 60 / 60 / 24); //把相差的毫秒数转换为天数
            return iDays;  //返回相差天数
        }
    });
})(jQuery);