package control;

import model.Enemic;
import model.Projectil;

import java.util.List;

public class CollisionManager {

    public static void checkCollisions(List<Enemic> enemics, List<Projectil> projectils) {

        for (int i = 0; i < enemics.size(); i++) {

            Enemic e = enemics.get(i);

            for (int j = 0; j < projectils.size(); j++) {

                Projectil p = projectils.get(j);

                if (Math.abs(e.getX() - p.getX()) < 20 &&
                        Math.abs(e.getY() - p.getY()) < 20) {

                    enemics.remove(i);
                    projectils.remove(j);

                    return;
                }
            }
        }
    }
}