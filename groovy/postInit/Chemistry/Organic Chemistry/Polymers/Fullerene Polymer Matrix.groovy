import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('naphthalene')*1000)
                .inputs(item('gregtechfoodoption:gtfo_oredict_item', 1138))
                .fluidInputs(fluid('bromine')*2000)
                .outputs(metaitem('dustSodiumBromide')*2)
                .notConsumable(metaitem('uva_halide_lamp'))
                .fluidOutputs(fluid('hydrobromic_acid')*1000)
                .outputs(metaitem('dustCyanonaphthalene')*19)
                .EUt(1920)
                .duration(80)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrobromic_acid')*1000)
                .fluidInputs(fluid('chlorine')*1000)
                .fluidOutputs(fluid('bromine')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .duration(160)
                .EUt(125)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumBromide')*4)
                .fluidInputs(fluid('phosphoric_acid')*1000)
                .fluidOutputs(fluid('hydrobromic_acid')*2000)
                .outputs(metaitem('dustDisodiumPhosphate')*8)
                .duration(190)
                .EUt(125)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCyanonaphthalene')*19)
                .notConsumable(metaitem('dustTinChloride'))
                .fluidInputs(fluid('water')*1000)
                .fluidInputs(fluid('hydrochloric_acid')*3000)
                .fluidOutputs(fluid('naphthaldehyde') * 1000)
                .fluidOutputs(fluid('ammonium_chloride')*1000)
                .fluidOutputs(fluid('chlorine')*2000)
                .EUt(1920)
                .duration(80)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ammonium_chloride')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .fluidOutputs(fluid('ammonia')*1000)
                .duration(200)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('naphthaldehyde')*1000)
                .fluidInputs(fluid('ethylbenzene')*1000)
                .fluidInputs(fluid('oxygen')*1000)
                .notConsumable(metaitem('dustIodine'))
                .notConsumable(metaitem('dustTriphenylphosphine')*1)
                .fluidOutputs(fluid('water')*2000)
                .outputs(metaitem('dustMethylbenzophenanthrene')*33)
                .EUt(1920)
                .duration(100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustMethylbenzophenanthrene')*33)
                .inputs(metaitem('dustPotassiumCyanide')*3)
                .inputs(metaitem('dustBromosuccinimide')*12)
                .outputs(metaitem('dustBenzophenanthrenylacetonitrile')*34)
                .outputs(metaitem('dustPotassiumBromide')*2)
                .outputs(metaitem('dustSuccinimide')*12)
                .EUt(1920)
                .duration(100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBenzophenanthrenylacetonitrile')*102)
                .notConsumable(metaitem('dustTiAlChloride')*1)
                .outputs(metaitem('dustUnfoldedFullerene')*1)
                .fluidOutputs(fluid('ammonia')*3000)
                .EUt(7680)
                .duration(250)
                .buildAndRegister();

        LASER_ENGRAVER_RECIPES.recipeBuilder()
                .notConsumable(metaitem('glass_lens.magenta'))
                .inputs(metaitem('dustUnfoldedFullerene')*1)
                .fluidInputs(fluid('nitrogen')*10000)
                .outputs(metaitem('dustFullerene')*1)
                .fluidOutputs(fluid('ammonia')*10000)
                .EUt(2000000)
                .duration(200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodium')*6)
                .fluidInputs(fluid('phosphorus_trichloride')*1000)
                .fluidInputs(fluid('chlorobenzene')*3000)
                .outputs(metaitem('dustSalt')*12)
                .outputs(metaitem('dustTriphenylphosphine')*34)
                .EUt(7680)
                .duration(250)
                .buildAndRegister();

        BIO_REACTOR_RECIPES.recipeBuilder()
                .inputs(metaitem('dustEschericiaColi')*1)
                .inputs(item('minecraft:sugar'))
                .EUt(480)
                .outputs(metaitem('dustSuccinicAcid')*14)
                .duration(200)
                .buildAndRegister();

        BLAST_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSuccinicAcid')*14)
                .fluidInputs(fluid('ammonia')*1000)
                .outputs(metaitem('dustSuccinimide')*12)
                .fluidOutputs(fluid('water')*2000)
                .EUt(120)
                .duration(500)
                .blastFurnaceTemp(2100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSuccinimide')*12)
                .fluidInputs(fluid('bromine')*2000)
                .outputs(metaitem('dustBromosuccinimide')*12)
                .fluidOutputs(fluid('hydrobromic_acid')*1000)
                .EUt(480)
                .duration(200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBromosuccinimide')*12)
                .outputs(metaitem('dustCarbon')*4)
                .fluidOutputs(fluid('hydrogen')*3000)
                .fluidOutputs(fluid('hydrobromic_acid')*1000)
                .fluidOutputs(fluid('nitrogen_dioxide')*1000)
                .duration(158)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('sulfur_trioxide')*1000)
                .inputs(metaitem('dustSulfur'))
                .fluidInputs(fluid('chlorine')*2000)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .fluidOutputs(fluid('thionyl_chloride')*1000)
                .EUt(480)
                .duration(400)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('titanium_tetrachloride')*1000)
                .inputs(metaitem('dustAluminiumChloride')*4)
                .EUt(7680)
                .duration(50)
                .outputs(metaitem('dustTiAlChloride')*9)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('gtfo_hydrogen_cyanide')*1000)
                .fluidInputs(fluid('potassium_hydroxide')*1000)
                .circuitMeta(1)
                .outputs(metaitem('dustPotassiumCyanide')*3)
                .fluidOutputs(fluid('water')*1000)
                .EUt(1920)
                .duration(200)
                .buildAndRegister();

        ELECTROLYZER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassiumCyanide')*3)
                .outputs(metaitem('dustPotassium'))
                .outputs(metaitem('dustCarbon'))
                .fluidOutputs(fluid('nitrogen')*1000)
                .duration(150)
                .EUt(120)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustRockSalt')*2)
                .fluidInputs(fluid('water')*1000)
                .fluidOutputs(fluid('potassium_hydroxide')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .EUt(480)
                .duration(270)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassium'))
                .fluidInputs(fluid('chlorine')*1000)
                .outputs(metaitem('dustRockSalt')*2)
                .EUt(30)
                .duration(220)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(40)
                .EUt(30)
                .fluidInputs(fluid('hydrogen')*1000)
                .fluidInputs(fluid('iron_chloride')*1000)
                .fluidOutputs(fluid('iron_2_chloride') * 1000)
                .fluidOutputs(fluid('hydrochloric_acid')*1000)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustZeolite')*1)
                .notConsumable(metaitem('dustPdIrReOCeOS')*1)
                .fluidInputs(fluid('iron_2_chloride') * 1000)
                .fluidInputs(fluid('cyclopentadiene')*2000)
                .fluidOutputs(fluid('ferrocene')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .EUt(30720)
                .duration(100)
                .buildAndRegister();

        MIXER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPalladium'))
                .inputs(metaitem('dustIridium'))
                .inputs(metaitem('dustRhenium'))
                .inputs(metaitem('dustCerium'))
                .inputs(metaitem('dustOsmium'))
                .inputs(metaitem('dustSilicon'))
                .fluidInputs(fluid('oxygen')*4000)
                .outputs(metaitem('dustPdIrReOCeOS')*10)
                .EUt(7680)
                .duration(50)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFullerene')*1)
                .inputs(metaitem('dustSarcosine')*13)
                .inputs(metaitem('dustSodiumEthoxide')*27)
                .fluidInputs(fluid('chloroform')*1000)
                .fluidInputs(fluid('ferrocene')*1000)
                .notConsumable(fluid('titanium_tetrachloride')*1000)
                .notConsumable(metaitem('gelled_toluene'))
                .outputs(metaitem('dustSalt')*6)
                .fluidOutputs(fluid('ferrocenylfulleropyrrolidine') * 1000)
                .fluidOutputs(fluid('carbon_dioxide')*1000)
                .fluidOutputs(fluid('ethanol')*3000)
                .EUt(500000)
                .duration(750)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustSodiumHydroxide')*3)
                .fluidInputs(fluid('ethanol')*1000)
                .fluidOutputs(fluid('water')*1000)
                .outputs(metaitem('dustSodiumEthoxide')*9)
                .EUt(7680)
                .duration(50)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('methylamine')*1000)
                .fluidInputs(fluid('chlorine')*2000)
                .fluidInputs(fluid('acetic_acid')*1000)
                .notConsumable(fluid('acetic_anhydride')*1000)
                .outputs(metaitem('dustSarcosine')*13)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .EUt(7680)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ammonia')*1000)
                .fluidInputs(fluid('methanol')*1000)
                .notConsumable(metaitem('dustAluminoSilicateWool'))
                .circuitMeta(3)
                .fluidOutputs(fluid('methylamine')*1000)
                .fluidOutputs(fluid('water')*1000)
                .EUt(7680)
                .duration(100)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ferrocenylfulleropyrrolidine') * 1000)
                .inputs(metaitem('dustPalladium'))
                .notConsumable(fluid('acetic_acid')*100)
                .notConsumable(fluid('nitric_acid')*100)
                .outputs(metaitem('dustPalladiumFullereneMatrix')*1)
                .EUt(2000000)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_sulfide')*1000)
                .fluidInputs(fluid('methanol')*2000)
                .fluidOutputs(fluid('dimethylsulfide')*1000)
                .fluidOutputs(fluid('water')*2000)
                .EUt(1920)
                .duration(100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustPotassiumPermanganate')*24)
                .fluidInputs(fluid('thionyl_chloride')*1000)
                .fluidInputs(fluid('toluene')*2000)
                .outputs(metaitem('dustPyrolusite')*12)
                .fluidOutputs(fluid('water')*1000)
                .fluidOutputs(fluid('potassium_hydroxide')*4000)
                .fluidOutputs(fluid('sulfur_dioxide')*1000)
                .fluidOutputs(fluid('benzoyl_chloride')*2000)
                .EUt(480)
                .duration(200)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('hydrogen_peroxide')*1000)
                .fluidInputs(fluid('benzoyl_chloride')*2000)
                .fluidOutputs(fluid('benzoyl_chloride') * 1000)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .EUt(1920)
                .duration(160)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustIodine')*4)
                .fluidInputs(fluid('hydrazine')*1000)
                .fluidOutputs(fluid('nitrogen')*2000)
                .fluidOutputs(fluid('hydroiodic_acid')*4000)
                .duration(210)
                .EUt(500)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('acrylo_nitrile')*1000)
                .fluidInputs(fluid('hydroiodic_acid')*1000)
                .fluidInputs(fluid('water')*2000)
                .fluidInputs(fluid('styrene')*1000)
                .inputs(metaitem('dustLithiumAluminiumHydride')*6)
                .notConsumable(fluid('trimethyl_tin_chloride')*100)
                .fluidOutputs(fluid('phenylpentanoicacid')*1000)
                .fluidOutputs(fluid('ammonia')*1000)
                .outputs(metaitem('dustAluminiumHydride')*4)
                .outputs(metaitem('dustLithiumIodide')*2)
                .EUt(3840)
                .duration(110)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .inputs(metaitem('dustFullerene')*2)
                .fluidInputs(fluid('phenylpentanoicacid')*2000)
                .fluidInputs(fluid('dimethylsulfide')*1000)
                .fluidInputs(fluid('chlorobenzene')*2000)
                .notConsumable(fluid('benzoyl_chloride') * 1000)
                .fluidOutputs(fluid('toluene')*2000)
                .fluidOutputs(fluid('hydrogen_sulfide')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .fluidOutputs(fluid('pcba')*2000)
                .EUt(500000)
                .duration(450)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .duration(80)
                .EUt(120)
                .inputs(metaitem('dustSilver')*2)
                .fluidInputs(fluid('chlorine')*2000)
                .outputs(metaitem('dustSilverChloride')*2)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('boron_fluoride')*8000)
                .inputs(metaitem('dustSilverOxide')*9)
                .notConsumable(fluid('benzene')*1000)
                .fluidOutputs(fluid('silvertetrafluoroborate')*6000)
                .outputs(metaitem('dustBoronOxide')*5)
                .EUt(7680)
                .duration(100)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('ammonia')*2000)
                .fluidInputs(fluid('phosgene')*1000)
                .notConsumable(fluid('silvertetrafluoroborate')*1000)
                .fluidInputs(fluid('isopropyl_alcohol')*2000)
                .notConsumable(metaitem('dustTriphenylphosphine')*1)
                .fluidOutputs(fluid('diluted_hydrochloric_acid')*4000)
                .fluidOutputs(fluid('diisopropylcarbodiimide')*1000)
                .EUt(7680)
                .duration(250)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('carbon_monoxide')*1000)
                .fluidInputs(fluid('chlorine')*2000)
                .notConsumable(metaitem('dustActivatedCarbon'))
                .fluidOutputs(fluid('phosgene')*1000)
                .EUt(1920)
                .duration(400)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('dimethylamine')*1000)
                .fluidInputs(fluid('pyridine')*1000)
                .fluidOutputs(fluid('hydrogen')*2000)
                .outputs(metaitem('dustDimethylaminopyridine')*19)
                .EUt(7680)
                .duration(200)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .notConsumable(metaitem('dustDimethylaminopyridine')*1)
                .notConsumable(fluid('diisopropylcarbodiimide')*10)
                .fluidInputs(fluid('pcba')*1000)
                .fluidInputs(fluid('styrene')*1000)
                .fluidInputs(fluid('dichloromethane')*1000)
                .fluidOutputs(fluid('hydrochloric_acid')*2000)
                .fluidOutputs(fluid('pcbs')*1000)
                .EUt(500000)
                .duration(400)
                .buildAndRegister();

        CHEMICAL_BATH_RECIPES.recipeBuilder()
                .fluidInputs(fluid('pcbs')*1000)
                .inputs(metaitem('dustPalladiumFullereneMatrix')*1)
                .outputs(metaitem('dustFullerenePolymerMatrix')*2)
                .EUt(8000000)
                .duration(40)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('nbutanol')*1000)
                .fluidInputs(fluid('hydrogen')*1000)
                .fluidOutputs(fluid('one_butane')*1000)
                .duration(120)
                .EUt(90)
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(fluid('one_butane')*1000)
                .inputs(metaitem('dustLithium'))
                .fluidOutputs(fluid('n_butyllithium')*1000)
                .duration(201)
                .EUt(700)
                .buildAndRegister();

        VACUUM_DISTILLATION_TOWER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustCarbon'))
                .outputs(metaitem('dustActivatedCarbon'))
                .duration(200)
                .EUt(822)
                .buildAndRegister();