(function() {
  'use strict';

  angular
    .module('unterFrontApp')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log) {

    $log.debug('runBlock end');
  }

})();
