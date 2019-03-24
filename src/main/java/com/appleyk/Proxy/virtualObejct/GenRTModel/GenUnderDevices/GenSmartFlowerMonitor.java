package com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Meacon;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.runtime.FlowerMonitor;
import com.appleyk.Proxy.virtualObejct.FlowerMonitors;

public class GenSmartFlowerMonitor {
	public static List<Object> genFlowerMonitor(Map<Object, Object> objMaps, Map<String, Object> idObjmaps,
			Map<String, String> idmaps, Map<String, Object> uidMaps, FlowerMonitors flowerMonitors) throws Exception {
		List<Object> dList = new ArrayList<Object>();

		// 底层设备生成 返回一个运行时对象
//		System.out.println(Meacon.class.getName());
		FlowerMonitor Meacon = (FlowerMonitor) Relation.generate(Meacon.class.getName());

		// 运行时对象调用
//		System.out.println(Meacon.hashCode());
		Meacon.setId("D7");
		Meacon.setDName("flower monitor");
		Meacon.setType("Meacon");
		Meacon.setLName("balcony");
		Meacon.setBrightness(0.0);
		Meacon.setHumidity(0.0);
		Meacon.setStatus("off");
		idObjmaps.put(String.valueOf(Meacon.hashCode()), objMaps.get(Meacon));
		idmaps.put(Meacon.getId(), String.valueOf(Meacon.hashCode()));

		// 遍历运行时对象标识与底层设备id的映射，添加运行时设备对应的底层设备id
		flowerMonitors.addlist(Meacon.getId());
		// 列出运行时的空调对应的底层空调
		List<String> fmList = flowerMonitors.list(false);
//		System.out.println(acList);
//				根据设备id获得所有设备的属性
//				System.out.println("设备属性列表：");
//		for (String underDeviceId : fmList) {
//					System.out.println("---------------------------");
//			flowerMonitors.ListProperties(underDeviceId, objMaps, idObjmaps, idmaps, true);
//
//		}

		uidMaps.put(Meacon.getId(), Meacon);
		dList.add(Meacon);

		return dList;
	}
}
