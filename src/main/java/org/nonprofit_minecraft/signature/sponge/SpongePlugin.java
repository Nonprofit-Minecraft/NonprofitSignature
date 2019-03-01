package org.nonprofit_minecraft.signature.sponge;

import org.bstats.sponge.Metrics2;
import org.spongepowered.api.plugin.Plugin;

import com.google.inject.Inject;

@Plugin(id = "nonprofit_signature", name = "NonprofitSignature", version = "1", authors = "NPSCO")
public class SpongePlugin {
    @Inject
    private Metrics2 metrics;
}
