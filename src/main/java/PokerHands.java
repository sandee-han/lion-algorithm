import java.util.Arrays;

public class PokerHands {

    public static String solution(String cards) {
        // Spade = 0, Clover = 1, Heart = 2, Diamond = 3
        int[] player1CountNumber = new int[14];
        int[] player1CountSuit = new int[4];
        int[] player2CountNumber = new int[14];
        int[] player2CountSuit = new int[4];

        // 카드 비교하는 Array
        /*
            0 : pair
            1 : three of a kind
            2 : straight
            3 : flush
            4 : Four of a Kind
            5 : Highest Card (Except index 6, 7, 8)
            6 : High Pair Number
            7 : Low Pair Number
            8 : Triple / Four of a kind Number
         */
        int[] checkCardsResult1 = new int[9]; // player1
        int[] checkCardsResult2 = new int[9]; // player2

        // final rank
        int finalPlayer1Rank = 0;
        int finalPlayer2Rank = 0;

        // player1 카운트 후 countNumber 추가
        for (int i = 0; i < 13; i += 3) {
            addCountNumber(cards, i, player1CountNumber);
        }

        // player2 카운트 후 countNumber 추가
        for (int i = 15; i < 28; i += 3) {
            addCountNumber(cards, i, player2CountNumber);
        }

        // player1 문양 수 확인
        for (int i = 1; i < 14; i += 3) {
            addCountSuit(cards, i, player1CountSuit);
        }

        // player2 문양 수 확인
        for (int i = 16; i < 28; i += 3) {
            addCountSuit(cards, i, player2CountSuit);
        }

        // Pair, Triple, Straight 확인
        inputCardsRankVariables(player1CountNumber, player1CountSuit, checkCardsResult1);
        inputCardsRankVariables(player2CountNumber, player2CountSuit, checkCardsResult2);

        System.out.println("checkCardsResult1 : " + Arrays.toString(checkCardsResult1));
        System.out.println("checkCardsResult2 : " + Arrays.toString(checkCardsResult2));

        // Rank , Highest Number 확인
        playerCardsRank(checkCardsResult1, finalPlayer1Rank);
        playerCardsRank(checkCardsResult2, finalPlayer2Rank);

        System.out.println(finalPlayer1Rank);
        System.out.println(finalPlayer2Rank);
        return getWinner(finalPlayer1Rank, finalPlayer2Rank, checkCardsResult1, checkCardsResult2);
    }

    // 숫자 카운트 넣어주는 함수
    public static void addCountNumber(String cards1, int i, int[] playerCountNumber) {
        switch (cards1.charAt(i)) {
            case 'T':
                playerCountNumber[9]++;
                break;
            case 'J':
                playerCountNumber[10]++;
                break;
            case 'Q':
                playerCountNumber[11]++;
                break;
            case 'K':
                playerCountNumber[12]++;
                break;
            case 'A':
                playerCountNumber[13]++;
                break;
            default:
                playerCountNumber[cards1.charAt(i) - 48]++;
                break;
        }
    }

    // 문양 숫자 세는 함수
    public static int[] addCountSuit(String cards1, int i, int[] playerCountSuit) {
        switch (cards1.charAt(i)) {
            case 'S':
                playerCountSuit[0]++;
                break;
            case 'C':
                playerCountSuit[1]++;
                break;
            case 'H':
                playerCountSuit[2]++;
                break;
            case 'D':
                playerCountSuit[3]++;
                break;
        }
        return playerCountSuit;
    }

    // 족보 변수 입력 함수
    public static int[] inputCardsRankVariables(int[] playerCountNumber, int[] playerCountSuit, int[] checkCards) {
        // Straight 확인 변수. 5일 경우 Straight
        int straightCount = 0;
        int actCount = 0;

        for (int i = 0; i < 14; i++) {
            switch (playerCountNumber[i]) {
                // 연속되지 않으면 0으로 리셋
                case 0:
                    straightCount = 0;
                    break;

                // 1장인 경우. StraightCount로 Straight 확인
                case 1:
                    straightCount++;
                    actCount++;
                    checkCards[5] = i + 1;
                    break;

                // Pair Count 증가
                case 2:
                    if (checkCards[0] == 1) {
                        // 2페어인 경우 낮은 페어를 checkCards 8번 인덱스에 입력
                        checkCards[7] = checkCards[6];
                    }
                    checkCards[0]++;
                    checkCards[6] = i;
                    actCount++;
                    break;

                // Three of a Kind true
                case 3:
                    checkCards[1]++;
                    checkCards[8] = i;
                    actCount++;
                    break;

                // Four of a Kind true
                case 4:
                    checkCards[4]++;
                    checkCards[8] = i;
                    actCount++;
                    break;
            }

            // 5개 연속이라서 straight
            if (straightCount == 5) {
                // straight true
                checkCards[2] = 1;
                break;
            }

            if (actCount == 5) break;
        }

        // Flush 확인
        for (int i = 0; i < 4; i++) {
            if (playerCountSuit[i] == 5) {
                checkCards[3] = 1;
                break;
            }
        }

        return checkCards;
    }

