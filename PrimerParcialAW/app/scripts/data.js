 var count=0;
       
    
    var todoApp = angular.module("todoApp", []);
        
        todoApp.controller("todoAppController", function ($scope,$http,$timeout){
            $timeout(function () {
            $http.get('http://localhost:8090/divisasActivas?version=1').then(function(res){
                $scope.todo = res.data; 
                var count = 0;
                angular.forEach($scope.todo, function (item) {
                    count++;
                    console.log(count);
                });
               
                 }, 100);

             
    }); 
        });
    

