package com.TestNG;

import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class CrossBrowser extends BaseClass{
 @Test(priority = 10)
	private void firefox() {
		launchBrowser("firefox");
		launchUrl("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=724530209348931997&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	}
 @Test(priority = -10)
	private void edge() {
		launchBrowser("edge");
		launchUrl("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=724530209348931997&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	}
 @Test(priority = 0)
	private void chrome() {
		launchBrowser("chrome");
		launchUrl("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=724530209348931997&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");

	}
}
