(function() {
  'use strict';

  angular
    .module('unterFrontApp')
    .controller('WarehouseController',['$scope','$state', '$http', WarehouseController]);

  /** @ngInject */
  function WarehouseController($scope, $state, $http) {
    $scope.warehouses = {};

    $scope.toGates = function(){
      $state.go('gates', {warehouse : $scope.warehouse, date : $scope.date});
    };

    $http.get("/warehouses").success(function(data){
      $scope.warehouses = data;
    }).error(function (error) {
      console.log(error);
    });
  }
})();
