/**
 * Created by Konrad on 2016-02-19.
 */
$(document).ready(function(){

    $.ajax({
        type:'GET',
        url:'/loginUser',
        contentType: 'application/json;charset=UTF-8',
        success:function(data){
            $('#loginUser').val(data.username);
        },
        error:function(){
            console.error("blad");
        }
    })



});