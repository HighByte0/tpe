using Android.App;
using Android.OS;
using Android.Runtime;
using System;

namespace tpev6
{
    [Application]
    public class MainApplication : MauiApplication
    {
        public MainApplication(IntPtr handle, JniHandleOwnership ownership)
            : base(handle, ownership)
        {
            Console.WriteLine("MainApplication created");
        }

      
        protected override MauiApp CreateMauiApp() => MauiProgram.CreateMauiApp();
    }
}
