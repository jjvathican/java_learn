class test{
	String a;
	test(String i){
		 a=i;
 	}
 	boolean equals(test o){
 		if (o.a==a ){
  			return true;
 		}
		else
 			return false;
 	}
}
class test_main{
	public static void main(String args[])
	{
  		test ob1= new test("wow");
  		test ob2= new test("abc");
 		System.out.println("ob1=ob2" +ob1.equals(ob2));
 	}
}















