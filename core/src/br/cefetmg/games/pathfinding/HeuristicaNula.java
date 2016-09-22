package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 * Created by matheus on 20/09/16.
 */
public class HeuristicaNula implements Heuristic<TileNode> {
    public float estimate(TileNode n1, TileNode n2) {
        return 0;
    }
}
