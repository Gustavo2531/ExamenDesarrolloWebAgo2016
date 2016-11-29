var todo=angular.module("todo", []);
    todo.factory('authInterceptor', function ($rootScope, $window) {
        return {
            request: function (config) {
                config.headers = config.headers || {};
                if ($window.sessionStorage.token) {
                    config.headers.Authorization = 'Bearer ' + $window.sessionStorage.token;
                }
                return config;
            }
        };
    });
    todo.config(function ($httpProvider) {
         $httpProvider.defaults.headers.common = {};
  $httpProvider.defaults.headers.post = {};
  $httpProvider.defaults.headers.put = {};
  $httpProvider.defaults.headers.patch = {};
        $httpProvider.interceptors.push('authInterceptor');
       
    });

    todo.controller("todoController", todoController);
    function todoController($scope, $http, $window) {
    var vm = $scope;

    vm.authenticated = false;
    vm.user = {};

    vm.todos = [];

    
    vm.login = function () {
        $http.post('http://localhost:8080/api/login/', {
            username: "user",
            password: "pass"
        }).then(function (response) {
            console.log("Que pox");
            vm.authenticated = true;
            $scope.sessionUsuario.token=response.data.access_token;
        });
    };
}