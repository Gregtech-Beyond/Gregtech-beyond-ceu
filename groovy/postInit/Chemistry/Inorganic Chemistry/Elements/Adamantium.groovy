import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        BEDROCK_PUMP_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('bedrock_contaminated_oil')*12)
                .duration(9000)
                .EUt(7000)
                .circuitMeta(1)
                .buildAndRegister()

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bedrock_contaminated_oil')*1000)
                .fluidOutputs(fluid('oil_heavy')*400)
                .outputs(metaitem('dustWetBedrockDust'))
                .outputs(metaitem('dustGrainsOfInfinity'))
                .outputs(metaitem('dustStone'))
                .outputs(metaitem('dustBasalticMineralSand'))
                .duration(401)
                .EUt(700)
                .buildAndRegister()

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('phosphorus_pentoxide')*1000)
                .fluidOutputs(fluid('phosphoric_acid')*1000)
                .inputs(metaitem('dustWetBedrockDust'))
                .outputs(metaitem('dustOilyBedrockDust'))
                .duration(700)
                .EUt(80)
                .buildAndRegister()

        FROTH_FLOTATION_UNIT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*16000)
                .fluidInputs(fluid('perfluorotributylamine')*100)
                .notConsumable(metaitem('dustSodiumIsobutylXanthate'))
                .inputs(metaitem('dustSalt'))
                .inputs(metaitem('dustOilyBedrockDust'))
                .fluidOutputs(fluid('bedrock_slurry')*1000)
                .duration(1200)
                .EUt(7800)
                .buildAndRegister()

        CLARIFIER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('bedrock_slurry')*1000)
                .fluidOutputs(fluid('purified_bedrock_slurry')*900)
                .fluidOutputs(fluid('waste_water')*100)
                .duration(100)
                .EUt(700)
                .buildAndRegister()

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('purified_bedrock_slurry')*1000)
                .fluidOutputs(fluid('adamantane_rich_oil_solution') *400)
                .outputs(metaitem('dustDiamond'))
                .outputs(metaitem('dustOilsands')*2)
                .outputs(metaitem('dustFineBedrockDust'))
                .duration(1200)
                .EUt(120)
                .buildAndRegister()

        VACUUM_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ozone')*1000)
                .fluidOutputs(fluid('liquid_ozone')*1000)
                .duration(100)
                .EUt(2000)
                .buildAndRegister()

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFineBedrockDust'))
                .fluidInputs(fluid('liquid_ozone')*1000)
                .outputs(metaitem('dustAdamantite'))
                .blastFurnaceTemp(1900)
                .EUt(7000)
                .duration(120)
                .buildAndRegister()

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('aqua_regia')*1000)
                .inputs(metaitem('dustAdamantite')* 2)
                .outputs(metaitem('dustEnrichedNaquadahNitrate') * 2)
                .outputs(metaitem('dustNaquadriaNitrate')* 2)
                .outputs(metaitem('dustAdamantiumPentoxide'))
                .fluidOutputs(fluid('trinium_solution')*1000)
                .duration(1200)
                .EUt(7800)
                .buildAndRegister()


