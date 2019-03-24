package com.appleyk.Proxy.runtime;

public interface FlowerMonitor {
	public double getHumidity();

	public void setHumidity(double humidity);

	public String getId();

	public void setId(String id);

	public String getLName();

	public void setLName(String locationName);

	public String getDName();

	public void setDName(String deviceName);

	public String getStatus();

	public void setStatus(String status);

	public String getType();

	public void setType(String type);

	public double getBrightness();

	public void setBrightness(double brightness);

}
