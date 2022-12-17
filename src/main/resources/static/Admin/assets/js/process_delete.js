/**
 * 
 
 
 */

var checkall = document.getElementById("check-all");//false

var checkbox = document.querySelectorAll("#check-box");
console.log(checkbox);
checkall.addEventListener("click", function() {
	console.log(checkall.checked);
	if (checkall.checked) {//false
		for (let i = 0; i < checkbox.length; i++) {
			checkbox[i].checked = true;
		}
	}
	else {
		for (let i = 0; i < checkbox.length; i++) {
			checkbox[i].checked = false;
		}
	}
})

	var ma = document.querySelectorAll(".ma");
	var ten = document.querySelectorAll(".ten");
	var vi_tri = document.querySelectorAll(".position-delete");
	var vi_tri_sua = document.querySelectorAll(".position-edit");
	var id;

	for (let i = 0; i < vi_tri.length; i++) {
		vi_tri[i].addEventListener("click", function() {
			$("#name").text(ten[i].innerHTML);
			id = ma[i].innerHTML;
		})
	}

	for (let i = 0; i < vi_tri_sua.length; i++) {
		vi_tri_sua[i].addEventListener("click", function() {
			$("#ten_sua").val(ten[i].innerHTML);
			$("#id").val(ma[i].innerHTML);
		})
	}

$("#sampleTable").on("order.dt search.dt page.dt",function() {
	alert('cc');
    ma = document.querySelectorAll(".ma");
    ten = document.querySelectorAll(".ten");
    vi_tri = document.querySelectorAll(".position-delete");
    vi_tri_sua = document.querySelectorAll(".position-edit");
	

	for (let i = 0; i < vi_tri.length; i++) {
		vi_tri[i].addEventListener("click", function() {
			$("#name").text(ten[i].innerHTML);
			id = ma[i].innerHTML;
		})
	}

	for (let i = 0; i < vi_tri_sua.length; i++) {
		vi_tri_sua[i].addEventListener("click", function() {
			$("#ten_sua").val(ten[i].innerHTML);
			$("#id").val(ma[i].innerHTML);
		})
	}
});
var id_main=id;
function xoaSet(url) {

	let da_chon = document
		.querySelectorAll(".selected");
	let set = [];
	let dem = 0;
	for (let j = 0; j < da_chon.length; j++) {
		if (da_chon[j].checked) {
			set[dem] = da_chon[j].value;
			dem++;
		}
	}
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: url,
		data: JSON
			.stringify(set),
		success: function(
			data) {
			alert(data);
			location
				.reload();
		},
		error: function(
			failed) {
			alert(set);
		}
	})
}

function xoaSingle(url) {
	$.ajax({
		type: "POST",
		contentType: "application/json",
		url: url,
		data: id,
		success: function(data) {
			alert(data);
			location.reload();
		}
	})
}


