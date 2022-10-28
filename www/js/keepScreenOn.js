var KeepScreenOn = function() {};

KeepScreenOn.prototype.setKeepScreenOn = function() {
    cordova.exec(null, null, "KeepScreenOn", "SetKeepScreenOn", [""]);
}

KeepScreenOn.prototype.cancelKeepScreenOn = function() {
    cordova.exec(null, null, "KeepScreenOn", "CancelKeepScreenOn", [""]);
}

module.exports = new KeepScreenOn();
