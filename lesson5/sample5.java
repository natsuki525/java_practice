import java.io.*;

// if文を使う
class Sample1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1)
			System.out.println("1が入力されました。");

		System.out.println("処理を終了します。");
	}
}

// 複数の文を処理するif文を使う
class Sample2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("1が入力されました。");
			System.out.println("1が選択されました。");
		}

		System.out.println("処理を終了します。");
	}
}

// if〜else文を使う
class Sample3{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("1が入力されました。");
		}
		else{
			System.out.println("1以外が入力されました。");
		}
	}
}

// if〜else if〜elseを使う
class Sample4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("1が入力されました。");
		}
		else if(res == 2){
			System.out.println("2が入力されました。");
		}
		else{
			System.out.println("1か2を入力してください。");
		}

	}
}

// switch文を使う
class Sample5
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
				System.out.println("1が入力されました。");
				break;
			case 2:
				System.out.println("2が入力されました。");
				break;
			default:
				System.out.println("1か2を入力してください。");
				break;
		}
	}
}

// switch文を文字で場合分けする
class Sample6
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		switch(res){
			case 'a':
				System.out.println("aが入力されました。");
				break;
			case 'b':
				System.out.println("bが入力されました。");
				break;
			default:
				System.out.println("aかbを入力してください。");
				break;
		}
	}
}

// 論理演算子で条件を記述する
class Sample7
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("あなたは男性ですか。");
		System.out.println("YまたはNを入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		if (res == 'Y' || res == 'y'){
			System.out.println("あなたは男性ですね。");
		}
		else if (res =='N' || res == 'n'){
			System.out.println("あなたは女性ですね。");
		}
		else{
			System.out.println("YまたはNを入力してください。");
		}
	}
}

// 条件演算子を使う
/* class Sample8
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("何番目のコースにしますか。");
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		char ans;
		if(res == 1)
			ans = 'A';
		else
			ans = 'B';

		System.out.println(ans + "コースを選択しました。");
	}
} */

class Sample8
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("何番目のコースにしますか。");
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		char ans = (res==1) ? 'A':'B';

		System.out.println(ans + "コースを選択しました。");
	}
}

// lesson5 練習

//2
class Sample9
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res%2 == 0)
			System.out.println(res + "は偶数です。");
		else
			System.out.println(res + "は奇数です。");
	}
}

// 3
class Sample10
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("2つの整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		int res1 = Integer.parseInt(str1);
		int res2 = Integer.parseInt(str2);

		if(res1 == res2){
			System.out.println("2つの数は同じ値です。");
		}
		else if(res1<res2){
			System.out.println(res1 + "より" + res2 + "のほうが大きい値です。");
		}
		else if(res1<res2){
			System.out.println(res2 + "より" + res1 + "のほうが大きい値です。");
		}
	}
}

// 4
class Sample11
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("0から10までの整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if (res >=0 && res <= 10){
			System.out.println("正解です");
		}
		else{
			System.out.println("まちがいです。");
		}
	}
}

// 5
class Sample12
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("成績を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if (res == 1){
			System.out.println("もっとがんばりましょう。");
		}
		else if (res == 2){
			System.out.println("もう少しがんばりましょう。");
		}
		else if (res == 3){
			System.out.println("さらに上をめざしましょう。");
		}
		else if (res == 4){
			System.out.println("たいへんよくできました。");
		}
		else if (res == 5){
			System.out.println("たいへん優秀です。");
		}
	}
}

//5 模範解答
class SampleA12
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("成績を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
				System.out.println("もっとがんばりましょう。");
			break;
			case 2:
				System.out.println("もう少しがんばりましょう。");
			break;
			case 3:
				System.out.println("さらに上をめざしましょう。");
			break;
			case 4:
				System.out.println("たいへんよくできました。");
			break;
			case 5:
				System.out.println("たいへん優秀です。");
			break;
		}
	}
}