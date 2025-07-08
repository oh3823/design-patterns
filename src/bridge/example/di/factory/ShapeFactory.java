package bridge.example.di.factory;

import bridge.abstraction.Shape;
import bridge.example.di.context.Context;

public interface ShapeFactory {

	Shape create(Context context);
}
