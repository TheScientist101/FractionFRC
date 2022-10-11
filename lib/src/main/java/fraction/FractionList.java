package fraction;

import fraction.Fraction;

public class FractionList {
    private Fraction[] fractions;
    private int size;
    private boolean sorted = false;

    public FractionList() {
        this.fractions = new Fraction[10];
        this.size = 0;
    }

    public FractionList(int capacity) {
        this.fractions = new Fraction[capacity];
        this.size = 0;
    }

    public FractionList(Fraction[] fractions) {
        this.fractions = fractions;
        this.size = fractions.length;
    }

    public Fraction get(int index) throws IllegalArgumentException{
        if (index > size - 1) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return this.fractions[index];
    }

    public void set(int index, Fraction fraction) throws IllegalArgumentException {
        if (index > size - 1) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        this.fractions[index] = fraction;
        this.sorted = false;
    }

    public void add(Fraction fraction) {
        if (this.size == this.fractions.length) {
            this.resize(10);
        }
        this.fractions[this.size] = fraction;
        this.size++;
        this.sorted = false;
    }

    public void remove(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.fractions[i] = this.fractions[i + 1];
        }
        this.size--;
    }

    public int size() {
        return this.size;
    }

    public void resize(int lengthAdded) {
        Fraction[] newFractions = new Fraction[this.fractions.length + lengthAdded];
        for (int i = 0; i < this.fractions.length; i++) {
            newFractions[i] = this.fractions[i];
        }
        this.fractions = newFractions;
    }

    public void insert(int index, Fraction fraction) throws IllegalArgumentException {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be greater than or equal to 0.");
        }
        if (this.size == this.fractions.length) {
            this.resize(10);
        }
        for (int i = this.size; i > index; i--) {
            this.fractions[i] = this.fractions[i - 1];
        }
        this.fractions[index] = fraction;
        this.size++;
        this.sorted = false;
    }

    public int linearSearch(Fraction fraction) {
        for (int i = 0; i < this.size; i++) {
            if (this.fractions[i].equals(fraction)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(Fraction fraction) {
        if (!this.sorted) {
            this.sort();
        }
        int low = 0;
        int high = this.size - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (this.get(mid).equals(fraction)) {
                return mid;
            } else if (this.get(mid).compareTo(fraction) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void sort() {
        for (int i = 0; i < this.size; i++) {
            Fraction x = this.get(i);
            int j = i - 1;
            while(j >= 0 && (this.get(j).compareTo(x) == 1)) {
                this.set(j + 1, this.get(j));
                j--;
            }
            this.set(j + 1, x);
        }
        this.sorted = true;
    }

    public FractionList withoutDuplicates() {
        FractionList newFractionList = new FractionList(this.fractions);
        if (!this.sorted) {
            newFractionList.sort();
        }
        for (int i = 1; i <= newFractionList.size(); i++) {
            if (newFractionList.get(i).equals(newFractionList.get(i - 1))) {
                newFractionList.remove(i);
            }
        }

        return newFractionList;
    }

    public boolean equals(Object other) {
        if (other instanceof FractionList) {
            FractionList otherList = (FractionList) other;
            if (this.size != otherList.size) {
                return false;
            }
            for (int i = 0; i < this.size; i++) {
                if (!this.fractions[i].equals(otherList.fractions[i])) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String result = "[";
        for (int i = 0; i < this.size; i++) {
            result += this.fractions[i].toString();
            if (i < this.size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
