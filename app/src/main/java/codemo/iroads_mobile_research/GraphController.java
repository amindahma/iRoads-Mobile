package codemo.iroads_mobile_research;

import android.hardware.SensorEvent;

import com.github.mikephil.charting.charts.LineChart;

import codemo.iroads_mobile_research.Fragments.GraphFragment;

/**
 * Created by aminda on 3/9/2018.
 */


public class GraphController {

    public static void setRmsChart(LineChart rmsChart) {
        GraphFragment.setRmsChart(rmsChart);
    }

    public static void setIRIChart(LineChart iriChart) {
        GraphFragment.setIRIChart(iriChart);
    }

    public static void setFuelChart(LineChart fuelChart) {
        GraphFragment.setFuelChart(fuelChart);
    }

    public static void drawGraph(SensorEvent sensorEvent) {
        GraphFragment.drawGraph(sensorEvent);
    }

    public static void setSleepTime(int time) {
        GraphFragment.setSleepTime(time);
    }

}
