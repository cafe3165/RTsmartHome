package com.appleyk.Proxy.map.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Meacon;
import com.appleyk.Proxy.runtime.FlowerMonitor;
import com.appleyk.Proxy.runtime.FlowerMonitorImpl;

public class ConfigFlowerMonitor {
	public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {

//		类映射
		classMaps.put(Meacon.class.getName(), FlowerMonitorImpl.class.getName());

		// 方法之间的映射关系

		// 1.1花草检测仪的设置获取湿度方法
		apiMaps.put(
				FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setHumidity", double.class).getName(),
				Arrays.asList(new String[] {
						Meacon.class.getName() + "." + Meacon.class.getMethod("setHumidity", double.class).getName() }));

		apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getHumidity").getName(), Arrays
				.asList(new String[] { Meacon.class.getName() + "." + Meacon.class.getMethod("getHumidity").getName() }));

		// 1.2花草检测仪的设置获取亮度值方法
				apiMaps.put(
						FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setBrightness", double.class).getName(),
						Arrays.asList(new String[] {
								Meacon.class.getName() + "." + Meacon.class.getMethod("setBrightness", double.class).getName() }));

				apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getBrightness").getName(), Arrays
						.asList(new String[] { Meacon.class.getName() + "." + Meacon.class.getMethod("getBrightness").getName() }));
		
		
		// 1.3花草检测仪的设置、获取id方法
		apiMaps.put(
				FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setId", String.class).getName(),
				Arrays.asList(new String[] {
						Meacon.class.getName() + "." + Meacon.class.getMethod("setId", String.class).getName() }));
		apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getId").getName(), Arrays
				.asList(new String[] { Meacon.class.getName() + "." + Meacon.class.getMethod("getId").getName() }));
		// 1.4花草检测仪的设置获取地点方法
		apiMaps.put(
				FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setLName", String.class).getName(),
				Arrays.asList(new String[] { Meacon.class.getName() + "."
						+ Meacon.class.getMethod("setLocationName", String.class).getName() }));
		apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getLName").getName(),
				Arrays.asList(new String[] {
						Meacon.class.getName() + "." + Meacon.class.getMethod("getLocationName").getName() }));
		// 1.5花草检测仪的状态设置获取方法
		apiMaps.put(
				FlowerMonitor.class.getName() + "."
						+ FlowerMonitor.class.getMethod("setStatus", String.class).getName(),
				Arrays.asList(new String[] {
						Meacon.class.getName() + "." + Meacon.class.getMethod("setStatus", String.class).getName() }));
		apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getStatus").getName(), Arrays
				.asList(new String[] { Meacon.class.getName() + "." + Meacon.class.getMethod("getStatus").getName() }));

		// 1.6花草检测仪的名字设置获取方法
		apiMaps.put(
				FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setDName", String.class).getName(),
				Arrays.asList(new String[] { Meacon.class.getName() + "."
						+ Meacon.class.getMethod("setDeviceName", String.class).getName() }));
		apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getDName").getName(),
				Arrays.asList(new String[] {
						Meacon.class.getName() + "." + Meacon.class.getMethod("getDeviceName").getName() }));
		// 1.7花草检测仪设置获取品牌方法
		apiMaps.put(
				FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("setType", String.class).getName(),
				Arrays.asList(new String[] {
						Meacon.class.getName() + "." + Meacon.class.getMethod("setType", String.class).getName() }));
		apiMaps.put(FlowerMonitor.class.getName() + "." + FlowerMonitor.class.getMethod("getType").getName(), Arrays
				.asList(new String[] { Meacon.class.getName() + "." + Meacon.class.getMethod("getType").getName() }));
		
	}

}
