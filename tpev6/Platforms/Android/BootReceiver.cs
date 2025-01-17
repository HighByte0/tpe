using Android.App;
using Android.Content;
using Android.Widget;
using System;
using tpev6;
using Android.Util;
namespace com.companyname.tpev6.Platforms.Android
{
    [BroadcastReceiver(Enabled = true, Exported = true)]
    [IntentFilter(new[] { Intent.ActionBootCompleted, Intent.ActionMyPackageReplaced })]

    public class BootReceiver : BroadcastReceiver
    {
        public override void OnReceive(Context context, Intent intent)
        {
            if (intent?.Action == Intent.ActionBootCompleted)
            {
                Log.Debug("BootReceiver", "Device reboot detected, launching MainActivity.");

                // Launch the app's MainActivity
                var startupIntent = new Intent(context, typeof(MainActivity));
                startupIntent.AddFlags(ActivityFlags.NewTask);  // This flag is necessary to start an activity outside the current task
                context.StartActivity(startupIntent);
            }
        }
    }
}