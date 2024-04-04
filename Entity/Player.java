package Entity;

import main.MainGame;
import java.util.ArrayList;
public class Player {
    MainGame game;
    public Player(MainGame game) {
        this.game = game;
    }
    ArrayList<Integer> arrList = new ArrayList<Integer>();

    public void checkSize() {
        System.out.println(arrList.size());
    }
    public void addList(int i) {
        arrList.add(i);
    }
    public void addToIndex(int num, int index) {
        arrList.add(num, index);
    }
    public void replaceToIndex(int num, int index) {
        arrList.set(num, index);
    }
    public void removeOnIndex(int index) {
        arrList.remove(index);
    }
    public void iterateList(int removeNum) {
        for (Integer i : arrList) {
            System.out.println(i);
            if (i == removeNum) arrList.remove(i);
        }
    }
    public void selectionSort() {
        int n = arrList.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arrList.get(j) < arrList.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arrList.get(i);
                arrList.set(i, arrList.get(minIndex));
                arrList.set(minIndex, temp);
            }
        }
    }
    public void insertionSort() {
        int n = arrList.size();
        for (int i = 1; i < n; i++) {
            int key = arrList.get(i);
            int j = i - 1;
            while (j >= 0 && arrList.get(j) > key) {
                arrList.set(j + 1, arrList.get(j));
                j = j - 1;
            }
            arrList.set(j + 1, key);
        }
    }
}
