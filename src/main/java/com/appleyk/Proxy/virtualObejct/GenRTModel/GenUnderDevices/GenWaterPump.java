package com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Wilo;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.runtime.SmartWaterPump;
import com.appleyk.Proxy.virtualObejct.WaterPumps;

public class GenWaterPump {
	public static List<Object> genWaterPump(Map<Object, Object> objMaps, Map<String, Object> idObjmaps,
			Map<String, String> idmaps, Map<String, Object> uidMaps, WaterPumps waterPumps) throws Exception {
		List<Object> dList = new ArrayList<Object>();

		// 底层设备生成 返回一个运行时对象
		SmartWaterPump wilo = (SmartWaterPump) Relation.generate(Wilo.class.getName());

		// 运行时对象调用

		wilo.setId("D8");
		wilo.setDName("water pump");
		wilo.setType("Wilo");
		wilo.setLName("balcony");
		wilo.setStatus("off");
		idObjmaps.put(String.valueOf(wilo.hashCode()), objMaps.get(wilo));
		idmaps.put(wilo.getId(), String.valueOf(wilo.hashCode()));

		// 遍历运行时对象标识与底层设备id的映射，添加运行时设备对应的底层设备id
		waterPumps.addlist(wilo.getId());
		// 列出运行时的空调对应的底层空调
		List<String> wpList = waterPumps.list(false);
//		System.out.println(pmList);
//				根据设备id获得所有设备的属性
//				System.out.println("设备属性列表：");
//				for (String underDeviceId : wpList) {
////					System.out.println("---------------------------");
//					waterPumps.ListProperties(underDeviceId, objMaps, idObjmaps, idmaps,true);
//					
//		
//				}

		uidMaps.put(wilo.getId(), wilo);
		dList.add(wilo);

		return dList;
	}

}