    // 족보 확인 및 입력 함수
    /*
        High Card : 0
        One Pair : 1
        Two Pairs : 2
        Three of a Kind : 3
        Straight : 4
        Flush : 5
        Full House : 6
        Four of a Kind : 7
        Straight Flush : 8
        Royal Flush : 9
     */
    public static int playerCardsRank(int[] checkCards, int finalPlayerRank) {
        // Full House
        if (checkCards[0] == 1 && checkCards[1] == 1) {
            finalPlayerRank = 6;
        }
        // 1 Pair
        else if (checkCards[0] == 1) {
            finalPlayerRank = 1;
        }
        // 2 Pairs
        else if (checkCards[0] == 2) {
            finalPlayerRank = 2;
        }
        // Three of a Kind
        else if (checkCards[1] == 1) {
            finalPlayerRank = 3;
        }
        // Straight Flush
        else if (checkCards[2] == 1 && checkCards[3] == 1) {
            finalPlayerRank = 8;
        }
        // Royal Flush
        else if (checkCards[2] == 1 && checkCards[3] == 1 && checkCards[4] == 14) {
            finalPlayerRank = 9;
        }
        // Straight
        else if (checkCards[2] == 1) {
            finalPlayerRank = 4;
        }
        // Flush
        else if (checkCards[3] == 1) {
            finalPlayerRank = 5;
        }
        // Four of a Kind
        else if (checkCards[4] == 1) {
            finalPlayerRank = 7;
        }
        return finalPlayerRank;
    }

    // 승자 비교
    public static String getWinner(int finalPlayer1Rank, int finalPlayer2Rank, int[] checkCardResult1, int[] checkCardResult2) {
        String player1Win = "Winner is Player 1";
        String player2Win = "Winner is Player 2";

        // Pair 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 1) {
            if (checkCardResult1[7] > checkCardResult2[7]) {
                return player1Win;
            } else if (checkCardResult1[7] < checkCardResult2[7]) {
                return  player2Win;
            } else {
                if (checkCardResult1[5] > checkCardResult2[5]) {
                    return player1Win;
                } else if (checkCardResult1[5] > checkCardResult2[5]) {
                    return player2Win;
                } else {
                    return "Tie";
                }
            }
        }

        // Two Pair 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 2) {
            if (checkCardResult1[6] > checkCardResult2[6]) {
                return player1Win;
            } else if (checkCardResult1[6] < checkCardResult2[6]) {
                return  player2Win;
            } else {
                if (checkCardResult1[7] > checkCardResult2[7]) {
                    return player1Win;
                } else if (checkCardResult1[7] > checkCardResult2[7]) {
                    return player2Win;
                } else {
                    if (checkCardResult1[5] > checkCardResult2[5]) {
                        return player1Win;
                    } else if (checkCardResult1[5] > checkCardResult2[5]) {
                        return player2Win;
                    } else {
                        return "Tie";
                    }
                }
            }
        }

        // Three of a Kind 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 3) {
            if (checkCardResult1[8] > checkCardResult2[8]) {
                return player1Win;
            } else if (checkCardResult1[8] < checkCardResult2[8]) {
                return player2Win;
            } else {
                if (checkCardResult1[5] > checkCardResult2[5]) {
                    return player1Win;
                } else if (checkCardResult1[5] > checkCardResult2[5]) {
                    return player2Win;
                } else {
                    return "Tie";
                }
            }
        }

        // Straight 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 4) {
            if (checkCardResult1[5] > checkCardResult2[5]) {
                return player1Win;
            } else if (checkCardResult1[5] > checkCardResult2[5]) {
                return player2Win;
            } else {
                return "Tie";
            }
        }

        // Flush 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 5) {
            if (checkCardResult1[5] > checkCardResult2[5]) {
                return player1Win;
            } else if (checkCardResult1[5] > checkCardResult2[5]) {
                return player2Win;
            } else {
                return "Tie";
            }
        }

        // FullHouse 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 6) {
            if (checkCardResult1[8] > checkCardResult2[8]) {
                return player1Win;
            } else if (checkCardResult1[8] < checkCardResult2[8]) {
                return player2Win;
            } else {
                if (checkCardResult1[7] > checkCardResult2[7]) {
                    return player1Win;
                } else if (checkCardResult1[7] < checkCardResult2[7]) {
                    return  player2Win;
                } else {
                    return "Tie";
                }
            }
        }

        // Four of a Kind 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 7) {
            if (checkCardResult1[8] > checkCardResult2[8]) {
                return player1Win;
            } else if (checkCardResult1[8] < checkCardResult2[8]) {
                return player2Win;
            } else {
                if (checkCardResult1[5] > checkCardResult2[5]) {
                    return player1Win;
                } else if (checkCardResult1[5] > checkCardResult2[5]) {
                    return player2Win;
                } else {
                    return "Tie";
                }
            }
        }

        // Straight Flush 비교
        if (finalPlayer1Rank == finalPlayer2Rank && finalPlayer1Rank == 8) {
            if (checkCardResult1[5] > checkCardResult2[5]) {
                return player1Win;
            } else if (checkCardResult1[5] > checkCardResult2[5]) {
                return player2Win;
            } else {
                return "Tie";
            }
        }

        if (finalPlayer1Rank > finalPlayer2Rank) {
            return player1Win;
        } else if (finalPlayer1Rank < finalPlayer2Rank) {
            return player2Win;
        }
        return "Tie";
    }

    public static void main(String[] args) {
        String cards1 = "5H 5C 6S 7S KD 2C 3S 8S 8D TD";
        String cards2 = "5D 8C 9S JS AC 2C 5C 7D 8S QH";
        String cards3 = "2D 9C AS AH AC 3D 6D 7D TD QD";
        String cards4 = "4D 6S 9H QH QC 3D 6D 7H QD QS";
        String cards5 = "3D 6D 7H QD QS 3C 3D 3S 9S 9D";
        System.out.println(solution(cards1) + "\n");
        System.out.println(solution(cards2) + "\n");
        System.out.println(solution(cards3) + "\n");
        System.out.println(solution(cards4) + "\n");
        System.out.println(solution(cards5) + "\n");
    }
}
