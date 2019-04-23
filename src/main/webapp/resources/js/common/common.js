var default_json_settings = {
	url: "",
	type: "post",
	dataType: "json",
	data: {},
	contentType: "application/json",
	success: function (data, textStatus, jqXHR){
		
	},
	error: function (jqXHR, textStatus, errorThrown){
		
	}
}


function ajax_json(settings){
	var opt = $.extend({}, default_json_settings, settings);
	opt['data'] = JSON.stringify(opt['data']);
	
	$.ajax(opt);
	
}


