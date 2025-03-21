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
DIGESTER_RECIPES = recipemap('digester_recipes')
DISSOLUTION_TANK_RECIPES = recipemap('dissolution_tank_recipes')
SIFTER_RECIPES = recipemap('sifter')
DILUTION_TANK_RECIPES = recipemap('dilution_tank_recipes')
DILUTION_REFRIGERATOR_RECIPES = recipemap('dilution_refrigerator_recipes')
CRYOGENIC_DISTILLATION_PLANT_RECIPES = recipemap('cryogenic_distillation_plant_recipes')

        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMolybdenite')*3)
                .fluidInputs(fluid('oxygen')*8000)
                .outputs(metaitem('dustMolybdenumTrioxide')*4)
                .fluidOutputs(fluid('sulfur_dioxide')*2000)
                .fluidOutputs(fluid('molybdenum_flue')*1000)
                .duration(200)
                .EUt(110)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMolybdenumTrioxide')*4)
                .fluidInputs(fluid('hydrogen')*6000)
                .outputs(metaitem('dustMolybdenum'))
                .fluidOutputs(fluid('water')*3000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPowellite')*6)
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .outputs(metaitem('dustMolybdenumTrioxide')*4)
                .outputs(metaitem('dustCalciumChloride')*3)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustWulfenite')*6)
                .fluidInputs(fluid('hydrochloric_acid')*2000)
                .outputs(metaitem('dustMolybdenumTrioxide')*4)
                .outputs(metaitem('dustLeadChloride')*3)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(480)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('molybdenum_flue')*1000)
                .outputs(metaitem('dustMolybdenumTrioxide'))
                .fluidOutputs(fluid('trace_rhenium_flue')*500)
                .duration(200)
                .EUt(60)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodaAsh')*6)
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidInputs(fluid('trace_rhenium_flue')*1000)
                .fluidInputs(fluid('chlorine')*3000)
                .outputs(metaitem('dustPerrhenicAcid')*6)
                .outputs(metaitem('dustSalt')*6)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .duration(100)
                .EUt(5000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPerrhenicAcid')*6)
                .fluidInputs(fluid('ammonia')*1000)
                .outputs(metaitem('dustAmmoniumPerrhenate')*10)
                .duration(100)
                .EUt(1600)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAmmoniumPerrhenate')*10)
                .fluidInputs(fluid('hydrogen_sulfide')*1000)
                .fluidInputs(fluid('chlorine')*1000)
                .outputs(metaitem('dustRhenium'))
                .outputs(metaitem('dustAmmoniumChloride')*2)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .duration(100)
                .EUt(1600)
                .buildAndRegister();