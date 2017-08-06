package com.crawl.acfun.http;

import org.apache.http.Header;

import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.common.HttpHeader;

public class WebchatCrawl {

	public static void main(String[] args) throws Exception {
		// https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzA5NzAzMjIxMw==&scene=124&#wechat_redirect
		
		String url = "https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzA5NzAzMjIxMw==&scene=124&#wechat_redirect";
		//HttpClientUtil.get(client, url, headers, context, encoding)
		
		Header[] headers 	= HttpHeader.custom()
				.userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36 MicroMessenger/6.5.2.501 NetType/WIFI WindowsWechat QBCore/3.43.556.400 QQBrowser/9.0.2524.400")
				.accept("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
				.acceptEncoding("gzip, deflate")
				.acceptLanguage("zh-CN,zh;q=0.8,en-us;q=0.6,en;q=0.5;q=0.4")
				.cookie("wap_sid2=CPLEg80DElw3UGRLSGpvUzMwcUR4T3hHdHVJRjBydDNfczJ4SVQ4NTVJUDhnVEtLV05yZ054a0d5dFFBUWdIR2dNTkwzWlpvMzN2dDRhdjhJVHZQckw4S0lhQnRCNUFEQUFBfjCDvI7LBTgNQJVO; Path=/; HttpOnly")
				.cookie("pass_ticket=Fjs4cMNA7/eF/BR+sHuM/4n/aPKbfvuOBA0xEp0nPwplWALAjhZt3SwOp42oOyvX; Path=/; HttpOnly")
				.cookie("wxuin=966845042; Path=/; HttpOnly")
				//.cookie("pass_ticket=Fjs4cMNA7/eF/BR+sHuM/4n/aPKbfvuOBA0xEp0nPwplWALAjhZt3SwOp42oOyvX; Path=/; HttpOnly")
				//.other("customer", "自定义")
				.build();
		
		HttpConfig  config = HttpConfig.custom().headers(headers).url(url);
		String result1 = HttpClientUtil.get(config);
		System.out.println(result1);
	}

}
