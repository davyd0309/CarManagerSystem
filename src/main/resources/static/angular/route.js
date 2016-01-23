cmsAngularModule.config(function($routeProvider){
$routeProvider

    .when("/",{
        templateUrl : "strony/logo.html"
    })
    .when("/login",{
        templateUrl : "strony/login.html"
    })
    .when("/dodajUzytkownika",{
        templateUrl : "strony/dodajUzytkownika.html"
    })
});