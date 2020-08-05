package us.navonod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void canGetCharge() {
        LightSaber lightSaber = new LightSaber(123);
        assertEquals((float) 100.0, lightSaber.getCharge());
    }

    @Test
    public void canSetCharge() {
        LightSaber lightSaber = new LightSaber(123);
        lightSaber.setCharge(50.0f);
        assertEquals(50.0f, lightSaber.getCharge());
    }

    @Test
    public void canGetColor() {
        LightSaber lightSaber = new LightSaber(123);
        assertEquals("green", lightSaber.getColor());
    }

    @Test
    public void canSetColor() {
        LightSaber lightSaber = new LightSaber(123);
        lightSaber.setColor("purple");
        assertEquals("purple", lightSaber.getColor());
    }

    @Test
    public void canGetJediSerialNumber() {
        LightSaber lightSaber = new LightSaber(123);
        assertEquals(123, lightSaber.getJediSerialNumber());
    }

    @Test
    public void usingLightSaberDepletesCharge() {
        LightSaber lightSaber = new LightSaber(123);
        lightSaber.use(60.0f);
        assertEquals(90.0f, lightSaber.getCharge());
    }

    @Test
    public void canGetRemainingMinutes() {
        LightSaber lightSaber = new LightSaber(123);
        lightSaber.use(60.0f);
        assertEquals(540f, lightSaber.getRemainingMinutes());
    }

    @Test
    public void canRecharge() {
        LightSaber lightSaber = new LightSaber(123);
        lightSaber.use(300);
        lightSaber.recharge();
        assertEquals(100f, lightSaber.getCharge());
    }
}
