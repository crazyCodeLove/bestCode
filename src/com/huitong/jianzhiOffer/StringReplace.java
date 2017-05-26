package com.huitong.jianzhiOffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by allen on 2017/5/24.
 */
public class StringReplace {

    /**
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {

        if (str!=null){

            Pattern pattern = Pattern.compile(" ");
            Matcher matcher = pattern.matcher(str);
            if(matcher.find()){
                String result = matcher.replaceAll("%20");
                return result;
            }
        }
        return str.toString();

    }

}
