package com.dev.springframework2;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

	@Autowired
	mobileprocessor cpu;
	
	public mobileprocessor getCpu() {
		return cpu;
	}

	public void setCpu(mobileprocessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("octacore processor, 12 mp camera");
		cpu.process();
	}
}
