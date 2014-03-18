package com.example.unittestapp.app.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class RoboTest {
    @Test
    public void testTrueIsTrue() throws Exception {
        assertEquals(true, true);
    }
}