package com.org;

public class Rabbit {
static {
	System.out.println("class loading");
}
{
	System.out.println("object is created");
}
public void init() {
	System.out.println("init method executed");
	
}
public void destroy() {
	System.out.println("destory method is Executed");
}
}
