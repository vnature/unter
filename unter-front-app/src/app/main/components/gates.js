(function() {
  'use strict';

  angular
    .module('unterFrontApp')
    .controller('GatesController',['$scope','$state', '$stateParams', '$http','$filter', GatesController]);

  /** @ngInject */
  function GatesController($scope, $state, $stateParams, $http, $filter) {
    console.log('/gateslots/reservations?warehouseName='+$state.params.warehouse+'&loadDate='+ $filter('date')($state.params.date,'yyyy-MM-dd'));
    $scope.gateSlotReservations = [];
    $http({
      method: 'GET',
      url: "/gateslots/reservations",
      params : {
        warehouseName:$state.params.warehouse,
        loadDate:$filter('date')($state.params.date,'yyyy-MM-dd')
      }
    })
    .success(function(data){
      $scope.gateSlotReservations = data;
    }).
    error(function(error){
      console.log(error);
    });
  }
})();
