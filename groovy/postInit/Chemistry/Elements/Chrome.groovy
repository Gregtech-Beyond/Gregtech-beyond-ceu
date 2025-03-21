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

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_carbonate_solution')*4000)
                .fluidInputs(fluid('oxygen')*2000)
                .inputs(metaitem('dustChromite')* 7)
                .fluidOutputs(fluid('carbon_dioxide')*4000)
                .fluidOutputs(fluid('sodium_chromate_solution')*4000)
                .outputs(metaitem('dustBandedIron')* 5)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustSodaAsh')* 5)
                .fluidOutputs(fluid('sodium_carbonate_solution')*1000)
                .duration(299)
                .EUt(500)
                .buildAndRegister()

        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('sodium_chromate_solution')*2000)
                .outputs(metaitem('dustSodiumSulfate')* 7)
                .fluidOutputs(fluid('sodium_dichromate_solution')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sodium_dichromate_solution')*1000)
                .outputs(metaitem('dustSodiumDichromate')* 11)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(190)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumDichromate')* 5)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustChromiumTrioxide')* 3)
                .fluidOutputs(fluid('soda_ash_solution')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('soda_ash_solution')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustSodaAsh')* 3)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustSodaAsh')* 3)
                .fluidOutputs(fluid('soda_ash_solution')*1000)
                .duration(400)
                .EUt(280)
                .buildAndRegister()

        BURNER_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustChromiumTrioxide')* 5)
                .inputs(metaitem('dustAluminium')* 2)
                .outputs(metaitem('dustAlumina')* 5)
                .outputs(metaitem('dustChrome')* 2)
                .duration(200)
                .EUt(180)
                .buildAndRegister()

