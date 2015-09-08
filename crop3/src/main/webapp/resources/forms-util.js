$(document).ready(function() {
    $('button[name="inputsUpdate"]').bind('click', function(event) {
	var myForm = $(event.target).parents('form');
	myForm.attr('action', 'inputsUpdate');
	myForm.submit();
    });

    $('button[name="inputsDelete"]').bind('click', function(event) {
	var myForm = $(event.target).parents('form');
	myForm.attr('action', 'inputsDelete');
	myForm.submit();
    });

    $('button[name="inputsEditOne"]').bind('click', function(event) {
	var myForm = $(event.target).parents('form');
	myForm.attr('action', 'inputsEditOne');
	myForm.submit();
    });

});