package com.appleyk.Proxy.map;

import com.appleyk.Proxy.virtualObejct.Context;
import com.appleyk.Proxy.virtualObejct.Contexts;
import com.appleyk.Proxy.virtualObejct.Service;
import com.appleyk.Proxy.virtualObejct.Services;

import java.util.Map;

public class inference {
    public static String changeContext(Services services, Contexts contexts, Map<String, Object> serMap, Map<String, Object> contMap, String result) {
        services.list(true);
        contexts.list(true);
        double currentCValue = Double.valueOf(result);
        String flag = null;
//        for (String sid : services.list(false)) {
//            Service service = (Service) services.ListProperties(sid, serMap, false);
////            System.out.println(service.getServiceId());
//            for (String cid : contexts.list(false)) {
//                Context context = (Context) contexts.ListProperties(cid, contMap, false);
////
//                if (service.getLName().equals(context.getLName()) && service.getCType().equals(context.getCType())) {
////
//                    if (currentCValue < context.getRMin() || currentCValue > context.getRMax()) {
//                        if ((service.getEffect().equals("Increase") && service.getStatus().equals("on"))) {
//                            context.setCValue(currentCValue);
////                            System.out.println(context.getCValue());
//                        }
//
//
//                    }
//
//                }
////
//            }
//        }

        for (String cid : contexts.list(false)) {
            Context context = (Context) contexts.ListProperties(cid, contMap, false);
            System.out.println(context.getLName()+" "+context.getUName()+" "+context.getCValue());


        }


        return flag;
    }

    public static boolean judgeContext(Contexts contexts, Services services, Map<String, Object> serMap, Map<String, Object> contMap) {
        boolean status = true;

        for (String cid : contexts.list(false)) {
            Context context = (Context) contexts.ListProperties(cid, contMap, false);

            if (context.getCValue() > context.getRMax()) {
                System.out.println(context.getCValue());

            }

            if (context.getCValue() < context.getRMin()) {
                System.out.println(context.getCValue());
                for (String sid : services.list(false)) {
                    Service service = new Service();
                    service = (Service) services.ListProperties(sid, serMap, false);
                    if (service.getLName().equals(context.getLName())
                            && service.getCType().equals(context.getCType())) {
                        System.out.println(service.getServiceId() + service.getStatus() + service.getEffect());

                    }
                }
            }

        }

        return status;
    }

}
