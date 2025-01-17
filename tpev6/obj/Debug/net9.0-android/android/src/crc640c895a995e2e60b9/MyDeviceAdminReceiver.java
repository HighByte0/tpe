package crc640c895a995e2e60b9;


public class MyDeviceAdminReceiver
	extends android.app.admin.DeviceAdminReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEnabled:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnEnabled_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"n_onDisabled:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnDisabled_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("MyDeviceAdminReceiver, tpev6", MyDeviceAdminReceiver.class, __md_methods);
	}

	public MyDeviceAdminReceiver ()
	{
		super ();
		if (getClass () == MyDeviceAdminReceiver.class) {
			mono.android.TypeManager.Activate ("MyDeviceAdminReceiver, tpev6", "", this, new java.lang.Object[] {  });
		}
	}

	public void onEnabled (android.content.Context p0, android.content.Intent p1)
	{
		n_onEnabled (p0, p1);
	}

	private native void n_onEnabled (android.content.Context p0, android.content.Intent p1);

	public void onDisabled (android.content.Context p0, android.content.Intent p1)
	{
		n_onDisabled (p0, p1);
	}

	private native void n_onDisabled (android.content.Context p0, android.content.Intent p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
