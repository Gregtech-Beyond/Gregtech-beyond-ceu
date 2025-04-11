package preInit;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.items.metaitem.*;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.util.text.TextFormatting;
import gregtech.api.unification.material.event.PostMaterialEvent;
import gregtech.common.items.behaviors.TooltipBehavior;

eventManager.listen {
    
    PostMaterialEvent event ->

        log.infoMC("Adding metaitems...")

        StandardMetaItem customMetaItems = new StandardMetaItem((short)2);
        customMetaItems.setRegistryName("meta_item_2") 
 
 
        customMetaItems.addItem(1, "astro_miner");
        customMetaItems.addItem(2, "moon");
        customMetaItems.addItem(3, "paraffin_wax");
        customMetaItems.addItem(4, "laser_assembly");
        customMetaItems.addItem(5, "nano_cpu_wafer");
        customMetaItems.addItem(6,"trenched_superconductor_layered_uhasoc_wafer");
        customMetaItems.addItem(7, "monocrystalline_seed_crystal");
        customMetaItems.addItem(8, "polysilicon_wafer");
        customMetaItems.addItem(9, "n_doped_silicon_dioxide_wafer");
        customMetaItems.addItem(10,"single_josephson_junction_lithography_mask");
        customMetaItems.addItem(11, "doped_power_ic_wafer");
        customMetaItems.addItem(12, "doped_ram_wafer");
        customMetaItems.addItem(13, "doped_ic_wafer");
        customMetaItems.addItem(14, "doped_high_power_ic_wafer");
        customMetaItems.addItem(15, "doped_cpu_wafer");
        customMetaItems.addItem(16, "doped_polysilicon_wafer");
        customMetaItems.addItem(17, "engraved_power_ic_wafer");
        customMetaItems.addItem(18, "engraved_cpu_wafer");
        customMetaItems.addItem(19, "engraved_ic_wafer");
        customMetaItems.addItem(20, "engraved_titanate_substrate_wafer");
        customMetaItems.addItem(21, "engraved_ram_wafer");
        customMetaItems.addItem(22, "controlled_shaped_naquadria_charge");
        customMetaItems.addItem(23,"controlled_shaped_naquadria_charge_casing");
        customMetaItems.addItem(24, "ram_lithography_mask");
        customMetaItems.addItem(25, "cpu_lithography_mask");
        customMetaItems.addItem(26, "lpic_lithography_mask");
        customMetaItems.addItem(27, "manufactured_superconductor_circuit");
        customMetaItems.addItem(28, "sputtered_sapphire_substrate");
        customMetaItems.addItem(29, "uhpic_base");
        customMetaItems.addItem(30, "uhpic_base_wafer");
        customMetaItems.addItem(31, "uhpic_lithography_mask");
        customMetaItems.addItem(32, "pic_lithography_mask");
        customMetaItems.addItem(33, "lithography_base_mask");
        customMetaItems.addItem(34, "wired_substrate_wafer");
        customMetaItems.addItem(35, "superconductor_coated_substrate_wafer");
        customMetaItems.addItem(36, "barium_titanate_substrate_wafer");
        customMetaItems.addItem(37, "barium_titanate_boule");
        customMetaItems.addItem(38, "barium_titanate_seed_crystal");
        customMetaItems.addItem(39, "treated_photocoated_hassium_wafer");
        customMetaItems.addItem(40, "unpreparated_cela_boule");
        customMetaItems.addItem(41, "cruicible_mold");
        customMetaItems.addItem(42, "graphite_cruicible");
        customMetaItems.addItem(43, "soc_wafer_base");
        customMetaItems.addItem(44, "engraved_soc_wafer");
        customMetaItems.addItem(45, "uhasoc_lithography_mask");
        customMetaItems.addItem(46, "shaped_high_energy_gamma_shield");
        customMetaItems.addItem(48, "superconductor_layered_uhasoc_wafer");
        customMetaItems.addItem(49, "degenerate_uhasoc_wafer");
        customMetaItems.addItem(50, "celled_uhasoc_wafer");
        customMetaItems.addItem(51, "spin_aligned_uhasoc_wafer");
        customMetaItems.addItem(52, "uhasoc_post_engraving_mask");
        customMetaItems.addItem(53, "relayered_uhasoc_wafer");
        customMetaItems.addItem(54, "fully_connected_uhasoc_wafer");
        customMetaItems.addItem(55, "supercooled_uhasoc_wafer");
        customMetaItems.addItem(56, "monocrystalline_inp_boule");
        customMetaItems.addItem(57, "monocrystalline_inp_ingot");
        customMetaItems.addItem(58, "monocrystalline_inp_seed_crystal");
        customMetaItems.addItem(59, "indium_phosphide_wafer");
        customMetaItems.addItem(60, "zblan_layered_inp_wafer");
        customMetaItems.addItem(61, "resonant_inp_wafer");
        customMetaItems.addItem(62, "insulated_inp_wafer");
        customMetaItems.addItem(63, "re_exposed_inp_wafer");
        customMetaItems.addItem(64, "electroluminescent_inp_wafer");
        customMetaItems.addItem(65, "recoated_inp_wafer");
        customMetaItems.addItem(66, "contact_ready_inp_wafer");
        customMetaItems.addItem(67, "uninsulated_optical_soc");
        customMetaItems.addItem(68, "contactless_optical_soc");
        customMetaItems.addItem(69, "insulated_optical_soc");
        customMetaItems.addItem(70, "photogenally_enhanced_wafer");
        customMetaItems.addItem(71, "doped_soc_wafer");
        customMetaItems.addItem(72, "fcelauwafer");
        customMetaItems.addItem(73, "celawafer");
        customMetaItems.addItem(74, "cela_silicon_boule");
        customMetaItems.addItem(75, "lanthanum_seed_crystal");
        customMetaItems.addItem(76, "oganesson_seed_crystal");
        customMetaItems.addItem(77, "oganesson_boule");
        customMetaItems.addItem(79, "monocrystalline_oganesson_ingot");
        customMetaItems.addItem(80, "oganesson_wafer");
        customMetaItems.addItem(81, "treated_oganesson_wafer");
        customMetaItems.addItem(82, "pre_engraving_oganesson_lithography_mask");
        customMetaItems.addItem(83, "engraved_oganesson_wafer");
        customMetaItems.addItem(84, "raw_oganesson_wafer");
        customMetaItems.addItem(85, "doped_oganesson_wafer");
        customMetaItems.addItem(86, "engraved_hasoc_wafer");
        customMetaItems.addItem(87, "bathed_treated_oganesson_wafer");
        customMetaItems.addItem(88, "unpolarized_hasoc_wafer");
        customMetaItems.addItem(89, "hasoc_die");
        customMetaItems.addItem(90, "biosafe_protective_plating");
        customMetaItems.addItem(91, "clean_hasoc_die");
        customMetaItems.addItem(92, "neural_implanted_hasoc_die");
        customMetaItems.addItem(93, "grown_hasoc_die");
        customMetaItems.addItem(94, "neurological_life_support_unit");
        customMetaItems.addItem(96, "sapphire_seed_crystal");
        customMetaItems.addItem(97, "sapphire_boule");
        customMetaItems.addItem(98, "monocrystalline_sapphire_ingot");
        customMetaItems.addItem(99, "sapphire_wafer");
        customMetaItems.addItem(100, "qbit_cpu_lithography_mask");
        customMetaItems.addItem(101, "engraved_qbit_cpu_wafer");
        customMetaItems.addItem(102, "doped_qbit_cpu_wafer");
        customMetaItems.addItem(103, "superconductor_coated_qbit_cpu_wafer");
        customMetaItems.addItem(104, "u_twofourty_electron_source");
        customMetaItems.addItem(105, "qbit_cpu_die");
        customMetaItems.addItem(95, "covered_qbit_cpu");
        customMetaItems.addItem(106, "lithium_sieve");
        customMetaItems.addItem(107, "lithium_saturated_sieve_lithium");
        customMetaItems.addItem(108, "celauwafer");
        customMetaItems.addItem(109, "silicon_dioxide_wafer");
        customMetaItems.addItem(110, "engraved_nanocpu_wafer");
        customMetaItems.addItem(111, "doped_nanocpu_wafer");
        customMetaItems.addItem(112, "nanocpu_lithography_mask");
        customMetaItems.addItem(113, "gated_nanocpu_wafer");
        customMetaItems.addItem(114, "insulated_nanocpu_wafer");
        customMetaItems.addItem(115, "trenched_insulated_nanocpu_wafer");
        customMetaItems.addItem(116, "unplanarized_nanocpu_wafer");
        customMetaItems.addItem(117, "boron_saturated_yarn");
        customMetaItems.addItem(118, "boron_retaining_yarn");
        customMetaItems.addItem(121, "nickel_nitride_wafer");
        customMetaItems.addItem(122, "engraved_nor_wafer");
        customMetaItems.addItem(123, "engraved_nand_wafer");
        customMetaItems.addItem(124, "flerovium_layered_wafer");
        customMetaItems.addItem(125, "spinorial_memory_wafer");
        customMetaItems.addItem(126, "pre_engraved_nqo2_wafer");
        customMetaItems.addItem(127, "enriched_naquadah_photolithography_mask");
        customMetaItems.addItem(128, "doped_asoc_wafer");
        customMetaItems.addItem(130, "engraved_spinorial_memory_wafer");
        customMetaItems.addItem(131, "doped_aram_wafer");
        customMetaItems.addItem(132, "unbaked_monocrystalline_silicon_boule");
        customMetaItems.addItem(134, "integrated_circuit_lithography_mask");
        customMetaItems.addItem(135, "naquadah_dioxide_seed_crystal");
        customMetaItems.addItem(136, "naquadah_dioxide_boule");
        customMetaItems.addItem(137, "naquadah_dioxide_wafer");
        customMetaItems.addItem(138, "soc_lithography_mask");
        customMetaItems.addItem(139, "trenched_naquadah_dioxide_wafer");
        customMetaItems.addItem(140, "nickel_breeding_bed");
        customMetaItems.addItem(141, "optical_lithography_mask");
        customMetaItems.addItem(142, "interconnected_inp_wafer");
        customMetaItems.addItem(143, "photocoated_hassium_wafer");
        customMetaItems.addItem(145, "nor_photolithography_mask");
        customMetaItems.addItem(146, "nand_photolithography_mask");
        customMetaItems.addItem(147, "aram_wafer");
        customMetaItems.addItem(148, "uhasoc_wafer");
        customMetaItems.addItem(149, "optical_soc_wafer");
        customMetaItems.addItem(151, "optical_soc");
        customMetaItems.addItem(120, "bituminous_residues");
        customMetaItems.addItem(152, "damascus_steel_assembly");
        customMetaItems.addItem(153, "hot_damascus_steel_assembly");
        customMetaItems.addItem(154, "lightly_forged_damascus_steel_assembly");
        customMetaItems.addItem(155,"hot_lightly_forged_damascus_steel_assembly");
        customMetaItems.addItem(156,"moderately_forged_damascus_steel_assembly");
        customMetaItems.addItem(157,"hot_moderately_forged_damascus_steel_assembly");
        customMetaItems.addItem(158, "highly_forged_damascus_steel_assembly");
        customMetaItems.addItem(159,"hot_highly_forged_damascus_steel_assembly");
        customMetaItems.addItem(161, "sterilized_petri_dish");
        customMetaItems.addItem(162, "plus_sterilized_petri_dish");
        customMetaItems.addItem(163, "contaminated_sterilized_petri_dish");
        customMetaItems.addItem(164, "petri_dish_mold");
        customMetaItems.addItem(165, "cupriavidus_bacteria_sample_petri_dish");
        customMetaItems.addItem(166, "ultrasonic_homogenizer");
        customMetaItems.addItem(167, "yeast_cells");
        customMetaItems.addItem(168, "grown_yeast_culture");
        customMetaItems.addItem(169, "barley");
        customMetaItems.addItem(170, "syringe");
        customMetaItems.addItem(171, "sterilized_syringe");
        customMetaItems.addItem(172, "sheep_blood_syringe");
        customMetaItems.addItem(173, "cotton");
        customMetaItems.addItem(174, "cotton_sheet");
        customMetaItems.addItem(175, "cheese_cloth");
        customMetaItems.addItem(176, "pancreas");
        customMetaItems.addItem(177, "yeem_petri");
        customMetaItems.addItem(178, "soy_bean");
        customMetaItems.addItem(180, "cupriavidus_necator_culture");
        customMetaItems.addItem(181, "engraved_asoc_wafer");
        customMetaItems.addItem(182, "pad_petri_dish");
        customMetaItems.addItem(183, "uva_halide_lamp");
        customMetaItems.addItem(184, "lithium_foam_base");
        customMetaItems.addItem(185, "alumino_silicate_wool_sheet");
        customMetaItems.addItem(186, "rotarry_spinning_whisker");
        customMetaItems.addItem(187, "chromatic_glass_fiber");
        customMetaItems.addItem(188, "saturated_chromatic_glass_fiber");
        customMetaItems.addItem(189, "sintered_silver_coil");
        customMetaItems.addItem(190, "vacuum_tube_components");
        customMetaItems.addItem(191, "thick_film_wafer");
        customMetaItems.addItem(192, "thick_film_resistor_base_wafer");
        customMetaItems.addItem(193, "thick_film_resistor_wafer");
        customMetaItems.addItem(194, "transistor_wafer");
        customMetaItems.addItem(195, "patterend_silicon_dioxide_wafer");
        customMetaItems.addItem(196, "inductor_lithography_mask");
        customMetaItems.addItem(197, "etched_inductor_wafer");
        customMetaItems.addItem(198, "inductor_wafer");
        customMetaItems.addItem(199, "reinforced_base_wafer");
        customMetaItems.addItem(200, "patterened_base_wafer");
        customMetaItems.addItem(201, "diode_wafer");
        customMetaItems.addItem(202, "aluminium_capacitor");
        customMetaItems.addItem(203, "raw_capacitor_roll");
        customMetaItems.addItem(204, "patterened_phenol_circuit_board");
        customMetaItems.addItem(205, "laminated_epoxy_board");
        customMetaItems.addItem(206, "engraved_epoxy_board");
        customMetaItems.addItem(207, "patterened_epoxy_board");
        customMetaItems.addItem(208, "transistor_base_wafer");
        customMetaItems.addItem(209, "biologically_approved_lens");
        customMetaItems.addItem(210, "neuro_support_unit");
        customMetaItems.addItem(211, "electrically_wired_petri_dish");
        customMetaItems.addItem(212, "bifidobacterium_brave_culture");
        customMetaItems.addItem(213, "stem_cell_lab_on_chip");
        customMetaItems.addItem(214, "lab_on_chip");
        customMetaItems.addItem(215, "lab_on_chip_base");
        customMetaItems.addItem(216, "annealed_nickel_plate");
        customMetaItems.addItem(217, "piezoelectric_crystal");
        customMetaItems.addItem(218, "laminated_rer_board");
        customMetaItems.addItem(219, "patterned_pr4_plate");
        customMetaItems.addItem(220, "etched_pr4_plate");
        customMetaItems.addItem(221, "planar_transformer");
        customMetaItems.addItem(222, "sputtered_pr4_plate");
        customMetaItems.addItem(223, "pressed_pr4_plate");
        customMetaItems.addItem(224, "neodymium_magnet");
        customMetaItems.addItem(225, "bitumen_crystal");
        customMetaItems.addItem(226, "asphalt");
        customMetaItems.addItem(227, "nano_smd_diode");
        customMetaItems.addItem(228, "nano_smd_transistor");
        customMetaItems.addItem(229, "nano_smd_capacitor");
        customMetaItems.addItem(230, "nano_smd_inductor");
        customMetaItems.addItem(231, "nano_smd_resistor");
        customMetaItems.addItem(232, "gdsii_lithography_mask");
        customMetaItems.addItem(233, "gdsii_masked_wafer");
        customMetaItems.addItem(234, "doped_gdsii_wafer");
        customMetaItems.addItem(235, "thin_copper_sheet");
        customMetaItems.addItem(236, "connected_gdsii_wafer");
        customMetaItems.addItem(237, "etched_gdsii_wafer");
        customMetaItems.addItem(238, "gdsii_chip");
        customMetaItems.addItem(239, "dip_8_package");
        customMetaItems.addItem(240, "dip_8_microcontroller");
        customMetaItems.addItem(241, "zener_diode");
        customMetaItems.addItem(242, "cracking_catalyst");
        customMetaItems.addItem(243, "used_cracking_catalyst");
        customMetaItems.addItem(244, "mv_voltage_regulator");
        customMetaItems.addItem(245, "hv_voltage_regulator");
        customMetaItems.addItem(246, "ev_voltage_regulator");
        customMetaItems.addItem(247, "iv_voltage_regulator");
        customMetaItems.addItem(248, "luv_voltage_regulator");
        customMetaItems.addItem(249, "zpm_voltage_regulator");
        customMetaItems.addItem(250, "uv_voltage_regulator");
        customMetaItems.addItem(251, "graphite_electrode");
        customMetaItems.addItem(300, "entropycore");
        customMetaItems.addItem(301, "boule.fluix");
        customMetaItems.addItem(302, "wafer.fluix");
        customMetaItems.addItem(303, "wafer.simple_fluix_systematic_chip");
        customMetaItems.addItem(304, "wafer.basic_fluix_systematic_chip");
        customMetaItems.addItem(305, "wafer.complex_fluix_systematic_chip");
        customMetaItems.addItem(306, "plate.simple_fluix_systematic_chip");
        customMetaItems.addItem(307, "plate.basic_fluix_systematic_chip");
        customMetaItems.addItem(308, "plate.complex_fluix_systematic_chip");


}