import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.markers.SeriesMarkers;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Example2 {

    private static Integer[][] plotChanelArray = new Integer[100000][4];

    private static int quantityRow = 22000;

    public static void main(String[] args) {
       int row=0;
        CSVReader fileReader = new CSVReader();
        try {
            fileReader.read(plotChanelArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int numCharts = 4;

        List<XYChart> charts = new ArrayList<XYChart>();
double[] array = new double[22000];

        for (int i=0;i<21000;i++){
            array[i]=plotChanelArray[i][0];
        }




        for (int i = 0; i < numCharts; i++) {
            XYChart chart = new XYChartBuilder().xAxisTitle("X").yAxisTitle("Y").width(600).height(400).build();
            //chart.getStyler().setYAxisMin((double) -10);
           // chart.getStyler().setYAxisMax((double) 10);

            //XYSeries series = chart.addSeries("" + i, null, getRandomWalk(200));
            XYSeries series = chart.addSeries("" + i, null, array);

            series.setMarker(SeriesMarkers.NONE);
            charts.add(chart);
        }
        new SwingWrapper<XYChart>(charts).displayChartMatrix();
        //new ZoomManager(charts);
        final StackPane pane = new StackPane();
        pane.getChildren().add((Node) charts);
        final Scene scene = new Scene(pane, 500, 400);

    }

    /**
     * Generates a set of random walk data
     *
     * @param numPoints
     * @return
     */
    private static double[] getRandomWalk(int numPoints) {

        double[] y = new double[numPoints];
        y[0] = 0;
        for (int i = 1; i < y.length; i++) {
            y[i] = y[i - 1] + Math.random() - .5;
        }
        return y;
    }

}