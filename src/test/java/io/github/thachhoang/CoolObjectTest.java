package io.github.thachhoang;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.bluelinelabs.logansquare.LoganSquare;

public class CoolObjectTest {

	@Test
	public void test() throws IOException {
		CoolObject o = new CoolObject();
		o.setCoolId(120L);
		o.setCoolProps(Arrays.asList("one fish", "two fish", "red fish", "blue fish"));

		String s = LoganSquare.serialize(o);
		Assert.assertEquals("{\"id\":120,\"props\":[\"one fish\",\"two fish\",\"red fish\",\"blue fish\"]}", s);
	}

}
