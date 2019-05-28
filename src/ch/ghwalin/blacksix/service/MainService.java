package ch.ghwalin.blacksix.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * defines base URI und all provider classes
 * <p>
 * Black Six
 *
 * @author Marcel Suter
 * @version 0.1
 * @since 2019-03-04
 */
@ApplicationPath("/resource")

public class MainService extends Application {
    /**
     * define all provider classes
     *
     * @return set of classes
     */
    @Override
    public Set<Class<?>> getClasses() {
        HashSet providers = new HashSet<Class<?>>();
        providers.add(PersonService.class);
        return providers;
    }}
