package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.tuscany.sca.Node;
import org.apache.tuscany.sca.TuscanyRuntime;
import org.apache.tuscany.sca.contribution.processor.ContributionReadException;
import org.apache.tuscany.sca.monitor.ValidationException;
import org.apache.tuscany.sca.runtime.ActivationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.oasisopen.sca.NoSuchServiceException;

import com.loadtest.service.MemberInfoService;
import com.loadtest.vo.MemberVo;
//import org.junit.Assert;

public class Sample1TestCases {

	private static Node node;
	List<MemberVo> list = new ArrayList<MemberVo>();
	
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@beforeClass...");
		String location = ContributionLocationHelper.getContributionLocation("RedLineLoadTest.composite");
		System.out.println("location is.."+location);
        node = NodeFactory.newInstance().createNode("RedLineLoadTest.composite", new Contribution("c1", location));
        node.start();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass...");
		node.stop();
	}
	*/

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before...");
		MemberVo vo = new MemberVo();
		vo.setEmail("email21@gmail.com");
		vo.setFname("fname21");
		vo.setLname("lname21");
		vo.setSource("test");
		
		MemberVo vo1 = new MemberVo();
		vo1.setEmail("email22@gmail.com");
		vo1.setFname("fname22");
		vo1.setLname("lname22");
		vo1.setSource("test");
		
		
		list.add(vo);
		list.add(vo1);
		
		
	}

	/*
	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}
*/
	@Test
	public void test() throws NoSuchServiceException, IOException, ContributionReadException, ActivationException, ValidationException {
		System.out.println("@Test");
		/*MemberInfoService service = node.getService(MemberInfoService.class, "MemberInfoService");
		System.out.println("service.getMember..."+service.getMember());
		assertEquals(list,service.insertMember(list));
		System.out.println("@Test");
		fail("Not yet implemented");*/
		  // Run the SCA composite in a Tuscany runtime
        Node node = TuscanyRuntime.runComposite("RedLineLoadTest.composite", "target/test-classes");
        try {
            
            // test that has exposed an HTTP endpoint that works as expected
          URL url = new URL("http://localhost:8085/MemberInfoService?name=gopi");
          Assert.assertEquals("hello gopi", read(url.openStream()));
          
        //  URL url1 = new URL("http://localhost:8085/MemberInfoService/save");
         // System.out.println("form service "+url1.getContent());
          
         // MemberInfoService sevice= node.getService(MemberInfoService.class, "MemberInfoService");
          //System.out.println("service is..."+sevice);
         // Assert.assertEquals(true,sevice.insertMember(list) );
         
            
        } finally {
            // Stop the Tuscany runtime Node
        	System.out.println("from finally");
            node.stop();        
        }
		
	}

	
	private static String read(InputStream is) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(is));
            StringBuffer sb = new StringBuffer();
            String str;
            while ((str = reader.readLine()) != null) {
                sb.append(str);
            }
            System.out.println("sb is..."+sb.toString());
            return sb.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
