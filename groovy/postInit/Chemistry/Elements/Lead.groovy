import globals.Globals


ROASTER_RECIPES = recipemap('roaster_recipes')
BLAST_RECIPES = recipemap('electric_blast_furnace')
CRYSTALLIZATION_RECIPES = recipemap('crystallization_recipes')
EXTRACTOR_RECIPES = recipemap('extractor')
CHEMICAL_BATH_RECIPES = recipemap('chemical_bath')
MIXER_RECIPES = recipemap('mixer')
CENTRIFUGE_RECIPES = recipemap('centrifuge')
VACUUM_RECIPES = recipemap('vacuum_freezer')
CHEMICAL_RECIPES = recipemap('chemical_reactor')
DEHYDRATOR_RECIPES = recipemap('dehydrator_recipes')
BURNER_REACTOR_RECIPES = recipemap('burner_reactor_recipes')
HIGH_TEMP_DISTILLATION_RECIPES = recipemap('high_temp_distillation_recipes')

        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGalena'))
                .fluidOutputs(fluid('molten_galena')*144)
                .duration(200)
                .EUt(8)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('molten_galena')*144)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidOutputs(fluid('molten_oxidized_galena')*144)
                .duration(208)
                .EUt(70)
                .buildAndRegister()

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('molten_oxidized_galena')*144)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .fluidOutputs(fluid('desulfurized_molten_galena')*144)
                .duration(200)
                .EUt(90)
                .buildAndRegister()

        HIGH_TEMP_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('desulfurized_molten_galena')*144)
                .fluidOutputs(fluid('lead')*144)
                .fluidOutputs(fluid('silver')*14)
                .duration(200)
                .EUt(70)
                .buildAndRegister()