(function() {
  'use strict';

  angular
    .module('material-lite')
    .directive('mlHeader', mlHeader);

  function mlHeader() {
    return {
      restrict: 'E',
      templateUrl: 'assets/app/tpl/demo/partials/header.html',
      replace: true
    };
  }

})();
