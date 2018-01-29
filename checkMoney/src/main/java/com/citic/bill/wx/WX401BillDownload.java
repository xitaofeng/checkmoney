package com.citic.bill.wx;

import java.io.IOException;

import com.citic.bill.IBillDown;
import com.citic.bill.util.ConfigUtil;
/**
 * 微信401（微信扫码）获取账单类
 * @author jial
 *
 */
public class WX401BillDownload extends WXBillDownload implements IBillDown{
	
	
	public void billDownload(String billDate) throws IOException{
		super.billDownload(ConfigUtil.WX_APP_ID_401, ConfigUtil.WX_MCH_ID_401, ConfigUtil.WX_API_KEY_401,billDate);
	}
	
}
