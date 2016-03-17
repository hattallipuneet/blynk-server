package cc.blynk.server.core.model.widgets.notifications;

import cc.blynk.server.core.model.enums.PinType;
import cc.blynk.server.core.model.widgets.Widget;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 21.03.15.
 */
public class SMS extends Widget {

    public String to;

    @Override
    public void updateIfSame(byte pin, PinType type, String[] values) {

    }

    @Override
    public boolean isSame(byte pin, PinType type) {
        return false;
    }

    @Override
    public String getValue(byte pin, PinType type) {
        return null;
    }

    @Override
    public String getJsonValue() {
        return null;
    }

    @Override
    public String makeHardwareBody() {
        return null;
    }

    @Override
    public String getModeType() {
        return null;
    }

    @Override
    public int getPrice() {
        return 100;
    }
}