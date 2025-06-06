import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diaminobenzidine')*1000)
                .fluidInputs(fluid('diphenyl_isophthalate') * 1000)
                .outputs(metaitem('dustPolybenzimidazolePrePolymerFoam')*1)
                .duration(120)
                .EUt(800)
                .buildAndRegister();

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolybenzimidazolePrePolymerFoam')* 1)
                .fluidOutputs(fluid('impure_polybenzimidazole_solution')*1000)
                .duration(700)
                .EUt(2008)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('impure_polybenzimidazole_solution')*7000)
                .fluidOutputs(fluid('polybenzimidazole_waste')*3000)
                .fluidOutputs(fluid('polybenzimidazole_solution')*4000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polybenzimidazole_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustPolybenzimidazole')* 7)
                .duration(120)
                .EUt(700)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('polybenzimidazole_waste')*3000)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('toluene')*1000)
                .fluidOutputs(fluid('phenol')*1000)
                .duration(120)
                .EUt(700)
                .buildAndRegister();

// Phenol * 1000
mods.gregtech.chemical_reactor.removeByInput(7680, null, [fluid('diaminobenzidine') * 1000 * 1000, fluid('diphenyl_isophthalate') * 1000 * 1000])
