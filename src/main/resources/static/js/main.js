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
        success: function () {
            alert("Dodano samochód "+car.carName +" o numerze "+car.carNumber );
            $('#carNameInput').val('');
            $('#carNumberInput').val('');
            $('#kmCounterInput').val('');
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }

    });

    };



var saveRefueling = function() {
    var refueling = {
        "car": {'id':$('#carListSelect').get(0)},
        "refuelingDate": $('#refuelingDateInput').val(),
        "refuelingPrice": $('#refuelingPriceInput').val(),
        "refuelingDescription": $('#refuelingDescriptionInput').val(),
        "place": {'id':1}
    };

    $.ajax({
        url: 'refueling/addRefueling',
        type: 'POST',
        contentType:"application/json",
        data:  JSON.stringify(refueling),
        success: function () {
            alert("Dodano nowe tankowanie");
            $('#refuelingDateInput').val('');
            $('#refuelingPriceInput').val('');
            $('#refuelingDescriptionInput').val('');

        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log( "Request Failed: " + err );
        }

    });

};

    var saveExchange = function(){
        //console.log($('#carListSelect option:selected').val());
        var car = $('#carListSelect option:selected').attr('value');
        var exchange = {
            "car": {
                //CAR OBJECT
            },
            "exchangeDate": $('#exchangeDateInput').val(),
            "exchangePrice": $('#exchangePriceInput').val(),
            "exchangeDescription": $('#exchangeDescriptionInput').val(),
            "place": {'id':parseInt($('#placeListSelect').get(0).id,10)}
        };

        $.ajax({
            url: 'exchange/addExchange',
            type: 'POST',
            contentType:"application/json",
            data:  JSON.stringify(exchange),
            success: function () {
                alert("Dodano nową wymianę");
                $('#exchangeDateInput').val('');
                $('#exchangePriceInput').val('');
                $('#exchangeDescriptionInput').val('');
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
