<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
$(document).ready(function(){
	//alert('hi');
	
	
});

function ajax(){
	$.ajax({
		url: '/json3',
		type: "post",
		dataType: "json",
		contentType: "application/json",
		data: JSON.stringify({
			txt: 'hello'
		}),
		success: function (data){
			console.log(data);
		}
	});
}
</script>