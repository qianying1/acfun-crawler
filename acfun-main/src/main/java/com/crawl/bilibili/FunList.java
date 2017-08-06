package com.crawl.bilibili;

import java.io.File;

import com.crawl.webchat.util.FileUtil;
import com.crawl.webchat.util.HttpUtils;

public class FunList {

	public static void main(String[] args) throws Exception {
		int tid = 33; // 连载动画
		tid = 32; // 完结动画
		tid = 153;  // 国产动画
		tid = 171; // 电子竞技
		//tid = 172; //手机游戏
		//tid = 17; // 单机游戏
		//tid = 65; // 网络游戏
		//tid = 173; // 桌游棋牌
		//tid = 121; // GMV
		//tid = 136;  // 音游
		//tid = 19; // Mugen
		tid =154;  //三次元舞蹈
		tid = 156; // 舞蹈教程
		tid = 20;
		tid = 82;
		tid =71; // 综艺
		tid = 137; // 明星
		tid = 131; // korea
		int maxPage = 26962; // 国产动画
		//maxPage = 9727;
		//maxPage = 72224;
		//maxPage = 27454; // 网络游戏
		//maxPage = 3413; // 桌游棋牌
		//maxPage = 2016; // GMV
		//maxPage = 4510; // 音游
		//maxPage = 1553; // mugen
		maxPage = 3101;
		maxPage = 371;
		maxPage = 4427;
		maxPage = 9830;
		maxPage = 10328;
		maxPage = 20441;
		maxPage = 17698;
		String url = "https://api.bilibili.com/archive_rank/getarchiverankbypartion?tid=%d&pn=%d";
		//long timestamp = System.currentTimeMillis();
		// &_=1501928192983
		String sDir = "htmls/video/tid_" + tid + "/";
		File dir = new File(sDir);
		dir.mkdirs();
		for (int pn = 1; pn <= maxPage; pn++){
			String fullUrl = String.format(url, tid, pn);
			String content = HttpUtils.doGet(fullUrl, null, "utf-8");
			
			String fileName = sDir + pn + ".json";
			FileUtil.filePutContent(fileName, content, "utf-8");
			Thread.sleep(500);
			//break;
		}

	}

}
