package xl.appware.mutewiper.ui;

import xl.appware.mutewiper.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class UseWiperDialog extends DialogFragment {

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder bulider = new AlertDialog.Builder(getActivity());
		bulider.setMessage(R.string.useWiper)
			   .setPositiveButton(R.string.use_wiper_pos, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			})
			.setNegativeButton(R.string.use_wiper_neg, new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
		return bulider.create();
	}

	


	
	
	
/*	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setMessage(R.string.useWiperTitle)
		       .setPositiveButton(
				R.string.positiveButtonMessage, new OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						
					}
				})
			  .setNegativeButton(R.string.negativeButtonMessage, new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					return;
				}
			});

		return builder.create();
	}*/
	
//	public FragmentManager returnFragmentManager(){
//		return getFragmentManager();
//
//	}


}
