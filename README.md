# KeepScreenOnPlugin
Cordova plugin to set and clear `FLAG_KEEP_SCREEN_ON` flag:

Android docs: [Keep the screen on](https://developer.android.com/training/scheduling/wakelock#screen)


## Install

```bash
cordova plugin add https://github.com/DKPillo/KeepScreenOnPlugin.git
```

## Usage

```javascript
// Set flag on current window
window.keepScreenOn.KeepScreenOn();

// Clear flag on current window
window.keepScreenOn.CancelKeepScreenOn();
```

