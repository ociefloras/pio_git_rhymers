package edu.kis.vh.nursery;

/**
 * Klasa {@code HanoiRhymer} rozszerza {@code DefaultCountingOutRhymer} i implementuje
 * wariant licznika, który odrzuca liczby według określonej zasady.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Licznik odrzuconych wartości
     */
    private int totalRejected = 0;

    /**
     * Zwraca całkowitą liczbę odrzuconych wartości.
     *
     * @return liczba odrzuconych wartości
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Nadpisuje metodę {@code countIn}, aby zaimplementować logikę odrzucania.
     * Jeśli nowa wartość jest większa niż obecna wartość na szczycie stosu i stos nie jest pusty,
     * wartość zostaje odrzucona, a licznik {@code totalRejected} zostaje zwiększony.
     * W przeciwnym razie wartość jest dodawana do stosu.
     *
     * @param in wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}