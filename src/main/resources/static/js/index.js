/**
 * Created by Konrad on 23.04.2016.
 */

var info = function () {
    $('#content').load('index/info');
};

var loginUser = function () {
    $('#content').load('index/loginUser');
};

var saveUser = function () {
    var user = {
        "firstName": $('#userFirstName').val(),
        "lastName": $('#userLstName').val(),
        "email": $('#userEmail').val(),
        "password": $('#userPassword').val()

    };

    $.ajax({
        url: 'user/saveUser',
        type: 'POST',
        contentType: 'application/json;charset=UTF-8',
        data: JSON.stringify(user),
        success: function () {
            console.log(user);
        },
        error: function () {
            console.log("BLADDDDD");
        }
    });


};

$(document).ready(function () {


});
