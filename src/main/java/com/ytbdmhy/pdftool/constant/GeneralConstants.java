package com.ytbdmhy.pdftool.constant;

import java.util.HashMap;

public class GeneralConstants {

    /**
     * 雪花算法的 workerID 和 datacenterId,区间为0~31
     */
    public static final int SNOW_FLAKE_WORKER_ID = 16;
    public static final int SNOW_FLAKE_DATA_CENTER_ID = 0;

    /**
     * 民族字典
     */
    public static HashMap<String, Integer> NATION_MAP;

    /**
     * 民族字典翻转
     */
    public static HashMap<Integer, String> NATION_MAP_REVERSE;

    /**
     * 银行字典
     */
    public static HashMap<String, Integer> BANK_MAP;

    /**
     * 银行字典翻转
     */
    public static HashMap<Integer, String> BANK_MAP_REVERSE;

    /**
     * 档次字典
     */
    public static HashMap<Integer, String> GRADE_MAP;

    static {
        NATION_MAP = new HashMap<>();
        NATION_MAP.put("汉族", 1);
        NATION_MAP.put("蒙古族", 2);
        NATION_MAP.put("回族", 3);
        NATION_MAP.put("藏族", 4);
        NATION_MAP.put("维吾尔族", 5);
        NATION_MAP.put("苗族", 6);
        NATION_MAP.put("彝族", 7);
        NATION_MAP.put("壮族", 8);
        NATION_MAP.put("布依族", 9);
        NATION_MAP.put("朝鲜族", 10);
        NATION_MAP.put("满族", 11);
        NATION_MAP.put("侗族", 12);
        NATION_MAP.put("瑶族", 13);
        NATION_MAP.put("白族", 14);
        NATION_MAP.put("土家族", 15);
        NATION_MAP.put("哈尼族", 16);
        NATION_MAP.put("哈萨克族", 17);
        NATION_MAP.put("傣族", 18);
        NATION_MAP.put("黎族", 19);
        NATION_MAP.put("傈傈族", 20);
        NATION_MAP.put("佤族", 21);
        NATION_MAP.put("畲族", 22);
        NATION_MAP.put("高山族", 23);
        NATION_MAP.put("拉祜族", 24);
        NATION_MAP.put("水族", 25);
        NATION_MAP.put("东乡族", 26);
        NATION_MAP.put("纳西族", 27);
        NATION_MAP.put("景颇族", 28);
        NATION_MAP.put("柯尔克孜族", 29);
        NATION_MAP.put("土族", 30);
        NATION_MAP.put("达翰尔族", 31);
        NATION_MAP.put("仫佬族", 32);
        NATION_MAP.put("羌族", 33);
        NATION_MAP.put("布朗族", 34);
        NATION_MAP.put("撒拉族", 35);
        NATION_MAP.put("毛南族", 36);
        NATION_MAP.put("仡佬族", 37);
        NATION_MAP.put("锡伯族", 38);
        NATION_MAP.put("阿昌族", 39);
        NATION_MAP.put("普米族", 40);
        NATION_MAP.put("塔吉克族", 41);
        NATION_MAP.put("怒族", 42);
        NATION_MAP.put("乌孜别克族", 43);
        NATION_MAP.put("俄罗斯族", 44);
        NATION_MAP.put("鄂温克族", 45);
        NATION_MAP.put("德昂族", 46);
        NATION_MAP.put("保安族", 47);
        NATION_MAP.put("裕固族", 48);
        NATION_MAP.put("京族", 49);
        NATION_MAP.put("塔塔尔族", 50);
        NATION_MAP.put("独龙族", 51);
        NATION_MAP.put("鄂伦春族", 52);
        NATION_MAP.put("赫哲族", 53);
        NATION_MAP.put("门巴族", 54);
        NATION_MAP.put("珞巴族", 55);
        NATION_MAP.put("基诺族", 56);

        BANK_MAP = new HashMap<>();
        BANK_MAP.put("中国工商银行", 102);
        BANK_MAP.put("中国农业银行", 103);
        BANK_MAP.put("中国银行", 104);
        BANK_MAP.put("中国建设银行", 105);
        BANK_MAP.put("交通银行", 301);
        BANK_MAP.put("中信银行", 302);
        BANK_MAP.put("中国光大银行", 303);
        BANK_MAP.put("华夏银行", 304);
        BANK_MAP.put("中国民生银行", 305);
        BANK_MAP.put("广发银行", 306);
        BANK_MAP.put("平安银行", 307);
        BANK_MAP.put("招商银行", 308);
        BANK_MAP.put("兴业银行", 309);
        BANK_MAP.put("上海浦东发展银行", 310);
        BANK_MAP.put("城市商业银行", 313);
        BANK_MAP.put("农村商业银行", 314);
        BANK_MAP.put("恒丰银行", 315);
        BANK_MAP.put("浙商银行", 316);
        BANK_MAP.put("农村合作银行", 317);
        BANK_MAP.put("渤海银行", 318);
        BANK_MAP.put("徽商银行", 319);
        BANK_MAP.put("村镇银行", 320);
        BANK_MAP.put("重庆三峡银行", 321);
        BANK_MAP.put("上海农村商业银行", 322);
        BANK_MAP.put("城市信用社", 401);
        BANK_MAP.put("农村信用联社", 402);
        BANK_MAP.put("中国邮政储蓄银行", 403);
        BANK_MAP.put("成都银行", 804);
        BANK_MAP.put("成都农商银行", 805);
        BANK_MAP.put("攀枝花农商行", 806);
        BANK_MAP.put("泸州市商行", 807);
        BANK_MAP.put("德阳银行", 808);
        BANK_MAP.put("绵阳市商业银行", 809);
        BANK_MAP.put("遂宁市商业银行", 810);
        BANK_MAP.put("乐山市商业银行", 811);
        BANK_MAP.put("宜宾市商业银行", 812);
        BANK_MAP.put("达州市商业银行", 813);
        BANK_MAP.put("雅安市商业银行", 814);
        BANK_MAP.put("凉山市商业银行", 815);
        BANK_MAP.put("南充市商业银行", 816);
        BANK_MAP.put("攀枝花商业银行", 817);
        BANK_MAP.put("广元贵商村镇银行", 818);
        BANK_MAP.put("自贡商业银行", 819);
        BANK_MAP.put("四川仪陇惠民村镇银行", 944);

        GRADE_MAP = new HashMap<>();
        GRADE_MAP.put(0, "0");
        GRADE_MAP.put(100, "100");
        GRADE_MAP.put(200, "200");
        GRADE_MAP.put(300, "300");
        GRADE_MAP.put(400, "400");
        GRADE_MAP.put(500, "500");
        GRADE_MAP.put(600, "600");
        GRADE_MAP.put(700, "700");
        GRADE_MAP.put(800, "800");
        GRADE_MAP.put(900, "900");
        GRADE_MAP.put(1000, "1000");
        GRADE_MAP.put(1300, "1300");
        GRADE_MAP.put(1400, "1400");
        GRADE_MAP.put(1500, "1500");
        GRADE_MAP.put(1800, "1800");
        GRADE_MAP.put(1900, "1900");
        GRADE_MAP.put(2000, "2000");
        GRADE_MAP.put(3000, "2000");

//        NATION_MAP_REVERSE = new HashMap<>();
//        for (String nation : NATION_MAP.keySet()) {
//            NATION_MAP_REVERSE.put(NATION_MAP.get(nation), nation);
//        }
//        NATION_MAP_REVERSE.put(99, "其他");
//
//        BANK_MAP_REVERSE = new HashMap<>();
//        for (String bank : BANK_MAP.keySet()) {
//            BANK_MAP_REVERSE.put(BANK_MAP.get(bank), bank);
//        }
    }
}
