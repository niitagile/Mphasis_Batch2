package pkg8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class DynamicTesting {
	/* Dynamic testing means test case generate at runtime
		@TestFactory-- using for DynamicTest. it always return stream, collection, iterator, Junitexception
		it should  be used with static or privae methods
		@BeforeEach,@AfterEach will not call with DynamicTest*/
	
	Collection<DynamicTest> dynamicTestWithCollection(){
		 
		return Arrays.asList(
		 DynamicTest.dynamicTest("Add Test", ()-> assertEquals(2, Math.addExact(988878345, 678899979))),
		 DynamicTest.dynamicTest("Multiply Test", ()->assertEquals(6,Math.multiplyExact(2, 3)))
		 );
	 }
	
	
	
}



/*

@TestFactory
Collection<DynamicTest> dynamicTestWithCollection(){
	return Arrays.asList(
	DynamicTest.dynamicTest("Add Test", ()->assertEquals(2,Math.addExact(988878345, 678899979))),
	DynamicTest.dynamicTest("Multiply Test", ()->assertEquals(6,Math.multiplyExact(2, 3)))
	);
}*/