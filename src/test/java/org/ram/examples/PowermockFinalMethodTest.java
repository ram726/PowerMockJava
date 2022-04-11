package org.ram.examples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "org.ram.examples.*")
public class PowermockFinalMethodTest {
    @Test
    public void testPrintMessage() throws Exception {
        String message="Hello world";

        ClassWithFinalMethods mockObject= PowerMockito.mock(ClassWithFinalMethods.class);

        PowerMockito.when(mockObject.printMessage(message)).thenReturn(message);

        ClassWithFinalMethods object= new ClassWithFinalMethods();

        String actualMessage=object.printMessage(message);
        Assert.assertEquals(message,actualMessage);

    }
}
