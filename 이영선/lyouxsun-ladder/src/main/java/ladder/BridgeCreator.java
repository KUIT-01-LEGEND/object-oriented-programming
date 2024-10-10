package ladder;

import java.util.Random;

public class BridgeCreator {
    public static void drawLine(Ladder ladder){
        int bridgeNum = ladder.getBridgeNum();
        Random random = new Random();
        while (bridgeNum > 0){
            int y = random.nextInt(ladder.getRow().getNum());
            int x = random.nextInt(ladder.getNumberOfPerson().getNum());


            if (ladder.validBridge(y, x)){
                ladder.drawLine(y, x);          // ladder에서 getRow를 해서 row에게 바로 drawLine을 요청하는게 좋을까?
                                                // 아니면 지금처럼 ladder에서 drawLine을 하면 ladder가 row에게 drawLine을 요청하도록 하는게 좋을까?
                bridgeNum--;
            }

        }
        ladder.print();
    }


}
