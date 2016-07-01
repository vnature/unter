(function() {
  'use strict';

  angular
    .module('unterFrontApp')
    .controller('WarehouseController',['$scope','$state', WarehouseController]);

  /** @ngInject */
  function WarehouseController($scope, $state, unterService) {
    unterService.getWarehouses().then(function(data){
      $scope.warehouses = data;
    })
  }
})();
