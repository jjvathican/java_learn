class test{
 int a,b;
 test(int i, int j){
 a=i; b=j;
 }
 boolean equals(test o){
 if (o.a==a && o.b==b){
  return true;
 }
 }
}
class test_main{
 public staic void main(String args[])
{
  test ob1= new test("wow","wow");
  test ob2= new test("wow");
  System.out.println("ob1=ob2" +ob1.equals(ob2));
 }
}
