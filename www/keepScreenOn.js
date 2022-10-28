var exec = require('cordova/exec');

var emptyFn = function(){};
var KeepScreenOn = {
    setKeepScreenOn: function () {
        exec(emptyFn, emptyFn, "KeepScreenOn", "SetKeepScreenOn", [""]);
    },
    cancelKeepScreenOn: function () {
        exec(emptyFn, emptyFn, "KeepScreenOn", "CancelKeepScreenOn", [""]);
    },
    test: function () {
        return "KeepScreenOn is available!";
    }
};

module.exports = KeepScreenOn;
