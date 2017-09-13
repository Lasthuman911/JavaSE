package com.wu.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lszhen on 2017/9/13.
 */
public class StringUtilsTest {
    @Test
    public void remove() throws Exception {
       // assertTrue(StringUtils.remove("好是好","好").equals("是"));
       assertTrue(StringUtils.remove("$是$","$").equals("是"));
    }

}