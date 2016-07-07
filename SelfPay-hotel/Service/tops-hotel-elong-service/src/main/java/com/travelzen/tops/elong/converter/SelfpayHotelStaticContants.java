package com.travelzen.tops.elong.converter;

import java.util.HashMap;
import java.util.Map;

public class SelfpayHotelStaticContants {

	private static Map<String,String> ELONG_CITY_MAP_PAIR = new HashMap<String,String>();
	
	private static Map<String,String[]> STATIC_FACILITIES = null;
	
	static {
		String[] fullFacilities = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13","14"};
		String[] facilitiesType = {"免费wifi", "收费wifi", "免费宽带", "收费宽带", "免费停车场", "收费停车场", "免费接机服务","收费接机服务", "室内游泳池", "室外游泳池", "健身房", "商务中心", "会议室", "酒店餐厅" };
		String[] facilitiesIcon = {"free-wifi", "wifi", "free-broadband", "broadband", "free-park", "park", null, null,"indoorswim", "outdoorswim", "gym", null, null, null };
		STATIC_FACILITIES = new HashMap<>();
		for(int i = 0;i < fullFacilities.length;i++){
			STATIC_FACILITIES.put(fullFacilities[i], new String[]{facilitiesType[i],facilitiesIcon[i]});
		}
	}

