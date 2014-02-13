package com.tinkerpop.tinkergraph.process.steps.sideEffect;

import com.tinkerpop.gremlin.process.steps.ComplianceTest;
import com.tinkerpop.gremlin.structure.Graph;
import com.tinkerpop.tinkergraph.TinkerFactory;
import org.junit.Test;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class AggregateTest extends com.tinkerpop.gremlin.process.steps.sideEffect.AggregateTest {

    Graph g = TinkerFactory.createClassic();

    @Test
    public void testCompliance() {
        ComplianceTest.testCompliance(this.getClass());
    }

    @Test
    public void g_v1_aggregateXaX_outXcreatedX_inXcreatedX_exceptXaX() {
        //  super.g_v1_aggregateXaX_outXcreatedX_inXcreatedX_exceptXaX(
        //          GremlinJ.of(g).with("x", new HashSet<>())
        //                 .v(1).aggregate("x").out("created").in("created").except("x"));
    }

    @Test
    public void g_V_valueXnameX_aggregateXaX_iterate_getXaX() {
        super.g_V_valueXnameX_aggregateXaX_iterate_getXaX(g.V().value("name").aggregate("x").iterate().memory().get("x"));
    }

    @Test
    public void g_V_aggregateXa_nameX_iterate_getXaX() {
        super.g_V_aggregateXa_nameX_iterate_getXaX(g.V().aggregate("a", v -> v.getValue("name")).iterate().memory().get("a"));
    }
}