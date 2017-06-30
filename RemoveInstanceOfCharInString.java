
//Hello World
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveInstanceOfCharInString {
	
	/**
		 * This test validates the input String and Input character passed to the method
		 */
		@Test(expectedExceptions=IllegalArgumentException.class)
		public void testInvalidInputs(){
			RemoveInstance removeInstanceTest = new RemoveInstance();
			removeInstanceTest.builtInFusolveInOneLine(null, null);
			removeInstanceTest.iterate(null, null);
		
			removeInstanceTest.builtInFusolveInOneLine("", 'a');
			removeInstanceTest.iterate("", ' ');
		}
		
	/**
		 * This test validates the 1. Iterate through the String, one character at a time condition
		 */
		@Test
		public void testIterativeApproach(){
			RemoveInstance removeOccurences = new RemoveInstance();
			String outputBasic = removeOccurences.iterate("javaprogram", 'a');
			Assert.assertEquals("jvprogrm", outputBasic);
			String outputWithNumber = removeOccurences.iterate("javaprogram123123", '1');
			Assert.assertEquals("javaprogram2323", outputWithNumber);
			String outputWithSpace = removeOccurences.iterate("java program string", ' ');
			Assert.assertEquals("javaprogramstring", outputWithSpace);
			String outputWithSpecialChar = removeOccurences.iterate("java-program-string", '-');
			Assert.assertEquals("javaprogramstring", outputWithSpecialChar);
		}
		
		/**
	+	 * This test validates the 2. Find a method in the String class that can solve this in one line condition
	+	 */
		@Test
		public void testBuiltInFunction(){
			RemoveInstance removeOccurences = new RemoveInstance();
			String outputBasic = removeOccurences.builtInFusolveInOneLine("javaprogram", 'a');
			Assert.assertEquals("jvprogrm", outputBasic);
			String outputWithNumber = removeOccurences.builtInFusolveInOneLine("javaprogram123123", '1');
			Assert.assertEquals("javaprogram2323", outputWithNumber);
			String outputWithSpace = removeOccurences.builtInFusolveInOneLine("java program string", ' ');
			Assert.assertEquals("javaprogramstring", outputWithSpace);
			String outputWithSpecialChar = removeOccurences.builtInFusolveInOneLine("java-program-string", '-');
			Assert.assertEquals("javaprogramstring", outputWithSpecialChar);
		}

}
