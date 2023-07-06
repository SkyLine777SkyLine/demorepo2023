package lesson16;

public class Yahoo {

	
//1. yahoo finance link	//div[@id='header-wrapper']//a[@href='https://www.yahoo.com/']	
	//a[@id='header-logo']
	
//2.home button //div[@id='header-wrapper']//a[@href='https://www.yahoo.com/']	
	//    //ul[@id='eyebrow']/li[1]/a
	
//3.sports //div[@id='header-wrapper']//a[@href='https://sports.yahoo.com/']
	//a[text()='Sports']
	
//4.crypto //div[@id='Nav-0-DesktopNav-0-DesktopNav']//a[starts-with(@class, 'nr-applet-nav-item Td(n) ')and @href='/crypto/']
	//a[@title='Crypto']
	//for Personal Finance link //a[@title='Crypto']//parent::li//preceding-sibling::li[1]/a
//5.search button //button[@id='header-desktop-search-button']
	
//6.sign in button //a[@id='header-signin-link']
	//span[text()='Sign in']//parent::a
	
//7.bell notification  //li[@id='header-notification-menu']/button
	//button[@id='header-notification-button']
	
//8.Quote lookup  //input[@type='text' and @aria-autocomplete='list']
	
//9. search //button[starts-with(@class, 'End(1px) H(32px) Lh(n) Va(m) Pos(a) Fl(end)')]
	//input[@placeholder='Quote Lookup']//following-sibling::button[2]
//10.dow 30 //a[@href ='/quote/%5EDJI?p=%5EDJI' and @title ='Dow 30']
	//li[@id ='marketsummary-itm-1']//a[1]
}
