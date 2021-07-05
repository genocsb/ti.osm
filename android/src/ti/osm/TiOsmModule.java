/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2018 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.osm;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;
import org.appcelerator.titanium.TiApplication;

@Kroll.module(name = "TiOsm", id = "ti.osm")
public class TiOsmModule extends KrollModule
{
	@Kroll.constant
	public static final int MAPNIK = 0;
	@Kroll.constant
	public static final int WIKIMEDIA = 1;
	@Kroll.constant
	public static final int PUBLIC_TRANSPORT = 2;
	@Kroll.constant
	public static final int CLOUDMADESTANDARDTILES = 3;
	@Kroll.constant
	public static final int CLOUDMADESMALLTILES = 4;
	@Kroll.constant
	public static final int FIETS_OVERLAY_NL = 5;
	@Kroll.constant
	public static final int BASE_OVERLAY_NL = 6;
	@Kroll.constant
	public static final int ROADS_OVERLAY_NL = 7;
	@Kroll.constant
	public static final int HIKEBIKEMAP = 8;
	@Kroll.constant
	public static final int OPEN_SEAMAP = 9;
	@Kroll.constant
	public static final int USGS_TOPO = 10;
	@Kroll.constant
	public static final int USGS_SAT = 11;

	public TiOsmModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
	}
}
