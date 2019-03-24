package com.appleyk.Proxy.map.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Mi;
import com.appleyk.Proxy.runtime.AirCleaner;
import com.appleyk.Proxy.runtime.AirCleanerImpl;

public class ConfigAir2s {
	public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {

//		类映射
		classMaps.put(Mi.class.getName(), AirCleanerImpl.class.getName());

		// 方法之间的映射关系

		// 1.1空气净化器的设置获取PM2.5方法
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setPM2_5", double.class).getName(),
				Arrays.asList(new String[] {
						Mi.class.getName() + "." + Mi.class.getMethod("setPM2_5", double.class).getName() }));

		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getPM2_5").getName(),
				Arrays.asList(new String[] { Mi.class.getName() + "." + Mi.class.getMethod("getPM2_5").getName() }));

		// 1.2空气净化器的设置、获取id方法
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setId", String.class).getName(),
				Arrays.asList(new String[] {
						Mi.class.getName() + "." + Mi.class.getMethod("setId", String.class).getName() }));
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getId").getName(),
				Arrays.asList(new String[] { Mi.class.getName() + "." + Mi.class.getMethod("getId").getName() }));
		// 1.3空气净化器的设置获取地点方法
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setLName", String.class).getName(),
				Arrays.asList(new String[] {
						Mi.class.getName() + "." + Mi.class.getMethod("setLocationName", String.class).getName() }));
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getLName").getName(), Arrays
				.asList(new String[] { Mi.class.getName() + "." + Mi.class.getMethod("getLocationName").getName() }));
		// 1.4空气净化器的状态设置获取方法
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setStatus", String.class).getName(),
				Arrays.asList(new String[] {
						Mi.class.getName() + "." + Mi.class.getMethod("setStatus", String.class).getName() }));
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getStatus").getName(),
				Arrays.asList(new String[] { Mi.class.getName() + "." + Mi.class.getMethod("getStatus").getName() }));

		// 1.5空气净化器的名字设置获取方法
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setDName", String.class).getName(),
				Arrays.asList(new String[] {
						Mi.class.getName() + "." + Mi.class.getMethod("setDeviceName", String.class).getName() }));
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getDName").getName(), Arrays
				.asList(new String[] { Mi.class.getName() + "." + Mi.class.getMethod("getDeviceName").getName() }));
		// 1.6空气净化器设置获取品牌方法
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("setType", String.class).getName(),
				Arrays.asList(new String[] {
						Mi.class.getName() + "." + Mi.class.getMethod("setType", String.class).getName() }));
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("getType").getName(),
				Arrays.asList(new String[] { Mi.class.getName() + "." + Mi.class.getMethod("getType").getName() }));
		// 1.7
		apiMaps.put(AirCleaner.class.getName() + "." + AirCleaner.class.getMethod("purify").getName(),
				Arrays.asList(new String[] { Mi.class.getName() + "." + Mi.class.getMethod("purify").getName() }));

	}

}
