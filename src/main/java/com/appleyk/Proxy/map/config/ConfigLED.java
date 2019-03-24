package com.appleyk.Proxy.map.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Led;
import com.appleyk.Proxy.runtime.SmartLed;
import com.appleyk.Proxy.runtime.SmartLedImpl;


public class ConfigLED {
	public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {

//		类映射
		classMaps.put(Led.class.getName(), SmartLedImpl.class.getName());

		// 方法之间的映射关系

		// 1.1空气检测仪的设置获取PM2.5方法
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setBrightness", double.class).getName(),
				Arrays.asList(new String[] {
						Led.class.getName() + "." + Led.class.getMethod("setBrightness", double.class).getName() }));

		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getBrightness").getName(), Arrays.asList(
				new String[] { Led.class.getName() + "." + Led.class.getMethod("getBrightness").getName() }));

		// 1.2空气检测仪的设置、获取id方法
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setId", String.class).getName(),
				Arrays.asList(new String[] {
						Led.class.getName() + "." + Led.class.getMethod("setId", String.class).getName() }));
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getId").getName(), Arrays
				.asList(new String[] { Led.class.getName() + "." + Led.class.getMethod("getId").getName() }));
		// 1.3空气检测仪的设置获取地点方法
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setLName", String.class).getName(),
				Arrays.asList(new String[] { Led.class.getName() + "."
						+ Led.class.getMethod("setLocationName", String.class).getName() }));
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getLName").getName(), Arrays.asList(
				new String[] { Led.class.getName() + "." + Led.class.getMethod("getLocationName").getName() }));
		// 1.4空气检测仪的状态设置获取方法
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setStatus", String.class).getName(),
				Arrays.asList(new String[] { Led.class.getName() + "."
						+ Led.class.getMethod("setStatus", String.class).getName() }));
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getStatus").getName(), Arrays.asList(
				new String[] { Led.class.getName() + "." + Led.class.getMethod("getStatus").getName() }));

		// 1.5空气检测仪的名字设置获取方法
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setDName", String.class).getName(),
				Arrays.asList(new String[] { Led.class.getName() + "."
						+ Led.class.getMethod("setDeviceName", String.class).getName() }));
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getDName").getName(), Arrays.asList(
				new String[] { Led.class.getName() + "." + Led.class.getMethod("getDeviceName").getName() }));
		// 1.6空气检测仪设置获取品牌方法
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("setType", String.class).getName(),
				Arrays.asList(new String[] {
						Led.class.getName() + "." + Led.class.getMethod("setType", String.class).getName() }));
		apiMaps.put(SmartLed.class.getName() + "." + SmartLed.class.getMethod("getType").getName(), Arrays
				.asList(new String[] { Led.class.getName() + "." + Led.class.getMethod("getType").getName() }));

	}

}
