public interface WidgetFactory {
    public ScrollBar CreateScrollBar();
    public Window CreateWindow();
}

class MotifWidgetFactory implements WidgetFactory{

    @Override
    public ScrollBar CreateScrollBar() {

        return new MotifScrollBar();
    }

    @Override
    public Window CreateWindow() {

        return new MotifWindow();
    }
}
class PMWidgetFactory implements WidgetFactory{

    @Override
    public ScrollBar CreateScrollBar() {

        return new PMScrollBar();
    }

    @Override
    public Window CreateWindow() {

        return new PMWindow();
    }
}
interface Window{
    void win();
}

class PMWindow implements Window{

    @Override
    public void win() {
        System.out.println("PM window");
    }
}
class MotifWindow implements Window{

    @Override
    public void win() {
        System.out.println("MotifWindow");
    }
}
interface ScrollBar{
    void scroll();
}
class PMScrollBar implements ScrollBar{

    @Override
    public void scroll() {
        System.out.println("PM scroll bar");
    }
}
class MotifScrollBar implements ScrollBar{

    @Override
    public void scroll() {
        System.out.println("Motif Scroll Bar");
    }
}

class App {
    private ScrollBar scrollBar;
    private Window window;

    public App(PMWidgetFactory factory) {
        scrollBar = factory.CreateScrollBar();
        window = factory.CreateWindow();
    }

    public void paint() {
        window.win();
        scrollBar.scroll();
    }
}
