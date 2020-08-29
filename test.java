import java.util.Scanner;
import java.util.Random;
import java.util.EnumSet;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;          // ActionListner,ActionEvent

//features of mac or windows
//text and  images
import javax.swing.*;
class apples{
	public static void main(String args[]){

		// double a;
		// a = 5.20;
		// System.out.print("A is ");
		// System.out.println(a);
		// System.out.print("Easy right");

		// get input
		// Scanner a = new Scanner(System.in);
		// System.out.println(a.nextLine());

		//calculator
		// Scanner a = new Scanner(System.in);
		// double fnum, snum, answer;
		// System.out.println("Enter First num");
		// fnum = a.nextDouble();
		// System.out.println("Enter Second num");
		// snum = a.nextDouble();
		// answer = fnum + snum;
		// System.out.println(answer);

		//Math Operators(int)
		// int a, b, c;
		// a = 3;
		// b = 4;
		// c = b / a;
		// System.out.println(c);
		//double
		// double a, b, c;
		// a = 3;
		// b = 4;
		// c = b / a;
		// System.out.println(c);

		//increment operators
		// int a = 3;
		// int b = 4;
		// System.out.println(++a);
		// System.out.println(a++);
		// System.out.println(a);
		// a += 5;
		// System.out.println(a);

		//if statement
		// int a = 5;
		// if (a == 10) {
		// 	System.out.println("Yes");
		// }else{
		// 	System.out.println("No");
		// }

		//logical operators
		// int a, b;
		// a = 4;
		// b = 3;
		// if (a < 10 && b > 10) {                    // ||
		// 	System.out.println("a less");
		// } else {
		// 	System.out.println("a more");
		// }

		//Switch Statement
		// int a;
		// a = 3;
		// switch (a){
		// 	case 1:
		// 		System.out.println("1");
		// 		break;
		// 	case 2:
		// 		System.out.println("2");
		// 		break;
		// 	case 3:
		// 		System.out.println("3");
		// 		break;
		// 	default:
		// 		System.out.println("4");
		// 		break;
		// }

		//While Statement
		// int a;
		// a = 0;
		// while(a < 10){
		// 	System.out.println(a);
		// 	a++;
		// }

		//Multiple classes
		// banana bananaObject = new banana();
		// bananaObject.nmessage();

		//Methods with parameters
		// Scanner a = new Scanner(System.in);
		// System.out.println("Enter Name");
		// String name = a.nextLine(); 
		// banana bananaObject = new banana();
		// bananaObject.nmessage(name);

		//many methods and instanses
		// Scanner input = new Scanner(System.in);
		// banana bananaObject = new banana();
		// System.out.println("Enter name : ");
		// String temp = input.nextLine();
		// bananaObject.setName(temp);
		// bananaObject.saying();

		//Constructors initialize the variables as the instance of the class is defined
		// banana bananaObject = new banana("yoyo");
		// banana bananaObject1 = new banana("toto");
		// bananaObject.saying();
		// bananaObject1.saying();

		//Nested if
		// int  a = 20;
		// if (a < 18){
		// 	System.out.println("Man u are small");
		// }else{
		// 	System.out.println("You are legal");
		// 	if (a == 18){
		// 		System.out.println("You are at the mark");
		// 	}
		// 	else{
		// 		System.out.println("Move on");
		// 	}
		// }

		//else if
		// int  a = 20;
		// if (a < 18){
		// 	System.out.println("Man u are small");
		// }else if(a > 18){
		// 	System.out.println("Man u are legal");
		// }else{
		// 	System.out.println("Move on");
		// }

		//Conditional operators
		// int  a = 20;
		// System.out.println(a > 18 ? "You are legal" : "You are Young");

		//Averaging program
		// Scanner input = new Scanner(System.in);
		// int total = 0;
		// int grade, average, counter = 0;
		// while (counter < 10){
		// 	grade = input.nextInt();
		// 	total += grade;
		// 	counter++;
		// }
		// average = total/10;
		// System.out.println("Average is "+average);

		//For loop
		// for(int x = 1; x <= 10; x++){
		// 	System.out.println(x);
		// }
		// for(int x = 3; x <= 30; x+=3){
		// 	System.out.println(x);
		// }

		//Do while [executes once before checking condition]
		// int x = 15;
		// do{
		// 	System.out.println(x);
		// 	x++;
		// }while(x<10);

		//Math class
		// System.out.println(Math.abs(-26.7));
		// System.out.println(Math.ceil(26.7));
		// System.out.println(Math.floor(26.7));
		// System.out.println(Math.max(26.7, 30.0));
		// System.out.println(Math.min(26.7, 30.0));
		// System.out.println(Math.pow(5, 3));
		// System.out.println(Math.sqrt(9));

		//Random number
		// Random dice = new Random();
		// int number;
		// for(int x = 1; x <= 10; x++){
		// 	number = 1 + dice.nextInt(6);
		// 	System.out.println("dice "+ x + " is :"+number);
		// }

		//Arrays
		// int a[] = new int[10];
		// a[0] = 45;
		// a[1] = 32;
		// a[9] = 34;
		// System.out.println(a[1]);
		//array initializers
		// int a[] = {2,3,4,5,6,7,8};
		// System.out.println(a[2]);

		//Array table
		// System.out.println("Index\tValue");
		// int a[]={1,2,3,4,5};
		// for (int x = 0; x < a.length; x++){
		// 	System.out.println(x + "\t" + a[x]);
		// }

		//Sum elements in an array
		// int a[] = {1,2,3,4,5};
		// int sum = 0;
		// for (int x = 0; x<a.length; x++){
		// 	sum+=a[x];
		// }
		// System.out.println("Sum is " + sum);

		//Array elements as counter //randomly get probability of each die face
		// Random rand = new Random();
		// int freq[] = new int[7];
		// for (int x = 1; x <= 1000; x++){
		// 	++freq[1+rand.nextInt(6)];
		// }
		// System.out.println("Face\tFrequency");
		// for (int face = 1; face< freq.length; face++){
		// 	System.out.println(face+"\t"+freq[face]);
		// }

		//Enhanced for loop
		// int a[] = {1,2,3,4,5};
		// int total = 0;
		// for(int x: a){
		// 	total += x;
		// }
		// System.out.println(total);

		//Arrays in methods
		// int a[] = {1,2,3,4,5};
		// change(a);
		// for(int x: a){
		// 	System.out.println(x);
		// }

		//Multidimensional arrays
		// int a[][] = {{1,2,3,4,5}, {6,7,8,9,10}};
		// int b[][] = {{23, 65, 43}, {5}, {4,3,6}};
		// //Display Multidimensional arrays
		// System.out.println("Array1 :");
		// display(a);
		// System.out.println("Array2 :");
		// display(b);

		//Variavble length arguments
		// System.out.println(average(1,2,3,4,5));

		//Time class
		// banana bananaObject = new banana();
		// System.out.println(bananaObject.toMilitary());
		// System.out.println(bananaObject.toString());
		// bananaObject.setTime(13, 27, 6);
		// System.out.println(bananaObject.toMilitary());
		// System.out.println(bananaObject.toString());

		//Multiple constructors
		// banana bananaObject1 = new banana();
		// banana bananaObject2 = new banana(5);
		// banana bananaObject3 = new banana(5,13);
		// banana bananaObject4 = new banana(5, 13, 43);
		// System.out.printf("%s\n", bananaObject1.toMilitar());
		// System.out.printf("%s\n", bananaObject2.toMilitar());
		// System.out.printf("%s\n", bananaObject3.toMilitar());
		// System.out.printf("%s\n", bananaObject4.toMilitar());

		//toString
		// mango mangoObject = new mango(4, 5, 6);
		// //Composition
		// banana bananaObject = new banana("yoyo", mangoObject);
		// System.out.println(bananaObject);

		//Enumeration
		// for(cherry words: cherry.values()){
		// 	System.out.printf("%s\t%s\t%s\n", words, words.getDesc(), words.getYear());
		// }
		// System.out.println("\nAnd now for range of constants!!\n");
		// for(cherry words: EnumSet.range(cherry.a, cherry.d)){
		// 	System.out.printf("%s\t%s\t%s\n", words, words.getDesc(), words.getYear());
		// }

		//static  [does not change after re-executing the method]
		// banana bananaObject1 = new banana("yoyo", "honey");
		// banana bananaObject2 = new banana("yoyo", "coney");
		// banana bananaObject3 = new banana("yoyo", "voney");
		// // System.out.println(bananaObject1.getFirst());
		// // System.out.println(bananaObject1.getLast());
		// // System.out.println(bananaObject1.getMembers());
		// System.out.println(banana.getMembers());

		//final   [can only assign value once and cannot be mutated]
		// banana bananaObject = new banana(10);
		// for(int x = 0; x<5; x++){
		// 	bananaObject.add();
		// 	System.out.printf("%s", bananaObject);
		// }

		//inheritance [make once and use many times, only public methods can be inherited, if b inherites or extends c and a inherites or extends b then a inherites or extends c (its like a hirarchy)]
		// berry berryObject = new berry();
		// berryObject.eat();

		//GUI
		// String fn = JOptionPane.showInputDialog("Enter first no : ");
		// String sn = JOptionPane.showInputDialog("Enter second no : ");
		// int num1 = Integer.parseInt(fn);   //Integer.parseInt converts String to int
		// int num2 = Integer.parseInt(sn);
		// int sum = num1 + num2;
		// JOptionPane.showMessageDialog(null, "The sum is : " + sum, "The title", JOptionPane.PLAIN_MESSAGE);

		//GUI with Jframe
		// kiwi kiwiObject = new kiwi();
		// kiwiObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// kiwiObject.setSize(250,250);
		// kiwiObject.setVisible(true);

		//Event Handling
		// kiwi kiwiObject = new kiwi();
		// kiwiObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// kiwiObject.setSize(400,400);
		// kiwiObject.setVisible(true);

		//Polymorphism
		// banana a[] = new banana[2];
		// a[0] = new berry();
		// a[1] = new terry();
		// for(int x =0; x<2; x++){
		// 	a[x].eat();
		// }
		//Polymorphi Arguments
		// fruits fruitsObject = new fruits();
		// terry terryObject = new terry();
		// terry berryObject = new berry();
		// fruitsObject.digest(terryObject);
		// fruitsObject.digest(berryObject);

		//Class to hold objects
		// dogList doglistObject = new dogList();
		// dog d = new dog();
		// doglistObject.add(d);

		//Class to holding many objects
		// animalList animalListObject = new animalList();
		// dog dogObject = new dog();
		// fish fishObject = new fish();
		// animalListObject.add(dogObject);
		// animalListObject.add(fishObject);

		//Polymorphism program
		// animal[] thelist = new animal[2];
		// dog dogObject = new dog();
		// fish fishObject = new fish();
		// thelist[0] = dogObject;
		// thelist[1] = fishObject;
		// for(animal x: thelist)
		// 	x.noise();

		//Jbutton
		// gui guiObject = new gui();
		// guiObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// guiObject.setSize(300,200);
		// guiObject.setVisible(true);



		



		
		

		

		

		



	}
	//Arrays in methods
	// public static void change(int x[]){
	// 	for(int a = 0; a < x.length; a++){
	// 		x[a] += 5;
	// 	}
	// }

