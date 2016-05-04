/**
 * Created by Konrad on 30.04.2016.
 */

var addCar = function () {
    alert("Dodaje auto");
};

var loadGrid = function(){
    var data = [
        { "Name": "John Smith", "Age": 45 },
        { "Name": "Mary Johnson", "Age": 32 },
        { "Name": "Bob Ferguson", "Age": 27 }
    ];

    $("#grid").igGrid({
        dataSource: data //JSON Array defined above
    });
};

//Grid
//var editor; // use a global for the submit and return data rendering in the examples

$(document).ready(function () {
    loadGrid();
});
