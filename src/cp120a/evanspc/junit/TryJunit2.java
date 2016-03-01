// this version copied down quickly in class

package cp120a.evanspc.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author philevans
 *
 */
public class TryJunit2 {
	private static final int FIRST_ELEMENT = 24;
	private static final int SECOND_ELEMENT = 12;
	private static final int THIRD_ELEMENT = 3;
	private static ArrayList<Integer> list;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		list = new ArrayList<>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list.clear(); // empty list first
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link java.util.ArrayList#size()}.
	 */
	@Test
	public void testSize() {
		//ArrayList<Integer> list = new ArrayList<>();
		assertEquals(0, list.size());
		list.add(FIRST_ELEMENT);
		assertEquals(0,list.size());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.util.ArrayList#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		//ArrayList<Integer> list = new ArrayList<>();
		assertTrue(list.isEmpty());
		assertEquals(true, list.isEmpty());
		list.add(24);
		assertFalse(list.isEmpty());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.util.ArrayList#add(java.lang.Object)}.
	 */
	@Test
	public void testAddE() {
		//fail("Not yet implemented");
		list.add(4);
		int result = list.get(list.size()-1);
		assertEquals(result, 4);
	}

	/**
	 * Test method for {@link java.util.ArrayList#get(int)}.
	 */
	@Test
	public void testGet() {
		int result = list.get(0);
		assertEquals(FIRST_ELEMENT,result);
		assertEquals(SECOND_ELEMENT,(int)list.get(1));
	}

}
