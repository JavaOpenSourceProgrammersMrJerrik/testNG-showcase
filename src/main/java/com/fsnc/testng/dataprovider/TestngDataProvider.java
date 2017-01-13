package com.fsnc.testng.dataprovider;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataProvider {

	/**
	 * 数组内的每个元素都会作为一个用例数据被执行 On execution testEmployeeData() will be executed 4
	 * times,
	 * 
	 * 数据源可以是Java对象、配置文件、数据库
	 * 
	 * @return
	 */
	@DataProvider(name = "DP1")
	public Object[][] createData() {
		Object[][] retObjArr = { { "001", "Jack", "London" }, { "002", "John", "New York" },
				{ "003", "Mary", "Miami" }, { "004", "George", "california" } };
		return (retObjArr);
	}

	@Test(dataProvider = "DP1")
	public void testEmployeeData(String empid, String empName, String city) {
		System.err.println(empid + "-" + empName + "-" + city);

	}

	@DataProvider(name = "iterator")
	public Iterator<Object[]> getData() {
		Set<Object[]> set = new HashSet<Object[]>();
		set.add(new String[] { "hello" });
		set.add(new String[] { "world" });
		set.add(new String[] { "IBM" });
		set.add(new String[] { "Oracle" });
		Iterator<Object[]> iterator = set.iterator();
		return iterator;
	}

	@Test(dataProvider = "iterator")
	public void testIteraorData(String iterator) {
		System.err.println("iterator  .. " + iterator);

	}
}
