public class Subclass extends Superclass {
    public int foo(){
	return 42;
    }
    public int foo2(){
	return foo()+42;
    }
    public int foo3(){
	return super.foo()+42;
    }
}
