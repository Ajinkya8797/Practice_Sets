package java_PracticeSet;

public class Increment_Decrement_Pract {

	public static void main(String[] args) {

//		What will be the output of the following programs
//		1
		int i = 1;
		i = i++ + ++i;
		System.out.println(i);

		System.out.println("----------");

//		2
		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		System.out.println("----------");

//		3
		int j = 0;
		j = j++ - --j + ++j - j--;
		System.out.println(j);

		System.out.println("----------");

//		4
		int I = 1, J = 2, K = 3;
		int M = I-- - J-- - K--;
		System.out.println("I=" + I);
		System.out.println("J=" + J);
		System.out.println("K=" + K);
		System.out.println("M=" + M);
		
		System.out.println("----------");	

//		5
		int a1=1, b1=2;    
		System.out.println("a1=" + a1);
		System.out.println("b1=" + b1);
		System.out.println(--b1 - ++a1 + ++b1 - --a1);
	
		System.out.println("----------");	

//		6
		int x=19, y=29, z;
		z = x-- - x++ + --y - ++y + --x - y-- + ++x - y++;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);

		System.out.println("----------");	

//		7
		int A=1;
		A = A++ + ++A * --A - A--;
		System.out.println(A);

		System.out.println("----------");	

//		8
		int m=1010, n=1010;
		System.out.println(m++ / ++n * n-- / --m);

		System.out.println("----------");	

//		9
		int P = 001, Q=010, R=100;
		int T = --P + Q++ - R-- - --R + ++Q - --P + Q-- - --P;
		System.out.println("P="+P);
		System.out.println("Q="+Q);
		System.out.println("R="+R);
		System.out.println("T="+T);
		
		System.out.println("----------");	

//		10
		int K1 = 0, L1 = 0;
		System.out.println(--K1 * K1++ * ++L1 * L1++);
		System.out.println("K1="+K1);
		System.out.println("L1="+L1);

		System.out.println("----------");	

//		11
		int x1 = 3;
		int y1 = ++x1 + x1++;
		System.out.println("x1 = " + x1 + ", y1 = " + y1);

		System.out.println("----------");	
		
//		12
		int g = 2, h = 3;
		int f = g++ + h++ + ++g + ++h;
		System.out.println(f);
		System.out.println("g : "+g);
		System.out.println("h : "+h);

		System.out.println("----------");	
		
//		13
		int x2 = 5;
		int y2 = x2++ + x2++ + ++x2;
		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
		
		System.out.println("----------");	
		
//		14
		int a2 = 5;
		System.out.println(a2++ == ++a2);

		System.out.println("----------");	
		
//		15
		int i1= 10;
		System.out.println(i1++ * 2);
		System.out.println("i1 :"+i1);

		System.out.println("----------");	
		
//		16
		int t = 1;
		if (++t == 2) {
		    System.out.println("Equal");
		} else {
		    System.out.println("Not Equal");
		}

		System.out.println("----------");	
			
//		17
		int ax = 5;
		ax = ax++ + ax++ + ax++;
		System.out.println("ax :"+ax);
		
		System.out.println("----------");	
		
//		18
		int i2 = 0;
		i2 = i2++ - --i2 + ++i2 - i2--;
		System.out.println(i2);

		System.out.println("----------");	
		
//		19
		int x3 = 1;
		x3 = x3++ + ++x3 * x3--;
		System.out.println(x3);

		System.out.println("----------");	
		
//		20
		int a3 = 1;
		int b3 = a3++ + a3++ + ++a3;
		System.out.println("a3 = " + a3 + ", b3 = " + b3);

		System.out.println("----------");	
		
//		21
		int ar = 1;
		int br = ar++ + ++ar * ar++ - --ar;
		System.out.println("ar = " + ar + ", br = " + br);

		System.out.println("----------");	
		
//		22
		int xe = 3;
		xe = xe++ + xe++ + xe-- - --xe + ++xe;
		System.out.println("xe = " + xe);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
