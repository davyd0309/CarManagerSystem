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
   var data = {
        "data": [
        {
            "name": "Tiger Nixon",
            "position": "System Architect",
            "salary": "$320,800",
            "start_date": "2011/04/25",
            "office": "Edinburgh",
            "extn": "5421"
        },
        {
            "name": "Caesar Vance",
            "position": "Pre-Sales Support",
            "salary": "$106,450",
            "start_date": "2011/12/12",
            "office": "New York",
            "extn": "8330"
        },
        {
            "name": "Doris Wilder",
            "position": "Sales Assistant",
            "salary": "$85,600",
            "start_date": "2010/09/20",
            "office": "Sidney",
            "extn": "3023"
        },
        {
            "name": "Donna Snider",
            "position": "Customer Support",
            "salary": "$112,000",
            "start_date": "2011/01/25",
            "office": "New York",
            "extn": "4226"
        }
    ]
    };

    $('#example').DataTable( {
        "ajax": data,
        "columns": [
            { "data": "name" },
            { "data": "position" },
            { "data": "office" },
            { "data": "extn" },
            { "data": "start_date" },
            { "data": "salary" }
        ]
    } );

});
