package xl.appware.mutewiper.engine;

import xl.appware.mutewiper.ui.UseWiperDialog;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.IBinder;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.widget.Toast;

public class WiperService extends Service {

	BroadcastReceiver receiver;
	
	@Override
	public IBinder onBind(Intent intent) {

		return null;
	}

	@Override
	public void onCreate() {
		System.out.println("mute wiper service created...");
		receiver = new MuteReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("android.media.RINGER_MODE_CHANGED");
		registerReceiver(receiver, filter);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		System.out.println("mute wiper service destroyed...");
		Toast.makeText(this, "静音消除功能已停止", 0).show();
	}

	class MuteReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			// 获取AudioManager来管理RingerMode
			AudioManager audioManager = (AudioManager) context
					.getSystemService(Context.AUDIO_SERVICE);

			int ringerMode = audioManager.getRingerMode();

			if (ringerMode == AudioManager.RINGER_MODE_SILENT) {
				UseWiperDialog useWiperDialog = new UseWiperDialog();
				useWiperDialog.show(useWiperDialog.getFragmentManager(), "useWiper");
				
				 Toast.makeText(context, "mute mode", 0).show();
			} else if (ringerMode == AudioManager.RINGER_MODE_NORMAL) {
				Toast.makeText(context, "ringer mode", 0).show();
			}

		}

	}

}
