package designpattern.lazyload;


/**
 * Created by yangbo on 2017/7/14.
 */

public class Java8Holder {
  /*  public Java8Holder() {
        System.out.println("Java8Holder created");
    }

    private Supplier<Heavy> heavySupplier = new Supplier<Heavy>() {
        @Override
        public Heavy get() {
            return createandcacheHeavy();
        }
    }
    private synchronized  Heavy createandcacheHeavy(){
        class HeavyFactory implements Supplier<Heavy>{
            private final Heavy heavyInstance = new Heavy();

            @Override
            public Heavy get() {
                return heavyInstance;
            }
            if(!HeavyFactory.class .isInstances(Heavy)) {

            }
        }
    }*/
}