// Liquid Adamantium Pentoxide * 144
mods.gregtech.extractor.removeByInput(30, [metaitem('dustAdamantiumPentoxide')], null)


        EXTRACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustAdamantiumPentoxide'))
                .fluidOutputs(fluid('adamantium_pentoxide')*1000)
                .duration(900)
                .EUt(120)
                .buildAndRegister()

        FUSION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('adamantium_pentoxide')*12)
                .fluidInputs(fluid('hydrogen')*12)
                .fluidOutputs(fluid('plasma.adamantium_phosphorus_hydrogen_plasma')*12)
                .EUToStart(320000000)
                .EUt(200000)
                .duration(70)
                .buildAndRegister()

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustDarmstadtiumCatalyst'))
                .inputs(metaitem('dustTungsten')* 2)
                .outputs(metaitem('dustTungstenTrioxide')* 6)
                .outputs(metaitem('dustAdamantium')* 2)
                .inputs(metaitem('laser_assembly'))
                .fluidInputs(fluid('gaseous_adamantane')*400)
                .fluidInputs(fluid('adamantium_pentoxide')*1000)
                .duration(9000)
                .EUt(400)
                .buildAndRegister()

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('water')*2000)
                .fluidInputs(fluid('fluorine')*1000)
                .fluidInputs(fluid('antimony_pentafluoride')*1000)
                .inputs(metaitem('dustTriphenylphosphine'))
                .fluidOutputs(fluid('fluorodarmstadtic_acid')*1000)
                .duration(210)
                .EUt(800)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('fluorine')*2000)
                .inputs(metaitem('dustAntimonyTrifluoride')* 4)
                .fluidOutputs(fluid('antimony_pentafluoride')*1000)
                .EUt(120)
                .duration(120)
                .buildAndRegister()

        CHEMICAL_PLANT_RECIPES.recipeBuilder()
                .fluidInputs(fluid('plasma.adamantium_phosphorus_hydrogen_plasma')*1000)
                .outputs(metaitem('dustPhosphorus'))
                .outputs(metaitem('dustAdamantiumPentoxide')* 2)
                .fluidOutputs(fluid('gaseous_adamantane')*800)
                .fluidOutputs(fluid('hydrogen')*400)
                .fluidOutputs(fluid('molten_adamantium_dioxide')*400)
                .duration(620)
                .EUt(12000)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('molten_adamantium_dioxide')*1000)
                .fluidOutputs(fluid('mithril_fluoride')*500)
                .fluidOutputs(fluid('adamantane_lubricant')*500)
                .outputs(metaitem('dustAdamantite'))
                .EUt(200)
                .duration(8000)
                .buildAndRegister()

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_sulfide')*1000)
                .fluidInputs(fluid('trinium_solution')*1000)
                .outputs(metaitem('dustTriniumSulfide')*2)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .duration(120)
                .EUt(600)
                .buildAndRegister()

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustTriniumSulfide')* 2)
                .outputs(metaitem('dustTrinium'))
                .outputs(metaitem('dustSulfur'))
                .duration(120)
                .EUt(800)
                .buildAndRegister()

        DIGESTER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('mithril_fluoride')*1000)
                .inputs(metaitem('dustLithium'))
                .outputs(metaitem('dustLithiumFluoride'))
                .outputs(metaitem('dustPrecipitateMithril')* 2)
                .duration(950)
                .EUt(1278)
                .buildAndRegister()

        SIFTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPrecipitateMithril'))
                .outputs(metaitem('dustTinySilver'))
                .outputs(metaitem('dustTinyCopper'))
                .outputs(metaitem('dustRoughenMithril'))
                .duration(120)
                .EUt(800)
                .buildAndRegister()

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('glass_lens.blue'))
                .inputs(metaitem('dustRoughenMithril'))
                .outputs(metaitem('dustExcitedRoughenMithril'))
                .duration(120)
                .EUt(790)
                .buildAndRegister()

        NEUTRON_ACCELERATOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustExcitedRoughenMithril'))
                .outputs(metaitem('dustSmallPotassium'))
                .outputs(metaitem('dustTinyNaquadah'))
                .outputs(metaitem('dustExcitedMithril'))
                .duration(1280)
                .EUt(9000)
                .buildAndRegister()

        VACUUM_RECIPES.recipeBuilder()
                .outputs(metaitem('dustMithril'))
                .inputs(metaitem('dustExcitedMithril'))
                .duration(2000)
                .EUt(8)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustNaquadriaNitrate'))
                .inputs(metaitem('dustSodium'))
                .outputs(metaitem('dustSodiumNitrate')* 3)
                .outputs(metaitem('dustNaquadriaticCompound'))
                .duration(800)
                .EUt(670)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustEnrichedNaquadahNitrate'))
                .inputs(metaitem('dustSodium'))
                .outputs(metaitem('dustSodiumNitrate')* 3)
                .outputs(metaitem('dustEnrichedNaquadahCompound'))
                .duration(800)
                .EUt(670)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('adamantane_rich_oil_solution')*1000)
                .fluidOutputs(fluid('adamantane')*400)
                .fluidOutputs(fluid('perfluorotributylamine')*90)
                .fluidOutputs(fluid('iodized_oil')*510)
                .duration(120)
                .EUt(700)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('alkylated_adamantanes')*2000)
                .fluidInputs(fluid('iso_octane')*1000)
                .fluidInputs(fluid('adamantane')*1000)
                .notConsumable(metaitem('dustAluminiumChloride')* 3)
                .duration(900)
                .EUt(80000)
                .buildAndRegister()

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('alkylated_adamantanes')*1000)
                .fluidOutputs(fluid('adamantane_lubricant')*500)
                .fluidOutputs(fluid('ethanol')*500)
                .duration(700)
                .EUt(7800)
                .buildAndRegister()

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('tributylamine')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('perfluorotributylamine')*2000)
                .EUt(700)
                .duration(1200)
                .buildAndRegister()

