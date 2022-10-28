var exec = require('cordova/exec');

var emptyFn = function(){};
function KeepScreenOn() {}

KeepScreenOn.prototype.setKeepScreenOn = function() {
    exec(emptyFn, emptyFn, "KeepScreenOn", "SetKeepScreenOn", [""]);
};
KeepScreenOn.prototype.cancelKeepScreenOn = function() {
    exec(emptyFn, emptyFn, "KeepScreenOn", "CancelKeepScreenOn", [""]);
};
KeepScreenOn.prototype.test = function() {
    return "KeepScreenOn is available!";
};

module.exports = new KeepScreenOn();
