package com.appleyk.Proxy.virtualObejct.GenRTModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.appleyk.Proxy.map.findUtil;
import com.appleyk.Proxy.runtime.AirCleaner;
import com.appleyk.Proxy.runtime.AirCondition;
import com.appleyk.Proxy.runtime.AirMonitor;
import com.appleyk.Proxy.runtime.FlowerMonitor;
import com.appleyk.Proxy.runtime.Light;
import com.appleyk.Proxy.runtime.SmartLed;
import com.appleyk.Proxy.runtime.SmartWaterPump;
import com.appleyk.Proxy.virtualObejct.AirConditioners;
import com.appleyk.Proxy.virtualObejct.Service;
import com.appleyk.Proxy.virtualObejct.Services;
import com.appleyk.Proxy.virtualObejct.init.initConcept;

public class genService {

	public static void genS(Map<String, String> idmaps, Map<String, String> SerDevMaps, Map<String, Object> serMap,
			Map<String, List<Object>> dmap, Services services) {
		List<Object> airlist = new ArrayList<>();
		List<Object> lightlist = new ArrayList<>();
		List<Object> pmlist = new ArrayList<>();
		List<Object> aplist = new ArrayList<>();
		List<Object> fmlist = new ArrayList<>();
		List<Object> wplist = new ArrayList<>();
		List<Object> ledlist = new ArrayList<>();

		for (Object d : dmap.get("airConditioner")) {
			AirCondition aCondition = (AirCondition) d;
			airlist.add(aCondition);
		}
		for (Object d : dmap.get("light")) {
			Light li = (Light) d;
			lightlist.add(li);
		}
		for (Object d : dmap.get("pmmonitor")) {
			AirMonitor li = (AirMonitor) d;
			pmlist.add(li);
		}
		for (Object d : dmap.get("airCleaners")) {
			AirCleaner li = (AirCleaner) d;
			aplist.add(li);
		}
		for (Object d : dmap.get("flowerMonitor")) {
			FlowerMonitor li = (FlowerMonitor) d;
			fmlist.add(li);
		}
		for (Object d : dmap.get("smartWaterPump")) {
			SmartWaterPump li = (SmartWaterPump) d;
			wplist.add(li);
		}
		for (Object d : dmap.get("smartLED")) {
			SmartLed li = (SmartLed) d;
			ledlist.add(li);
		}

//		Light tLight=(Light)lightlist.get(1);
//		System.out.println(tLight.getType());

//		松下空调 卧室
		String ServiceId11 = "S11";
		String DName11 = "air conditioner";
		String Type11 = "Panasonic";
		String CType11 = "Temperature";
		String Effect11 = "Monitor";
		String DeviceId11 = findUtil.findUnderid(airlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId11 = String.valueOf(airlist.get(1).hashCode());

		String ServiceId12 = "S12";
		String Effect12 = "Increase";

		String ServiceId13 = "S13";
		String Effect13 = "Reduce";

		String ServiceId14 = "S14";
		String Effect14 = "Assign";
////////////////////////////////////////////////////////////////////////////////////////////////////
//		格力空调 卧室
		String ServiceId51 = "S51";
		String DName51 = "air conditioner";
		String Type51 = "Gree";
		String CType51 = "Temperature";
		String Effect51 = "Monitor";
		String DeviceId51 = findUtil.findUnderid(airlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId51 = String.valueOf(airlist.get(0).hashCode());

		String ServiceId52 = "S52";
		String Effect52 = "Increase";

		String ServiceId53 = "S53";
		String Effect53 = "Reduce";

		String ServiceId54 = "S54";
		String Effect54 = "Assign";

//		midea电灯
		String ServiceId21 = "S21";
		String DName21 = "light";
		String Type21 = "Midea";
		String CType21 = "Brightness";
		String Effect21 = "Monitor";
		String DeviceId21 = findUtil.findUnderid(lightlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId21 = String.valueOf(lightlist.get(0).hashCode());

		String ServiceId22 = "S22";
		String Effect22 = "Increase";

		String ServiceId23 = "S23";
		String Effect23 = "Assign";

//		Opple电灯
		String ServiceId61 = "S61";
		String DName61 = "light";
		String Type61 = "Opple";
		String CType61 = "Brightness";
		String Effect61 = "Monitor";
		String DeviceId61 = findUtil.findUnderid(lightlist.get(1).hashCode(), idmaps);
		String RutimeDeviceId61 = String.valueOf(lightlist.get(1).hashCode());

		String ServiceId62 = "S62";
		String Effect62 = "Increase";

		String ServiceId63 = "S63";
		String Effect63 = "Assign";

//		空气检测仪
		String ServiceId31 = "S31";
		String DName31 = "PM2.5 monitor";
		String Type31 = "Philips";
		String CType31 = "PM2.5";
		String Effect31 = "Monitor";
		String DeviceId31 = findUtil.findUnderid(pmlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId31 = String.valueOf(pmlist.get(0).hashCode());

//		空气净化器
		String ServiceId41 = "S41";
		String DName41 = "air purifier";
		String Type41 = "Mi";
		String CType41 = "PM2.5";
		String Effect41 = "Reduce";
		String DeviceId41 = findUtil.findUnderid(aplist.get(0).hashCode(), idmaps);
		String RutimeDeviceId41 = String.valueOf(aplist.get(0).hashCode());

//		花草检测仪
		String ServiceId71 = "S71";
		String DName71 = "flower monitor";
		String Type71 = "Meacon";
		String CType71 = "Humidity";
		String Effect71 = "Monitor";
		String DeviceId71 = findUtil.findUnderid(fmlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId71 = String.valueOf(fmlist.get(0).hashCode());

		String ServiceId72 = "S72";
		String CType72 = "Brightness";
		String Effect72 = "Monitor";

//		水泵
		String ServiceId81 = "S81";
		String DName81 = "water pump";
		String Type81 = "Wilo";
		String CType81 = "Humidity";
		String Effect81 = "Increase";
		String DeviceId81 = findUtil.findUnderid(wplist.get(0).hashCode(), idmaps);
		String RutimeDeviceId81 = String.valueOf(wplist.get(0).hashCode());

		String ServiceId91 = "S91";
		String DName91 = "SmartLedFC";
		String Type91 = "Led";
		String CType91 = "Brightness";
		String Effect91 = "Increase";
		String DeviceId91 = findUtil.findUnderid(ledlist.get(0).hashCode(), idmaps);
		String RutimeDeviceId91 = String.valueOf(ledlist.get(0).hashCode());

		String ServiceId92 = "S92";
		String Effect92 = "Assign";

////////////////////////////////////////////////////////////////////////////////////////////////////
//		服务初始化
		Service Service11 = new Service();
		Service S11 = (Service) initConcept.initService(ServiceId11, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect11, Type11, Service11);
		Service Service12 = new Service();
		Service S12 = (Service) initConcept.initService(ServiceId12, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect12, Type11, Service12);
		Service Service13 = new Service();
		Service S13 = (Service) initConcept.initService(ServiceId13, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect13, Type11, Service13);
		Service Service14 = new Service();
		Service S14 = (Service) initConcept.initService(ServiceId14, DeviceId11, RutimeDeviceId11, DName11, CType11,
				Effect14, Type11, Service14);

		Service Service51 = new Service();
		Service S51 = (Service) initConcept.initService(ServiceId51, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect51, Type51, Service51);
		Service Service52 = new Service();
		Service S52 = (Service) initConcept.initService(ServiceId52, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect52, Type51, Service52);
		Service Service53 = new Service();
		Service S53 = (Service) initConcept.initService(ServiceId53, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect53, Type51, Service53);
		Service Service54 = new Service();
		Service S54 = (Service) initConcept.initService(ServiceId54, DeviceId51, RutimeDeviceId51, DName51, CType51,
				Effect54, Type51, Service54);

		Service Service21 = new Service();
		Service S21 = (Service) initConcept.initService(ServiceId21, DeviceId21, RutimeDeviceId21, DName21, CType21,
				Effect21, Type21, Service21);
		Service Service22 = new Service();
		Service S22 = (Service) initConcept.initService(ServiceId22, DeviceId21, RutimeDeviceId21, DName21, CType21,
				Effect22, Type21, Service22);
		Service Service23 = new Service();
		Service S23 = (Service) initConcept.initService(ServiceId23, DeviceId21, RutimeDeviceId21, DName21, CType21,
				Effect23, Type21, Service23);

		Service Service61 = new Service();
		Service S61 = (Service) initConcept.initService(ServiceId61, DeviceId61, RutimeDeviceId61, DName61, CType61,
				Effect61, Type61, Service61);
		Service Service62 = new Service();
		Service S62 = (Service) initConcept.initService(ServiceId62, DeviceId61, RutimeDeviceId61, DName61, CType61,
				Effect62, Type61, Service62);
		Service Service63 = new Service();
		Service S63 = (Service) initConcept.initService(ServiceId63, DeviceId61, RutimeDeviceId61, DName61, CType61,
				Effect63, Type61, Service63);

		Service Service31 = new Service();
		Service S31 = (Service) initConcept.initService(ServiceId31, DeviceId31, RutimeDeviceId31, DName31, CType31,
				Effect31, Type31, Service31);
		Service Service41 = new Service();
		Service S41 = (Service) initConcept.initService(ServiceId41, DeviceId41, RutimeDeviceId41, DName41, CType41,
				Effect41, Type41, Service41);

		Service Service71 = new Service();
		Service S71 = (Service) initConcept.initService(ServiceId71, DeviceId71, RutimeDeviceId71, DName71, CType71,
				Effect71, Type71, Service71);
		Service Service72 = new Service();
		Service S72 = (Service) initConcept.initService(ServiceId72, DeviceId71, RutimeDeviceId71, DName71, CType72,
				Effect72, Type71, Service72);

		Service Service81 = new Service();
		Service S81 = (Service) initConcept.initService(ServiceId81, DeviceId81, RutimeDeviceId81, DName81, CType81,
				Effect81, Type81, Service81);

		Service Service91 = new Service();
		Service S91 = (Service) initConcept.initService(ServiceId91, DeviceId91, RutimeDeviceId91, DName91, CType91,
				Effect91, Type91, Service91);
		Service Service92 = new Service();
		Service S92 = (Service) initConcept.initService(ServiceId92, DeviceId91, RutimeDeviceId91, DName91, CType91,
				Effect92, Type91, Service92);

		AirCondition ndAirCondition = (AirCondition) airlist.get(0);
		AirCondition panasonic = (AirCondition) airlist.get(1);

		Light midea = (Light) lightlist.get(0);
		Light opple = (Light) lightlist.get(1);

		AirMonitor philips = (AirMonitor) pmlist.get(0);

		AirCleaner mi = (AirCleaner) aplist.get(0);

		FlowerMonitor meacon = (FlowerMonitor) fmlist.get(0);

		SmartWaterPump wilo = (SmartWaterPump) wplist.get(0);
		
		SmartLed led = (SmartLed) ledlist.get(0);
//		服务配置
		initConcept.serConfig(panasonic, S11, SerDevMaps, serMap, panasonic.getDName());
		initConcept.serConfig(panasonic, S12, SerDevMaps, serMap, panasonic.getDName());
		initConcept.serConfig(panasonic, S13, SerDevMaps, serMap, panasonic.getDName());
		initConcept.serConfig(panasonic, S14, SerDevMaps, serMap, panasonic.getDName());

		initConcept.serConfig(ndAirCondition, S51, SerDevMaps, serMap, ndAirCondition.getDName());
		initConcept.serConfig(ndAirCondition, S52, SerDevMaps, serMap, ndAirCondition.getDName());
		initConcept.serConfig(ndAirCondition, S53, SerDevMaps, serMap, ndAirCondition.getDName());
		initConcept.serConfig(ndAirCondition, S54, SerDevMaps, serMap, ndAirCondition.getDName());

		initConcept.serConfig(midea, S21, SerDevMaps, serMap, midea.getDName());
		initConcept.serConfig(midea, S22, SerDevMaps, serMap, midea.getDName());
		initConcept.serConfig(midea, S23, SerDevMaps, serMap, midea.getDName());

		initConcept.serConfig(opple, S61, SerDevMaps, serMap, opple.getDName());
		initConcept.serConfig(opple, S62, SerDevMaps, serMap, opple.getDName());
		initConcept.serConfig(opple, S63, SerDevMaps, serMap, opple.getDName());

		initConcept.serConfig(philips, S31, SerDevMaps, serMap, philips.getDName());
		initConcept.serConfig(mi, S41, SerDevMaps, serMap, mi.getDName());

		initConcept.serConfig(meacon, S71, SerDevMaps, serMap, meacon.getDName());
		initConcept.serConfig(meacon, S72, SerDevMaps, serMap, meacon.getDName());

		initConcept.serConfig(wilo, S81, SerDevMaps, serMap, wilo.getDName());
		
		initConcept.serConfig(led, S91, SerDevMaps, serMap, led.getDName());
		initConcept.serConfig(led, S92, SerDevMaps, serMap, led.getDName());

		services.addlist(SerDevMaps);
//		List<String> SList = services.list(true);
		outPutSer(services, serMap, false);

	}

//	服务输出操作
	public static void outPutSer(Services services, Map<String, Object> serMap, boolean f) {

		for (String sid : services.list(f)) {
			services.ListProperties(sid, serMap, f);
		}

	}

}
