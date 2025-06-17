package edu.unl.cc.succession.business;

import edu.unl.cc.succession.domain.Successionable;

/**
 * 2. Serie de primos elevados al cubo  hasta un limite
 * S = 1^3 + 3^3 + 5^3 + 7^3 + 11^3 + 13^3 ... + N^3
 * Autores:
 *  GYNA MAYERLY YUPANQUI ROMERO
 *  ROYEL IVÁN JIMA PARDO
 *  DAVID ALEJANDRO RUIZ SANCHEZ
 *  GALO MILTON BENITEZ CABRERA
 *  DARWIN JOSE CORREA SARITAMA
 */

public class PrimeCubedCalculatorUpToLimit implements Successionable {
    private int limit;
    private final StringBuilder printableTerms = new StringBuilder("S = ");

    public PrimeCubedCalculatorUpToLimit(Number limit) {
        setLimit(limit);
    }

    @Override
    public Number nextTerm(Number currentPrime) {
        int n = currentPrime.intValue() + 2;
        while (n <= limit && !isPrime(n)) {
            n += 2;
        }
        return n;
    }

    @Override
    public void setLimit(Number limit) {
        this.limit = limit.intValue();
    }

    @Override
    public Number calculate() {
        int sum = 0;
        int prime = 1;
        boolean first = true;
        while (prime <= limit) {
            int cube = (int)Math.pow(prime, 3);
            if (!first) printableTerms.append(" + ");
            printableTerms.append(prime).append("^3");
            sum += cube;
            int next = nextTerm(prime).intValue();
            if (next > limit) break;
            prime = next;
            first = false;
        }
        return sum;
    }

    @Override
    public String print() {
        return printableTerms.toString();
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}