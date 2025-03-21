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
DISTILLATION_RECIPES = recipemap('distillation_tower')
ELECTROLYTIC_CELL_RECIPES = recipemap('electrolytic_cell_recipes')
OXIDATION_FURNACE_RECIPES = recipemap('oxidation_furnace_recipes')


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