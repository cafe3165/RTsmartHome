package com.appleyk.Proxy.virtualObejct;

import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.runtime.AirCleaner;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.runtime.AirMonitor;
import com.appleyk.Proxy.runtime.FlowerMonitor;
import com.appleyk.Proxy.runtime.Light;
import com.appleyk.Proxy.runtime.SmartLed;
import com.appleyk.Proxy.runtime.SmartWaterPump;

public class Devices {
//	列出设备的所有属性
	public void List(Map<Object, Object> objMaps, Map<String, List<Object>> dmap) {
		System.out.println(dmap);

		for (String i : dmap.keySet()) {
			if (i.equals("airConditioner")) {

				List<Object> aList = dmap.get(i);
				for (Object a : aList) {
					AirCondition airCondition = (AirCondition) a;
					System.out.println(airCondition.getDName());
				}

			} else if (i.equals("airCleaners")) {
				List<Object> aList = dmap.get(i);
				for (Object a : aList) {
					AirCleaner airCondition = (AirCleaner) a;
					System.out.println(airCondition.getDName());
				}

			} else if (i.equals("light")) {
				List<Object> aList = dmap.get(i);
				for (Object a : aList) {
					Light airCondition = (Light) a;
					System.out.println(airCondition.getDName());
				}

			} else if (i.equals("pmmonitor")) {
				List<Object> aList = dmap.get(i);
				for (Object a : aList) {
					AirMonitor airCondition = (AirMonitor) a;
					System.out.println(airCondition.getDName());
				}

			} else if (i.equals("flowerMonitor")) {
				List<Object> aList = dmap.get(i);
				for (Object a : aList) {
					FlowerMonitor airCondition = (FlowerMonitor) a;
					System.out.println(airCondition.getDName());
				}

			} else if (i.equals("smartWaterPump")) {
				List<Object> aList = dmap.get(i);
				for (Object a : aList) {
					SmartWaterPump airCondition = (SmartWaterPump) a;
					System.out.println(airCondition.getDName());
				}

			} else if (i.equals("smartLED")) {
				List<Object> aList = dmap.get(i);
				for (Object a : aList) {
					SmartLed airCondition = (SmartLed) a;
					System.out.println(airCondition.getDName());
				}

			} else {
				System.out.println("no");

			}
		}

	}

}
