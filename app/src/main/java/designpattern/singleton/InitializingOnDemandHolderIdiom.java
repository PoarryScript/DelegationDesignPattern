package designpattern.singleton;

/**
 * Created by yangbo on 2017/7/14.
 */

public final class InitializingOnDemandHolderIdiom {
    private InitializingOnDemandHolderIdiom() {
    }

    public static InitializingOnDemandHolderIdiom getInstance() {
        return helperHolder.INSTANCE;
    }

    private static class helperHolder {
        private static final InitializingOnDemandHolderIdiom INSTANCE = new InitializingOnDemandHolderIdiom();
    }
}
