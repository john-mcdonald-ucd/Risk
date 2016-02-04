import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphPanel extends JPanel {

    private ArrayList<Country> mCountries = new ArrayList<>();
    private ArrayList<Edge> mEdges = new ArrayList<>();

    public GraphPanel() {
        initGraph();
    }

    private void initGraph() {

        // Nodes
        int country = 0;
        for (int i = 0; i < Constants.NUM_CONTINENTS; i++) {
            for (int j = 0; j < Constants.CONTINENT_VALUES[i]; j++) {
                mCountries.add(new Country(
                        Constants.COUNTRY_NAMES[country],
                        Constants.COUNTRY_COORD[country]
                ));
                country++;
            }
        }

        // Edges
        for (int i = 0; i < Constants.ADJACENT.length; i++) {
            for (int j = 0; j < Constants.ADJACENT[i].length; j++) {
                int x1 = mCountries.get(Constants.ADJACENT[i][j]).getCoord()[0];
                int y1 = mCountries.get(Constants.ADJACENT[i][j]).getCoord()[1];

                for (int k = j; k < Constants.ADJACENT[i].length; k++) {
                    int x2 = mCountries.get(Constants.ADJACENT[i][k]).getCoord()[0];
                    int y2 = mCountries.get(Constants.ADJACENT[i][k]).getCoord()[1];
                    mEdges.add(new Edge(new Point(x1 + Constants.COUNTRY_WIDTH / 2, y1 + Constants.COUNTRY_HEIGHT / 2), new Point(x2 + Constants.COUNTRY_WIDTH / 2, y2 + Constants.COUNTRY_HEIGHT / 2)));
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < mCountries.size(); i++) {
            int x = mCountries.get(i).getCoord()[0];
            int y = mCountries.get(i).getCoord()[1];
            g.fillOval(x, y, Constants.COUNTRY_WIDTH, Constants.COUNTRY_HEIGHT);
            g.drawString(mCountries.get(i).getName(), x, y - Constants.COUNTRY_HEIGHT);
        }

        for (int i = 0; i < mEdges.size(); i++) {
            g.drawLine(mEdges.get(i).getA().x, mEdges.get(i).getA().y, mEdges.get(i).getB().x, mEdges.get(i).getB().y);
        }
    }

    private class Edge {

        private Point mA, mB;

        public Edge(Point a, Point b) {
            mA = a;
            mB = b;
        }

        public Point getA() {
            return mA;
        }

        public void setA(Point a) {
            mA = a;
        }

        public Point getB() {
            return mB;
        }

        public void setB(Point b) {
            mB = b;
        }
    }
}
