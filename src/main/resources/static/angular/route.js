cmsAngularModule.config(function($routeProvider){
$routeProvider

    .when("/",{
        templateUrl : "strony/logo.html"
    })

    .when("/dodajUzytkownika",{
        templateUrl : "strony/dodajUzytkownika.html"
    })
});