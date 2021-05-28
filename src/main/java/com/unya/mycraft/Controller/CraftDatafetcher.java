package com.unya.mycraft.Controller;

import java.util.List;
import java.util.stream.Collectors;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.unya.mycraft.entity.Craft;

@DgsComponent
public class CraftDatafetcher {

    private final List<Craft> crafts = List.of(new Craft(null, "Housegirl"),
            new Craft(null, "Mason"),
            new Craft(null, "Carpenter"),
            new Craft(null, "Electrician"),
            new Craft(null, "Plumber"),
            new Craft(null, "Gardener"),
            new Craft(null, "Landscapper"),
            new Craft(null, "Plumber")
     );

    @DgsQuery
    public List<Craft> crafts(@InputArgument String titleFilter) {
        if(titleFilter == null) {
            return crafts;
        }
        return crafts.stream().filter(c -> c.getCraftName().contains(titleFilter)).collect(Collectors.toList());
    }
}
