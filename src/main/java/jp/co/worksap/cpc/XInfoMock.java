package jp.co.worksap.cpc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class XInfoMock {

	//mockup data list fixed
	public static String[][] fixedLine = {
			{"","","","","","",""}
		,	{"製品","VERSION","発売日","サポート終了日","補足","詳細バージョン","補足"}
		,	{"","","","","","",""}
	};

	public static int[][] mergedBlock = {
			{1,2,0,0}
		,	{1,2,1,1}
		,	{1,2,2,2}
		,	{1,2,3,3}
		,	{1,2,4,4}
		,	{1,2,5,5}
		,	{1,2,6,6}
		,	{3,12,0,0}
		,	{4,7,1,1}
		,	{4,7,2,2}
		,	{4,7,3,3}
		,	{10,12,1,1}
		,	{10,12,2,2}
		,	{10,12,3,3}
	};

	public static final int freezeCol = 6;
	public static final int freezeRow = 3;

	public static final int excelRowVal = 7;
	public static final int excelColVal = 3;

	public static String[][] wasFixedBlock = {
			{"WebSphere","6.1","2006/6/30","2013/9/30","2012/9 一年間のサポート延長","6.1.0.33","",""}
		,	{"WebSphere","7.0","2008/10/17","-","","7.0.0.29","CVE-2014-4770/CVE-2014-4816 パッチ適用必須",""}
		,	{"WebSphere","7.0","","","","7.0.0.33","",""}
		,	{"WebSphere","7.0","","","","7.0.0.35","管理コンソールのXSS・CSRF脆弱性解消Ver",""}
		,	{"WebSphere","7.0","","","","7.0.0.39","",""}
		,	{"WebSphere","8.0","2011/7/22","-","","非推奨","脆弱性問題あり、パッチ提供なしのため非推奨	CVE-2014-4770/CVE-2014-4816",""}
		,	{"WebSphere","8.5","2012/7/13","-","8.5.0.3は出荷されず 8.5.5.0へマージ","8.5.0.2","",""}
		,	{"WebSphere","8.5.5","2013/6/14","-","","8.5.5.3","管理コンソールのXSS・CSRF脆弱性解消Ver",""}
		,	{"WebSphere","8.5.5","","","","8.5.5.6","WAS管理コンソール脆弱性 CVE-2015-1920解消Ver",""}
		,	{"WebSphere","8.5.5","","","","8.5.5.7","Logjam(CVE-2015-4947),IHS脆弱性（CVE-2015-4947)解消Ver",""}

		,	{"Oracle","9iR2","2002/7","2007/7","","非推奨","PremierSupport終了",""}
		,	{"Oracle","10gR2","2005/7","2010/7","","非推奨","PremierSupport終了",""}
		,	{"Oracle","11gR2","2009/9","2015/1","","11.2.0.3","PremierSupport終了 （Extended無償~2016/1）",""}
		,	{"Oracle","11gR2","2009/9","2015/1","","11.2.0.4","PremierSupport終了 （Extended無償~2016/1）",""}
		,	{"Oracle","12cR1","2013/6","2018/7","12.1.0.2SE2は2015年9月出荷	12.1.0.1は2016/8/31パッチ終了","12.1.0.1.19","PremierSupport終了",""}
		,	{"Oracle","12cR1","2002/7","2007/7","12.1.0.2SE2は2015年9月出荷	12.1.0.1は2016/8/31パッチ終了","12.1.0.2","SE,SE1の廃止。SE2へ。",""}
	};

	public static Map<Integer, ArrayList<String>> thirdFixedBlock = new HashMap<Integer, ArrayList<String>>() {{
			put(new Integer(1), new ArrayList<>(Arrays.asList("WebSphere","6.1","6.1.0.33")) );
	}};


	public static String[][] cnpyFixedBlock = {
			{"CJK","6.2","2015/10",""}
		,	{"CJK","6.7","2018/10(予定)",""}
		,	{"CJK","7.x","未定",""}
		,	{"CSR","2.3","2015/10",""}
		,	{"CSR","3.x","2018/10(予定)",""}
		,	{"CSR","4.x","未定",""}
		,	{"CWS","4.7","2015/10",""}
		,	{"CWS","5.x","2018/10(予定)",""}
		,	{"CWS","6.x","未定",""}
		,	{"CLM","4.x","2018/10(予定)",""}
	};

	public static String[][] wasSupportData = {
			{"~620458","~620460","非検証","620466","―","620460","620460","620466","620471","未定"}
		,	{"670123","670125","非検証","670131","2016/1PTF予定","670125","670125","670131","670204","未定"}
		,	{"","―","非検証","―","2016/1PTF予定","","","―","710102","未定"}
		,	{"","239910","239918","239921","―","239911","239911","239919","239927","未定"}
		,	{"","330100","350102","360102","2016/1PTF予定","330100","330100","350103","380102","未定"}
		,	{"","―","―","―","2016/1PTF予定","","","―","2015/12PTF予定","未定"}
		,	{"~479914","479916","479924","479927","―","479916","479916","479928","479933","未定"}
		,	{"~540102","550101","570103","580103","2016/1PTF予定","550101","550101","589901","589906","未定"}
		,	{"","―","―","600100","2016/1PTF予定","","","600101","610103","未定"}
		,	{"~403102","400100","非検証","409101","未定","405102","405102","409101","2016/1PTF予定","未定"}
	};

	public static final int cpnyName = 0;
	public static final int cpnyVersion = 1;
	public static final int productName = 2;
	public static final int productVersion = 3;
	public static final int productVersionDetail = 4;
	public static final int supportValue = 5;
	public static final int cellStyle = 6;

	public static String[][] supportData = {
			{"CJK","6.2","WebSphere","6.1","6.1.0.33","~620458","{style}"}
		,	{"CJK","6.2","WebSphere","7.0","7.0.0.29","~620460","{style}"}
		,	{"CJK","6.2","WebSphere","7.0","7.0.0.33","非検証","{style}"}
		,	{"CJK","6.2","WebSphere","7.0","7.0.0.35","620466","{style}"}
		,	{"CJK","6.2","WebSphere","7.0","7.0.0.39","―","{style}"}
		,	{"CJK","6.2","WebSphere","8.0","","620460","{style}"}
		,	{"CJK","6.2","WebSphere","8.5","8.5.0.2","620460","{style}"}
		,	{"CJK","6.2","WebSphere","8.5.5","8.5.5.3","620466","{style}"}
		,	{"CJK","6.2","WebSphere","8.5.5","8.5.5.6","620471","{style}"}
		,	{"CJK","6.2","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CJK","6.7","WebSphere","6.1","6.1.0.33","670123","{style}"}
		,	{"CJK","6.7","WebSphere","7.0","7.0.0.29","~670125","{style}"}
		,	{"CJK","6.7","WebSphere","7.0","7.0.0.33","非検証","{style}"}
		,	{"CJK","6.7","WebSphere","7.0","7.0.0.35","670131","{style}"}
		,	{"CJK","6.7","WebSphere","7.0","7.0.0.39","2016/1PTF予定","{style}"}
		,	{"CJK","6.7","WebSphere","8.0","","670125","{style}"}
		,	{"CJK","6.7","WebSphere","8.5","8.5.0.2","670125","{style}"}
		,	{"CJK","6.7","WebSphere","8.5.5","8.5.5.3","670131","{style}"}
		,	{"CJK","6.7","WebSphere","8.5.5","8.5.5.6","670204","{style}"}
		,	{"CJK","6.7","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CJK","7.x","WebSphere","6.1","6.1.0.33","","{style}"}
		,	{"CJK","7.x","WebSphere","7.0","7.0.0.29","―","{style}"}
		,	{"CJK","7.x","WebSphere","7.0","7.0.0.33","非検証","{style}"}
		,	{"CJK","7.x","WebSphere","7.0","7.0.0.35","―","{style}"}
		,	{"CJK","7.x","WebSphere","7.0","7.0.0.39","2016/1PTF予定","{style}"}
		,	{"CJK","7.x","WebSphere","8.0","","","{style}"}
		,	{"CJK","7.x","WebSphere","8.5","8.5.0.2","","{style}"}
		,	{"CJK","7.x","WebSphere","8.5.5","8.5.5.3","―","{style}"}
		,	{"CJK","7.x","WebSphere","8.5.5","8.5.5.6","710102","{style}"}
		,	{"CJK","7.x","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CSR","2.3","WebSphere","6.1","6.1.0.33","","{style}"}
		,	{"CSR","2.3","WebSphere","7.0","7.0.0.29","~239910","{style}"}
		,	{"CSR","2.3","WebSphere","7.0","7.0.0.33","239918","{style}"}
		,	{"CSR","2.3","WebSphere","7.0","7.0.0.35","239921","{style}"}
		,	{"CSR","2.3","WebSphere","7.0","7.0.0.39","―","{style}"}
		,	{"CSR","2.3","WebSphere","8.0","","239911","{style}"}
		,	{"CSR","2.3","WebSphere","8.5","8.5.0.2","239911","{style}"}
		,	{"CSR","2.3","WebSphere","8.5.5","8.5.5.3","239919","{style}"}
		,	{"CSR","2.3","WebSphere","8.5.5","8.5.5.6","239927","{style}"}
		,	{"CSR","2.3","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CSR","3.x","WebSphere","6.1","6.1.0.33","","{style}"}
		,	{"CSR","3.x","WebSphere","7.0","7.0.0.29","330100","{style}"}
		,	{"CSR","3.x","WebSphere","7.0","7.0.0.33","350102","{style}"}
		,	{"CSR","3.x","WebSphere","7.0","7.0.0.35","360102","{style}"}
		,	{"CSR","3.x","WebSphere","7.0","7.0.0.39","2016/1PTF予定","{style}"}
		,	{"CSR","3.x","WebSphere","8.0","","330100","{style}"}
		,	{"CSR","3.x","WebSphere","8.5","8.5.0.2","330100","{style}"}
		,	{"CSR","3.x","WebSphere","8.5.5","8.5.5.3","350103","{style}"}
		,	{"CSR","3.x","WebSphere","8.5.5","8.5.5.6","380102","{style}"}
		,	{"CSR","3.x","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CSR","4.x","WebSphere","6.1","6.1.0.33","","{style}"}
		,	{"CSR","4.x","WebSphere","7.0","7.0.0.29","―","{style}"}
		,	{"CSR","4.x","WebSphere","7.0","7.0.0.33","―","{style}"}
		,	{"CSR","4.x","WebSphere","7.0","7.0.0.35","―","{style}"}
		,	{"CSR","4.x","WebSphere","7.0","7.0.0.39","2016/1PTF予定","{style}"}
		,	{"CSR","4.x","WebSphere","8.0","","","{style}"}
		,	{"CSR","4.x","WebSphere","8.5","8.5.0.2","","{style}"}
		,	{"CSR","4.x","WebSphere","8.5.5","8.5.5.3","―","{style}"}
		,	{"CSR","4.x","WebSphere","8.5.5","8.5.5.6","2015/12PTF予定","{style}"}
		,	{"CSR","4.x","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CWS","4.7","WebSphere","6.1","6.1.0.33","~479914","{style}"}
		,	{"CWS","4.7","WebSphere","7.0","7.0.0.29","479916","{style}"}
		,	{"CWS","4.7","WebSphere","7.0","7.0.0.33","479924","{style}"}
		,	{"CWS","4.7","WebSphere","7.0","7.0.0.35","479927","{style}"}
		,	{"CWS","4.7","WebSphere","7.0","7.0.0.39","―","{style}"}
		,	{"CWS","4.7","WebSphere","8.0","","479916","{style}"}
		,	{"CWS","4.7","WebSphere","8.5","8.5.0.2","479916","{style}"}
		,	{"CWS","4.7","WebSphere","8.5.5","8.5.5.3","479928","{style}"}
		,	{"CWS","4.7","WebSphere","8.5.5","8.5.5.6","479933","{style}"}
		,	{"CWS","4.7","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CWS","5.x","WebSphere","6.1","6.1.0.33","~540102","{style}"}
		,	{"CWS","5.x","WebSphere","7.0","7.0.0.29","550101","{style}"}
		,	{"CWS","5.x","WebSphere","7.0","7.0.0.33","570103","{style}"}
		,	{"CWS","5.x","WebSphere","7.0","7.0.0.35","580103","{style}"}
		,	{"CWS","5.x","WebSphere","7.0","7.0.0.39","2016/1PTF予定","{style}"}
		,	{"CWS","5.x","WebSphere","8.0","","550101","{style}"}
		,	{"CWS","5.x","WebSphere","8.5","8.5.0.2","550101","{style}"}
		,	{"CWS","5.x","WebSphere","8.5.5","8.5.5.3","589901","{style}"}
		,	{"CWS","5.x","WebSphere","8.5.5","8.5.5.6","589906","{style}"}
		,	{"CWS","5.x","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CWS","6.x","WebSphere","6.1","6.1.0.33","","{style}"}
		,	{"CWS","6.x","WebSphere","7.0","7.0.0.29","―","{style}"}
		,	{"CWS","6.x","WebSphere","7.0","7.0.0.33","―","{style}"}
		,	{"CWS","6.x","WebSphere","7.0","7.0.0.35","600100","{style}"}
		,	{"CWS","6.x","WebSphere","7.0","7.0.0.39","2016/1PTF予定","{style}"}
		,	{"CWS","6.x","WebSphere","8.0","","","{style}"}
		,	{"CWS","6.x","WebSphere","8.5","8.5.0.2","","{style}"}
		,	{"CWS","6.x","WebSphere","8.5.5","8.5.5.3","600101","{style}"}
		,	{"CWS","6.x","WebSphere","8.5.5","8.5.5.6","600103","{style}"}
		,	{"CWS","6.x","WebSphere","8.5.5","8.5.5.7","未定","{style}"}

		,	{"CLM","4.x","WebSphere","6.1","6.1.0.33","~403102","{style}"}
		,	{"CLM","4.x","WebSphere","7.0","7.0.0.29","400100","{style}"}
		,	{"CLM","4.x","WebSphere","7.0","7.0.0.33","非検証","{style}"}
		,	{"CLM","4.x","WebSphere","7.0","7.0.0.35","409101","{style}"}
		,	{"CLM","4.x","WebSphere","7.0","7.0.0.39","未定","{style}"}
		,	{"CLM","4.x","WebSphere","8.0","","405102","{style}"}
		,	{"CLM","4.x","WebSphere","8.5","8.5.0.2","405102","{style}"}
		,	{"CLM","4.x","WebSphere","8.5.5","8.5.5.3","409101","{style}"}
		,	{"CLM","4.x","WebSphere","8.5.5","8.5.5.6","2016/1PTF予定","{style}"}
		,	{"CLM","4.x","WebSphere","8.5.5","8.5.5.7","未定","{style}"}
};


}