	//Display Multidimensional arrays
	// public static void display(int x[][]){
	// 	for(int row = 0; row < x.length; row++){
	// 		for(int column = 0; column < x[row].length; column ++){
	// 			System.out.print(x[row][column] +"\t");
	// 		}
	// 		System.out.println();
	// 	}
	// }

	//Variavble length arguments [Not knowing how many variables(...)]
	// public static int average(int...numbers){
	// 	int total = 0;
	// 	for(int x:numbers){
	// 		total+=x;
	// 	}
	// 	return total/numbers.length;
	// }

	// //static
	// cherry cherryObject1 = new cherry("yoyo", "lolo");
	// cherry cherryObject2 = new cherry("momo", "soso");
	// cherry cherryObject3 = new cherry("koko", "dodo");

}

class banana{
	// public void nmessage(){
	// 	System.out.println("New Class");
	// }

	// public void nmessage(String name){
	// 	System.out.println("New class for " + name);
	// }
	
	//many methods and instanses
	//Private is for only this class  
	// private String nname;
	// public banana(String name){
	// 	nname = name;
	// }
	// public void setName(String name){
	// 	nname = name;
	// }
	// public String getName(){
	// 	return nname;
	// }
	// public void saying(){
	// 	System.out.printf("Your nname is %s\n", getName());
	// }

