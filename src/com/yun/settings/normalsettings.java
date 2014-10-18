package com.yun.settings;

import java.util.List;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class normalsettings extends PreferenceActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.normalsetting);
	}
}

