package com.appleyk.Proxy.device;

public class Wilo {
	private double Humidity;
	private String id;
	private String locationName;
	private String deviceName;
	private String status;
	private String type;

	public double getHumidity() {
		return Humidity;
	}

	public void setHumidity(double humidity) {
		Humidity = humidity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void water() {
		Humidity+=1.0;
		System.out.println("设备 "+id+" 正在浇水，湿度为 "+Humidity);
	}

}
