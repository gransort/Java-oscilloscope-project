import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYAreaRenderer;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYSeries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class StackedPolylineRendererTest extends JFrame {
    private static Integer[][] plotChanelArray = new Integer[100000][4];
    private static JButton channelA;
    private static JButton channelB;
    private static JButton channelC;
    private static JButton channelD;
    static final int quantityRow = 22000;


    public static void main(String[] args) {
        StackedPolylineRendererTest app = new StackedPolylineRendererTest();
        app.StackedPolylineRendererTest();
    }





    private static TableXYDataset createDataSetA() {

        CSVReader fileReader = new CSVReader();
        try {
            fileReader.read(plotChanelArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        final XYSeries dataSeriesA = new XYSeries("A", true, false); //$NON-NLS-1$

        for (int row = 0; row < quantityRow; row++) {
            dataSeriesA.add(row, plotChanelArray[row][0]);
        }

        final DefaultTableXYDataset dataSet = new DefaultTableXYDataset();
        dataSet.addSeries(dataSeriesA);


        channelA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean go = false;
                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
                    if (dataSet.getSeriesKey(i).equals("A")) {
                        go = true;
                    }
                    System.out.println((String) dataSet.getSeriesKey(i));
                }
                if (go) {
                    dataSet.removeSeries(dataSeriesA);
                } else {
                    dataSet.addSeries(dataSeriesA);
                }
            }
        });


        return dataSet;
    }



    private static TableXYDataset createDataSetB() {

        CSVReader fileReader = new CSVReader();
        try {
            fileReader.read(plotChanelArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        final XYSeries dataSeriesB = new XYSeries("B", true, false); //$NON-NLS-1$

        for (int row = 0; row < quantityRow; row++) {
            dataSeriesB.add(row, plotChanelArray[row][1]);
        }

        final DefaultTableXYDataset dataSet = new DefaultTableXYDataset();
        dataSet.addSeries(dataSeriesB);


        channelA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean go = false;
                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
                    if (dataSet.getSeriesKey(i).equals("B")) {
                        go = true;
                    }
                    System.out.println((String) dataSet.getSeriesKey(i));
                }
                if (go) {
                    dataSet.removeSeries(dataSeriesB);
                } else {
                    dataSet.addSeries(dataSeriesB);
                }
            }
        });


        return dataSet;
    }






    private static TableXYDataset createDataSetC() {

        CSVReader fileReader = new CSVReader();
        try {
            fileReader.read(plotChanelArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        final XYSeries dataSeriesC = new XYSeries("C", true, false); //$NON-NLS-1$

        for (int row = 0; row < quantityRow; row++) {
            dataSeriesC.add(row, plotChanelArray[row][2]);
        }

        final DefaultTableXYDataset dataSet = new DefaultTableXYDataset();
        dataSet.addSeries(dataSeriesC);


        channelA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean go = false;
                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
                    if (dataSet.getSeriesKey(i).equals("C")) {
                        go = true;
                    }
                    System.out.println((String) dataSet.getSeriesKey(i));
                }
                if (go) {
                    dataSet.removeSeries(dataSeriesC);
                } else {
                    dataSet.addSeries(dataSeriesC);
                }
            }
        });


        return dataSet;
    }





    private static TableXYDataset createDataSetD() {

        CSVReader fileReader = new CSVReader();
        try {
            fileReader.read(plotChanelArray);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        final XYSeries dataSeriesD = new XYSeries("D", true, false); //$NON-NLS-1$

        for (int row = 0; row < quantityRow; row++) {
            dataSeriesD.add(row, plotChanelArray[row][3]);
        }

        final DefaultTableXYDataset dataSet = new DefaultTableXYDataset();
        dataSet.addSeries(dataSeriesD);


        channelA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean go = false;
                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
                    if (dataSet.getSeriesKey(i).equals("D")) {
                        go = true;
                    }
                    System.out.println((String) dataSet.getSeriesKey(i));
                }
                if (go) {
                    dataSet.removeSeries(dataSeriesD);
                } else {
                    dataSet.addSeries(dataSeriesD);
                }
            }
        });


        return dataSet;
    }





