public class PickTwoCards
{
    public static void main(String[] args)
    {
        final int CARDS_IN_SUIT = 13;
        Card card1 = new Card();
        Card card2 = new Card();

        card1.setSuit('s');
        card2.setSuit('h');
        card1.setValue((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        card2.setValue((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        System.out.println("Card 1: value " + card1.getValue() + ", suit " + card1.getSuit());
        System.out.println("Card 2: value " + card2.getValue() + ", suit " + card2.getSuit());

    }
}