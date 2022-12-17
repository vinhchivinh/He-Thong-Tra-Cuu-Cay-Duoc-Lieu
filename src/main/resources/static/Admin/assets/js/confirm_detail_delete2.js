

function xuli_load_thong_tin_ajax (id,url){
	$.ajax({
				type: "GET",
				contentType: "application/json",
				url: url,
				data: {
					"id":id
				},
				success: function(data) {
					$('#model-content').replaceWith("<div id=model-content>"+data.noidung+"</div>");
					$('#modal-title').replaceWith("<div id=modal-title>"+data.tenbaiviet+"</div>")
					$('#chitiet').modal('show');
					
				}
			})
} 
function xuli_duyet_thong_tin (id,url){
	$.ajax({
				type: "POST",
				contentType: "application/json",
				url: url,
				data:id,
				success: function(data) {
					alert(data);
					location.reload();
				}
			})
} 

function xuli_xoa_thong_tin (id,url){
	$.ajax({
				type: "POST",
				contentType: "application/json",
				url: url,
				data:id,
				success: function(data) {
					alert(data);
					location.reload();
				}
			})
} 

function xuli (url1,url2,url3) {
	var ma = document.querySelectorAll(".ma");
	var vi_tri_xac_nhan = document.querySelectorAll(".position-confirm");
	var vi_tri_chi_tiet = document.querySelectorAll(".position-detail");
	var vi_tri_tu_choi = document.querySelectorAll(".position-refuse");
	var ten = document.querySelectorAll(".name");
	var id;
	for (let i = 0; i < vi_tri_chi_tiet.length; i++) {
		vi_tri_chi_tiet[i].addEventListener("click",  function (){
			id =  ma[i].innerHTML;
		    xuli_load_thong_tin_ajax(id,url2);
		})
	}

	for (let i = 0; i < vi_tri_tu_choi.length; i++) {
		vi_tri_tu_choi[i].addEventListener("click", function() {
			id = ma[i].innerHTML;
			$("#tenxoa").text(ten[i].innerHTML);
			$("#confirm-refuse").click(function(){
				xuli_xoa_thong_tin (id,url3);
			})
			
		})
	}
	for (let i = 0; i < vi_tri_xac_nhan.length; i++) {
		vi_tri_xac_nhan[i].addEventListener("click", function() {
			id = ma[i].innerHTML;
			$("#tenduyet").text(ten[i].innerHTML);
			$("#confirm-accept").click(function(){
				xuli_duyet_thong_tin (id,url1);
			})
		})
	}
}

