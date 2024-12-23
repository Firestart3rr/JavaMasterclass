package Section16_FinalImmutable;

import Section16_FinalImmutable.consumer.specific.ChildClass;
import Section16_FinalImmutable.generic.BaseClass;

public class Main {

    public static void main(String[] args) {

        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("----------------");
        childReferredToAsBase.recommendedMethod();
        System.out.println("----------------");
        child.recommendedMethod();


        System.out.println("----------------");
        parent.recommendedStatic();
        System.out.println("----------------");
        childReferredToAsBase.recommendedStatic();
        System.out.println("----------------");
        child.recommendedStatic();
    }
}
