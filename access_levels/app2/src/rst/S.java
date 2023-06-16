package rst;
import lara.*;
class S 
{
	public static void main(String[] args) 
	{
		N n1=new N();
		System.out.println("Hello World!");
	}
}

// incase of package statement and import statement then,first you must keep package declaration then only import declaration.
//while importing a package if you mention " .* " it represents import all files from current directory
// it means(.) --> represents current directory
// (*) represents all files.
// import packageName.classfileName; Ex: import lara.N; this type of import is recommended bcoz instead of importing all files it is unnecessary load
// once you import package in the file ,that package or package members are available to the entire java file itself(where import statement is declared).