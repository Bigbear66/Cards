public class Cards {

    enum Rank
    {
        ace,two,three,four,five,six,seven,eight,nine,ten,jack,queen,king
    }
    public static void main(String[] args) {

        Rank highcard,faceCard,card1,card2;

        highcard=Rank.ace;
        faceCard=Rank.king;
        card1=Rank.eight;
        card2=Rank.six;

        System.out.println("A black jack hand: "+highcard+" and "+faceCard);

        int card1Val,card2Val;

        card1Val=card1.ordinal()+1;

        card2Val=card2.ordinal()+1;

        System.out.println("\nA two card hand: "+card1+" and "+card2);

        System.out.println("Hand value: "+(card1Val+card2Val));
    }
}
