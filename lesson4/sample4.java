import java.io.*;

class Sample1
{
	public static void main(String[] args)
	{
		System.out.println("1+2は" + (1+2) + "です。");
		System.out.println("3*4は" + (3*4) + "です。");
	}
}

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