package com.generalprocessingunit.processing;

import processing.core.PApplet;

public class MainActivity extends PApplet
{
    @Override
    public void setup()
    {
        orientation(LANDSCAPE);
        super.setup();
    }

    @Override
    public void draw()
    {
        super.draw();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String sketchRenderer() {
        return PApplet.P3D;
    }
}
