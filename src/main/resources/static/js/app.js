var app = angular.module('aws',[]);

app.controller('Home', function($scope, $http) {
    $scope.regions = [];

    function getRegions(){
        $http.get('/api/regions').
                then(function(response) {
                    $scope.regions = response.data;
         });
    }
    getRegions();
});