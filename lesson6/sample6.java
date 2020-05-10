import java.io.*;
// for文を使う
class Sample1
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++){
			System.out.println("繰り返しています。");
		}

		System.out.println("繰り返しが終わりました。");
	}
}

// 繰り返し回数を出力する
class Sample2
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++){
			System.out.println(i + "番目の繰り返しです。");
		}

		System.out.println("繰り返しが終わりました。");
	}
}

// 入力した数だけ*を出力する
class Sample3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("いくつ*を出力しますか？");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		for(int i=1; i<=num; i++){
			System.out.print("*");
		}
	}
}

// 入力した数までの合計を求める
class Sample4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("いくつまでの合計を求めますか？");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int sum = 0;
		for(int i=1; i<=num; i++){
			sum += i;
		}

		System.out.println("1から" + num + "までの合計は" + sum + "です。");
	}
}

