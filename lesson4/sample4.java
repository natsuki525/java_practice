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



