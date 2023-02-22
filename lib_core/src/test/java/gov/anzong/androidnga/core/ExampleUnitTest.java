package gov.anzong.androidnga.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import gov.anzong.androidnga.core.data.HtmlData;
import gov.anzong.androidnga.core.decode.ForumBasicDecoder;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testQuote() {
        String testString = "[quote]123[quote]456[/quote]789[/quote]";
        ForumBasicDecoder decoder = new ForumBasicDecoder();
        String result = decoder.decode(testString, createHtmlData());
        result = decoder.decode(result, createHtmlData());
        System.out.println(result);
    }

    private HtmlData createHtmlData() {
        return new HtmlData("");
    }

    @Test
    public void testSignPost() {
        String sign = "测试";
        try {
            System.out.println(URLEncoder.encode(sign,"gbk"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}