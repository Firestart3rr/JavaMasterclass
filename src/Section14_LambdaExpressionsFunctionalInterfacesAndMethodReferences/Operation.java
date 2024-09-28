package Section14_LambdaExpressionsFunctionalInterfacesAndMethodReferences;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
