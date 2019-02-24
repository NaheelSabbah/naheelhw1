package test;

import static org.junit.Assert.*;

import org.junit.Test;

import hw1.P;
import hw1.library;

public class natest {

	@Test
	public void test() {
	library na = new library();
	assertEquals (0 ,na.getNum());
	}
	
	@Test

	public void test2() {

	library c = new library ();

		P p = new P("web",127,1);

		c.add(p);

		assertEquals(1,c.getNum());

	}

	@Test

	public void test3() {

	library n = new library ();

		P p = new P("web",127,1);

		P P= new P("java",100,1);

		n.add(p);

		n.add(P);

		assertEquals(2,n.getNum());

		assertEquals(227,n.getcost());

	}
}
