package com.appleyk.Proxy.device;

import lombok.Data;

@Data
public class Wilo {
	private double Humidity;
	private String id;
	private String locationName;
	private String deviceName;
	private String status;
	private String type;


	
	public void water() {
		Humidity+=1.0;
		System.out.println("设备 "+id+" 正在浇水，湿度为 "+Humidity);
	}

}
