import java.io.*;
// 変数に値を代入する
class Sample1
{
	public static void main(String[] args)
	{
		int num;
		num = 3;
		System.out.println("変数numの値は" + num + "です。");
	}
}

// 変数を初期化する
class Sample2
{
	public static void main(String[] args)
	{
		int num = 3;
		System.out.println("変数numの値は" + num + "です。");
	}
}

// 変数の値を変更する
class Sample3
{
	public static void main(String[] args)
	{
		int num = 3;
		System.out.println("変数numの値は" + num + "です。");
		num = 5;
		System.out.println("変数numの値を変更しました。");
		System.out.println("変数numの新しい値は" + num + "です。");
	}
}

// 他の変数の値を代入する
class Sample4
{
	public static void main(String[] args)
	{
		int num1, num2;
		num1 = 3;
		System.out.println("変数num1の値は" + num1 + "です。");
		num2 = num1;
		System.out.println("変数num1の値を変数num2に代入しました。");
		System.out.println("変数num2の値は" + num2 + "です。");
	}
}

// キーボードから入力する
class Sample5
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("文字列を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		// 変数strにキーボードで入力された文字列を代入
		String str = br.readLine();

		System.out.println(str + "が入力されました。");
	}
}

// 数値を入力する
class Sample6
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		// 入力した文字列strを整数に変換して、int型の変数numに読み込む
		int num = Integer.parseInt(str);

		System.out.println(str + "が入力されました。");
	}
}

// 2つ以上の数値を続けて入力する
class Sample7
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

		System.out.println("最初に" + num1 + "が入力されました。");
		System.out.println("次に" + num2 + "が入力されました。");
	}
}

// レッスン3練習
// 3
class Sample8
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("あなたは何歳ですか？");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int num = Integer.parseInt(str);

		System.out.println("あなたは" + str + "歳です。");
	}
}

// 4
class Sample9
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("円周率の値はいくつですか？");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		// 不正解　float num = Float.parseFloat(str);
		double pi = Double.parseDouble(str);

		// 不正解　System.out.println("円周率の値は" + str + "です。");
		System.out.println("円周率の値は" + pi + "です。");
	}
}

// 5
class Sample10
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("身長と体重を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);

		System.out.println("身長は" + num1 + "センチです。");
		System.out.println("体重は" + num2 +"キロです。");
	}
}

