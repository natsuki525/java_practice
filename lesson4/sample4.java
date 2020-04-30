import java.io.*;

// 式の値を出力する
class Sample1
{
	public static void main(String[] args)
	{
		System.out.println("1+2は" + (1+2) + "です。");
		System.out.println("3*4は" + (3*4) + "です。");
	}
}

// 変数の値を使う
class Sample2
{
	public static void main(String[] args)
	{
		int num1 = 2;
		int num2 = 3;
		int sum = num1 + num2;

		System.out.println("変数num1の値は" + num1 + "です。");
		System.out.println("変数num2の値は" + num2 + "です。");
		System.out.println("num1+num2の値は" + sum + "です。");

		num1 = num1+1;

		System.out.println("変数num1の値に1を足すと" + num1 + "です。");
	}
}

// 入力された整数の足し算プログラム
class Sample3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を2つ入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		System.out.println("足し算の結果は" + (num1+num2) + "です。");
	}
}

// いろいろな演算子を利用する
class Sample4
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 5;

		System.out.println("num1とnim2にいろいろな演算を行います。");
		System.out.println("num1+num2は" + (num1+num2) + "です。");
		System.out.println("num1-num2は" + (num1-num2) + "です。");
		System.out.println("num1*num2は" + (num1*num2) + "です。");
		System.out.println("num1%num2は" + (num1%num2) + "です。");
	}
}

// 前置・後置インクリメント演算子を使う
class Sample5
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;

		b = ++a;

		System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
	}
}

// 複合的な代入演算子を使う
class Sample6
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を3つ入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();

		int sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);

		System.out.println("3つの数の合計は" + sum + "です。");
	}
}

// かっこをつけない
class Sample7
{
	public static void main(String[] args)
	{
		System.out.println("1+2は" + 1+2 + "です。");
		System.out.println("3*4は" + 3*4 + "です。");
	}
}

// 大きなサイズの型に代入する ＜型変換＞
class Sample8
{
	public static void main(String[] arigs)
	{
		int inum = 160;

		System.out.println("身長は" + inum + "センチです。");

		System.out.println("double型の変数に代入します。");
		double dnum = inum;

		System.out.println("身長は" + dnum + "センチです。");
	}
}

// 小さなサイズの型に代入する　＜キャスト演算子＞ (型名) 式
class Sample9
{
	public static void main(String[] args)
	{
		double dnum = 160.5;

		System.out.println("身長は" + dnum + "センチです。");

		System.out.println("int型の変数に代入します。");
		int inum = (int)dnum;

		System.out.println("身長は" + inum + "センチです。");
	}
}

/* 異なる型の演算をする
	演算子に異なる2つのオペランドを記述した場合には、
	「一方のオペランドを大きなサイズの型に変換してから演算を行う」
	という決まりになっている。 */
class Sample10
{
	public static void main(String[] args)
	{
		int d = 2;
		double pi = 3.14;

		System.out.println("直径が" + d + "センチの円の");
		System.out.println("円周は" + (d*pi) + "センチです。");
		// int型のdがdouble型に変換されて演算が行われる。
	}
}

// 同じ型の演算をする
/* class Sample11
{
	public static void main(String[] arga)
	{
		int num1 = 5;
		int num2 = 4;

		double div = num1 / num2;

		System.out.println("5/4は" + div + "です。");
	}
} */
/* 上記の記述では結果が「5/4は1.0です。」になる。
	期待していた答えは1.25であるが、int型同士の計算のため、答えもint型のままになってしまう。 */

class Sample11
{
	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 4;

		double div = (double)num1 / (double)num2;
		// 少なくともどちらか一方をキャスト演算子を利用してdouble型にする必要がある。

		System.out.println("5/4は" + div + "です。");
	}
}

// lesson4 練習
//2
class Sample12
{
	public static void main(String[] args)
	{
		int ans1 = 0-4;
		double ans2 = 3.14*2;
		double ans3 = (double)5/3;
		int ans4 = 30%7;
		double ans5 = (7+32)/(double)5;

		System.out.println("0-4は" + ans1 + "です。");
		System.out.println("3.14×2は" + ans2 + "です。");
		System.out.println("5÷3は" + ans3 + "です。");
		System.out.println("30÷7のあまりの数は" + ans4 + "です。");
		System.out.println("(7+32)÷5は" + ans5 + "です。");
	}
}

//3
class Sample13
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("正方形の辺の長さを入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int width = Integer.parseInt(str);

		System.out.println("正方形の面積は" + (width*width) + "です。");
	}
}

// 4
class Sample14
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("三角形の高さと底辺を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int height = Integer.parseInt(str1);
		int bottom = Integer.parseInt(str2);

		double ans = (bottom*height)/(double)2;

		System.out.println("三角形の面積は" + ans + "です。");
	}
}

// 5
class Sample15
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("科目1〜5の点数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();

		Integer num1 = Integer.parseInt(str1);
		Integer num2 = Integer.parseInt(str2);
		Integer num3 = Integer.parseInt(str3);
		Integer num4 = Integer.parseInt(str4);
		Integer num5 = Integer.parseInt(str5);

		int sum = num1 + num2 + num3 + num4 + num5;
		double ave = (num1+num2+num3+num4+num5) /(double)5;

		System.out.println("5科目の合計点は" + sum + "点です。");
		System.out.println("5科目の平均点は" + ave + "点です。");
	}
}