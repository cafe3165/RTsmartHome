package com.appleyk.Proxy.map.config;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Wilo;
import com.appleyk.Proxy.runtime.SmartWaterPump;
import com.appleyk.Proxy.runtime.SmartWaterPumpImpl;


public class ConfigWaterPump {
	public static void config(Map<String, String> classMaps, Map<String, List<String>> apiMaps) throws Exception {

//		类映射
		classMaps.put(Wilo.class.getName(), SmartWaterPumpImpl.class.getName());

		// 方法之间的映射关系

		// 1.1花草检测仪的设置获取湿度方法
		apiMaps.put(
				SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setHumidity", double.class).getName(),
				Arrays.asList(new String[] {
						Wilo.class.getName() + "." + Wilo.class.getMethod("setHumidity", double.class).getName() }));

		apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getHumidity").getName(), Arrays
				.asList(new String[] { Wilo.class.getName() + "." + Wilo.class.getMethod("getHumidity").getName() }));

		
		// 1.3花草检测仪的设置、获取id方法
		apiMaps.put(
				SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setId", String.class).getName(),
				Arrays.asList(new String[] {
						Wilo.class.getName() + "." + Wilo.class.getMethod("setId", String.class).getName() }));
		apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getId").getName(), Arrays
				.asList(new String[] { Wilo.class.getName() + "." + Wilo.class.getMethod("getId").getName() }));
		// 1.4花草检测仪的设置获取地点方法
		apiMaps.put(
				SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setLName", String.class).getName(),
				Arrays.asList(new String[] { Wilo.class.getName() + "."
						+ Wilo.class.getMethod("setLocationName", String.class).getName() }));
		apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getLName").getName(),
				Arrays.asList(new String[] {
						Wilo.class.getName() + "." + Wilo.class.getMethod("getLocationName").getName() }));
		// 1.5花草检测仪的状态设置获取方法
		apiMaps.put(
				SmartWaterPump.class.getName() + "."
						+ SmartWaterPump.class.getMethod("setStatus", String.class).getName(),
				Arrays.asList(new String[] {
						Wilo.class.getName() + "." + Wilo.class.getMethod("setStatus", String.class).getName() }));
		apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getStatus").getName(), Arrays
				.asList(new String[] { Wilo.class.getName() + "." + Wilo.class.getMethod("getStatus").getName() }));

		// 1.6花草检测仪的名字设置获取方法
		apiMaps.put(
				SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setDName", String.class).getName(),
				Arrays.asList(new String[] { Wilo.class.getName() + "."
						+ Wilo.class.getMethod("setDeviceName", String.class).getName() }));
		apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getDName").getName(),
				Arrays.asList(new String[] {
						Wilo.class.getName() + "." + Wilo.class.getMethod("getDeviceName").getName() }));
		// 1.7花草检测仪设置获取品牌方法
		apiMaps.put(
				SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("setType", String.class).getName(),
				Arrays.asList(new String[] {
						Wilo.class.getName() + "." + Wilo.class.getMethod("setType", String.class).getName() }));
		apiMaps.put(SmartWaterPump.class.getName() + "." + SmartWaterPump.class.getMethod("getType").getName(), Arrays
				.asList(new String[] { Wilo.class.getName() + "." + Wilo.class.getMethod("getType").getName() }));
		
	}


}
