package mvc.mvc;

public interface HandlerMapping {
    Object findHandler(HandlerKey handlerKey);
}