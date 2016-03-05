/**
 * Created by Konrad on 2016-02-06.
 */

$(document).ready(function () {

//Formularz dodawania uzytkownika



    $('#buttonAddToDatebase').click(function submitForm() {


        $.ajax({
            type: 'POST',
            url: 'user/save',
            data: JSON.stringify({
                'firstName': $('#firstName').val(),
                'lastName': $('#lastName').val(),
                'login': $('#login').val(),
                'password': $('#password').val(),
                'email': $('#email').val()
            }),
            contentType: 'application/json;charset=UTF-8',

            success: function (data) {
                console.log(data);
            },
            error: function () {
                console.log("Błąd");
            }
        });
    });




});