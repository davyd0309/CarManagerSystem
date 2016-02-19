/**
 * Created by Judytka on 2016-02-06.
 */

$(document).ready(function(){

//Formularz dodawania uzytkownika

    $('#addUser').click(function submitForm(){


        $.ajax({
            type: "POST",
            url:'user/save',
            data:JSON.stringify({
                'firstName':"Tomasz",
                'lastName': "Wrona",
                'login': "davyd"
            }),
            contentType: "application/json;charset=UTF-8",

            success: function(data){
            console.log(data);
            },
            error:function(){
                console.log("Błąd");
            }
        });
    });


    $('#clearFieldsAddUser').click(function clearForm(){
        $('#ff').form('clear');
    });



});