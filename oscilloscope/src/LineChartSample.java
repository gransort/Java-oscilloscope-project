import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class LineChartSample extends Application {

    private static Integer[][] plotChanelArray = new Integer[100000][4];
    private static int quantityRow = 22000;

    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) {

        CSVReader fileReader = new CSVReader();
        try {
            fileReader.read(plotChanelArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        stage.setTitle("Line Chart Sample");
        // defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setAutoRanging(true);
        xAxis.setForceZeroInRange(false);
        yAxis.setAutoRanging(true);
        yAxis.setForceZeroInRange(false);
        xAxis.setLabel("Number of Month");
        // creating the chart
        final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(xAxis, yAxis);

        lineChart.setTitle("Stock Monitoring, 2010");
        // defining a series
        final XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        // populating the series with data



        for (int row = 0; row < quantityRow; row++) {
            //  dataSeriesC.add(row, plotChanelArray[row][2]);
            //mcf.getXYSeries(0).getSeries(0).add(row, plotChanelArray[row][0]);
           // series.getData().add();
           // lineChart.getData().
        }





//        series.getData().add(new XYChart.Data(1, 23));
//        series.getData().add(new XYChart.Data(2, 14));
//        series.getData().add(new XYChart.Data(3, 15));
//        series.getData().add(new XYChart.Data(4, 24));
//        series.getData().add(new XYChart.Data(5, 34));
//        series.getData().add(new XYChart.Data(6, 36));
//        series.getData().add(new XYChart.Data(7, 22));
//        series.getData().add(new XYChart.Data(8, 45));
//        series.getData().add(new XYChart.Data(9, 43));
//        series.getData().add(new XYChart.Data(10, 17));
//        series.getData().add(new XYChart.Data(11, 29));
//        series.getData().add(new XYChart.Data(12, 25));

        // DO NOT ADD DATA TO CHART
        // bc.getData().addAll(series1, series2, series3);
        final StackPane pane = new StackPane();
        pane.getChildren().add(lineChart);
        final Scene scene = new Scene(pane, 500, 400);
        new ZoomManager(pane, lineChart, series);
        stage.setScene(scene);
        stage.show();
    }
}