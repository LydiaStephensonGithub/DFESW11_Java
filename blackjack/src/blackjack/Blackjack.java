package blackjack;

public class Blackjack {
	public static int play(int player, int dealer) {
		if (player > 21 && dealer > 21) {
			return 0;
		} else {
			if (player > 21) {
				return dealer;
			} else if (dealer > 21) {
				return player;
			} else if (dealer > player) {
				return dealer;
			} else if (player > dealer) {
				return player;
			} else {
				return 0;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(play(10, 21));
		System.out.println(play(20, 18));
		System.out.println(play(1, 22));
		System.out.println(play(22, 23));
	}
}
