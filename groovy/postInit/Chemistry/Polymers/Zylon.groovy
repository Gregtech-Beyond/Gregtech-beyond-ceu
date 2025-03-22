import globals.Globals

MIXER_RECIPES = recipemap('mixer')
BLAST_RECIPES = recipemap('electric_blast_furnace')
CHEMICAL_RECIPES = recipemap('chemical_reactor')
LARGE_CHEMICAL_RECIPES = recipemap('large_chemical_reactor')
ELECTROLYZER_RECIPES = recipemap('electrolyzer')
POLYMERIZATION_TANK_RECIPES = recipemap('polymerization_tank_recipes')
CENTRIFUGE_RECIPES = recipemap('centrifuge')


        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ortho_xylene')*1000)
                .inputs(metaitem('dustZeolite'))
                .fluidOutputs(fluid('ortho_xylene_zeolite_mixture')*1000)
                .EUt(480)
                .duration(50)
                .buildAndRegister()

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ortho_xylene_zeolite_mixture')*1000)
                .outputs(metaitem('dustZeolite'))
                .fluidOutputs(fluid('para_xylene')*1000)
                .EUt(480)
                .duration(100)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('para_xylene')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('bromine')*2000)
                .fluidOutputs(fluid('dibromomethylbenzene')*1000)
                .fluidOutputs(fluid('water')*1000)
                .EUt(7680)
                .duration(150)
                .buildAndRegister()

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dibromomethylbenzene')*1000)
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('bromine')*2000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000)
                .fluidOutputs(fluid('hydrogen_peroxide')*1000)
                .outputs(metaitem('dustTerephthalaldehyde')*16)
                .EUt(7680)
                .duration(50)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustGold'))
                .inputs(metaitem('dustPdCCatalyst')*2)
                .outputs(metaitem('dustAuPdCCatalyst')*3)
                .EUt(2000000)
                .duration(60)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidInputs(fluid('propene')*1000)
                .fluidOutputs(fluid('isochloropropane')*1000)
                .EUt(480)
                .duration(110)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethenone')*1000)
                .fluidInputs(fluid('acetic_acid')*1000)
                .fluidOutputs(fluid('acetic_anhydride')*1000)
                .EUt(480)
                .duration(80)
                .buildAndRegister()

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('resorcinol')*1000)
                .fluidInputs(fluid('isochloropropane')*1000)
                .fluidInputs(fluid('acetic_anhydride')*1000)
                .fluidInputs(fluid('nitric_acid')*1000)
                .fluidInputs(fluid('propene')*1000)
                .inputs(metaitem('dustSodiumOxide')* 3)
                .fluidOutputs(fluid('dinitrodipropanyloxybenzene')*1000)
                .fluidOutputs(fluid('acetic_acid')*1000)
                .fluidOutputs(fluid('sodium_acetate')*1000)
                .outputs(metaitem('dustSalt')*2)
                .EUt(7680)
                .duration(50)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder().duration(80).EUt(120)
                .fluidInputs(fluid('sodium_acetate')*1000)
                .outputs(metaitem('dustSodiumHydroxide')* 3)
                .fluidOutputs(fluid('ethenone')*1000)
                .EUt(7680)
                .duration(50)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dinitrodipropanyloxybenzene')*1000)
                .inputs(metaitem('dustTerephthalaldehyde')* 16)
                .notConsumable(metaitem('dustAuPdCCatalyst'))
                .outputs(metaitem('dustPreZylon'))
                .fluidOutputs(fluid('oxygen')*6000)
                .EUt(1966080)
                .duration(50)
                .buildAndRegister()

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPreZylon'))
                .fluidOutputs(fluid('propane')*2000)
                .outputs(metaitem('dustPolymerizationReadyZylon'))
                .EUt(120)
                .duration(16000)
                .blastFurnaceTemp(10000)
                .buildAndRegister()

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolymerizationReadyZylon'))
                .outputs(metaitem('dustZylon'))
                .fluidInputs(fluid('air')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolymerizationReadyZylon'))
                .outputs(metaitem('dustZylon'))
                .fluidInputs(fluid('oxygen')*1000)
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolymerizationReadyZylon'))
                .outputs(metaitem('dustZylon'))
                .notConsumable(metaitem('dustKaminskyCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolymerizationReadyZylon'))
                .outputs(metaitem('dustZylon'))
                .notConsumable(metaitem('dustPhilipsCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        POLYMERIZATION_TANK_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPolymerizationReadyZylon'))
                .outputs(metaitem('dustZylon'))
                .notConsumable(metaitem('dustZieglerNattaCatalyst'))
                .duration(200)
                .EUt(80)
                .buildAndRegister()

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('propene')*1000)
                .fluidInputs(fluid('benzene')*1000)
                .fluidInputs(fluid('oxygen')*3000)
                .fluidOutputs(fluid('acetone')*1000)
                .fluidOutputs(fluid('resorcinol')*1000)
                .fluidOutputs(fluid('hydroquinone')*1000)
                .duration(500)
                .EUt(480)
                .buildAndRegister()