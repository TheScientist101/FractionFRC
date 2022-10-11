package fraction;

import fraction.Fraction;
import fraction.FractionList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    void testFraction() {
        Fraction f = new Fraction(1, 2);
        assertEquals(1, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    void testFractionInt() {
        Fraction f = new Fraction(1);
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void testFractionEmpty() {
        Fraction f = new Fraction();
        assertEquals(0, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void testSetNumerator() {
        Fraction f = new Fraction();
        f.setNumerator(1);
        assertEquals(1, f.getNumerator());
        assertEquals(1, f.getDenominator());
    }

    @Test
    void testSetDenominator() {
        Fraction f = new Fraction();
        f.setDenominator(2);
        assertEquals(0, f.getNumerator());
        assertEquals(2, f.getDenominator());
    }

    @Test
    void testReduce() {
        Fraction f = new Fraction(8, 16);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(1, reducedF.getNumerator());
        assertEquals(2, reducedF.getDenominator());
    }

    @Test
    void testReduce2() {
        Fraction f = new Fraction(12, 36);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(1, reducedF.getNumerator());
        assertEquals(3, reducedF.getDenominator());
    }

    @Test
    void testReduce3() {
        Fraction f = new Fraction(36, 12);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(3, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testReduce4() {
        Fraction f = new Fraction(36, 36);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(1, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testReduce5() {
        Fraction f = new Fraction(0, 36);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(0, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testReduce6() {
        Fraction f = new Fraction(15, 3);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(5, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testReduce7() {
        Fraction f = new Fraction(36, -36);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(-1, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testReduce8() {
        Fraction f = new Fraction(-36, -36);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(1, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testReduce9() {
        Fraction f = new Fraction(-36, 36);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(-1, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testReduce10() {
        Fraction f = new Fraction(36, -36);
        Fraction reducedF = Fraction.reduce(f);
        assertEquals(-1, reducedF.getNumerator());
        assertEquals(1, reducedF.getDenominator());
    }

    @Test
    void testAdd() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testAdd2() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(5, f3.getNumerator());
        assertEquals(6, f3.getDenominator());
    }

    @Test
    void testAdd3() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(3, f3.getNumerator());
        assertEquals(4, f3.getDenominator());
    }

    @Test
    void testAdd4() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 6);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(2, f3.getNumerator());
        assertEquals(3, f3.getDenominator());
    }

    @Test
    void testAdd5() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 8);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(3, f3.getNumerator());
        assertEquals(4, f3.getDenominator());
    }

    @Test
    void testAdd6() {
        Fraction f1 = new Fraction(12, 128);
        Fraction f2 = new Fraction(1, 12);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(17, f3.getNumerator());
        assertEquals(96, f3.getDenominator());
    }

    @Test
    void testAdd7() {
        Fraction f1 = new Fraction(15, 45);
        Fraction f2 = new Fraction(2, 12);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(2, f3.getDenominator());
    }

    @Test
    void testAdd8() {
        Fraction f1 = new Fraction(1020, 1234);
        Fraction f2 = new Fraction(324, 4321);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(2403618, f3.getNumerator());
        assertEquals(2666057, f3.getDenominator());
    }

    @Test
    void testAdd9() {
        Fraction f1 = new Fraction(930, 2345);
        Fraction f2 = new Fraction(15, 2534);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(68337, f3.getNumerator());
        assertEquals(169778, f3.getDenominator());
    }

    @Test
    void testAdd10() {
        Fraction f1 = new Fraction(21, 1);
        Fraction f2 = new Fraction(43, 1);
        Fraction f3 = Fraction.add(f1, f2);
        assertEquals(64, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testSubtract() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = Fraction.subtract(f1, f2);
        assertEquals(0, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testSubtract2() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = Fraction.subtract(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(6, f3.getDenominator());
    }

    @Test
    void testSubtract3() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction f3 = Fraction.subtract(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(4, f3.getDenominator());
    }

    @Test
    void testSubtract4() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 6);
        Fraction f3 = Fraction.subtract(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(3, f3.getDenominator());
    }

    @Test
    void testSubtract5() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 8);
        Fraction f3 = Fraction.subtract(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(4, f3.getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = Fraction.multiply(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(4, f3.getDenominator());
    }

    @Test
    void testMultiply2() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = Fraction.multiply(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(6, f3.getDenominator());
    }

    @Test
    void testMultiply3() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction f3 = Fraction.multiply(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(8, f3.getDenominator());
    }

    @Test
    void testMultiply4() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 6);
        Fraction f3 = Fraction.multiply(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(12, f3.getDenominator());
    }

    @Test
    void testMultiply5() {
        Fraction f1 = new Fraction(32, 2);
        Fraction f2 = new Fraction(51, 8);
        Fraction f3 = Fraction.multiply(f1, f2);
        assertEquals(102, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testDivide() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = Fraction.divide(f1, f2);
        assertEquals(1, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testDivide2() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = Fraction.divide(f1, f2);
        assertEquals(3, f3.getNumerator());
        assertEquals(2, f3.getDenominator());
    }

    @Test
    void testDivide3() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 4);
        Fraction f3 = Fraction.divide(f1, f2);
        assertEquals(2, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testDivide4() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 6);
        Fraction f3 = Fraction.divide(f1, f2);
        assertEquals(3, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testDivide5() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 8);
        Fraction f3 = Fraction.divide(f1, f2);
        assertEquals(2, f3.getNumerator());
        assertEquals(1, f3.getDenominator());
    }

    @Test
    void testAddAssignment() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        f1.add(f2);
        assertEquals(1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
    }

    @Test
    void testSubtractAssignment() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        f1.subtract(f2);
        assertEquals(1, f1.getNumerator());
        assertEquals(6, f1.getDenominator());
    }

    @Test
    void testDivisionAssignment() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        f1.divide(f2);
        assertEquals(1, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
    }

    @Test
    void testMultiplyAssignment() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        f1.multiply(f2);
        assertEquals(1, f1.getNumerator());
        assertEquals(4, f1.getDenominator());
    }

    @Test
    void testEquals() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        assertTrue(f1.equals(f2));
    }

    @Test
    void testCompareTo() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(0, f1.compareTo(f2));
    }

    @Test
    void testCompareTo2() {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        assertEquals(1, f1.compareTo(f2));
    }

    @Test
    void testCompareTo3() {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(1, 2);
        assertEquals(-1, f1.compareTo(f2));
    }

    @Test
    void testToString() {
        Fraction f1 = new Fraction(1, 2);
        assertEquals("1/2", f1.toString());
    }

    @Test
    void testSort() {
        FractionList unsorted = new FractionList(10);
        for (int i = 10; i > 0; i--) {
            unsorted.add(new Fraction(i, 10));
        }
        Fraction[] values = {
                new Fraction(1, 10),
                new Fraction(2, 10),
                new Fraction(3, 10),
                new Fraction(4, 10),
                new Fraction(5, 10),
                new Fraction(6, 10),
                new Fraction(7, 10),
                new Fraction(8, 10),
                new Fraction(9, 10),
                new Fraction(10, 10)
        };
        FractionList sorted = new FractionList(values);
        unsorted.sort();
        assertEquals(sorted, unsorted);
    }

    @Test
    void testSort2() {
        FractionList unsorted = new FractionList(10);
        for (int i = -10; i < 0; i++) {
            unsorted.add(new Fraction(i, 10));
        }
        Fraction[] values = {
            new Fraction(-10, 10),
            new Fraction(-9, 10),
            new Fraction(-8, 10),
            new Fraction(-7, 10),
            new Fraction(-6, 10),
            new Fraction(-5, 10),
            new Fraction(-4, 10),
            new Fraction(-3, 10),
            new Fraction(-2, 10),
            new Fraction(-1, 10)
        };
        FractionList sorted = new FractionList(values);
        unsorted.sort();
        assertEquals(sorted, unsorted);
    }

    @Test
    void testBinarySearch() {
        FractionList list = new FractionList(10);
        for (int i = 1; i <= 10; i++) {
            list.add(new Fraction(i, 10));
        }
        assertEquals(0, list.binarySearch(new Fraction(1, 10)));
        assertEquals(1, list.binarySearch(new Fraction(2, 10)));
        assertEquals(2, list.binarySearch(new Fraction(3, 10)));
        assertEquals(3, list.binarySearch(new Fraction(4, 10)));
        assertEquals(4, list.binarySearch(new Fraction(5, 10)));
        assertEquals(5, list.binarySearch(new Fraction(6, 10)));
        assertEquals(6, list.binarySearch(new Fraction(7, 10)));
        assertEquals(7, list.binarySearch(new Fraction(8, 10)));
        assertEquals(8, list.binarySearch(new Fraction(9, 10)));
        assertEquals(9, list.binarySearch(new Fraction(10, 10)));
    }

    @Test
    void testBinarySearch2() {
        FractionList list = new FractionList(10);
        for (int i = -10; i < 0; i++) {
            list.add(new Fraction(i, 10));
        }
        assertEquals(0, list.binarySearch(new Fraction(-10, 10)));
        assertEquals(1, list.binarySearch(new Fraction(-9, 10)));
        assertEquals(2, list.binarySearch(new Fraction(-8, 10)));
        assertEquals(3, list.binarySearch(new Fraction(-7, 10)));
        assertEquals(4, list.binarySearch(new Fraction(-6, 10)));
        assertEquals(5, list.binarySearch(new Fraction(-5, 10)));
        assertEquals(6, list.binarySearch(new Fraction(-4, 10)));
        assertEquals(7, list.binarySearch(new Fraction(-3, 10)));
        assertEquals(8, list.binarySearch(new Fraction(-2, 10)));
        assertEquals(9, list.binarySearch(new Fraction(-1, 10)));
    }

    @Test
    void testLinearSearch() {
        FractionList list = new FractionList(10);
        for (int i = 1; i <= 10; i++) {
            list.add(new Fraction(i, 10));
        }
        assertEquals(0, list.linearSearch(new Fraction(1, 10)));
        assertEquals(1, list.linearSearch(new Fraction(2, 10)));
        assertEquals(2, list.linearSearch(new Fraction(3, 10)));
        assertEquals(3, list.linearSearch(new Fraction(4, 10)));
        assertEquals(4, list.linearSearch(new Fraction(5, 10)));
        assertEquals(5, list.linearSearch(new Fraction(6, 10)));
        assertEquals(6, list.linearSearch(new Fraction(7, 10)));
        assertEquals(7, list.linearSearch(new Fraction(8, 10)));
        assertEquals(8, list.linearSearch(new Fraction(9, 10)));
        assertEquals(9, list.linearSearch(new Fraction(10, 10)));
    }

    @Test
    void testLinearSearch2() {
        FractionList list = new FractionList(10);
        for (int i = -10; i < 0; i++) {
            list.add(new Fraction(i, 10));
        }
        assertEquals(0, list.linearSearch(new Fraction(-10, 10)));
        assertEquals(1, list.linearSearch(new Fraction(-9, 10)));
        assertEquals(2, list.linearSearch(new Fraction(-8, 10)));
        assertEquals(3, list.linearSearch(new Fraction(-7, 10)));
        assertEquals(4, list.linearSearch(new Fraction(-6, 10)));
        assertEquals(5, list.linearSearch(new Fraction(-5, 10)));
        assertEquals(6, list.linearSearch(new Fraction(-4, 10)));
        assertEquals(7, list.linearSearch(new Fraction(-3, 10)));
        assertEquals(8, list.linearSearch(new Fraction(-2, 10)));
        assertEquals(9, list.linearSearch(new Fraction(-1, 10)));
    }

    @Test
    void testWithoutDuplicates() {
        FractionList list = new FractionList(20);
        for (int i = 1; i <= 10; i++) {
            list.add(new Fraction(i, 10));
            list.add(new Fraction(i, 10));
        }
        Fraction[] values = {
            new Fraction(1, 10),
            new Fraction(2, 10),
            new Fraction(3, 10),
            new Fraction(4, 10),
            new Fraction(5, 10),
            new Fraction(6, 10),
            new Fraction(7, 10),
            new Fraction(8, 10),
            new Fraction(9, 10),
            new Fraction(10, 10)
        };
        assertEquals(new FractionList(values), list.withoutDuplicates());
    }

    @Test
    void testWithoutDuplicates2() {
        FractionList list = new FractionList(20);
        for (int i = -10; i < 0; i++) {
            list.add(new Fraction(i, 10));
            list.add(new Fraction(i, 10));
        }
        Fraction[] values = {
            new Fraction(-10, 10),
            new Fraction(-9, 10),
            new Fraction(-8, 10),
            new Fraction(-7, 10),
            new Fraction(-6, 10),
            new Fraction(-5, 10),
            new Fraction(-4, 10),
            new Fraction(-3, 10),
            new Fraction(-2, 10),
            new Fraction(-1, 10)
        };
        assertEquals(new FractionList(values), list.withoutDuplicates());
    }
}