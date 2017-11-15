$(document).ready(function(){ 
	$('.title').nextSibling.articleInit();
});


$.articleInit = function(){
	$.ajax({
		url: '/article/article_list',
		type: 'POST',
		success:function(data){
			$(this).html(data);
		}
	})
}
