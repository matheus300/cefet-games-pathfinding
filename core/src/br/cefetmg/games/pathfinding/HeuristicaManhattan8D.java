package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 * Created by matheus on 20/09/16.
 */
public class HeuristicaManhattan8D implements Heuristic<TileNode> {
    public float estimate(TileNode n1, TileNode n2) {
        float dx = Math.abs(n1.getPosition().x - n2.getPosition().x);
        float dy = Math.abs(n1.getPosition().y - n2.getPosition().y);
        return (float) (((dx + dy) + (Math.sqrt(2) - 2) * Math.min(dx, dy)) / 9);
    }
}