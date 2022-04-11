package org.ram.examples;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "org.ram.examples.*")
public class PowermockPrivateMethodTest{

    @Test
    public void testPrivateMethod() throws Exception {
        String actualMessage= "this is actual message";
        String expectedMessage="this is expected message";

        ClassWithPrivateMethods mock= PowerMockito.spy(new ClassWithPrivateMethods());
        PowerMockito.doReturn(expectedMessage).when(mock,"privateShowMessage",actualMessage);
        String actual=mock.callPrivateShowMessage(actualMessage);
        Assert.assertEquals(expectedMessage,actual);

    }
}
