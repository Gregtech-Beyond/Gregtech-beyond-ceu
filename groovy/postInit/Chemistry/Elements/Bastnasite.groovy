import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;


        ROASTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBastnasite'))
                .inputs(metaitem('dustCalcite'))
                .outputs(metaitem('dustCalcinatedBastnasite')* 2)
                .duration(290)
                .EUt(70)
                .buildAndRegister()

        DIGESTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nitric_acid')*1000)
                .inputs(metaitem('dustCalcinatedBastnasite'))
                .outputs(metaitem('dustCalcinatedSiliconDioxide'))
                .fluidOutputs(fluid('muddy_bastnasite_solution')*1000)
                .duration(800)
                .EUt(700)
                .buildAndRegister()

        CENTRIFUGE_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCalcinatedSiliconDioxide'))
                .outputs(metaitem('dustSiliconDioxide'))
                .outputs(metaitem('dustCalcinatedResidues'))
                .duration(500)
                .EUt(600)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*1000)
                .inputs(metaitem('dustCalcinatedResidues'))
                .fluidOutputs(fluid('calcinated_residues')*1000)
                .duration(800)
                .EUt(670)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('calcinated_residues')*1000)
                .outputs(metaitem('dustCalciumDioxide')* 2)
                .fluidOutputs(fluid('muddy_water')*1000)
                .duration(200)
                .EUt(60)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCalciumDioxide')* 2)
                .notConsumable(metaitem('dustDeoxygenationCatalyst'))
                .outputs(metaitem('dustCalcite'))
                .EUt(900)
                .duration(600)
                .buildAndRegister()

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('muddy_bastnasite_solution')*1000)
                .inputs(metaitem('dustSodiumHydroxide')* 3)
                .fluidOutputs(fluid('conditioned_bastnasite_mud')*1432)
                .duration(400)
                .EUt(80)
                .buildAndRegister()

        DISSOLUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*4000)
                .fluidInputs(fluid('conditioned_bastnasite_mud')*1432)
                .fluidOutputs(fluid('diluted_bastnasite_mud')*5000)
                .duration(200)
                .EUt(900)
                .buildAndRegister()

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_bastnasite_mud')*5000)
                .fluidOutputs(fluid('filtered_bastnasite_mud')*1000)
                .chancedOutput(metaitem('dustIlmenite')*1, 7500, 60)
                .chancedOutput(metaitem('dustRutile')*1, 3200, 80)
                .chancedOutput(metaitem('dustSiliconDioxide')*1, 6000, 80)
                .duration(800)
                .EUt(912)
                .buildAndRegister()

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('filtered_bastnasite_mud')*1000)
                .circuitMeta(1)
                .outputs(metaitem('dustBastnasiteOxideComposite'))
                .duration(800)
                .EUt(90)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .inputs(metaitem('dustBastnasiteOxideComposite'))
                .inputs(metaitem('dustSodiumHydroxide')* 3)
                .fluidOutputs(fluid('bastnasite_concentrate')*1000)
                .duration(200)
                .EUt(600)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bastnasite_concentrate')*1000)
                .fluidInputs(fluid('nitric_acid')*1000)
                .fluidOutputs(fluid('nitrogen_dioxide')*1000)
                .fluidOutputs(fluid('acidic_bastnasite_concentrate')*1000)
                .duration(190)
                .EUt(2090)
                .buildAndRegister()

        DILUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acidic_bastnasite_concentrate')*1000)
                .fluidInputs(fluid('fluorine')*1000)
                .fluidOutputs(fluid('hydrofluoric_acid')*1000)
                .fluidOutputs(fluid('cerium_rich_bastnasite_concentrate')*1000)
                .duration(900)
                .EUt(1009)
                .buildAndRegister()

        ELECTROLYTIC_CELL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('stickIridium'))
                .notConsumable(metaitem('stickStainlessSteel'))
                .fluidInputs(fluid('cerium_rich_bastnasite_concentrate')*1000)
                .fluidOutputs(fluid('acidic_cerium_based_mud')*400)
                .fluidOutputs(fluid('bastnasite_rarer_earth_oxides_mixture')*600)
                .outputs(metaitem('dustSodiumNitride')* 9)
                .duration(200)
                .EUt(8000)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acidic_cerium_based_mud')*1000)
                .fluidInputs(fluid('potassium_hydroxide')*432)
                .outputs(metaitem('dustPotassium')* 2)
                .fluidOutputs(fluid('cerium_solution')*1000)
                .duration(200)
                .EUt(800)
                .buildAndRegister()

        DILUTION_TANK_RECIPES.recipeBuilder()
                .fluidInputs(fluid('cerium_solution')*1000)
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidOutputs(fluid('diluted_cerium_solution')*2000)
                .EUt(500)
                .duration(800)
                .buildAndRegister()

        SIFTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_cerium_solution')*1000)
                .outputs(metaitem('dustCeriumOxide')* 2)
                .fluidOutputs(fluid('water')*1000)
                .duration(1000)
                .EUt(900)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCeriumOxide')* 3)
                .outputs(metaitem('dustCerium'))
                .fluidOutputs(fluid('oxygen')*2000)
                .duration(1200)
                .EUt(70)
                .buildAndRegister()

        DRYER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bastnasite_rarer_earth_oxides_mixture')*1000)
                .outputs(metaitem('dustDriedBastnasiteRarerEarthOxidesPulp'))
                .outputs(metaitem('dustBastnasiteByproducts'))
                .duration(200)
                .EUt(90)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('distilled_water')*1000)
                .inputs(metaitem('dustDriedBastnasiteRarerEarthOxidesPulp'))
                .fluidOutputs(fluid('bastnasite_rarer_earth_oxides_emulsion')*1000)
                .duration(890)
                .EUt(200)
                .buildAndRegister()

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumHydroxide')* 3)
                .fluidInputs(fluid('bastnasite_rarer_earth_oxides_emulsion')*1000)
                .fluidOutputs(fluid('bastnasite_rarer_earth_oxides_solution')*1000)
                .outputs(metaitem('dustSalt')* 3)
                .EUt(900)
                .duration(280)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bastnasite_rarer_earth_oxides_solution')*1000)
                .fluidInputs(fluid('water')*1000)
                .outputs(metaitem('dustSamaricRareEarthConcentrate')* 2)
                .fluidOutputs(fluid('samarium_reduced_rarer_earth_oxides')*1000)
                .duration(800)
                .EUt(1890)
                .buildAndRegister()

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('samarium_reduced_rarer_earth_oxides')*1000)
                .notConsumable(metaitem('dustHydrogenationCatalyst'))
                .outputs(metaitem('dustNeodymiumRareEarthConcentrate')* 2)
                .fluidOutputs(fluid('hydrogen_chloride')*2000)
                .duration(890)
                .EUt(600)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNeodymiumRareEarthConcentrate')* 2)
                .fluidInputs(fluid('aqua_regia')*1000)
                .fluidOutputs(fluid('diluted_aqua_regia')*2000)
                .outputs(metaitem('dustNeodymiumOxide'))
                .outputs(metaitem('dustLanthanumOxide'))
                .duration(800)
                .EUt(700)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('diluted_aqua_regia')*2000)
                .fluidOutputs(fluid('aqua_regia')*1000)
                .fluidOutputs(fluid('water')*1000)
                .duration(200)
                .EUt(129)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSamariumRareEarthConcentrate')* 2)
                .fluidInputs(fluid('aqua_regia')*1000)
                .fluidOutputs(fluid('diluted_aqua_regia')*2000)
                .outputs(metaitem('dustSamariumOxide'))
                .outputs(metaitem('dustHolmiumOxide'))
                .duration(800)
                .EUt(700)
                .buildAndRegister()

        ROASTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrofluoric_acid')*1000)
                .inputs(metaitem('dustHolmiumOxide'))
                .outputs(metaitem('dustHolmiumFluoride'))
                .EUt(280)
                .duration(900)
                .buildAndRegister()

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustHolmiumFluoride')* 2)
                .inputs(metaitem('dustCalcium'))
                .outputs(metaitem('dustHolmium'))
                .outputs(metaitem('dustCalciumFluoride'))
                .EUt(800)
                .blastFurnaceTemp(1800)
                .duration(80)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCalciumFluoride')* 3)
                .outputs(metaitem('dustCalcium'))
                .fluidOutputs(fluid('fluorine')*2000)
                .duration(180)
                .EUt(90)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSamariumOxide')* 3)
                .outputs(metaitem('dustSamarium'))
                .fluidOutputs(fluid('oxygen')*2000)
                .duration(180)
                .EUt(90)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustLanthanumOxide')* 3)
                .outputs(metaitem('dustLanthanum'))
                .fluidOutputs(fluid('oxygen')*2000)
                .duration(180)
                .EUt(90)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNeodymiumOxide')* 3)
                .outputs(metaitem('dustNeodymium'))
                .fluidOutputs(fluid('oxygen')*2000)
                .duration(180)
                .EUt(90)
                .buildAndRegister()

// Cerium Dust * 1
mods.gregtech.electrolyzer.removeByInput(60, [metaitem('dustBastnasite') * 6], null)
