/**
 * Created by Konrad on 30.04.2016.
 */


var dialogShow = function (dialogUrl) {
    $('#dialogDiv').load(dialogUrl);
};

var saveCar = function(){

    var car = {
        "carName": $('#carNameInput').val(),
        "carNumber": $('#carNumberInput').val(),
        "kmCounter": $('#kmCounterInput').val()
    };

    $.ajax({
        url: 'car/addCar',
        type: 'POST',
        contentType: 'application/json;charset=UTF-8',
        data: JSON.stringify(car),
        success: function (car) {
           alert("Dodano samochód " + car.carName);
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }
    });

};

var saveRefueling = function(){
    var refueling = {
        "refuelingDate": $('#carNameInput').val(),
        "refuelingPrice": $('#carNumberInput').val(),
        "kmCounter": $('#kmCounterInput').val()
    };

    $.ajax({
        url: 'car/addCar',
        type: 'POST',
        contentType: 'application/json;charset=UTF-8',
        data: JSON.stringify(car),
        success: function (car) {
            alert("Dodano samochód " + car.carName);
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }
    });


};


var loadGrid = function(){

    $("#grid").igGrid({
        autoGenerateColumns: false,
        dataSource: 'car/list',
        columns: [
            { headerText: "Samochod", key: "carName", dataType: "string", width: "25%" },
            { headerText: "Wymiany", key: "exchange", dataType: "string", width: "35%" },
            { headerText: "Tankowania", key: "refueling", dataType: "string", width: "35%" },

        ]
    });

};


$(document).ready(function () {
    loadGrid();




});
