package ch.pillo.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.view.WindowManager;

public class KeepScreenOn extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
		System.out.println("Im in the plugin");

		if (action.equalsIgnoreCase("SetShowWhenLocked")) {
			System.out.println("SetShowWhenLocked");
			cordova.getActivity().runOnUiThread(new Runnable() {
	            public void run() {
	            	cordova.getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
    				System.out.println("SetShowWhenLocked: Screen will be shown while locked.");
	            }
	        });
            return true;

        } else if (action.equalsIgnoreCase("CancelShowWhenLocked")) {
			System.out.println("CancelShowWhenLocked");
			cordova.getActivity().runOnUiThread(new Runnable() {
				public void run() {
					cordova.getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
					System.out.println("CancelShowWhenLocked: Screen will not be shown while locked.");
				}
			});
			return true;

        } else if (action.equalsIgnoreCase("SetKeepScreenOn")) {
			System.out.println("SetKeepScreenOn");
			cordova.getActivity().runOnUiThread(new Runnable() {
	            public void run() {
	            	cordova.getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    				System.out.println("SetKeepScreenOn: Screen will be kept on.");
	            }
	        });
            return true;

        } else if (action.equalsIgnoreCase("CancelKeepScreenOn")){
			System.out.println("CancelKeepScreenOn");
			cordova.getActivity().runOnUiThread(new Runnable() {
	            public void run() {
	            	cordova.getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
	            	System.out.println("CancelKeepScreenOn: Screen will not be kept on.");
	            }
	        });
            return true;

        } else {
			System.out.println("UNKNOWN");
			callbackContext.error("unknown action" + action);
            return false;
        }
	}

}
