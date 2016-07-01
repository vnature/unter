!function(){"use strict";angular.module("unterFrontApp",["ngAnimate","ngCookies","ngTouch","ngSanitize","ngMessages","ngAria","ui.router","ui.bootstrap","toastr"])}(),function(){"use strict";function e(e,n,t){t.getWarehouses().then(function(n){e.warehouses=n})}e.$inject=["$scope","$state","unterService"],angular.module("unterFrontApp").controller("WarehouseController",["$scope","$state",e])}(),function(){"use strict";function e(e,n){e.user="ravago",e.pass="ravago",e.login=function(){e.user==e.username&&e.pass==e.password&&n.go("warehouse")}}e.$inject=["$scope","$state"],angular.module("unterFrontApp").controller("MainController",["$scope","$state",e])}(),function(){"use strict";function e(e){var n=function(e){return e.data},t=function(e){return e};return{getWarehouses:function(){return e.get("/warehouses").success(n).error(t)}}}e.$inject=["$http"],angular.module("unterFrontApp").service(e)}(),function(){"use strict";function e(e){e.debug("runBlock end")}e.$inject=["$log"],angular.module("unterFrontApp").run(e)}(),function(){"use strict";function e(e,n){e.state("home",{url:"/",templateUrl:"app/main/main.html",controller:"MainController",controllerAs:"main"}).state("warehouse",{url:"/warehouse",templateUrl:"app/main/warehouse.html",controller:"WarehouseController",controllerAs:"warehouse"}),n.otherwise("/")}e.$inject=["$stateProvider","$urlRouterProvider"],angular.module("unterFrontApp").config(e)}(),function(){"use strict";function e(e,n){e.debugEnabled(!0),n.allowHtml=!0,n.timeOut=3e3,n.positionClass="toast-top-right",n.preventDuplicates=!0,n.progressBar=!0}e.$inject=["$logProvider","toastrConfig"],angular.module("unterFrontApp").config(e)}(),angular.module("unterFrontApp").run(["$templateCache",function(e){e.put("app/main/main.html","<div class=container><div input-group><span class=input-group-addon id=basic-addon1>User</span> <input type=text ng-model=username class=form-control placeholder=Username aria-describedby=basic-addon1></div><br><div input-group><span class=input-group-addon id=basic-addon1>Password</span> <input type=password ng-model=password class=form-control placeholder=Password aria-describedby=basic-addon1></div><br><input type=button ng-click=login(); value=Login class=form-control></div>"),e.put("app/main/warehouse.html",'<div><select ng-model=warehouses><option ng-repeat="warehouse in warehouses" value={{warehouse.name}}>{{warehouse.names}}</option></select></div>')}]);
//# sourceMappingURL=../maps/scripts/app-bcf27678d2.js.map