//    private static TableXYDataset createDataSet() {
//
//        CSVReader fileReader = new CSVReader();
//        try {
//            fileReader.read(plotChanelArray);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        final XYSeries dataSeriesA = new XYSeries("A", true, false); //$NON-NLS-1$
//
//        for (int row = 0; row < quantityRow; row++) {
//            dataSeriesA.add(row, plotChanelArray[row][0]);
//        }
//
//        final XYSeries dataSeriesB = new XYSeries("B", true, false); //$NON-NLS-1$
//
//        for (int row = 0; row < quantityRow; row++) {
//            dataSeriesB.add(row, plotChanelArray[row][1]);
//        }
//
//        final XYSeries dataSeriesC = new XYSeries("C", true, false); //$NON-NLS-1$
//
//        for (int row = 0; row < quantityRow; row++) {
//            dataSeriesC.add(row, plotChanelArray[row][2]);
//        }
//
//        final XYSeries dataSeriesD = new XYSeries("D", true, false); //$NON-NLS-1$
//
//        for (int row = 0; row < quantityRow; row++) {
//            dataSeriesD.add(row, plotChanelArray[row][3]);
//        }
//
//
//        final DefaultTableXYDataset dataSet = new DefaultTableXYDataset();
//        dataSet.addSeries(dataSeriesA);
//        dataSet.addSeries(dataSeriesB);
//        dataSet.addSeries(dataSeriesC);
//        dataSet.addSeries(dataSeriesD);
//
//
//        channelA.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                boolean go = false;
//                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
//                    if (dataSet.getSeriesKey(i).equals("A")) {
//                        go = true;
//                    }
//                    System.out.println((String) dataSet.getSeriesKey(i));
//                }
//                if (go) {
//                    dataSet.removeSeries(dataSeriesA);
//                } else {
//                    dataSet.addSeries(dataSeriesA);
//                }
//            }
//        });
//
//
//        channelB.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                boolean go = false;
//                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
//                    if (dataSet.getSeriesKey(i).equals("B")) {
//                        go = true;
//                    }
//                    System.out.println((String) dataSet.getSeriesKey(i));
//                }
//                if (go) {
//                    dataSet.removeSeries(dataSeriesB);
//                } else {
//                    dataSet.addSeries(dataSeriesB);
//                }
//            }
//        });
//
//        channelC.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                boolean go = false;
//                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
//                    if (dataSet.getSeriesKey(i).equals("C")) {
//                        go = true;
//                    }
//                    System.out.println((String) dataSet.getSeriesKey(i));
//                }
//                if (go) {
//                    dataSet.removeSeries(dataSeriesC);
//                } else {
//                    dataSet.addSeries(dataSeriesC);
//                }
//            }
//        });
//
//        channelD.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                boolean go = false;
//                for (int i = 0; i < dataSet.getSeriesCount(); i++) {
//                    if (dataSet.getSeriesKey(i).equals("D")) {
//                        go = true;
//                    }
//                    System.out.println((String) dataSet.getSeriesKey(i));
//                }
//                if (go) {
//                    dataSet.removeSeries(dataSeriesD);
//                } else {
//                    dataSet.addSeries(dataSeriesD);
//                }
//            }
//        });
//
//        return dataSet;
//    }


























    public void StackedPolylineRendererTest() {

        channelA = new JButton("ch.A");
        channelB = new JButton("ch.B");
        channelC = new JButton("ch.C");
        channelD = new JButton("ch.D");

       // final JFreeChart chart = ChartFactory.createStackedXYAreaChart(" ", null, null, createDataSet(), PlotOrientation.VERTICAL, true, false, false);
       // chart.getXYPlot().setRenderer(new StackedXYAreaRenderer(XYAreaRenderer.LINES));

//        final JFrame oscilloscopeFrame = new JFrame("Oscilloscope");
//        oscilloscopeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        oscilloscopeFrame.setPreferredSize(new Dimension(1000, 600));



        final JFreeChart chartA = ChartFactory.createStackedXYAreaChart(" ", null, null, createDataSetA(), PlotOrientation.VERTICAL, true, false, false);
        chartA.getXYPlot().setRenderer(new StackedXYAreaRenderer(XYAreaRenderer.LINES));

        final JFrame oscilloscopeFrameA = new JFrame("OscilloscopeA");
        oscilloscopeFrameA.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        oscilloscopeFrameA.setPreferredSize(new Dimension(1000, 600));




        final JFreeChart chartB = ChartFactory.createStackedXYAreaChart(" ", null, null, createDataSetB(), PlotOrientation.VERTICAL, true, false, false);
        chartB.getXYPlot().setRenderer(new StackedXYAreaRenderer(XYAreaRenderer.LINES));

        final JFrame oscilloscopeFrameB = new JFrame("OscilloscopeB");
        oscilloscopeFrameB.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        oscilloscopeFrameB.setPreferredSize(new Dimension(1000, 600));



        final JFreeChart chartC = ChartFactory.createStackedXYAreaChart(" ", null, null, createDataSetC(), PlotOrientation.VERTICAL, true, false, false);
        chartC.getXYPlot().setRenderer(new StackedXYAreaRenderer(XYAreaRenderer.LINES));

        final JFrame oscilloscopeFrameC = new JFrame("OscilloscopeC");
        oscilloscopeFrameC.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        oscilloscopeFrameC.setPreferredSize(new Dimension(1000, 600));

        final JFreeChart chartD = ChartFactory.createStackedXYAreaChart(" ", null, null, createDataSetD(), PlotOrientation.VERTICAL, true, false, false);
        chartD.getXYPlot().setRenderer(new StackedXYAreaRenderer(XYAreaRenderer.LINES));

        final JFrame oscilloscopeFrameD = new JFrame("OscilloscopeD");
        oscilloscopeFrameD.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        oscilloscopeFrameD.setPreferredSize(new Dimension(1000, 600));











        final JFrame controlFrame = new JFrame("Oscilloscope");
        controlFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        controlFrame.setPreferredSize(new Dimension(1000, 600));

        JPanel buttonsPanel = new JPanel(new FlowLayout());

        buttonsPanel.add(channelA);
        buttonsPanel.add(channelB);
        buttonsPanel.add(channelC);
        buttonsPanel.add(channelD);
// oscilloscopeFrame.add(buttonsPanel, BorderLayout.EAST);


        oscilloscopeFrameA.add(new ChartPanel(chartA), BorderLayout.WEST);
        oscilloscopeFrameA.pack();
        oscilloscopeFrameA.setVisible(true);

        oscilloscopeFrameB.add(new ChartPanel(chartB), BorderLayout.WEST);
        oscilloscopeFrameB.pack();
        oscilloscopeFrameB.setVisible(true);

        oscilloscopeFrameC.add(new ChartPanel(chartC), BorderLayout.WEST);
        oscilloscopeFrameC.pack();
        oscilloscopeFrameC.setVisible(true);

        oscilloscopeFrameD.add(new ChartPanel(chartD), BorderLayout.WEST);
        oscilloscopeFrameD.pack();
        oscilloscopeFrameD.setVisible(true);


    }


}
