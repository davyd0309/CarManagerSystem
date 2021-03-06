/**
 * Created by Konrad on 30.04.2016.
 */




var dialogShow = function (dialogUrl) {
    $('#dialogDiv').load(dialogUrl);
};

var saveCar = function () {

    var car = {
        "carName": $('#carNameInput').val(),
        "carNumber": $('#carNumberInput').val(),
        "kmCounter": $('#kmCounterInput').val()

    };

    $.ajax({
        type: "POST",
        url: "car/addCar",
        contentType: "application/json",
        data: JSON.stringify(car),
        success: function () {
            alert("Dodano samochód " + car.carName + " o numerze " + car.carNumber);
            $('#carNameInput').val('');
            $('#carNumberInput').val('');
            $('#kmCounterInput').val('');
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log("Request Failed: " + err);
        }

    });

};


var saveRefueling = function () {
    var car = $('#carListSelect option:selected').val();
    var place = $('#placeListSelect option:selected').val();
    var refueling = {
        "car": {"id":car},
        "refuelingDate": $('#refuelingDateInput').val(),
        "refuelingPrice": $('#refuelingPriceInput').val(),
        "refuelingDescription": $('#refuelingDescriptionInput').val(),
        "place": {"id": place}
    };

    $.ajax({
        url: 'refueling/addRefueling',
        type: 'POST',
        contentType: "application/json",
        data: JSON.stringify(refueling),
        success: function () {
            alert("Dodano nowe tankowanie");
            $('#refuelingDateInput').val('');
            $('#refuelingPriceInput').val('');
            $('#refuelingDescriptionInput').val('');
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log("Request Failed: " + err);
        }

    });

};

var saveExchange = function () {
    var car = $('#carListSelect option:selected').val();
    var place = $('#placeListSelect option:selected').val();
    var exchange = {
        "car": {"id":car},
        "exchangeDate": $('#exchangeDateInput').val(),
        "exchangePrice": $('#exchangePriceInput').val(),
        "exchangeDescription": $('#exchangeDescriptionInput').val(),
        "place": {"id": place}
    };

    $.ajax({
        url: 'exchange/addExchange',
        type: 'POST',
        contentType: "application/json",
        data: JSON.stringify(exchange),
        success: function () {
            alert("Dodano nowe wymianę");
            $('#exchangeDateInput').val('');
            $('#exchangePriceInput').val('');
            $('#exchangeDescriptionInput').val('');
        },
        error: function (jqxhr, textStatus, error) {
            var err = textStatus + ", " + error;
            console.log("Request Failed: " + err);
        }

    });

};


var loadGrid = function () {

    $("#grid").igGrid({
        autoGenerateColumns: false,
        dataSource: 'car/listExchange',
        columns: [
            {headerText: "Samochod", key: "carName", dataType: "string", width: "25%"},
            {headerText: "Data", key: "dateInfo", dataType: "date", width: "35%"},
            {headerText: "Opis", key: "exchange", dataType: "string", width: "35%"},
            {headerText: "Cena", key: "price", dataType: "bigdecimal", width: "35%"},

        ]
    });

};


$(document).ready(function () {
    loadGrid();


});
