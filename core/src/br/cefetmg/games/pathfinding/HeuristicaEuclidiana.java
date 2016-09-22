package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 * Created by matheus on 20/09/16.
 */
public class HeuristicaEuclidiana implements Heuristic<TileNode> {
    public float estimate(TileNode n1, TileNode n2) {
        return n1.getPosition().dst(n2.getPosition()) / 9;
    }
}