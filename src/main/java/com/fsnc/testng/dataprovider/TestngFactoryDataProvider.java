package com.fsnc.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class TestngFactoryDataProvider {
	@Factory(dataProvider = "datasource")
	public Object[] createInstances(int a) {
		System.out.println(a);
		Object[] result = new Object[a];
		for (int i = 0; i < a; i++) {
			result[i] = new TestngFactoryTest(i * 10);
		}
		return result;
	}

	@DataProvider(name = "datasource")
	public Object[][] getDatasource() {
		return new Object[][] { new Object[] { 2 }, new Object[] { 4 } };
	}
}
