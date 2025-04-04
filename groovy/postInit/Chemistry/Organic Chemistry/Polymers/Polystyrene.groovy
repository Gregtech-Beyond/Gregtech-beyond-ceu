import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

MIXER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('water')*1000)
    .fluidInputs(fluid('styrene')*1000)
    .fluidOutputs(fluid('styrene_suspension')*2000)
    .EUt(200)
    .duration(400)
    .buildAndRegister()

POLYMERIZATION_TANK_RECIPES.recipeBuilder()
    .fluidInputs(fluid('styrene_suspension')*1000)
    .inputs(metaitem('dustPotassiumPersulfate'))
    .fluidOutputs(fluid('polystyrene_suspension')*1000)
    .EUt(200)
    .duration(400)
    .buildAndRegister()

DRYER_RECIPES.recipeBuilder()
    .fluidInputs(fluid('polystyrene_suspension')*1000)
    .fluidOutputs(fluid('water')*1000)
    .outputs(metaitem('dustPotassiumPersulfate'))
    .fluidOutputs(fluid('polystyrene')*1000)
    .EUt(200)
    .duration(400)
    .buildAndRegister()