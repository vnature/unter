(function() {
  'use strict';

  angular
    .module('unterFrontApp')
    .service(unterService);

  /** @ngInject */
  function unterService($http) {
    var onSuccess = function(response){
      return response.data;
    }
    var onError = function(error){
      return error;
    }
    return {
      getWarehouses:function(){
        return $http.get("/warehouses").success(onSuccess).error(onError);
      }
    }
  }

})();