/**
 * This version from git 2/28/16
 */
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
public class TryJunit {

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
		list.clear();
		list.add(FIRST_ELEMENT);
		list.add(SECOND_ELEMENT);
		list.add(THIRD_ELEMENT);
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
		assertEquals(3,list.size());
		list.remove(0);
		assertEquals(2,list.size());		
	}

	/**
	 * Test method for {@link java.util.ArrayList#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		assertFalse(list.isEmpty());
		list.clear();
		assertTrue(list.isEmpty());		
	}

	/**
	 * Test method for {@link java.util.ArrayList#add(java.lang.Object)}.
	 */
	@Test
	public void testAdd() {
		list.add(4);
		int result = list.get(list.size()-1);
		assertEquals(result,4);
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