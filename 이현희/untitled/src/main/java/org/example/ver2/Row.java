package org.example.ver2;

public class Row {
    Line[] lines;
    public Row(int width) {
        lines = new Line[width];
        for (int i = 0; i < width; i++) {
            lines[i] = new Line();
        }
    }
    public void drawLine(int column) {
        if(column - 2 >= 0 && lines[column-2].checkIsLineDrawed())
            return;
        if(column <= lines.length -1 && lines[column].checkIsLineDrawed())
            return;
        lines[column-1].drawLine();
    }
    public int calcResult(int startColumn) {
        if(startColumn - 2 >= 0 && lines[startColumn-2].checkIsLineDrawed())
            return startColumn - 1;
        if(lines[startColumn - 1].checkIsLineDrawed())
            return startColumn + 1;
        return startColumn;
    }
    public void print() {
        for (int i = 0; i < 2 * lines.length - 1; i++) {
            if(i%2==0)
                System.out.print("|");
            else
                lines[(i-1)/2].print();
        }
        System.out.println();
    }
}
