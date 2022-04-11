package org.ram.examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "org.ram.examples.*")
public class PowermockStaticMethodTest {
    @Test
    public void testShowMessageStaticMethod(){
        String message="Hello world";
        PowerMockito.mockStatic(ClassWithStaticMethod.class);
        PowerMockito.when(ClassWithStaticMethod.showMessage(message)).thenReturn(message);
        String actualMessage=ClassWithStaticMethod.showMessage(message);
        Assert.assertEquals(message,actualMessage);
    }
}
