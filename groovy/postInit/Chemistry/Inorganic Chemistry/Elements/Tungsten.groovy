import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        DEHYDRATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTungsticAcid')*7)
                .outputs(metaitem('dustTungstenTrioxide')*4)
                .duration(200)
                .EUt(400)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_peroxide')*1000)
                .inputs(metaitem('dustScheelite')*7)
                .inputs(metaitem('dustSodiumHydroxide')*6)
                .outputs(metaitem('dustCalciumHydroxide')*10)
                .fluidOutputs(fluid('sodium_tungstate')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTungstate')*7)
                .inputs(metaitem('dustSodiumHydroxide')*6)
                .outputs(metaitem('dustLithiumHydroxide')*6)
                .fluidOutputs(fluid('sodium_tungstate')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCalciumChloride')*3)
                .fluidInputs(fluid('water')*2000)
                .fluidInputs(fluid('sodium_tungstate')*1000)
                .fluidOutputs(fluid('salt_water')*2000)
                .outputs(metaitem('dustCalciumTungstate')*6)
                .duration(800)
                .EUt(70)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*2000)
                .outputs(metaitem('dustTungsticAcid')*7)
                .outputs(metaitem('dustCalciumHydroxide')*5)
                .inputs(metaitem('dustCalciumTungstate')*6)
                .duration(800)
                .EUt(70)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustLithiumHydroxide')*3)
                .fluidOutputs(fluid('lithium_hydroxide_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('lithium_hydroxide_solution')*1000)
                .fluidInputs(fluid('hydrofluoric_acid')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustLithiumFluoride')*2)
                .duration(200)
                .EUt(12)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLithiumFluoride')*2)
                .fluidOutputs(fluid('fluorine')*1000)
                .outputs(metaitem('dustLithium')*1)
                .duration(70)
                .EUt(12)
                .buildAndRegister()

        OXIDATION_FURNACE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTungstenTrioxide')*4)
                .outputs(metaitem('dustTungsten')*1)
                .fluidOutputs(fluid('oxygen')*3000)
                .duration(200)
                .EUt(80)
                .buildAndRegister()


// Tungstic Acid Dust * 7
mods.gregtech.chemical_bath.removeByInput(960, [metaitem('dustTungstate') * 7], [fluid('hydrochloric_acid') * 2000 * 2000])

// Tungsten Dust * 1
mods.gregtech.electrolyzer.removeByInput(960, [metaitem('dustTungsticAcid') * 7], null)
// Tungstic Acid Dust * 7
mods.gregtech.chemical_bath.removeByInput(960, [metaitem('dustScheelite') * 6], [fluid('hydrochloric_acid') * 2000 * 2000])
