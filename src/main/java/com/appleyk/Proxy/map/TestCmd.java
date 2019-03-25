package com.appleyk.Proxy.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.runtime.Light;
import com.appleyk.Proxy.util.sleepUtil;
import com.appleyk.Proxy.virtualObejct.AirConditioners;
import com.appleyk.Proxy.virtualObejct.Services;

public class TestCmd {
//	核心是去寻找设备，并改变其状态
	public static void testCmd2(Map<String, String> cmdMaps, Map<String, String> idmaps, Map<String, Object> idObjmaps,
			Map<Object, Object> objMaps, Map<String, List<Object>> dmap) {

//		System.out.println(cmdMaps);
		Object airCon = null;
		switch (cmdMaps.get("device")) {
		case "airconditioner":
			List<Object> airlist = dmap.get("airConditioner");
			for (Object to : airlist) {
				AirCondition airCondition = (AirCondition) to;
				if (airCondition.getLName().equals(cmdMaps.get("location"))) {
					airCon = airCondition;
					break;
				}
			}

			AirCondition airC = (AirCondition) airCon;
			System.out.println("在 " + cmdMaps.get("location") + " 的设备为：" + airC.getID());

			String op = judge.judgeOperation(cmdMaps.get("operation"));
			System.out.println("设备 " + airC.getID() + "当前状态为：" + airC.getStatus());
			System.out.println("改变设备" + airC.getID() + "状态。");
			airC.setStatus(op);
			System.out.println("设备 " + airC.getID() + "当前状态为：" + airC.getStatus());

			break;

		case "light":
			List<Object> lightlist = dmap.get("light");
			for (Object to : lightlist) {
				Light light = (Light) to;
				if (light.getLName().equals(cmdMaps.get("location"))) {
					airCon = light;
					break;
				}
			}

			Light light = (Light) airCon;
			System.out.println("在 " + cmdMaps.get("location") + " 的设备为：" + light.getID());

			String lop = judge.judgeOperation(cmdMaps.get("operation"));
			System.out.println("设备 " + light.getID() + "当前状态为：" + light.getStatus());
			System.out.println("改变设备" + light.getID() + "状态。");
			light.setStatus(lop);
			System.out.println("设备 " + light.getID() + "当前状态为：" + light.getStatus());

			break;
		default:
			break;
		}

	}

	// 核心是去找service，并最终执行
	public static void testCmd(Map<String, String> cmdMaps, Services services, Map<String, String> SerDevMaps,
			Map<String, String> idmaps, Map<String, Object> idObjmaps, Map<Object, Object> objMaps,
			Map<String, Object> serMap, Map<String, Object> contMap) throws InterruptedException {
		Map<String, String> doMap = new HashMap<String, String>();

//		System.out.println("根据已知信息，寻找对应服务。");
		doMap = findUtil.findSer(cmdMaps, services, serMap);
		
//		System.out.println("开始执行服务操作：");
//		System.out.println(doMap);
		String SerId = doMap.get("SerId");
		String Value = doMap.get("Value");
		String SKey = doMap.get("SKey");
		services.SetDevProperties(SerId, Value, SKey, SerDevMaps, idmaps, idObjmaps, objMaps, serMap, contMap);
//		changeContext(services, contexts);
//		for (String cid : contexts.list(false)) {
//			Context context = (Context) contexts.ListProperties(cid, contMap, true);
//		}
//
//		judgeContext(contexts, services);
//		outputTime();

//		Sleep();
//		

//		Sleep();
//		outputTime();

	}

}