	//Time class [private variables can be accessed in the class they are defined]
	// private int  hour;
	// private int minute;
	// private int second;
	// public void setTime(int h, int m, int s){   //this keyword is used to use the variables in the method
	// 	hour = ((h>=0  && h<24) ? h :0);
	// 	minute = ((m>=0  && m<60) ? m :0);
	// 	second = ((s>=0  && s<60) ? s :0);
	// }
	// public String toMilitary(){
	// 	return String.format("%02d:%02d:%02d", hour, minute, second);
	// }
	// public String toString(){
	// 	return String.format("%d:%02d:%02d %s", ((hour==0 || hour ==12)? 12:hour%12), minute, second, (hour < 12? "am" : "pm"));
	// }

	//Multiple constructors
	// private int  hour;
	// private int minute;
	// private int second;
	// public banana(){
	// 	this(0,0,0);                //this calls the method again with 3 parameters i.e the method with 3 params
	// }
	// public banana(int h){
	// 	this(h,0,0);
	// }
	// public banana(int h, int m){
	// 	this(h,m,0);
	// }
	// public banana(int h, int m, int s){
	// 	setTime(h,m,s);
	// }
	// public void  setTime(int h, int m, int s){
	// 	setHour(h);
	// 	setMinute(m);
	// 	setSecond(s);
	// }
	// public void setHour(int h){
	// 	hour = ((h>=0 && h<24)?h :0);
	// }
	// public void setMinute(int m){
	// 	minute = ((m>=0 && m<60)?m :0);
	// }
	// public void setSecond(int s){
	// 	second = ((s>=0 && s<60)?s :0);
	// }
	// public int getHour(){
	// 	return hour;
	// }
	// public int getMinute(){
	// 	return minute;
	// }
	// public int getSecond(){
	// 	return second;
	// }
	// public String toMilitar(){
	// 	return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	// }

