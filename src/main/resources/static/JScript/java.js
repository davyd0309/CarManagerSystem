/**
 * Created by Judytka on 2016-02-06.
 */

$(document).ready(function(){

//Formularz dodawania uzytkownika

    $('#addUser').click(function submitForm(){

        $('#ff').form({
                url:'user/save',

            onSubmit: function(){
            // do some check
            // return false to prevent submit;
        },
        success:function(data){
            console.log(data);
        }
    });
// submit the form
        $('#ff').submit();



        //$.ajax({
        //    type: "POST",
        //    url:'user/save',
        //    data:JSON.stringify({
        //        'firstName':$('#addFirstName),
        //        'lastName': "Wrona"
        //    }),
        //    contentType: "application/json;charset=UTF-8",
        //
        //    success: function(data){
        //    console.log(data);
        //    },
        //    error:function(){
        //        alert("WTF");
        //    }
        //});
    });


    $('#clearFieldsAddUser').click(function clearForm(){
        $('#ff').form('clear');
    });



});