import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;



        DEHYDRATOR_RECIPES.recipeBuilder()
                .fluidInputs(fluid('one_four_butanediol')*1000)
                .fluidOutputs(fluid('y_butyralacetone') * 1000)
                .notConsumable(metaitem('dustCucrmgbaCatalyst')* 1)
                .EUt(210)
                .duration(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen')*4000)
                .fluidOutputs(fluid('one_four_butanediol')*1000)
                .fluidInputs(fluid('one_four_butynediol')*1000)
                .notConsumable(metaitem('dustPalladium')*1)
                .duration(200)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetylene')*1000)
                .circuitMeta(1)
                .notConsumable(metaitem('dustCopper'))
                .fluidInputs(fluid('formaldehyde')*1000)
                .fluidOutputs(fluid('one_four_butynediol')*1000)
                .duration(400)
                .EUt(1200)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidInputs(fluid('hydrogen_peroxide')*1000)
                .fluidOutputs(fluid('piranha_solution')*1000)
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('piranha_solution')*100)
                .inputs(metaitem('contaminated_sterilized_petri_dish'))
                .outputs(metaitem('petri_dish'))
                .duration(800)
                .EUt(900)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('oxygen')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*1000)
                .fluidInputs(fluid('sulfuric_acid')*2000)
                .fluidOutputs(fluid('sulfur_trioxide')*1000)
                .fluidOutputs(fluid('chlorosulfonic_acid')*2000)
                .fluidOutputs(fluid('water')*2000)
                .duration(240)
                .EUt(800)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('petri_dish_mold'))
                .fluidInputs(fluid('polybenzimidazole')*144)
                .fluidInputs(fluid('polytetrafluoroethylene')*144)
                .fluidInputs(fluid('polyetheretherketone')*144)
                .outputs(metaitem('petri_dish'))
                .duration(200)
                .EUt(700)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('petri_dish'))
                .outputs(metaitem('contaminated_sterilized_petri_dish'))
                .fluidInputs(fluid('ethanol_100')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .inputs(metaitem('sterilized_petri_dish'))
                .outputs(metaitem('plus_sterilized_petri_dish'))
                .fluidInputs(fluid('butanol_100')*1000)
                .fluidInputs(fluid('methanol_100')*1000)
                .duration(200)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('plus_sterilized_petri_dish'))
                .inputs(metaitem('dustCupriavidusNecatorBacteriaSample'))
                .outputs(metaitem('cupriavidus_bacteria_sample_petri_dish'))
                .duration(40)
                .EUt(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('cupriavidus_bacteria_sample_petri_dish'))
                .fluidInputs(fluid('cuproquin')*1000)
                .outputs(metaitem('cupriavidus_necator_culture'))
                .duration(1200)
                .EUt(80)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('cupriavidus_necator_culture'))
                .fluidInputs(fluid('bacterial_growth_medium')*1000)
                .fluidOutputs(fluid('depleted_bacterial_growth_medium')*1000)
                .duration(200)
                .outputs(metaitem('dustCupriavidusNecator')* 1)
                .outputs(metaitem('contaminated_sterilized_petri_dish'))
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('chlorosulfonic_acid')*1000)
                .fluidInputs(fluid('acetic_anhydride')*1000)
                .fluidInputs(fluid('aniline')*1000)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('acetic_acid')*1000)
                .fluidOutputs(fluid('acetylsulfanilyl_chloride')*1000)
                .duration(200)
                .EUt(1200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acetylsulfanilyl_chloride')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .inputs(metaitem('dustSodiumBicarbonate')* 6)
                .outputs(metaitem('dustSalt')* 2)
                .fluidOutputs(fluid('sulfanilamide')*1000)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .fluidOutputs(fluid('acetic_acid')*1000)
                .duration(800)
                .EUt(900)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('basic_fibroglast_growth_medium')*1000)
                .fluidInputs(fluid('ammonium_nitrate')*1000)
                .fluidInputs(fluid('epidermal_growth_factora')*1000)
                .fluidInputs(fluid('b_27_supplement')*1000)
                .inputs(metaitem('dustAgar')* 4)
                .inputs(metaitem('dustGlutamine')* 20)
                .fluidOutputs(fluid('raw_growth_medium')*4000)
                .duration(1000)
                .EUt(28000)
                .buildAndRegister();

        CENTRIFUGE_RECIPES.recipeBuilder()
                .fluidInputs(fluid('plasma.blood_plasma')*1000)
                .fluidOutputs(fluid('catalase')*200)
                .fluidOutputs(fluid('basic_fibroglast_growth_medium')*200)
                .fluidOutputs(fluid('epidermal_growth_factora')*200)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('catalase')*1000)
                .fluidInputs(fluid('linoleic_acid')*1000)
                .fluidInputs(fluid('biotin')*1000)
                .fluidInputs(fluid('ethanolamine')*1000)
                .fluidInputs(fluid('vitamin_a')*1000)
                .fluidOutputs(fluid('b_27_supplement')*5000)
                .duration(200)
                .EUt(2400)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('propargyl_alcohol')*5000)
                .fluidInputs(fluid('beta_ionone')*25000)
                .fluidOutputs(fluid('oxygen')*8000)
                .fluidOutputs(fluid('hydrochloric_acid')*5000)
                .fluidOutputs(fluid('vitamin_a')*17000)
                .duration(800)
                .EUt(12)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('citral')*1000)
                .fluidInputs(fluid('acetone')*1000)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('beta_ionone')*1000)
                .EUt(120)
                .duration(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBetaPinene')* 26)
                .fluidInputs(fluid('isoprene')*2000)
                .fluidInputs(fluid('oxygen')*2000)
                .fluidOutputs(fluid('citral')*2000)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfuric_acid')*1000)
                .fluidOutputs(fluid('beta_pinene_solution')*2000)
                .fluidInputs(fluid('turpentine')*1000)
                .duration(80)
                .EUt(790)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('beta_pinene_solution')*2000)
                .fluidOutputs(fluid('sulfuric_acid')*1000)
                .outputs(metaitem('dustBetaPinene')* 26)
                .duration(600)
                .EUt(1200)
                .buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(fluid('resin')*1000)
                .fluidOutputs(fluid('isoprene')*20)
                .fluidOutputs(fluid('turpentine')*200)
                .outputs(metaitem('dustRawRubber')* 1)
                .duration(600)
                .EUt(120)
                .buildAndRegister();

        FLUID_HEATER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('depleted_bacterial_growth_medium')*1000)
                .fluidOutputs(fluid('bacterial_growth_medium')*500)
                .circuitMeta(1)
                .duration(200)
                .EUt(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustYeast')* 1)
                .fluidInputs(fluid('biomass')*1000)
                .fluidOutputs(fluid('linoleic_acid')*1000)
                .notConsumable(metaitem('ultrasonic_homogenizer'))
                .duration(2000)
                .EUt(7)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ethylene_oxide')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .fluidOutputs(fluid('ethanolamine')*1000)
                .duration(212)
                .EUt(112)
                .buildAndRegister();

        MACERATOR_RECIPES.recipeBuilder()
                .inputs(item('minecraft:apple'))
                .outputs(metaitem('dustYeast'))
                .EUt(12)
                .duration(80)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidOutputs(fluid('clean_ammonia_solution')*1000)
                .fluidInputs(fluid('distilled_water')*1000)
                .fluidInputs(fluid('ammonia')*1000)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('plastic')*72)
                .inputs(metaitem('petri_dish'))
                .inputs(item('gregtech:cable_single', 2))
                .outputs(metaitem('electrically_wired_petri_dish'))
                .duration(100)
                .EUt(70)
                .buildAndRegister();