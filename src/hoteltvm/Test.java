package hoteltvm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.w3c.dom.ranges.Range;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the budget");
		int s=sc.nextInt();
		
	//	Tvmhotel t1=new Tvmhotel("231245","fsds","wefg","fedgfhn");
	//	Tvmhotel t2=new Tvmhotel("354356","gfyf","gjhk","sdsfdgg");
	//	Tvmhotel t3=new Tvmhotel("324325","fdsb","fgsa","rgrsgra");
		//Range<Integer,Integer> test1 = Range.between(1000, 3000);
		//static IntStream range(int startInclusive,   int endExclusive)
		//Range range = new Range(0, 2147483647);
		if(s>=2000)
		{
			System.out.println("crown plaza");
		}
		if(s<2000) {
			System.out.println("hgsd");
			
		}
		else {
			System.out.println("hotel not found");
		}
	//	List<Tvmhotel> th=Arrays.asList(t1,t2,t3);
		//System.out.println(th);
	//	List<String> th1=th.stream().map(t->t.name).collect(Collectors.toList());
	//	System.out.println(th1);
		
	}

}