	//Composition
	// private String name;
	// private mango birthday;
	// public banana(String theName, mango theDate){
	// 	name = theName;
	// 	birthday = theDate;
	// }
	// public String toString(){
	// 	return String.format("My name is %s, my birthday is %s", name, birthday);
	// }

	//static
	// private String fname;
	// private String lname;
	// private static int members = 0;
	// public banana(String fn, String ln){
	// 	fname = fn;
	// 	lname = ln;
	// 	members++;
	// }
	// public String getFirst(){
	// 	return fname;
	// }
	// public String getLast(){
	// 	return lname;
	// }
	// public static int getMembers(){
	// 	return members;
	// }

	//final 
	// private int sum;
	// private final int NUMBER;
	// public banana(int x){
	// 	NUMBER = x;
	// }
	// public void add(){
	// 	sum+=NUMBER;
	// }
	// public String toString(){
	// 	return String.format("Sum = %d\n", sum);
	// }
	
	//inheritance  [class having method is superclass and the inheritor is the subclass]
	// public void eat(){ 
	// 	System.out.println("eat method");
	// }                    //[banana is superclass and rest are subclass that inherit or extends superclass]
	//use abstract before class (abstract class) so that lets others use the class but we cannot make a object of that class else the class is concrete class
	//polymorphism
	//abstract method

	
	
	

	








	

}

class mango{  			

	//toString
	// private int month;
	// private int day;
	// private int year;
	// public mango(int m, int d, int y){
	// 	month = m;
	// 	day = d;
	// 	year = y;
	// 	System.out.printf("The constructor %s\n", this); //looks for the %s(string) i.e toString()
	// }
	// public String toString(){
	// 	return String.format("%d/%d/%d", month, day, year);
	// }

}

//polymorphism/Inheritence
class berry extends terry{
	// public void eat(){
	// 	System.out.println("new berry eat method"); //overwrite the eat method in superclass, if the main eat method of superclass does not have the arguments we cannot overwrite the method with new arguments int the subclasses
	// }												//overwrited method should have the same return  as the main eat method in superclass
}													//overloading is calling the class with diff parameters than the main eat method in superclass
class terry extends banana{							//overwrite method uses same arguments and return type as the main eat method in superclass
	// public void eat(){
	// 	System.out.println("new terry eat method");
	// }
}
class fruits{
	// public void digest(terry x){
	// 	x.eat();
	// }
}

