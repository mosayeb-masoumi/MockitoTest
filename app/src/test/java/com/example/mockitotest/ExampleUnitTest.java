package com.example.mockitotest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

    @Mock
    MainActivity mainActivity;

    @Before
    public void setUpMockito(){
        MockitoAnnotations.initMocks(this);
        mainActivity = new MainActivity();
    }

    @Test
    public void yearDays(){

        MainActivity mainActivity = Mockito.mock(MainActivity.class);


        when(mainActivity.yearDays(200)).thenReturn(365);

//        int result = mainActivity.yearDays(100);


        assertEquals(mainActivity.yearDays(100),365);

//        assertThat(result,is(365));

//        Assert.assertEquals(365, 365);
//        verify(mainActivity).yearDays(eq(100));
    }

}