	static {
		  ELONG_CITY_MAP_PAIR.put("CN010","0101");    ELONG_CITY_MAP_PAIR.put("CN027","1801");
		  ELONG_CITY_MAP_PAIR.put("CN021","0201");    ELONG_CITY_MAP_PAIR.put("CN028","2301");
		  ELONG_CITY_MAP_PAIR.put("CN020","2001");    ELONG_CITY_MAP_PAIR.put("CN023","0401");
		  ELONG_CITY_MAP_PAIR.put("CN0755","2003");    ELONG_CITY_MAP_PAIR.put("CN029","2701");
		  ELONG_CITY_MAP_PAIR.put("CN0571","1201");    ELONG_CITY_MAP_PAIR.put("CN0871","2501");
		  ELONG_CITY_MAP_PAIR.put("CN0512SZ", "1102");    ELONG_CITY_MAP_PAIR.put("CN0532", "1601");
		  ELONG_CITY_MAP_PAIR.put("CN0574", "1202");    ELONG_CITY_MAP_PAIR.put("CN0411", "0801");
		  ELONG_CITY_MAP_PAIR.put("CN025", "1101");    ELONG_CITY_MAP_PAIR.put("CN024", "0802");
		  ELONG_CITY_MAP_PAIR.put("CN0898SY", "2201");    ELONG_CITY_MAP_PAIR.put("CN022", "0301");
		  ELONG_CITY_MAP_PAIR.put("CN0592", "1401");    ELONG_CITY_MAP_PAIR.put("CN0311", "0501");
		  ELONG_CITY_MAP_PAIR.put("CN0556","1303");    ELONG_CITY_MAP_PAIR.put("CN0472"," 0702");      ELONG_CITY_MAP_PAIR.put("CN0779"," 2103");
		  ELONG_CITY_MAP_PAIR.put("CN0875BS","2510");    ELONG_CITY_MAP_PAIR.put("CN0776","2112");      ELONG_CITY_MAP_PAIR.put("CN0731","1901");
		  ELONG_CITY_MAP_PAIR.put("CN0431","0901");    ELONG_CITY_MAP_PAIR.put("CN0519CZ","1103");      ELONG_CITY_MAP_PAIR.put("CN0476","0707");
		  ELONG_CITY_MAP_PAIR.put("CN0736","1910");    ELONG_CITY_MAP_PAIR.put("CN0872","2505");      ELONG_CITY_MAP_PAIR.put("CN0352","0602");
		  ELONG_CITY_MAP_PAIR.put("CN0415","0806");    ELONG_CITY_MAP_PAIR.put("CN0937","2803");      ELONG_CITY_MAP_PAIR.put("CN0459","1004");
		  ELONG_CITY_MAP_PAIR.put("CN0546", "1607");    ELONG_CITY_MAP_PAIR.put("CN0769","2007");      ELONG_CITY_MAP_PAIR.put("CN0773"," 2101");
		  ELONG_CITY_MAP_PAIR.put("CN0718","1811");    ELONG_CITY_MAP_PAIR.put("CN0591","1402");      ELONG_CITY_MAP_PAIR.put("CN0757","2005");
		  ELONG_CITY_MAP_PAIR.put("CN0851", "2401");    ELONG_CITY_MAP_PAIR.put("CN0797","1516");      ELONG_CITY_MAP_PAIR.put("CN0839","2320");
		  ELONG_CITY_MAP_PAIR.put("CN0451","1001");    ELONG_CITY_MAP_PAIR.put("CN0898","2202");      ELONG_CITY_MAP_PAIR.put("CN0471","0701");
		  ELONG_CITY_MAP_PAIR.put("CN0551","1301");    ELONG_CITY_MAP_PAIR.put("CN0416","0810");      ELONG_CITY_MAP_PAIR.put("CN00852","3201");
		  ELONG_CITY_MAP_PAIR.put("CN0559","1302");    ELONG_CITY_MAP_PAIR.put("CN0456","1014");      ELONG_CITY_MAP_PAIR.put("CN0745","1921");
		  ELONG_CITY_MAP_PAIR.put("CN0531","1602");   ELONG_CITY_MAP_PAIR.put("CN0595JJ","1413");  ELONG_CITY_MAP_PAIR.put("CN0837","2311");
		  ELONG_CITY_MAP_PAIR.put("CN0798","1507");   ELONG_CITY_MAP_PAIR.put("CN0537","1619");  ELONG_CITY_MAP_PAIR.put("CN0454","1012");
		  ELONG_CITY_MAP_PAIR.put("CN0416","0810");   ELONG_CITY_MAP_PAIR.put("CN0937JYG","2802");  ELONG_CITY_MAP_PAIR.put("CN0792","1502");
		  ELONG_CITY_MAP_PAIR.put("CN0999","3111");   ELONG_CITY_MAP_PAIR.put("CN0990","3102");  ELONG_CITY_MAP_PAIR.put("CN0888","2503");
		  ELONG_CITY_MAP_PAIR.put("CN0931","2801");   ELONG_CITY_MAP_PAIR.put("CN0891","2601");  ELONG_CITY_MAP_PAIR.put("CN0539","1611");
		  ELONG_CITY_MAP_PAIR.put("CN0518","1110");   ELONG_CITY_MAP_PAIR.put("CN0772","2105");  ELONG_CITY_MAP_PAIR.put("CN0379","1702");
		  ELONG_CITY_MAP_PAIR.put("CN0830","2314");   ELONG_CITY_MAP_PAIR.put("CN0894","2603");  ELONG_CITY_MAP_PAIR.put("CN0597","1409");
		  ELONG_CITY_MAP_PAIR.put("CN00853","3301");   ELONG_CITY_MAP_PAIR.put("CN0453","1002");  ELONG_CITY_MAP_PAIR.put("CN0771","2102");
		  ELONG_CITY_MAP_PAIR.put("CN0791","1501");   ELONG_CITY_MAP_PAIR.put("CN0513NT","1107");  ELONG_CITY_MAP_PAIR.put("CN0377","1707");
		  ELONG_CITY_MAP_PAIR.put("CN0817","2309");   ELONG_CITY_MAP_PAIR.put("CN0812","2321");  ELONG_CITY_MAP_PAIR.put("CN0452","1005");
		  ELONG_CITY_MAP_PAIR.put("CN0570","1235");   ELONG_CITY_MAP_PAIR.put("CN0335","0503");  ELONG_CITY_MAP_PAIR.put("CN0754","2002");
		  ELONG_CITY_MAP_PAIR.put("CN022","0301");   ELONG_CITY_MAP_PAIR.put("CN0538","1614");  ELONG_CITY_MAP_PAIR.put("CN0351","0601");
		  ELONG_CITY_MAP_PAIR.put("CN0475","0706");   ELONG_CITY_MAP_PAIR.put("CN0875","2512");  ELONG_CITY_MAP_PAIR.put("CN0938","2805");
		  ELONG_CITY_MAP_PAIR.put("CN027","1801");   ELONG_CITY_MAP_PAIR.put("CN0577","1203");  ELONG_CITY_MAP_PAIR.put("CN0510WX","1105");
		  ELONG_CITY_MAP_PAIR.put("CN0631","1605");   ELONG_CITY_MAP_PAIR.put("CN0536","1603");  ELONG_CITY_MAP_PAIR.put("CN0473","0714");
		  ELONG_CITY_MAP_PAIR.put("CN0774","2108");   ELONG_CITY_MAP_PAIR.put("CN0971","3001");  ELONG_CITY_MAP_PAIR.put("CN0516","1106");
		  ELONG_CITY_MAP_PAIR.put("CN0710","1834");   ELONG_CITY_MAP_PAIR.put("CN0535","1604");  ELONG_CITY_MAP_PAIR.put("CN0951","2901");
		  ELONG_CITY_MAP_PAIR.put("CN0579","1207");   ELONG_CITY_MAP_PAIR.put("CN0717","1803");  ELONG_CITY_MAP_PAIR.put("CN0912","2709");
		  ELONG_CITY_MAP_PAIR.put("CN0359","0605");   ELONG_CITY_MAP_PAIR.put("CN0515","1116");  ELONG_CITY_MAP_PAIR.put("CN0831","2308");
		  ELONG_CITY_MAP_PAIR.put("CN0911","2705");   ELONG_CITY_MAP_PAIR.put("CN0371","1701");  ELONG_CITY_MAP_PAIR.put("CN0756","2004");
		  ELONG_CITY_MAP_PAIR.put("CN0744","1903");   ELONG_CITY_MAP_PAIR.put("CN0759","2014");  ELONG_CITY_MAP_PAIR.put("CN0533","1606");
		  ELONG_CITY_MAP_PAIR.put("CN0917","2702");    ELONG_CITY_MAP_PAIR.put("CN0520","1117");   ELONG_CITY_MAP_PAIR.put("CN0574CX","1231");
		  ELONG_CITY_MAP_PAIR.put("CN0550","1318");    ELONG_CITY_MAP_PAIR.put("CN0553CH","1308");   ELONG_CITY_MAP_PAIR.put("CN0566CZ","1320");
		  ELONG_CITY_MAP_PAIR.put("CN0314","0502");    ELONG_CITY_MAP_PAIR.put("CN0878","2518");        ELONG_CITY_MAP_PAIR.put("CN0572DQ","1242");
		  ELONG_CITY_MAP_PAIR.put("CN0534","1612");     ELONG_CITY_MAP_PAIR.put("CN0838","2312");      ELONG_CITY_MAP_PAIR.put("CN028DJY","2385");
		  ELONG_CITY_MAP_PAIR.put("CN0833","2310");     ELONG_CITY_MAP_PAIR.put("CN0558","1307");     ELONG_CITY_MAP_PAIR.put("CN0743JS","1915");
		  ELONG_CITY_MAP_PAIR.put("CN0826","2313");     ELONG_CITY_MAP_PAIR.put("CN0517","1123");     ELONG_CITY_MAP_PAIR.put("CN0572","1239");
		  ELONG_CITY_MAP_PAIR.put("CN0554","1306");    ELONG_CITY_MAP_PAIR.put("CN0734","1918");     ELONG_CITY_MAP_PAIR.put("CN0752","2010"); 
		  ELONG_CITY_MAP_PAIR.put("CN0573","1209");    ELONG_CITY_MAP_PAIR.put("CN0579JH","1204");   ELONG_CITY_MAP_PAIR.put("CN0566JHS","1309"); 
		  ELONG_CITY_MAP_PAIR.put("CN0750","2021");    ELONG_CITY_MAP_PAIR.put("CN0432","0902");      ELONG_CITY_MAP_PAIR.put("CN0716","1802");
		  ELONG_CITY_MAP_PAIR.put("CN0796JGS","1511");   ELONG_CITY_MAP_PAIR.put("CN0356","0609");   ELONG_CITY_MAP_PAIR.put("CN0391","1710");
		  ELONG_CITY_MAP_PAIR.put("CN0512KS","1127");    ELONG_CITY_MAP_PAIR.put("CN0371KF","1703");   ELONG_CITY_MAP_PAIR.put("CN0519LY","1122");
		  ELONG_CITY_MAP_PAIR.put("CN0578","1230");      ELONG_CITY_MAP_PAIR.put("CN0576LH","1226");     ELONG_CITY_MAP_PAIR.put("CN0571LN","1213");
		  ELONG_CITY_MAP_PAIR.put("CN0738","1928");     ELONG_CITY_MAP_PAIR.put("CN0316","0511");         ELONG_CITY_MAP_PAIR.put("CN0635","1622");
		  ELONG_CITY_MAP_PAIR.put("CN0555","1311");     ELONG_CITY_MAP_PAIR.put("CN0816","2302");      ELONG_CITY_MAP_PAIR.put("CN0668","2009");
		  ELONG_CITY_MAP_PAIR.put("CN0573PH","1268");    ELONG_CITY_MAP_PAIR.put("CN0594","1406");    ELONG_CITY_MAP_PAIR.put("CN0571QDH","1233");
		  ELONG_CITY_MAP_PAIR.put("CN0595","1403");       ELONG_CITY_MAP_PAIR.put("CN0763","2027");     ELONG_CITY_MAP_PAIR.put("CN0537JN","1610");
		  ELONG_CITY_MAP_PAIR.put("CN0898QH","2206");   ELONG_CITY_MAP_PAIR.put("CN0575","1205");    ELONG_CITY_MAP_PAIR.put("CN0793","1508");
		  ELONG_CITY_MAP_PAIR.put("CN0719","1807");        ELONG_CITY_MAP_PAIR.put("CN0825","2315");    ELONG_CITY_MAP_PAIR.put("CN0595SS","1405");
		  ELONG_CITY_MAP_PAIR.put("CN0523","1115");     ELONG_CITY_MAP_PAIR.put("CN0512TC","1120");    ELONG_CITY_MAP_PAIR.put("CN0576","1224");
		  ELONG_CITY_MAP_PAIR.put("CN0573TX","1263");   ELONG_CITY_MAP_PAIR.put("CN0573TL","1120");   ELONG_CITY_MAP_PAIR.put("CN0315","0506");
		  ELONG_CITY_MAP_PAIR.put("CN8862","3401");      ELONG_CITY_MAP_PAIR.put("CN0512WJ","1114");    ELONG_CITY_MAP_PAIR.put("CN0576WL","1238");
		  ELONG_CITY_MAP_PAIR.put("CN0553","1304");     ELONG_CITY_MAP_PAIR.put("CN0599","1404");          ELONG_CITY_MAP_PAIR.put("CN0793WY","1520");
		  ELONG_CITY_MAP_PAIR.put("CN0991","3101");     ELONG_CITY_MAP_PAIR.put("CN0898WN","2203");    ELONG_CITY_MAP_PAIR.put("CN0574XS","1253");
		  ELONG_CITY_MAP_PAIR.put("CN0731XT","1906");    ELONG_CITY_MAP_PAIR.put("CN0887","2506");       ELONG_CITY_MAP_PAIR.put("CN0691","2507");
		  ELONG_CITY_MAP_PAIR.put("CN029XY","2703");      ELONG_CITY_MAP_PAIR.put("CN0834","2318");      ELONG_CITY_MAP_PAIR.put("CN0514","1104");
		  ELONG_CITY_MAP_PAIR.put("CN0510YX","1109");     ELONG_CITY_MAP_PAIR.put("CN0795","1509");     ELONG_CITY_MAP_PAIR.put("CN0730","1904");
		  ELONG_CITY_MAP_PAIR.put("CN0773YC","2106");    ELONG_CITY_MAP_PAIR.put("CN0775","2104");      ELONG_CITY_MAP_PAIR.put("CN0835","2306");
		  ELONG_CITY_MAP_PAIR.put("CN0701","1517");       ELONG_CITY_MAP_PAIR.put("CN0662","2020");     ELONG_CITY_MAP_PAIR.put("CN0512ZJG","1111");
		  ELONG_CITY_MAP_PAIR.put("CN0510ZZ","1126");     ELONG_CITY_MAP_PAIR.put("CN0511","1108");    ELONG_CITY_MAP_PAIR.put("CN0580","1245");
		  ELONG_CITY_MAP_PAIR.put("CN0575ZJ","1212");      ELONG_CITY_MAP_PAIR.put("CN0596","1408");     ELONG_CITY_MAP_PAIR.put("CN0760","2011");
		  ELONG_CITY_MAP_PAIR.put("CN0758","2013");       ELONG_CITY_MAP_PAIR.put("CN0632","1608");       ELONG_CITY_MAP_PAIR.put("CN0855","2415");
		  ELONG_CITY_MAP_PAIR.put("CN0731ZZ","1902");     ELONG_CITY_MAP_PAIR.put("CN0571TL","1247");
		  
	}
	/**
	 * 获得
	 * @author muyuansun
	 * @date 2014-10-21 下午2:25:45
	 * @return
	 */
	public static Map<String, String[]> getSTATIC_FACILITIES() {
		return STATIC_FACILITIES;
	}

	/**
	 * 转换真旅城市编码到elong城市编码
	 * @author muyuansun
	 * @date 2014-10-14 下午12:10:23
	 * @param travelzenCityCode
	 * @return
	 */
	public static String transferTzCode2Elong(String travelzenCityCode){
		if(ELONG_CITY_MAP_PAIR.get(travelzenCityCode) != null){
			  return ELONG_CITY_MAP_PAIR.get(travelzenCityCode);
		}else{
			  return null;
		}
	}
}