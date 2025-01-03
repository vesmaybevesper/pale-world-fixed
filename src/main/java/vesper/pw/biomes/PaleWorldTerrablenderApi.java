package vesper.pw.biomes;

import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;
import vesper.pw.biomes.surface.PaleWorldMaterialRules;
import net.minecraft.util.Identifier;

import static vesper.pw.PaleWorld.MOD_ID;

public class PaleWorldTerrablenderApi implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized(){
        Regions.register(new PaleWorldRegion(Identifier.of(MOD_ID, "overworld"), 3));


        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, PaleWorldMaterialRules.makeRules());
    }
}
