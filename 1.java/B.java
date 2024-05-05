public class B 
{ 
    public static void main(String args[]) {
		String str = "Java Programming";   
        int index = str.indexOf('o');
		
		if(index == -1) {
			System.out.println("Character '" + str + "' not found in the string");
		}
		else {
			System.out.println("Character '" + str + "' found at position: " + index);
		} 
    }     

}
