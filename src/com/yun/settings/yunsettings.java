package com.yun.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class yunsettings extends PreferenceActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.yunsetting);
	}
}
