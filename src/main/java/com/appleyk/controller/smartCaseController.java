package com.appleyk.controller;


import com.appleyk.Proxy.virtualObejct.Context;
import com.appleyk.Proxy.virtualObejct.Contexts;
import com.appleyk.Proxy.virtualObejct.Service;
import com.appleyk.Proxy.virtualObejct.Services;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class smartCaseController {
    @RequestMapping("/create")
    public String index() {
        return "Hello World 888";
    }

    @RequestMapping("/createtest")

    public static void changeContext(Services services, Contexts contexts, Map<String, Object> serMap, Map<String, Object> contMap) {
        services.list(true);
        contexts.list(true);

        for (String sid : services.list(false)) {
            Service service = (Service) services.ListProperties(sid, serMap, false);
//            System.out.println(service.getServiceId());
            for (String cid : contexts.list(false)) {
                Context context = (Context) contexts.ListProperties(cid, contMap, false);

                if (service.getLName().equals(context.getLName()) && service.getCType().equals(context.getCType())) {

                    if ((service.getEffect().equals("Increase") || service.getEffect().equals("Reduce")
                            || service.getEffect().equals("Assign")) && service.getStatus().equals("on")) {
//                        context.setCValue(service.getSValue());
//						System.out.println(service.getServiceId() + context.getCId());
//                        context.setCVale(service.getSValue());
                        System.out.println(service.getEffect());
                        System.out.println(context.getRMax());
                    }


//
                }
//
            }
        }

    }

}
