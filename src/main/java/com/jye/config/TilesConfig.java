package com.jye.config;

public class TilesConfig
{
	public static final String TILES_URL_PREFIX = "tiles/";
	
	public static String setTilesURL(String url)
	{
		return (TILES_URL_PREFIX + url).replaceAll("//", "/");
	}
}
