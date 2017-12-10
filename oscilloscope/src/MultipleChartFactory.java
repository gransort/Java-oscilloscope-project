import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MultipleChartFactory {
    private static Integer[][] plotChanelArray = new Integer[100000][4];
    static boolean check = true;
    private static int quantityRow = 22000;
    private static JButton channelA;
    private static JButton channelB;
    private static JButton channelC;
    private static JButton channelD;
    private XYPlot plot;
    private ChartPanel chartPanel;
    private int datasetIndex = 0;
    private List<XYSeriesCollection> seriesArrayList = new ArrayList<XYSeriesCollection>();

    public MultipleChartFactory(String title, String xAxis) {
        super();
        String yAxis = title;
        XYSeriesCollection dataset = createDataset("Series");
        JFreeChart chart = ChartFactory.createXYLineChart("", xAxis, yAxis,
                dataset, PlotOrientation.VERTICAL, false, false, false);
        chart.setBackgroundPaint(Color.white);
        plot = chart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        ValueAxis axis = plot.getDomainAxis();
        axis.setAutoRange(true);
        NumberAxis rangeAxis2 = new NumberAxis("Range Axis 2");
        rangeAxis2.setAutoRangeIncludesZero(false);
        JPanel content = new JPanel(new BorderLayout());
        chartPanel = new ChartPanel(chart);
        content.add(chartPanel);

        CSVReader fileReader = new CSVReader();
        try {
            fileReader.read(plotChanelArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        MultipleChartFactory mcf = new MultipleChartFactory("Battery", "Time");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.add(mcf.getChart());
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        mcf.createDataset("A");
        mcf.createAdditionalDataset();
        mcf.createAdditionalDataset();
       // mcf.createAdditionalDataset();
        //mcf.createAdditionalDataset();


        channelA = new JButton("ch.A");
        channelB = new JButton("ch.B");
        channelC = new JButton("ch.C");
        channelD = new JButton("ch.D");


        JPanel buttonsPanel = new JPanel(new FlowLayout());

        buttonsPanel.add(channelA);
        buttonsPanel.add(channelB);
        buttonsPanel.add(channelC);
        buttonsPanel.add(channelD);


        // frame.add(new ChartPanel(chart), BorderLayout.WEST);
        frame.add(buttonsPanel, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);


        panel.add(buttonsPanel, BorderLayout.SOUTH);
        //.setPreferredSize(new java.awt.Dimension(500, 270));


        for (int row = 0; row < quantityRow; row++) {
            //  dataSeriesC.add(row, plotChanelArray[row][2]);
            mcf.getXYSeries(0).getSeries(0).add(row, plotChanelArray[row][0]);
        }

//        for (int row = 0; row < quantityRow; row++) {
//            //  dataSeriesC.add(row, plotChanelArray[row][2]);
//            mcf.getXYSeries(1).getSeries(0).add(row, plotChanelArray[row][1]);
//        }

        // mcf.getXYSeries(1).getSeries(0).remove(1);
//        mcf.getXYSeries(0).getSeries(0).add(1, 10);
//        mcf.getXYSeries(0).getSeries(0).add(2, 100);
//        System.out.println("first");
//        mcf.getXYSeries(1).getSeries(0).add(1, 20);
//        mcf.getXYSeries(1).getSeries(0).add(2, 200);
//        System.out.println("second");
//        mcf.getXYSeries(2).getSeries(0).add(1, 30);
//        mcf.getXYSeries(2).getSeries(0).add(2, 300);


        channelA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (check) {
                   // mcf.getXYSeries(0).removeSeries(0);
                   // mcf.getXYSeries(0).getSeries(0).add();
                    check = false;
                } else {
                    //mcf.createAdditionalDataset();
                    for (int row = 0; row < quantityRow; row++) {
                        //  dataSeriesC.add(row, plotChanelArray[row][2]);
                        //mcf.getXYSeries(mcf.datasetIndex).getSeries(0).add(row, plotChanelArray[row][0]);
                       // mcf.getXYSeries(mcf.datasetIndex).getSeries(0)=mcf.getXYSeries(mcf.datasetIndex).getSeries(0);
                       // mcf.getXYSeries(0).getSeries(0).
                    }
                    check = true;
                }
            }
        });

    }

    private XYSeriesCollection createDataset(String name) {
        XYSeries series = new XYSeries(name);
        return new XYSeriesCollection(series);
    }

    public ChartPanel getChart() {
        return chartPanel;
    }

    public void createAdditionalDataset() {
        seriesArrayList.add(createDataset("S" + this.datasetIndex));
        this.plot.setDataset(this.datasetIndex, seriesArrayList.get(datasetIndex));
        this.plot.setRenderer(this.datasetIndex, new StandardXYItemRenderer());
        this.datasetIndex++;
    }

    public XYSeriesCollection getXYSeries(int datasetIndex) {
        return seriesArrayList.get(datasetIndex);
    }

    public int getDatasetCount() {
        return this.plot.getDatasetCount();
    }

}