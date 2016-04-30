/**
 * Created by Konrad on 30.04.2016.
 */

var addCar = function () {
    alert("Dodaje auto");
};
var loadGrid = function () {
    $('#content').load('main/grid');
};
//Grid
//var editor; // use a global for the submit and return data rendering in the examples

$(document).ready(function () {
    loadGrid();

});
