package com.appleyk.Proxy.virtualObejct.GenRTModel;

import com.appleyk.Proxy.virtualObejct.Context;
import com.appleyk.Proxy.virtualObejct.Contexts;
import com.appleyk.Proxy.virtualObejct.Service;
import com.appleyk.Proxy.virtualObejct.Services;
import com.appleyk.Proxy.virtualObejct.init.initConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class genContext {

	public static void genC(Map<String, String> serConMap, Map<String, String> userIdNameMap,
			Map<String, Object> userMap, Map<String, Object> serMap, Map<String, Object> contMap, Services services,
			Contexts contexts) {

		String CUName11 = "Jack";
		String CCType11 = "Temperature";
		double RMin11 = 19.0;
		double RMax11 = 26.0;
		String CID11 = "C11";

		String CCType13 = "Brightness";
		double RMin13 = 20.0;
		double RMax13 = 100.0;
		String CID13 = "C13";

		String CCType14 = "PM2.5";
		double RMin14 = 0.0;
		double RMax14 = 35.0;
		String CID14 = "C14";

		String CUName21 = "Ken";
		String CCType21 = "Temperature";
		double RMin21 = 22.0;
		double RMax21 = 26.0;
		String CID21 = "C21";

		String CCType23 = "Brightness";
		double RMin23 = 20.0;
		double RMax23 = 100.0;
		String CID23 = "C23";

		String CCType24 = "PM2.5";
		double RMin24 = 0.0;
		double RMax24 = 35.0;
		String CID24 = "C24";

		String CUName31 = "Sansevieria";
		String CCType31 = "Temperature";
		double RMin31 = 10.0;
		double RMax31 = 35.0;
		String CID31 = "C31";

		String CCType33 = "Brightness";
		double RMin33 = 20.0;
		double RMax33 = 100.0;
		String CID33 = "C33";

		String CUName43 = "Cactus";
		String CCType43 = "Brightness";
		double RMin43 = 80.0;
		double RMax43 = 100.0;
		String CID43 = "C43";
		
		String CCType42 = "Humidity";
		double RMin42 = 20.0;
		double RMax42 = 100.0;
		String CID42 = "C42";

		String CUName53 = "Lily";
		String CCType53 = "Brightness";
		double RMin53 = 70.0;
		double RMax53 = 100.0;
		String CID53 = "C53";
		
		String CCType52 = "Humidity";
		double RMin52 = 60.0;
		double RMax52 = 100.0;
		String CID52 = "C52";

		List<String> CIDList = new ArrayList<String>();
		CIDList.add(CID11);
		CIDList.add(CID13);
		CIDList.add(CID14);
		CIDList.add(CID21);
		CIDList.add(CID23);
		CIDList.add(CID24);
		CIDList.add(CID31);
		CIDList.add(CID33);
		CIDList.add(CID42);
		CIDList.add(CID43);
		CIDList.add(CID52);
		CIDList.add(CID53);

//		服务与环境的绑定
		int index = 0;
		for (String s : services.list(false)) {
			Service ts = new Service();
			ts = (Service) services.ListProperties(s, serMap, false);
			if (ts.getEffect().equals("Monitor")) {
				serConMap.put(CIDList.get(index), ts.getServiceId());
				index++;

			} else {
				continue;
			}
		}
//		System.out.println(serConMap);
		Context c11 = new Context();
		Context c13 = new Context();
		Context c14 = new Context();
		Context c21 = new Context();
		Context c23 = new Context();
		Context c24 = new Context();

		Context c31 = new Context();
		Context c33 = new Context();
		Context c43 = new Context();
		Context c42 = new Context();
		Context c52 = new Context();
		Context c53 = new Context();
		c11 = (Context) initConcept.initContext(CUName11, CCType11, RMin11, RMax11, CID11, c11, userIdNameMap, userMap,
				serConMap, serMap);
		c13 = (Context) initConcept.initContext(CUName11, CCType13, RMin13, RMax13, CID13, c13, userIdNameMap, userMap,
				serConMap, serMap);
		c14 = (Context) initConcept.initContext(CUName11, CCType14, RMin14, RMax14, CID14, c14, userIdNameMap, userMap,
				serConMap, serMap);
		c21 = (Context) initConcept.initContext(CUName21, CCType21, RMin21, RMax21, CID21, c21, userIdNameMap, userMap,
				serConMap, serMap);
		c23 = (Context) initConcept.initContext(CUName21, CCType23, RMin23, RMax23, CID23, c23, userIdNameMap, userMap,
				serConMap, serMap);
		c24 = (Context) initConcept.initContext(CUName21, CCType24, RMin24, RMax24, CID24, c24, userIdNameMap, userMap,
				serConMap, serMap);
		c31 = (Context) initConcept.initContext(CUName31, CCType31, RMin31, RMax31, CID31, c31, userIdNameMap, userMap,
				serConMap, serMap);
		c33 = (Context) initConcept.initContext(CUName31, CCType33, RMin33, RMax33, CID33, c33, userIdNameMap, userMap,
				serConMap, serMap);
		c42 = (Context) initConcept.initContext(CUName43, CCType42, RMin42, RMax42, CID42, c42, userIdNameMap, userMap,
				serConMap, serMap);
		c43 = (Context) initConcept.initContext(CUName43, CCType43, RMin43, RMax43, CID43, c43, userIdNameMap, userMap,
				serConMap, serMap);
		c52 = (Context) initConcept.initContext(CUName53, CCType52, RMin52, RMax52, CID52, c52, userIdNameMap, userMap,
				serConMap, serMap);
		c53 = (Context) initConcept.initContext(CUName53, CCType53, RMin53, RMax53, CID53, c53, userIdNameMap, userMap,
				serConMap, serMap);
		

		contMap.put(c11.getCId(), c11);
		contMap.put(c13.getCId(), c13);
		contMap.put(c14.getCId(), c14);

		contMap.put(c21.getCId(), c21);
		contMap.put(c23.getCId(), c23);
		contMap.put(c24.getCId(), c24);

		contMap.put(c31.getCId(), c31);
		contMap.put(c33.getCId(), c33);
		contMap.put(c43.getCId(), c43);
		contMap.put(c42.getCId(), c42);
		contMap.put(c52.getCId(), c52);
		contMap.put(c53.getCId(), c53);

		contexts.addlist(CID11);
		contexts.addlist(CID13);
		contexts.addlist(CID14);

		contexts.addlist(CID21);
		contexts.addlist(CID23);
		contexts.addlist(CID24);

		contexts.addlist(CID31);
		contexts.addlist(CID33);
		contexts.addlist(CID42);
		contexts.addlist(CID43);
		contexts.addlist(CID52);
		contexts.addlist(CID53);
		for (String cid : contexts.list(false)) {
//			System.out.println("------------------");
			contexts.ListProperties(cid, contMap, false);

		}

	}

}
