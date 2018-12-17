package ruget.reproducer.typearg;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Launcher;

public class MainVerticle extends AbstractVerticle {

	public static void main(String[] args) {
		Launcher.executeCommand("run", MainVerticle.class.getName());
	}

	@Override
	public void start() {
		vertx.deployVerticle(TestVerticle.class.getName());
	}
}
