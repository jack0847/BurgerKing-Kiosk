package kiosk;
//생각정리
// 메뉴, 가격 받는 class
// 장바구니에 저장하는 class
// 장바구니에 뭐가 있는지 확인하는 class
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("=====홈=====\n");

            System.out.println("1. 햄버거");
            System.out.println("2. 사이드");
            System.out.println("3. 음료");
            System.out.println("4. 장바구니");
            System.out.println("5. 종료\n");

            System.out.println("메뉴선택: ");

            int homeChoice = input.nextInt();

            if (homeChoice == 1) {
                System.out.println("=====햄버거 메뉴=====\n");

                System.out.println("1. 와퍼 (6900원)");
                System.out.println("2. 큐브 스테이크 와퍼 (8900원)");
                System.out.println("3. 콰트로 치즈 와퍼 (7900원)");
                System.out.println("4. 몬스터 와파 (9300원)");
                System.out.println("5. 통새우 와퍼 (7900원)");
                System.out.println("6. 블랙바베큐 와퍼 (9300원)\n");

                System.out.println("(0을 선택 시 홈으로): ");

                int foodChoice = input.nextInt();

                if (foodChoice == 1) {
                    cart.addItem(new Menu("와퍼", 6900));
                } else if (foodChoice == 2) {
                    cart.addItem(new Menu("큐브 스테이크 와퍼", 8900));
                } else if (foodChoice == 3) {
                    cart.addItem(new Menu("콰트로 치즈 와퍼", 7900));
                } else if (foodChoice == 4) {
                    cart.addItem(new Menu("몬스터 와퍼", 9300));
                } else if (foodChoice == 5) {
                    cart.addItem(new Menu("통새우 와퍼", 7900));
                } else if (foodChoice == 6) {
                    cart.addItem(new Menu("블랙바베큐 와퍼", 9300));
                } else if (foodChoice == 0) {
                    continue;
                } else {
                    throw new IllegalArgumentException("선택지에 없는 번호입니다.");
                }


            } else if (homeChoice == 2) {
                System.out.println("=====사이드 메뉴=====\n");

                System.out.println("1. 너겟킹 (2500원)");
                System.out.println("2. 해쉬 브라운 (1800원)");
                System.out.println("3. 치즈스틱 (1200원)");
                System.out.println("4. 어니언링 (2400원)");
                System.out.println("5. 바삭킹 (3000원)");
                System.out.println("6. 감자튀김 (2000원)\n");

                System.out.println("(0을 선택 시 홈으로): ");

                int drinkChoice = input.nextInt();

                if (drinkChoice == 1) {
                    cart.addItem(new Menu("너겟킹", 2500));
                } else if (drinkChoice == 2) {
                    cart.addItem(new Menu("해쉬 브라운", 1800));
                } else if (drinkChoice == 3) {
                    cart.addItem(new Menu("치즈스틱", 1200));
                } else if (drinkChoice == 4) {
                    cart.addItem(new Menu("어니언링", 2400));
                } else if (drinkChoice == 5) {
                    cart.addItem(new Menu("바삭킹", 3000));
                } else if (drinkChoice == 6) {
                    cart.addItem(new Menu("감자튀김", 2000));
                } else if (drinkChoice == 0) {
                    continue;
                } else {
                    throw new IllegalArgumentException("선택지에 없는 번호입니다.");
                }

            } else if (homeChoice == 3) {
                System.out.println("=====음료 메뉴=====\n");

                System.out.println("1. 코카콜라 (2000원)");
                System.out.println("2. 코카콜라 제로 (2000원)");
                System.out.println("3. 펩시 (2000원)");
                System.out.println("4. 펩시 제로 (2000원)");
                System.out.println("5. 스프라이트 (2000원)");
                System.out.println("6. 스프라이트 제로 (2000원)\n");

                System.out.println("(0을 선택 시 홈으로): ");

                int drinkChoice = input.nextInt();

                if (drinkChoice == 1) {
                    cart.addItem(new Menu("코카콜라", 2000));
                } else if (drinkChoice == 2) {
                    cart.addItem(new Menu("코카콜라 제로", 2000));
                } else if (drinkChoice == 3) {
                    cart.addItem(new Menu("펩시", 2000));
                } else if (drinkChoice == 4) {
                    cart.addItem(new Menu("펩시 제로", 2000));
                } else if (drinkChoice == 5) {
                    cart.addItem(new Menu("스프라이트", 2000));
                } else if (drinkChoice == 6) {
                    cart.addItem(new Menu("스프라이트 제로", 2000));
                } else if (drinkChoice == 0) {
                    continue;
                } else {
                    throw new IllegalArgumentException("선택지에 없는 번호입니다.");
                }


            } else if (homeChoice == 4) {
                System.out.println("===== 장바구니 =====");

                for (int i = 0; i < cart.getItems().size(); i++) {
                    System.out.println("- " + cart.getItems().get(i).getMenu().getName()+" "+ cart.getItems().get(i).getCount() + "개");
                }
                System.out.println("====================");
                System.out.println("1. 주문하기");
                System.out.println("2. 수량 조절하기");
                System.out.println("3. 삭제하기\n");

                int totalSum=0;
                for(CartItem item:cart.getItems()){
                    totalSum+=item.totalPrice();
                }
                System.out.println("총 가격: " +totalSum+ "원\n");

                System.out.println("(0을 선택 시 홈으로): ");
                int cartChange = input.nextInt();

                if (cartChange == 1) {
                    System.out.println("주문이 완료되었습니다. 앱을 종료합니다.");
                    System.exit(0);
                } else if (cartChange == 2) {
                    System.out.println("===== 수량 조절하기 =====\n");
                    System.out.println("현재 장바구니\n");

                    for (int i = 0; i < cart.getItems().size(); i++) {
                        System.out.println((i + 1) + ". " + cart.getItems().get(i).getMenu().getName()+" " + cart.getItems().get(i).getCount() + "개");
                    }
                    System.out.println("\n수량을 조절할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): \n");
                    int cartNumber = input.nextInt();
                    cartNumber = cartNumber - 1;

                    if (cartNumber == -1) {
                        continue;
                    }

                    System.out.println("변경할 수량을 입력하세요: ");
                    int countChange = input.nextInt();
                    if (countChange < 1 || countChange > 50) {
                        throw new IllegalArgumentException("잘못된 입력입니다. 수량은 1~50 사이여야 합니다.");
                    } else {
                        cart.getItems().get(cartNumber).setCount(countChange);
                        System.out.println("수정이 완료되었습니다.");
                    }
                } else if (cartChange == 3) {
                    System.out.println("===== 삭제하기 =====\n");
                    System.out.println("현재 장바구니\n");
                    for (int i = 0; i < cart.getItems().size(); i++) {
                        System.out.println((i + 1) + ". " + cart.getItems().get(i).getMenu().getName() + cart.getItems().get(i).getCount() + "개");
                    }
                    System.out.println("\n삭제할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로):\n");
                    int delMenu = input.nextInt();
                    if (delMenu == 0)
                        continue;

                    System.out.println("정말 삭제 하시겠습니까? (0: 취소 및 홈으로 1: 삭제):");
                    int realDel = input.nextInt();
                    if (realDel == 1) {
                        cart.getItems().remove(delMenu-1);
                        System.out.println("삭제되었습니다.");
                    } else {
                        continue;
                    }
                }

            } else if (homeChoice == 5) {
                System.exit(0);
            } else{
                throw new IllegalArgumentException("1~5 숫자만 입력 가능합니다.");
            }
        }
    }
}