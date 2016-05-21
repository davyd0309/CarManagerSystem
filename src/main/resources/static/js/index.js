/**
 * Created by Konrad on 23.04.2016.
 */

var info = function () {
    $('#content').load('index/info');
};


var addUser = function () {
    $('#content').load('index/addUser');
};

var addPlace = function () {
    $('#content').load('index/addPlace');
};

var goToMain = function() {
    location.replace("/main");
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
            alert("Dodano użytkownika "+user.firstName +" "+user.lastName );
            clearAddUserForm();
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }
    });


};

var clearAddUserForm = function(){
    $('#userFirstName').val('');
       $('#userLstName').val('');
       $('#userEmail').val('');
       $('#userPassword').val('');
};


var savePlace = function () {
    var place = {
        "name": $('#placeName').val(),
        "address": $('#placeAddress').val(),
    };

    $.ajax({
        url: 'place/savePlace',
        type: 'POST',
        contentType: 'application/json;charset=UTF-8',
        data: JSON.stringify(place),
        success: function () {
            alert("Dodano miejsce "+place.name);
            clearAddPlaceForm();
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }
    });


};

var clearAddPlaceForm = function(){
    $('#placeName').val('');
    $('#placeAddress').val('');
};

$(document).ready(function () {


});
