package com.example.mockitotest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockitoTest {

    @Mock
    MainActivity mainActivity;

    @Before
    public void setUpMockito() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void yearDays() {
        mainActivity = Mockito.mock(MainActivity.class);

        int input = 100;
        int expected = 365;

        when(mainActivity.yearDays(input)).thenReturn(365);
        assertEquals(expected, mainActivity.yearDays(input));

    }


    @Test
    public void testSpyMethod() {
        List spyList = Mockito.spy(new ArrayList());
        spyList.add("hello world");
        verify(spyList).add("hello world");
        assertEquals(1, spyList.size());
    }

    @Test
    public void fulName() {
        mainActivity = Mockito.mock(MainActivity.class);

//        MainActivity mainActivity = new MainActivity();

        String input = "hassan";
        String output = "hassan  masoumi";

        String expected ="hassan  masoumi";

       String a = mainActivity.fullName("hassan");

        when(mainActivity.fullName(input)).thenReturn(output);
        assertEquals(expected, mainActivity.fullName(input));

//        when(mainActivity.fullName(input)).thenReturn(output);
//        assertEquals(expcted, mainActivity.fullName(input));
//
//        // not important
//        verify(mainActivity).fullName(input);

    }


}
