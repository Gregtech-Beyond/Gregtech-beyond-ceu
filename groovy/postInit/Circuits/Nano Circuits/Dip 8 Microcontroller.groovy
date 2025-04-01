import static gregtech.api.recipes.RecipeMaps.*;
import static gtb.api.recipes.GTBRecipeMaps.*;

        UV_LIGHT_RECIPES.recipeBuilder()
                .inputs(metaitem('wafer.silicon'))
                .fluidInputs(fluid('novolacs_photoresist') *100)
                .notConsumable(metaitem('gdsii_lithography_mask'))
                .outputs(metaitem('gdsii_masked_wafer'))
                .duration(400)
                .EUt(460)
                .buildAndRegister()

        ION_IMPLANTER_RECIPES.recipeBuilder()
                .inputs(metaitem('dustBoron'))
                .inputs(metaitem('dustWhitePhosphorus'))
                .inputs(metaitem('gdsii_masked_wafer'))
                .outputs(metaitem('doped_gdsii_wafer'))
                .duration(400)
                .EUt(580)
                .buildAndRegister()

        MOCVD_UNIT_RECIPES.recipeBuilder()
                .inputs(metaitem('thin_copper_sheet')* 4)
                .inputs(metaitem('doped_gdsii_wafer'))
                .outputs(metaitem('connected_gdsii_wafer'))
                .duration(500)
                .EUt(480)
                .buildAndRegister()

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('foilCopper'))
                .outputs(metaitem('thin_copper_sheet')* 16)
                .duration(400)
                .EUt(580)
                .buildAndRegister()

        PLASMA_ETCHER_RECIPES.recipeBuilder()
                .fluidInputs(fluid('piranha_solution')* 100)
                .inputs(metaitem('connected_gdsii_wafer'))
                .outputs(metaitem('etched_gdsii_wafer'))
                .duration(500)
                .EUt(380)
                .buildAndRegister()

        CUTTER_RECIPES.recipeBuilder()
                .inputs(metaitem('etched_gdsii_wafer'))
                .outputs(metaitem('gdsii_chip')* 16)
                .duration(500)
                .EUt(380)
                .buildAndRegister()

        PACKER_RECIPES.recipeBuilder()
                .inputs(metaitem('dip_8_package'))
                .inputs(metaitem('gdsii_chip'))
                .outputs(metaitem('dip_8_microcontroller'))
                .duration(500)
                .EUt(380)
                .buildAndRegister()

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('frameLead'))
                .inputs(metaitem('boltTin'))
                .fluidInputs(fluid('soldering_alloy')* 144)
                .outputs(metaitem('dip_8_package')* 16)
                .duration(300)
                .EUt(490)
                .buildAndRegister()

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(metaitem('circuit_board.advanced'))
                .inputs(metaitem('plate.nano_central_processing_unit'))
                .inputs(metaitem('nano_smd_capacitor')* 8)
                .inputs(metaitem('nano_smd_transistor')* 8)
                .inputs(metaitem('nano_smd_resistor')* 8)
                .inputs(metaitem('wireFineElectrum')* 8)
                .fluidInputs(fluid('tin')* 144)
                .inputs(metaitem('dip_8_microcontroller'))
                .outputs(metaitem('circuit.nano_processor'))
                .duration(300)
                .EUt(490)
                .buildAndRegister()