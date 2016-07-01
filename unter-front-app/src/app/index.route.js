(function() {
  'use strict';

  angular
    .module('unterFrontApp')
    .config(routerConfig);

  /** @ngInject */
  function routerConfig($stateProvider, $urlRouterProvider) {
    $stateProvider
      .state('home', {
        url: '/',
        templateUrl: 'app/main/main.html',
        controller: 'MainController',
        controllerAs: 'main'
      }).state('warehouse',{
        url:'/warehouse',
        templateUrl: 'app/main/warehouse.html',
        controller: 'WarehouseController',
        controllerAs:'warehouse'
      });

    $urlRouterProvider.otherwise('/');
  }

})();
