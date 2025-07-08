package bridge.example.di;

import bridge.example.di.context.CircleContext;
import bridge.example.di.context.RectangleContext;
import bridge.example.di.factory.CircleFactory;
import bridge.example.di.factory.RectangleFactory;
import bridge.example.di.factory.ShapeFactory;
import bridge.implementation.Drawer;
import bridge.implementation.OpenGLDrawer;
import java.util.HashMap;
import java.util.Map;

class DI {

	public static void main(String[] args) {
		// 런타임에 설정 파일을 통해 결정, 런타임에서 변경되지 않는다고 가정
		Drawer drawer = new OpenGLDrawer();
		Map<String, ShapeFactory> factoryMap = new HashMap<>();
		factoryMap.put("circle", new CircleFactory(drawer));
		factoryMap.put("rectangle", new RectangleFactory(drawer));
		Client client = new Client(factoryMap);

		// 사용자 입력
		client.draw(new CircleContext("circle", 3, 3, 3));
		client.draw(new RectangleContext("rectangle", 1, 1, 2, 2));
	}
}
