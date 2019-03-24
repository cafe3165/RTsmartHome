package com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Mi;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.runtime.AirCleaner;
import com.appleyk.Proxy.virtualObejct.AirCleaners;

public class GenAir2s {
	public static List<Object> genAir2s(Map<Object, Object> objMaps, Map<String, Object> idObjmaps, Map<String, String> idmaps,
			Map<String, Object> uidMaps, AirCleaners acs) throws Exception {
		List<Object> dList=new ArrayList<Object>();
		
		// 底层设备生成 返回一个运行时对象
		AirCleaner Mi = (AirCleaner) Relation.generate(Mi.class.getName());

		// 运行时对象调用

		Mi.setId("D4");
		Mi.setDName("air purifier");
		Mi.setType("Mi");
		Mi.setLName("sittingroom");
		Mi.setPM2_5(0.0);
		Mi.setStatus("off");
		idObjmaps.put(String.valueOf(Mi.hashCode()), objMaps.get(Mi));
		idmaps.put(Mi.getId(), String.valueOf(Mi.hashCode()));
		
		// 遍历运行时对象标识与底层设备id的映射，添加运行时设备对应的底层设备id
		acs.addlist(Mi.getId());
		// 列出运行时的空调对应的底层空调
		List<String> acList = acs.list(false);
//		System.out.println(acList);
//				根据设备id获得所有设备的属性
//				System.out.println("设备属性列表：");
//				for (String underDeviceId : acList) {
////					System.out.println("---------------------------");
//					acs.ListProperties(underDeviceId, objMaps, idObjmaps, idmaps,true);
//					
//		
//				}

		uidMaps.put(Mi.getId(), Mi);
		dList.add(Mi);
		
		return dList;
	}


}