class kiwi extends JFrame{

	//GUI with Jframe
	// private JLabel item1;
	// public kiwi(){
	// 	super("The title bar"); //title to window
	// 	setLayout(new FlowLayout());
	// 	item1 = new JLabel("This is a sentence");
	// 	item1.setToolTipText("This is gonna show up on hover");
	// 	add(item1);
	// }
	

	//Event Handling
	// private JTextField item1;
	// private JTextField item2;
	// private JTextField item3;
	// private JPasswordField passwordField;
	// public kiwi(){
	// 	super("The title");
	// 	setLayout(new FlowLayout());
	// 	item1 = new JTextField(10);
	// 	add(item1);
	// 	item2 = new JTextField("Enter text here");
	// 	add(item2);
	// 	item3 = new JTextField("Uneditable", 20);
	// 	item3.setEditable(false);
	// 	add(item3);
	// 	passwordField = new JPasswordField("Mypass");
	// 	add(passwordField);
	// 	thehandler handler = new thehandler();
	// 	item1.addActionListener(handler);
	// 	item2.addActionListener(handler);
	// 	item3.addActionListener(handler);
	// 	passwordField.addActionListener(handler);
	// }
	// private class thehandler implements ActionListener{
	// 	public void actionPerformed(ActionEvent event){
	// 		String string = "";
	// 		if(event.getSource() == item1)
	// 			string = String.format("Field 1: %s", event.getActionCommand());
	// 		else if(event.getSource() == item2)
	// 			string = String.format("Field 2: %s", event.getActionCommand());
	// 		else if(event.getSource() == item3)
	// 			string = String.format("Field 3: %s", event.getActionCommand());
	// 		else if(event.getSource() == passwordField)
	// 			string = String.format("PasswordField is : %s", event.getActionCommand());
	// 		JOptionPane.showMessageDialog(null, string);
	// 	}
	// }
	
}

//Class to hold objects //class to hold many objects
class dog extends animal{
	// public void noise(){
	// 	System.out.println("Ruff Ruff ");
	// }
}
// class dogList{
// 	private dog[] thelist = new dog[5];
// 	private int i = 0;
// 	public void add(dog d){
// 		if(i<thelist.length){
// 			thelist[i] = d;
// 			System.out.println("Dog added to list at index " +i);
// 			i++;
// 		}
// 	}
// }
class fish extends animal{
	// public void noise(){
	// 	System.out.println("Glurp Slurp");
	// }
}
class animal{
	// public void noise(){
	// 	System.out.println("Animals do not make noise ");
	// }
}
class animalList{
	// private animal[] thelist = new animal[5];
	// private int i = 0;
	// public void add(animal a){
	// 	if(i<thelist.length){
 	// 		thelist[i] = a;
 	// 		System.out.println("Animal added to list at index " +i);
 	// 		i++;
 	// 	}
	// }
}

class gui extends JFrame{
	//Jbutton
// 		private JButton reg;
// 		private JButton custom;
// 		public gui(){
// 			super("The title");
// 			setLayout(new FlowLayout());
// 			reg = new JButton("Reg Button");
// 			add(reg);
// 			Icon b = new ImageIcon(getClass().getResource("b.jpg"));
// 			Icon a = new ImageIcon(getClass().getResource("a.jpg"));
// 			custom = new JButton("Custom", b);
// 			custom.setRolloverIcon(a);
// 			add(custom);
// 			handler handlerobject = new handler();
// 			reg.addActionListener(handlerobject);
// 		}
// }
// class handler implements ActionListener{
// 	public void actionPerformed(ActionEvent event){
// 		JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
// 	}

//Checkbox
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	public gui(){
		super("The title");
		setLayout(new FlowLayout());
		tf = new JTextField("This is a sentence", 20);
		tf.setFont(new Font("Serif", Font.PLAIN, 14));
		add(tf);
		boldbox = new JCheckBox("Bold");
		italicbox = new JCheckBox("Italic");
		add(boldbox);
		add(italicbox);

		handler handlerObject = new handler();
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
	}
	private handler implements ItemListener(){

	}

}









 