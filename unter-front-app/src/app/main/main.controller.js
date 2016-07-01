(function() {
  'use strict';

  angular
    .module('unterFrontApp')
    .controller('MainController',['$scope','$state', MainController]);

  /** @ngInject */
  function MainController($scope, $state) {
    $scope.user='ravago';
    $scope.pass='ravago';
    $scope.login = function(){
      if ($scope.user == $scope.username && $scope.pass == $scope.password){
        $state.go('warehouse');
      }
    }
  }
})();
