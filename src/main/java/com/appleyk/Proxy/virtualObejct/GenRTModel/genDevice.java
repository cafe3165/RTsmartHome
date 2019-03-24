package com.appleyk.Proxy.virtualObejct.GenRTModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.device.Gree;
import com.appleyk.Proxy.device.Panasonic;
import com.appleyk.Proxy.map.Relation;
import com.appleyk.Proxy.map.findUtil;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.virtualObejct.AirCleaners;
import com.appleyk.Proxy.virtualObejct.AirConditioners;
import com.appleyk.Proxy.virtualObejct.FlowerMonitors;
import com.appleyk.Proxy.virtualObejct.LEDs;
import com.appleyk.Proxy.virtualObejct.Lights;
import com.appleyk.Proxy.virtualObejct.PMMonitors;
import com.appleyk.Proxy.virtualObejct.WaterPumps;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenAir2s;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenAirConditioner;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenLED;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenLight;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenPMMonitor;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenSmartFlowerMonitor;
import com.appleyk.Proxy.virtualObejct.GenRTModel.GenUnderDevices.GenWaterPump;

public class genDevice {

	public static Map<String, List<Object>> genD(Map<Object, Object> objMaps, Map<String, Object> idObjmaps,
			Map<String, String> idmaps, Map<String, Object> uidMaps, Map<String, Object> typeMap) throws Exception {

//		AirConditioners airConditioners;
		Map<String, List<Object>> dmaps = new HashMap<String, List<Object>>();
		List<Object> aList = new ArrayList<>();
		List<Object> lList = new ArrayList<>();
		List<Object> pmList = new ArrayList<>();
		List<Object> acList = new ArrayList<>();
		List<Object> fmList = new ArrayList<>();
		List<Object> wpList = new ArrayList<>();
		List<Object> ledList = new ArrayList<>();

		aList = GenAirConditioner.genAirConditioner(objMaps, idObjmaps, idmaps, uidMaps,
				(AirConditioners) typeMap.get("AirConditioners"));
		dmaps.put("airConditioner", aList);
		lList = GenLight.genLight(objMaps, idObjmaps, idmaps, uidMaps, (Lights) typeMap.get("Lights"));
		dmaps.put("light", lList);
		pmList = GenPMMonitor.genPMMonitor(objMaps, idObjmaps, idmaps, uidMaps, (PMMonitors) typeMap.get("PMMonitors"));
		dmaps.put("pmmonitor", pmList);
		acList = GenAir2s.genAir2s(objMaps, idObjmaps, idmaps, uidMaps, (AirCleaners) typeMap.get("AirCleaners"));
		dmaps.put("airCleaners", acList);
		fmList = GenSmartFlowerMonitor.genFlowerMonitor(objMaps, idObjmaps, idmaps, uidMaps,
				(FlowerMonitors) typeMap.get("FlowerMonitors"));
		dmaps.put("flowerMonitor", fmList);
		wpList = GenWaterPump.genWaterPump(objMaps, idObjmaps, idmaps, uidMaps, (WaterPumps) typeMap.get("WaterPumps"));
		dmaps.put("smartWaterPump", wpList);
		ledList = GenLED.genLED(objMaps, idObjmaps, idmaps, uidMaps, (LEDs) typeMap.get("SmartLEDs"));
		dmaps.put("smartLED", ledList);

		return dmaps;
	}

}
