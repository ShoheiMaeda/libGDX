package jp.maeda.shohei.jumpactiongame;


import com.badlogic.gdx.graphics.Texture;



public class Enemy extends GameObject{

    public static final float ENEMY_WIDTH = 2.0f;
    public static final float ENEMY_HEIGHT = 2.0f;
    public static final int ENEMY_TYPE_MOVING = 1;
    public static final float ENEMY_VELOCITY = 2.0f;


    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);

            velocity.x = ENEMY_VELOCITY;
            velocity.y = ENEMY_VELOCITY;

    }

    public void update(float deltaTime) {

            setX(getX() + velocity.x * deltaTime);
            setX(getY() + velocity.y * deltaTime);

            if (getX() < ENEMY_WIDTH / 2) {
                velocity.x = -velocity.x;
                setX(ENEMY_WIDTH / 2);
            }
            if (getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2) {
                velocity.x = -velocity.x;
                setX(GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2);
            }

            if (getY() < ENEMY_WIDTH / 2) {
                velocity.y = -velocity.y;
                setY(ENEMY_WIDTH / 2);
            }
            if (getY() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2) {
                velocity.y = -velocity.y;
                setY(GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2);
            }
        }
    }

