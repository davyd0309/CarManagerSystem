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
        type: "POST",
        url: "car/addCar",
        contentType:"application/json",
        data:  JSON.stringify(car),
        success: function (data) {
            console.log(data);
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }

    });

    };



var saveRefueling = function() {
    var refueling = {
        "car": $('#carListSelect').val(),
        "refuelingDate": $('#refuelingDateInput').val(),
        "refuelingPrice": $('#refuelingPriceInput').val(),
        "refuelingDescription": $('#refuelingDescriptionInput').val(),
        "place": $('#refuelingPlaceInput').val()
    };

    $.ajax({
        url: 'refueling/addRefueling',
        type: 'POST',
        contentType:"application/json",
        data:  JSON.stringify(refueling),
        success: function (data) {
            console.log(data);
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }

    });

};

    var saveExchange = function(){
        var exchange = {
            "car": $('#carListSelect').val(),
            "exchangeDate": $('#exchangeDateInput').val(),
            "exchangePrice": $('#exchangePriceInput').val(),
            "exchangeDescription": $('#exchangeDescriptionInput').val(),
            "place": $('#exchangePlaceInput').val()
        };

        $.ajax({
            url: 'exchange/addExchange',
            type: 'POST',
            contentType:"application/json",
            data:  JSON.stringify(exchange),
            success: function (data) {
                console.log(data);
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
