package jp.maeda.shohei.jumpactiongame;


import com.badlogic.gdx.graphics.Texture;



public class Enemy extends GameObject{

    public static final float ENEMY_WIDTH = 2.0f;
    public static final float ENEMY_HEIGHT = 2.0f;
    public static final float ENEMY_VELOCITY = 2.0f;


    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT);

            velocity.x = ENEMY_VELOCITY;
            velocity.y = ENEMY_VELOCITY;

    }

    public void update(float deltaTime) {

            setX(getX() + velocity.x * deltaTime);
            setY(getY() + velocity.y * deltaTime);

            if (getX() < 0) {
                velocity.x = -velocity.x;
                setX(0);
            }
            if (getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH) {
                velocity.x = -velocity.x;
                setX(GameScreen.WORLD_WIDTH - ENEMY_WIDTH);
            }

            if (getY() < 0) {
                velocity.y = -velocity.y;
                setY(0);
            }
            if (getY() > GameScreen.CAMERA_HEIGHT-ENEMY_HEIGHT) {
                velocity.y = -velocity.y;
                setY(GameScreen.CAMERA_HEIGHT-ENEMY_HEIGHT);
            }
        }
    }

