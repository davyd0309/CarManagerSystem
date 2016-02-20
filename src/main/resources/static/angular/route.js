cmsAngularModule.config(function($routeProvider){
$routeProvider

    .when("/",{
        templateUrl : "strony/powitanie.html"
    })

    .when("/dodajUzytkownika",{
        templateUrl : "strony/dodajUzytkownika.html"
    })

    .when("/informacjeDodatkowe",{
        templateUrl : "strony/informacjeDodatkowe.html"
    })

    .when("/dane",{
        templateUrl : "strony/dane.html"
    })

    .when("/plan",{
        templateUrl : "strony/plan.html"
    })

    .when("/tabela",{
        templateUrl : "strony/tabela.html"
    })
});