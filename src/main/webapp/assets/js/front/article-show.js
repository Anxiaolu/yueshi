(function(){
	var string = $.attr("article");

/*var req = new XMLHttpRequest();
req.open('GET', document.location, false);
req.send(null);
var headers = req.getAllResponseHeaders().toLowerCase();
alert(headers);*/

$.get('http://localhost:8080/lucms/article/article-content/3', function(data,status){
	console.log('数据:' + data+" "+ "状态:" + status);
})

$.ajax({
	url: ctx + '/',
})

})();