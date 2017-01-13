package com.fsnc.testng.group;

import java.io.File;

import org.testng.annotations.Test;

/**
 * 右键  New->test NG class 创建testng.xml
 * 
 * testng.xml右键  Run As testng-suit即可运行
 * 
 * @author Jerrik
 */
public class TestGroup {
	@Test(groups = "isBlank")
	public void isBlank() {
		System.out.println("isBlank");
	}

	@Test(groups = "isNotBlank")
	public void isNotBlank() {
		System.out.println("isNotBlank");
	}

	@Test(groups = { "isBlank", "isNotBlank" })
	public void testAll() {
		System.out.println("test All");
	}
	
	@Test(groups = { "windows.separator" })
	public void testWindows() {
		System.out.println("windows: " + File.separator);
	}
	
	@Test(groups = { "linux.separator" })
	public void testLiniux() {
		System.out.println("linux: " + File.separator);
	}
}
