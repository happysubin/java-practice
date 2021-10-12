
/*

import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class javaClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int beDividedNumber=1;
		int dividingNumber=0;
		int check=0;
		
		while(true) {
			
			try {
				if(beDividedNumber!=check) {
				System.out.println("나뉨수를 입력하시오.");
				 beDividedNumber=sc.nextInt();
				}
			}
			
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next();
				continue;
			}
			
			try {
				System.out.println("나눔수를 입력하시오.");
				dividingNumber=sc.nextInt(); 
			}
			
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				check=beDividedNumber;
				sc.next();
				continue;
			}
			
			try {
				int result=beDividedNumber/dividingNumber;
				System.out.println(beDividedNumber+"을 "+dividingNumber+"로 나누면 "+result+"입니다.");
				check=0;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				continue;
			}
			finally {
				
			}
		}
		
	}
}
*/
//문제점 분자로 0이 들어오면 안된다.


/*
import java.util.Scanner;

class Book{
	String title,author,year;
	
	public Book(String title, String author) {
		this(title,author,"발간년도미상");
	}
	public Book(String title, String author,String year) {
		this.title=title;
		this.author=author;
		this.year=year;
	}
}
	

public class javaClass{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book[] book=new Book[2];
		for(int i=0;i<book.length;i++) {
			System.out.println("제목>>");
			String title=sc.nextLine();
			
			System.out.println("저자>>");
			String author=sc.nextLine();
			
			System.out.println("발간년도>>");
			String year=sc.nextLine();
			
			if(year=="") {
				book[i]=new Book(title,author);
			}
			else {
				book[i]=new Book(title,author,year);
			}
			
		}
		for(int i=0;i<book.length;i++) {
			System.out.print("(" + book[i].title + ", " + book[i].author+ ", " + book[i].year + ")");
		}
		sc.close();
		
	}
}

*/


class Disk{
	public int width=5;
	public Disk() {};
}

class Disk1 extends Disk{
	protected int height=6;
	public int width=10;
	public Disk1() {}
	public int area(Disk2 d) {
		return super.width*height;
	}
	

}

class Disk2 extends Disk1{
	private int depth=7; 
	public int width=15;
	public Disk2(int depth) {
		this.depth=depth;
	}
	public int getdepth() {
		return depth;
	}
	public void setdepth(int depth) {
		this.depth=depth;
	}
	public int vol() {
		return area(this)*depth;
	}
}

public class javaClass{
	public static void main(String[] args) {
		Disk2 d =new Disk2(8);
		System.out.println("d width ="+d.width);
		System.out.println("d height ="+d.height + ", area ="+d.area(d));
		d.setdepth(9);
		System.out.println("d deth = "+d.getdepth()+", vol = "+d.vol());
	}
}
