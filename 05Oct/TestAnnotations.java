package BAsicAnnotationExamples;
import org.testng.annotations.*;

/*
 @BeforeSuite-it will run once, before all test in suits
 @AfterSuite
 @BeforeGroups- this method will run before the first test run of that specific group
 @AfterGroups
 @BeforeClass
 @AfterClass
 @BeforeMethod- this will be executed before every @test annotation
 @AfterMethod
 @BeforeTest- This will be executed before first @Test . It will be executed multiple times before test cases
 @AfterTest 
 
*/
public class TestAnnotations {
	
	public void getInfo() {
		System.out.println("Get Info Method");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1 Executed");
	}
	@Test
	public void Test2() {
		System.out.println("Test2 Executed");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest Executed");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest Executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod Executed");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod Executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass Executed");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass Executed");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite Executed");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite Executed");
	}
}
    
