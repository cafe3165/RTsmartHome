package com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Led;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.runtime.SmartLed;
import com.appleyk.Proxy.virtualObejct.LEDs;

public class GenLED {
	public static List<Object> genLED(Map<Object, Object> objMaps, Map<String, Object> idObjmaps, Map<String, String> idmaps,
			Map<String, Object> uidMaps, LEDs leds) throws Exception {
		List<Object> dList=new ArrayList<Object>();
		
		// 底层设备生成 返回一个运行时对象
		SmartLed led = (SmartLed) Relation.generate(Led.class.getName());

		// 运行时对象调用

		led.setId("D9");
		led.setDName("SmartLedFC");
		led.setType("LED");
		led.setLName("balcony");
		led.setBrightness(0.0);
		led.setStatus("off");
		idObjmaps.put(String.valueOf(led.hashCode()), objMaps.get(led));
		idmaps.put(led.getId(), String.valueOf(led.hashCode()));
		
		// 遍历运行时对象标识与底层设备id的映射，添加运行时设备对应的底层设备id
		leds.addlist(led.getId());
		// 列出运行时的空调对应的底层空调
		List<String> ledList = leds.list(false);
//		System.out.println(pmList);
//				根据设备id获得所有设备的属性
//				System.out.println("设备属性列表：");
//				for (String underDeviceId : ledList) {
////					System.out.println("---------------------------");
//					leds.ListProperties(underDeviceId, objMaps, idObjmaps, idmaps,true);
//					
//		
//				}

		uidMaps.put(led.getId(), led);
		dList.add(led);
		
		return dList;
	}


}
