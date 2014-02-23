import java.io.File;
import java.util.ArrayList;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class MakeDevices {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Devices ddevices = new Devices();
		Serializer serializer = new Persister();
		
		ArrayList<Partition> partitions;
		ArrayList<String> firmware = new ArrayList<String>();
		ArrayList<String> model = new ArrayList<String>();
		ArrayList<String> carrier = new ArrayList<String>();
		ArrayList<Device> devices = new ArrayList<Device>();

		Action loki_boot = new Action();
		loki_boot.setName("loki_boot");
		loki_boot.setDescription("This will loki the boot image as needed");
		loki_boot.setMd5sum("74af8de898159bb4bdfd058f4b858844");
		loki_boot.setVersion("1");
		loki_boot.setHidden(true);
		loki_boot.setZipFile("loki_boot.zip");
		loki_boot.setZipFileLocation("loki_boot.zip");
		loki_boot.setPriority(0);
		
		Action loki_recovery = new Action();
		loki_recovery.setName("loki_recovery");
		loki_recovery.setDescription("This will loki the recovery image as needed");
		loki_recovery.setMd5sum("fb1b35bf05f1200e7f508962939296aa");
		loki_recovery.setVersion("1");
		loki_recovery.setHidden(true);
		loki_recovery.setZipFile("loki_recovery.zip");
		loki_recovery.setZipFileLocation("loki_recovery.zip");
		loki_recovery.setPriority(0);
		
		Action loki_check = new Action();
		loki_check.setName("loki_check");
		loki_check.setDescription("This will check if the aboot is supported by loki");
		loki_check.setMd5sum("24ca4d079b533dc2c96e8b05ee210aeb");
		loki_check.setVersion("1");
		loki_check.setHidden(true);
		loki_check.setZipFile("loki_check.zip");
		loki_check.setZipFileLocation("loki_check.zip");
		loki_check.setPriority(20);

		Action loki_update_zip = new Action();
		loki_update_zip.setName("loki_update_zip");
		loki_update_zip.setDescription("This will update a zip with a newer version of loki_patch and loki_flash");
		loki_update_zip.setMd5sum("f4bcee1c76bf0100c73faacc28822406");
		loki_update_zip.setVersion("1");
		loki_update_zip.setHidden(true);
		loki_update_zip.setZipFile("loki_update_zip.zip");
		loki_update_zip.setZipFileLocation("loki_update_zip.zip");
		loki_update_zip.setPriority(20);
		
		Action revert_aboot_zva = new Action();
		revert_aboot_zva.setName("Revert ZVA Aboot");
		revert_aboot_zva.setDescription("This will revert the Sprint ZVA update to ZV8 aboot");
		revert_aboot_zva.setMd5sum("a918f9f42f216d1079d4e1e9a915e086");
		revert_aboot_zva.setVersion("1");
		revert_aboot_zva.setStockOnly(true);
		revert_aboot_zva.setHidden(true);
		revert_aboot_zva.setZipFile("revert_aboot_zva.zip");
		revert_aboot_zva.setZipFileLocation("revert_aboot_zva.zip");
		revert_aboot_zva.setPriority(11);
		
		Action disable_lge_security_og = new Action();
		disable_lge_security_og.setName("Disable LGE Security");
		disable_lge_security_og.setDescription("This will Disable LGE Security and enable you to uninstall system apps");
		disable_lge_security_og.setMd5sum("9ff567c3b9a4cca9f12200a14f06be1f");
		disable_lge_security_og.setVersion("1");
		disable_lge_security_og.setStockOnly(true);
		disable_lge_security_og.setHidden(true);
		disable_lge_security_og.setZipFile("disable_lge_security_og.zip");
		disable_lge_security_og.setZipFileLocation("disable_lge_security_og.zip");
		
		Action fix_stock_recovery_og = new Action();
		fix_stock_recovery_og.setName("Fix stock recovery");
		fix_stock_recovery_og.setDescription("This will fix the stock recovery to boot with an unlocked bootloader");
		fix_stock_recovery_og.setMd5sum("a73e8c282a8d20ffcacb6c6b6ec56599");
		fix_stock_recovery_og.setVersion("1");
		fix_stock_recovery_og.setStockOnly(true);
		fix_stock_recovery_og.setHidden(true);
		fix_stock_recovery_og.setZipFile("fix_stock_recovery_og.zip");
		fix_stock_recovery_og.setZipFileLocation("fix_stock_recovery_og.zip");

		Action disable_lge_security_loki = new Action();
		disable_lge_security_loki.setName("Disable LGE Security");
		disable_lge_security_loki.setDescription("This will Disable LGE Security and enable you to uninstall system apps");
		disable_lge_security_loki.setMd5sum("145ac4c71e23efa141e2cbf3221d7455");
		disable_lge_security_loki.setVersion("1");
		disable_lge_security_loki.setStockOnly(true);
		disable_lge_security_loki.setHidden(true);
		disable_lge_security_loki.setZipFile("disable_lge_security_loki.zip");
		disable_lge_security_loki.setZipFileLocation("disable_lge_security_loki.zip");
		ArrayList<Action> rdepends_disable_lge_security_loki = new ArrayList<Action>();
		rdepends_disable_lge_security_loki.add(loki_boot);
		disable_lge_security_loki.setDependencies(rdepends_disable_lge_security_loki);
		
		Action disable_lge_security_msm8974 = new Action();
		disable_lge_security_msm8974.setName("Disable LGE Security");
		disable_lge_security_msm8974.setDescription("This will Disable LGE Security and enable you to uninstall system apps");
		disable_lge_security_msm8974.setMd5sum("48d8d3f383a3f5315a98b54c396a430b");
		disable_lge_security_msm8974.setVersion("1");
		disable_lge_security_msm8974.setStockOnly(true);
		disable_lge_security_msm8974.setHidden(true);
		disable_lge_security_msm8974.setZipFile("disable_lge_security_msm8974.zip");
		disable_lge_security_msm8974.setZipFileLocation("disable_lge_security_msm8974.zip");
		ArrayList<Action> rdepends_disable_lge_security_msm8974 = new ArrayList<Action>();
		rdepends_disable_lge_security_msm8974.add(loki_boot);
		disable_lge_security_msm8974.setDependencies(rdepends_disable_lge_security_msm8974);
		
		Action restore_backups_og = new Action();
		restore_backups_og.setName("Re-lock (restore backups)");
		restore_backups_og.setDescription("This will relock your phone and put back stock recovery and stock boot if they exists");
		restore_backups_og.setMd5sum("79057e4922ce7e23728d4c6d56d7c386");
		restore_backups_og.setVersion("1");
		//restore_backups_og.setHidden(true);
		restore_backups_og.setZipFile("restore_backups_og.zip");
		restore_backups_og.setZipFileLocation("restore_backups_og.zip");
		
		Action restore_backups_msm8974 = new Action();
		restore_backups_msm8974.setName("Restore All Backups");
		restore_backups_msm8974.setDescription("This will restore EFS, boot and recovery with backups if these exists");
		restore_backups_msm8974.setMd5sum("c71f21a5ed51e8baa8986bc538620a67");
		restore_backups_msm8974.setVersion("1");
		//disable_lge_security_msm8974.setHidden(true);
		restore_backups_msm8974.setZipFile("restore_backups_msm8974.zip");
		restore_backups_msm8974.setZipFileLocation("restore_backups_msm8974.zip");
		
		Action backup_efs_apq8064 = new Action();
		backup_efs_apq8064.setName("Backup EFS");
		backup_efs_apq8064.setDescription("This will backup your efs partitions, which contain your network values");
		backup_efs_apq8064.setMd5sum("405ec41cb93662f063d6092c5ea2b6bd");
		backup_efs_apq8064.setVersion("1");
		backup_efs_apq8064.setZipFile("backup_efs_apq8064.zip");
		backup_efs_apq8064.setZipFileLocation("backup_efs_apq8064.zip");
		backup_efs_apq8064.setPriority(10);
		
		Action backup_efs_msm8974 = new Action();
		backup_efs_msm8974.setName("Backup EFS");
		backup_efs_msm8974.setDescription("This will backup your efs partitions, which contain your network values");
		backup_efs_msm8974.setMd5sum("653666bd41da5244f6b614b1405bb1e3");
		backup_efs_msm8974.setVersion("1");
		backup_efs_msm8974.setZipFile("backup_efs_msm8974.zip");
		backup_efs_msm8974.setZipFileLocation("backup_efs_msm8974.zip");
		
		Action restore_efs_apq8064 = new Action();
		restore_efs_apq8064.setName("Restore EFS");
		restore_efs_apq8064.setDescription("This will restore your efs partitions, which contain your network values");
		restore_efs_apq8064.setMd5sum("279cfff702d47c0aaffb1dc2ea79579d");
		restore_efs_apq8064.setVersion("1");
		restore_efs_apq8064.setZipFile("restore_efs_apq8064.zip");
		restore_efs_apq8064.setZipFileLocation("restore_efs_apq8064.zip");
		
		Action restore_efs_msm8974 = new Action();
		restore_efs_msm8974.setName("Restore EFS");
		restore_efs_msm8974.setDescription("This will restore your efs partitions, which contain your network values");
		restore_efs_msm8974.setMd5sum("a1a58e5bb7fb57ff01302c2604289f2b");
		restore_efs_msm8974.setVersion("1");
		restore_efs_msm8974.setZipFile("restore_efs_msm8974.zip");
		restore_efs_msm8974.setZipFileLocation("restore_efs_msm8974.zip");
		
		Action ogMakounlock = new Action();
		ogMakounlock.setName("Mako Unlock");
		ogMakounlock.setDescription("This will unlock you device using the mako sbl stack without installing a custom recovery");
		ogMakounlock.setMd5sum("1e239f09c2d2a828797acdade714a603");
		ogMakounlock.setVersion("1");
		ogMakounlock.setStockOnly(true);
		ogMakounlock.setHidden(true);
		ArrayList<Action> ogMakounlock_dependencies = new ArrayList<Action>();
		ogMakounlock_dependencies.add(disable_lge_security_og);
		ogMakounlock_dependencies.add(backup_efs_apq8064);
//		ogMakounlock_dependencies.add(fix_stock_recovery_og);
		ogMakounlock.setDependencies(ogMakounlock_dependencies);
		ogMakounlock.setZipFile("mako_unlock.zip");
		ogMakounlock.setZipFileLocation("mako_unlock.zip");
		
		Action ogunlock = new Action();
		ogunlock.setName("Optimus G Unlock");
		ogunlock.setDescription("This will unlock you device using the ics sbl stack without installing a custom recovery");
		ogunlock.setMd5sum("8aabd707db2af3c909c9ffe5762dd406");
		ogunlock.setVersion("1");
		ogunlock.setStockOnly(true);
		ogunlock.setHidden(true);
		ArrayList<Action> ogunlock_dependencies = new ArrayList<Action>();
		ogunlock_dependencies.add(disable_lge_security_og);
		ogunlock_dependencies.add(backup_efs_apq8064);
//		ogunlock_dependencies.add(fix_stock_recovery_og);
		ogunlock.setDependencies(ogunlock_dependencies);
		ogunlock.setZipFile("og_unlock.zip");
		ogunlock.setZipFileLocation("og_unlock.zip");
		
		ArrayList<Action> optimusgCommonActions = new ArrayList<Action>();
		optimusgCommonActions.add(ogunlock);
		optimusgCommonActions.add(ogMakounlock);
		optimusgCommonActions.add(disable_lge_security_og);
		optimusgCommonActions.add(fix_stock_recovery_og);
		optimusgCommonActions.add(backup_efs_apq8064);
		optimusgCommonActions.add(restore_efs_apq8064);
		optimusgCommonActions.add(restore_backups_og);
		optimusgCommonActions.add(loki_update_zip);
		
		ArrayList<Action> optimusgproCommonActions = new ArrayList<Action>();
		optimusgproCommonActions.add(disable_lge_security_loki);
		optimusgproCommonActions.add(backup_efs_apq8064);
		optimusgproCommonActions.add(restore_efs_apq8064);
		optimusgproCommonActions.add(loki_boot);
		optimusgproCommonActions.add(loki_recovery);
		optimusgproCommonActions.add(loki_check);
		optimusgproCommonActions.add(loki_update_zip);
		optimusgproCommonActions.add(loki_update_zip);
		

		ArrayList<Action> g2CommonActions = new ArrayList<Action>();
		g2CommonActions.add(disable_lge_security_msm8974);
		g2CommonActions.add(loki_check);
		g2CommonActions.add(loki_boot);
		g2CommonActions.add(loki_recovery);
		g2CommonActions.add(loki_update_zip);
		g2CommonActions.add(backup_efs_msm8974);
		g2CommonActions.add(restore_efs_msm8974);
		g2CommonActions.add(restore_backups_msm8974);
		g2CommonActions.add(loki_update_zip);
		
		//LG-LS970
		ArrayList<Action> ls970actions = new ArrayList<Action>();
		Device ls970 = new Device();
		ls970.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("Sprint");
		ls970.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		ls970.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-LS970");
		ls970.setModel(model);
		ls970.setProp_id("ro.product.Model");
		ls970.setSW_Prop_id("ro.lge.swversion");
		ls970.setBootloaderExploit(0);
		ls970.setDeviceDetailsLocation("LG-LS970/ls970.xml");
		ls970actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_ls970 = new Action();
		cwm_6045_ls970.setName("CWM-6.0.4.5");
		cwm_6045_ls970.setDescription("This will install "+cwm_6045_ls970.getName() + " and unlock your device as necessary.");
		cwm_6045_ls970.setMd5sum("6931a1d6a527fb46f1cfbb6ec000250f");
		cwm_6045_ls970.setVersion("1");
		cwm_6045_ls970.setZipFile("cwm-6.0.4.5-ls970.zip");
		cwm_6045_ls970.setZipFileLocation("LG-LS970/cwm-6.0.4.5-ls970.zip");
		cwm_6045_ls970.setPriority(5);
		ArrayList<Action> rdepse_cwm_6045_ls970 = new ArrayList<Action>();
		rdepse_cwm_6045_ls970.add(ogMakounlock);
		cwm_6045_ls970.setDependencies(rdepse_cwm_6045_ls970);
		//ls970actions.add(cwm_6045_ls970);
		
		Action cwm_6046_ls970 = new Action();
		cwm_6046_ls970.setName("CWM-6.0.4.6");
		cwm_6046_ls970.setDescription("This will install "+cwm_6046_ls970.getName() + " and unlock your device as necessary.");
		cwm_6046_ls970.setMd5sum("8dc8aec1078d1008bbed9ef3e9a3249a");
		cwm_6046_ls970.setVersion("1");
		cwm_6046_ls970.setZipFile("cwm-6.0.4.6-ls970.zip");
		cwm_6046_ls970.setZipFileLocation("LG-LS970/cwm-6.0.4.6-ls970.zip");
		cwm_6046_ls970.setPriority(5);
		ArrayList<Action> rdepse_cwm_6046_ls970 = new ArrayList<Action>();
		rdepse_cwm_6046_ls970.add(ogMakounlock);
		cwm_6046_ls970.setDependencies(rdepse_cwm_6046_ls970);
		ls970actions.add(cwm_6046_ls970);
		
		Action cwm_6047_ls970 = new Action();
		cwm_6047_ls970.setName("CWM-6.0.4.7");
		cwm_6047_ls970.setDescription("This will install "+cwm_6047_ls970.getName() + " and unlock your device as necessary.");
		cwm_6047_ls970.setMd5sum("6a7ccc529f614ccd1e99aac75c564a2b");
		cwm_6047_ls970.setVersion("1");
		cwm_6047_ls970.setZipFile("cwm-6.0.4.7-ls970.zip");
		cwm_6047_ls970.setZipFileLocation("LG-LS970/cwm-6.0.4.7-ls970.zip");
		cwm_6047_ls970.setPriority(5);
		ArrayList<Action> rdepse_cwm_6047_ls970 = new ArrayList<Action>();
		rdepse_cwm_6047_ls970.add(ogMakounlock);
		cwm_6047_ls970.setDependencies(rdepse_cwm_6047_ls970);
		ls970actions.add(cwm_6047_ls970);
		
		Action twrp_2630_ls970 = new Action();
		twrp_2630_ls970.setName("TWRP-2.6.3.3");
		twrp_2630_ls970.setDescription("This will install "+twrp_2630_ls970.getName() + " and unlock your device as necessary.");
		twrp_2630_ls970.setMd5sum("484b331c3f7d8cdb323ca312474f39d4");
		twrp_2630_ls970.setVersion("1");
		twrp_2630_ls970.setZipFile("twrp-2.6.3.0-ls970.zip");
		twrp_2630_ls970.setZipFileLocation("LG-LS970/twrp-2.6.3.0-ls970.zip");
		ArrayList<Action> rdepse_twrp_2630_ls970 = new ArrayList<Action>();
		rdepse_twrp_2630_ls970.add(ogMakounlock);
		twrp_2630_ls970.setDependencies(rdepse_twrp_2630_ls970);
		ls970actions.add(twrp_2630_ls970);

		ls970.setActions(ls970actions);
		
		partitions = new ArrayList<Partition>();
		partitions.add(new Partition("aboot","mmcblk0p5",true));
		partitions.add(new Partition("sbl1","mmcblk0p2",true));
		partitions.add(new Partition("sbl2","mmcblk0p3",true));
		partitions.add(new Partition("sbl3","mmcblk0p4",true));
		partitions.add(new Partition("recovery","mmcblk0p28",false));
		partitions.add(new Partition("boot","mmcblk0p7",false));
		partitions.add(new Partition("m9kefs1","mmcblk0p12",false));
		partitions.add(new Partition("m9kefs2","mmcblk0p13",false));
		partitions.add(new Partition("m9kefs3","mmcblk0p14",false));
		
		DeviceDetails ls970Details = new DeviceDetails(partitions);

		File ls970DetailsFile = new File("/mnt/Android/optimusg/freegee/2.0/devices/LG-LS970/ls970.xml");
		serializer.write(ls970Details, ls970DetailsFile);
		
		DeviceDetails newls970Details = serializer.read(DeviceDetails.class, ls970DetailsFile);
		
		//LG-E970
		ArrayList<Action> e970actions = new ArrayList<Action>();
		Device e970 = new Device();
		e970.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("Att");
		e970.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e970.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E970");
		e970.setModel(model);
		e970.setProp_id("ro.product.Model");
		e970.setSW_Prop_id("ro.lge.swversion");
		e970.setBootloaderExploit(0);
		e970.setDeviceDetailsLocation("LG-E970/e970.xml");
		e970actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_e970 = new Action();
		cwm_6045_e970.setName("CWM-6.0.4.5");
		cwm_6045_e970.setDescription("This will install "+cwm_6045_e970.getName() + " and unlock your device as necessary.");
		cwm_6045_e970.setMd5sum("3ce6fbe8bfa20c21c33e24fa60a58761");
		cwm_6045_e970.setVersion("1");
		cwm_6045_e970.setZipFile("cwm-6.0.4.5-e970.zip");
		cwm_6045_e970.setZipFileLocation("LG-E970/cwm-6.0.4.5-e970.zip");
		ArrayList<Action> rdepse_cwm_6045_e970 = new ArrayList<Action>();
		rdepse_cwm_6045_e970.add(ogMakounlock);
		cwm_6045_e970.setDependencies(rdepse_cwm_6045_e970);
		//e970actions.add(cwm_6045_e970);
		
		Action cwm_6046_e970 = new Action();
		cwm_6046_e970.setName("CWM-6.0.4.6");
		cwm_6046_e970.setDescription("This will install "+cwm_6046_e970.getName() + " and unlock your device as necessary.");
		cwm_6046_e970.setMd5sum("5c3788938877c5ebb637674f562226c0");
		cwm_6046_e970.setVersion("1");
		cwm_6046_e970.setZipFile("cwm-6.0.4.6-e970.zip");
		cwm_6046_e970.setZipFileLocation("LG-E970/cwm-6.0.4.6-e970.zip");
		ArrayList<Action> rdepse_cwm_6046_e970 = new ArrayList<Action>();
		rdepse_cwm_6046_e970.add(ogMakounlock);
		cwm_6046_e970.setDependencies(rdepse_cwm_6046_e970);
		e970actions.add(cwm_6046_e970);
		
		Action cwm_6047_e970 = new Action();
		cwm_6047_e970.setName("CWM-6.0.4.7");
		cwm_6047_e970.setDescription("This will install "+cwm_6047_e970.getName() + " and unlock your device as necessary.");
		cwm_6047_e970.setMd5sum("40bcbfea623ce73e629746991a036f8d");
		cwm_6047_e970.setVersion("1");
		cwm_6047_e970.setZipFile("cwm-6.0.4.7-e970.zip");
		cwm_6047_e970.setZipFileLocation("LG-E970/cwm-6.0.4.7-e970.zip");
		ArrayList<Action> rdepse_cwm_6047_e970 = new ArrayList<Action>();
		rdepse_cwm_6047_e970.add(ogMakounlock);
		cwm_6047_e970.setDependencies(rdepse_cwm_6047_e970);
		e970actions.add(cwm_6047_e970);
		
		Action twrp_2630_e970 = new Action();
		twrp_2630_e970.setName("TWRP-2.6.3.3");
		twrp_2630_e970.setDescription("This will install "+twrp_2630_e970.getName() + " and unlock your device as necessary.");
		twrp_2630_e970.setMd5sum("562bb173b0b1eb81291ac2af7f480054");
		twrp_2630_e970.setVersion("1");
		twrp_2630_e970.setZipFile("twrp-2.6.3.0-e970.zip");
		twrp_2630_e970.setZipFileLocation("LG-E970/twrp-2.6.3.0-e970.zip");
		ArrayList<Action> rdepse_twrp_2630_e970 = new ArrayList<Action>();
		rdepse_twrp_2630_e970.add(ogMakounlock);
		twrp_2630_e970.setDependencies(rdepse_twrp_2630_e970);
		e970actions.add(twrp_2630_e970);

		e970.setActions(e970actions);
		
		partitions = new ArrayList<Partition>();
		partitions.add(new Partition("aboot","mmcblk0p5",true));
		partitions.add(new Partition("sbl1","mmcblk0p2",true));
		partitions.add(new Partition("sbl2","mmcblk0p3",true));
		partitions.add(new Partition("sbl3","mmcblk0p4",true));
		partitions.add(new Partition("recovery","mmcblk0p27",false));
		partitions.add(new Partition("boot","mmcblk0p7",false));
		partitions.add(new Partition("m9kefs1","mmcblk0p12",false));
		partitions.add(new Partition("m9kefs2","mmcblk0p13",false));
		partitions.add(new Partition("m9kefs3","mmcblk0p14",false));
		
		DeviceDetails e970Details = new DeviceDetails(partitions);

		File e970DetailsFile = new File("/mnt/Android/optimusg/freegee/2.0/devices/LG-E970/e970.xml");
		serializer.write(e970Details, e970DetailsFile);
		
		//LG-E971
		ArrayList<Action> e971actions = new ArrayList<Action>();
		Device e971 = new Device();
		e971.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("Telus");
		carrier.add("Rogers");
		carrier.add("Bell");
		e971.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e971.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E971");
		e971.setModel(model);
		e971.setProp_id("ro.product.Model");
		e971.setSW_Prop_id("ro.lge.swversion");
		e971.setBootloaderExploit(0);
		e971.setDeviceDetailsLocation("LG-E973/e973.xml");
		e971actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_e971 = new Action();
		cwm_6045_e971.setName("CWM-6.0.4.5");
		cwm_6045_e971.setDescription("This will install "+cwm_6045_e971.getName() + " and unlock your device as necessary.");
		cwm_6045_e971.setMd5sum("95d208bf1ccd8b669c24234ad7062034");
		cwm_6045_e971.setVersion("1");
		cwm_6045_e971.setZipFile("cwm-6.0.4.5-e973.zip");
		cwm_6045_e971.setZipFileLocation("LG-E973/cwm-6.0.4.5-e973.zip");
		ArrayList<Action> rdepse_cwm_6045_e971 = new ArrayList<Action>();
		rdepse_cwm_6045_e971.add(ogMakounlock);
		cwm_6045_e971.setDependencies(rdepse_cwm_6045_e971);
		//e971actions.add(cwm_6045_e971);
		
		Action cwm_6046_e973 = new Action();
		cwm_6046_e973.setName("CWM-6.0.4.6");
		cwm_6046_e973.setDescription("This will install "+cwm_6046_e973.getName() + " and unlock your device as necessary.");
		cwm_6046_e973.setMd5sum("e498ea13bdc88b4ce257ae30dfb2e06d");
		cwm_6046_e973.setVersion("1");
		cwm_6046_e973.setZipFile("cwm-6.0.4.6-e973.zip");
		cwm_6046_e973.setZipFileLocation("LG-E973/cwm-6.0.4.6-e973.zip");
		ArrayList<Action> rdepse_cwm_6046_e973 = new ArrayList<Action>();
		rdepse_cwm_6046_e973.add(ogMakounlock);
		cwm_6046_e973.setDependencies(rdepse_cwm_6046_e973);
		e971actions.add(cwm_6046_e973);
		
		Action cwm_6047_e973 = new Action();
		cwm_6047_e973.setName("CWM-6.0.4.7");
		cwm_6047_e973.setDescription("This will install "+cwm_6047_e973.getName() + " and unlock your device as necessary.");
		cwm_6047_e973.setMd5sum("8f1cc64483842b02e3eb8f6fcbdac3d8");
		cwm_6047_e973.setVersion("1");
		cwm_6047_e973.setZipFile("cwm-6.0.4.7-e973.zip");
		cwm_6047_e973.setZipFileLocation("LG-E973/cwm-6.0.4.7-e973.zip");
		ArrayList<Action> rdepse_cwm_6047_e973 = new ArrayList<Action>();
		rdepse_cwm_6047_e973.add(ogMakounlock);
		cwm_6047_e973.setDependencies(rdepse_cwm_6047_e973);
		e971actions.add(cwm_6047_e973);
		
		Action twrp_2630_e973 = new Action();
		twrp_2630_e973.setName("TWRP-2.6.3.3");
		twrp_2630_e973.setDescription("This will install "+twrp_2630_e973.getName() + " and unlock your device as necessary.");
		twrp_2630_e973.setMd5sum("b1b09ab7c12912bf1c53a3b98e8367e5");
		twrp_2630_e973.setVersion("1");
		twrp_2630_e973.setZipFile("twrp-2.6.3.0-e973.zip");
		twrp_2630_e973.setZipFileLocation("LG-E973/twrp-2.6.3.0-e973.zip");
		ArrayList<Action> rdepse_twrp_2630_e973 = new ArrayList<Action>();
		rdepse_twrp_2630_e973.add(ogMakounlock);
		twrp_2630_e973.setDependencies(rdepse_twrp_2630_e973);
		e971actions.add(twrp_2630_e973);

		e971.setActions(e971actions);
		
		partitions = new ArrayList<Partition>();
		partitions.add(new Partition("aboot","mmcblk0p5",true));
		partitions.add(new Partition("sbl1","mmcblk0p2",true));
		partitions.add(new Partition("sbl2","mmcblk0p3",true));
		partitions.add(new Partition("sbl3","mmcblk0p4",true));
		partitions.add(new Partition("recovery","mmcblk0p27",false));
		partitions.add(new Partition("boot","mmcblk0p7",false));
		partitions.add(new Partition("m9kefs1","mmcblk0p12",false));
		partitions.add(new Partition("m9kefs2","mmcblk0p13",false));
		partitions.add(new Partition("m9kefs3","mmcblk0p14",false));
		
		DeviceDetails e973Details = new DeviceDetails(partitions);

		File e973DetailsFile = new File("/mnt/Android/optimusg/freegee/2.0/devices/LG-E973/e973.xml");
		serializer.write(e973Details, e973DetailsFile);
		
		//LG-E973
		ArrayList<Action> e973actions = new ArrayList<Action>();
		Device e973 = new Device();
		e973.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("Telus");
		carrier.add("Rogers");
		carrier.add("Bell");
		e973.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e973.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E973");
		e973.setModel(model);
		e973.setProp_id("ro.product.Model");
		e973.setSW_Prop_id("ro.lge.swversion");
		e973.setBootloaderExploit(0);
		e973.setDeviceDetailsLocation("LG-E973/e973.xml");
		e973actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_e973 = new Action();
		cwm_6045_e973.setName("CWM-6.0.4.5");
		cwm_6045_e973.setDescription("This will install "+cwm_6045_e973.getName() + " and unlock your device as necessary.");
		cwm_6045_e973.setMd5sum("95d208bf1ccd8b669c24234ad7062034");
		cwm_6045_e973.setVersion("1");
		cwm_6045_e973.setZipFile("cwm-6.0.4.5-e973.zip");
		cwm_6045_e973.setZipFileLocation("LG-E973/cwm-6.0.4.5-e973.zip");
		ArrayList<Action> rdepse_cwm_6045_e973 = new ArrayList<Action>();
		rdepse_cwm_6045_e973.add(ogunlock);
		cwm_6045_e973.setDependencies(rdepse_cwm_6045_e973);
		//e973actions.add(cwm_6045_e973);
		e973actions.add(cwm_6046_e973);
		e973actions.add(cwm_6047_e973);
		e973actions.add(twrp_2630_e973);

		e973.setActions(e973actions);
		
		//LG-E975
		ArrayList<Action> e975actions = new ArrayList<Action>();
		Device e975 = new Device();
		e975.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e975.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e975.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E975");
		e975.setModel(model);
		e975.setProp_id("ro.product.Model");
		e975.setSW_Prop_id("ro.lge.swversion");
		e975.setBootloaderExploit(0);
		e975.setDeviceDetailsLocation("LG-E975/e975.xml");
		e975actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_e975 = new Action();
		cwm_6045_e975.setName("CWM-6.0.4.5");
		cwm_6045_e975.setDescription("This will install "+cwm_6045_e975.getName() + " and unlock your device as necessary.");
		cwm_6045_e975.setMd5sum("f92e000b33bb3a34ce10f43adb5efbab");
		cwm_6045_e975.setVersion("1");
		cwm_6045_e975.setZipFile("cwm-6.0.4.5-e975.zip");
		cwm_6045_e975.setZipFileLocation("LG-E975/cwm-6.0.4.5-e975.zip");
		ArrayList<Action> rdepse_cwm_6045_e975 = new ArrayList<Action>();
		rdepse_cwm_6045_e975.add(ogMakounlock);
		cwm_6045_e975.setDependencies(rdepse_cwm_6045_e975);
		//e975actions.add(cwm_6045_e975);
		
		Action cwm_6046_e975 = new Action();
		cwm_6046_e975.setName("CWM-6.0.4.6");
		cwm_6046_e975.setDescription("This will install "+cwm_6046_e975.getName() + " and unlock your device as necessary.");
		cwm_6046_e975.setMd5sum("0a9a13af8cc0b3dafda91c22473fa6ef");
		cwm_6046_e975.setVersion("1");
		cwm_6046_e975.setZipFile("cwm-6.0.4.6-e975.zip");
		cwm_6046_e975.setZipFileLocation("LG-E975/cwm-6.0.4.6-e975.zip");
		ArrayList<Action> rdepse_cwm_6046_e975 = new ArrayList<Action>();
		rdepse_cwm_6046_e975.add(ogMakounlock);
		cwm_6046_e975.setDependencies(rdepse_cwm_6046_e975);
		e975actions.add(cwm_6046_e975);
		
		Action cwm_6047_e975 = new Action();
		cwm_6047_e975.setName("CWM-6.0.4.7");
		cwm_6047_e975.setDescription("This will install "+cwm_6047_e975.getName() + " and unlock your device as necessary.");
		cwm_6047_e975.setMd5sum("cc5b2e72fa30472660a08f5a933ba450");
		cwm_6047_e975.setVersion("1");
		cwm_6047_e975.setZipFile("cwm-6.0.4.7-e975.zip");
		cwm_6047_e975.setZipFileLocation("LG-E975/cwm-6.0.4.7-e975.zip");
		ArrayList<Action> rdepse_cwm_6047_e975 = new ArrayList<Action>();
		rdepse_cwm_6047_e975.add(ogMakounlock);
		cwm_6047_e975.setDependencies(rdepse_cwm_6047_e975);
		e975actions.add(cwm_6047_e975);
		
		Action twrp_2630_e975 = new Action();
		twrp_2630_e975.setName("TWRP-2.6.3.3");
		twrp_2630_e975.setDescription("This will install "+twrp_2630_e975.getName() + " and unlock your device as necessary.");
		twrp_2630_e975.setMd5sum("7ccc5764295ee1777b5e583500a5717b");
		twrp_2630_e975.setVersion("1");
		twrp_2630_e975.setZipFile("twrp-2.6.3.0-e975.zip");
		twrp_2630_e975.setZipFileLocation("LG-E975/twrp-2.6.3.0-e975.zip");
		ArrayList<Action> rdepse_twrp_2630_e975 = new ArrayList<Action>();
		rdepse_twrp_2630_e975.add(ogMakounlock);
		twrp_2630_e975.setDependencies(rdepse_twrp_2630_e975);
		e975actions.add(twrp_2630_e975);

		e975.setActions(e975actions);
		
		partitions = new ArrayList<Partition>();
		partitions.add(new Partition("aboot","mmcblk0p5",true));
		partitions.add(new Partition("sbl1","mmcblk0p2",true));
		partitions.add(new Partition("sbl2","mmcblk0p3",true));
		partitions.add(new Partition("sbl3","mmcblk0p4",true));
		partitions.add(new Partition("recovery","mmcblk0p27",false));
		partitions.add(new Partition("boot","mmcblk0p7",false));
		partitions.add(new Partition("m9kefs1","mmcblk0p12",false));
		partitions.add(new Partition("m9kefs2","mmcblk0p13",false));
		partitions.add(new Partition("m9kefs3","mmcblk0p14",false));
		
		DeviceDetails e975Details = new DeviceDetails(partitions);

		File e975DetailsFile = new File("/mnt/Android/optimusg/freegee/2.0/devices/LG-E975/e975.xml");
		serializer.write(e975Details, e975DetailsFile);
		
		//LG-E975k
		Device e975k = new Device();
		e975k.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e975k.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e975k.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E975K");
		e975k.setModel(model);
		e975k.setProp_id("ro.product.Model");
		e975k.setSW_Prop_id("ro.lge.swversion");
		e975k.setBootloaderExploit(0);
		e975k.setDeviceDetailsLocation("LG-E975/e975.xml");
		e975k.setActions(e975actions);
		
		//LG-E975W
		Device e975w = new Device();
		e975w.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e975w.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e975w.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E975W");
		e975w.setModel(model);;
		e975w.setProp_id("ro.product.Model");
		e975w.setSW_Prop_id("ro.lge.swversion");
		e975w.setBootloaderExploit(0);
		e975w.setDeviceDetailsLocation("LG-E975/e975.xml");
		e975w.setActions(e975actions);

		//LG-E976
		Device e976 = new Device();
		e976.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e976.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e976.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E976");
		e976.setModel(model);
		e976.setProp_id("ro.product.Model");
		e976.setSW_Prop_id("ro.lge.swversion");
		e976.setBootloaderExploit(0);
		e976.setDeviceDetailsLocation("LG-E975/e975.xml");
		e976.setActions(e975actions);
		
		//LG-E977
		Device e977 = new Device();
		e977.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e977.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e977.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E977");
		e977.setModel(model);
		e977.setProp_id("ro.product.Model");
		e977.setSW_Prop_id("ro.lge.swversion");
		e977.setBootloaderExploit(0);
		e977.setDeviceDetailsLocation("LG-E975/e975.xml");
		e977.setActions(e975actions);
		
		//LG-E987
		Device e987 = new Device();
		e987.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e987.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e987.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E987");
		e987.setModel(model);
		e987.setProp_id("ro.product.Model");
		e987.setSW_Prop_id("ro.lge.swversion");
		e987.setBootloaderExploit(0);
		e987.setDeviceDetailsLocation("LG-E975/e975.xml");
		e987.setActions(e975actions);
		
		//LG-180K
		ArrayList<Action> k180actions = new ArrayList<Action>();
		Device k180 = new Device();
		k180.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		k180.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		k180.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-F180K");
		k180.setModel(model);
		k180.setProp_id("ro.product.Model");
		k180.setSW_Prop_id("ro.lge.swversion");
		k180.setBootloaderExploit(0);
		k180.setDeviceDetailsLocation("LG-180K/180k.xml");
		k180actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_180k = new Action();
		cwm_6045_180k.setName("CWM-6.0.4.5");
		cwm_6045_180k.setDescription("This will install "+cwm_6045_180k.getName() + " and unlock your device as necessary.");
		cwm_6045_180k.setMd5sum("2e59251fa600bed0de7e822eef5551ed");
		cwm_6045_180k.setVersion("1");
		cwm_6045_180k.setZipFile("cwm-6.0.4.5-180k.zip");
		cwm_6045_180k.setZipFileLocation("LG-180K/cwm-6.0.4.5-180k.zip");
		ArrayList<Action> rdepse_cwm_6045_180k = new ArrayList<Action>();
		rdepse_cwm_6045_180k.add(ogMakounlock);
		cwm_6045_180k.setDependencies(rdepse_cwm_6045_180k);
		//k180actions.add(cwm_6045_180k);
		
		Action cwm_6046_180k = new Action();
		cwm_6046_180k.setName("CWM-6.0.4.6");
		cwm_6046_180k.setDescription("This will install "+cwm_6046_180k.getName() + " and unlock your device as necessary.");
		cwm_6046_180k.setMd5sum("3967795eaeaa16eb4bf517844dd728de");
		cwm_6046_180k.setVersion("1");
		cwm_6046_180k.setZipFile("cwm-6.0.4.6-180k.zip");
		cwm_6046_180k.setZipFileLocation("LG-180K/cwm-6.0.4.6-180k.zip");
		ArrayList<Action> rdepse_cwm_6046_180k = new ArrayList<Action>();
		rdepse_cwm_6046_180k.add(ogMakounlock);
		cwm_6046_180k.setDependencies(rdepse_cwm_6046_180k);
		//k180actions.add(cwm_6046_180k);
		
		Action cwm_6047_180k = new Action();
		cwm_6047_180k.setName("CWM-6.0.4.7");
		cwm_6047_180k.setDescription("This will install "+cwm_6047_180k.getName() + " and unlock your device as necessary.");
		cwm_6047_180k.setMd5sum("88f067778aed07a2db99fe524c0fa07e");
		cwm_6047_180k.setVersion("1");
		cwm_6047_180k.setZipFile("cwm-6.0.4.7-180k.zip");
		cwm_6047_180k.setZipFileLocation("LG-180K/cwm-6.0.4.7-180k.zip");
		ArrayList<Action> rdepse_cwm_6047_180k = new ArrayList<Action>();
		rdepse_cwm_6047_180k.add(ogMakounlock);
		cwm_6047_180k.setDependencies(rdepse_cwm_6047_180k);
		k180actions.add(cwm_6047_180k);
		
		Action twrp_2630_180k = new Action();
		twrp_2630_180k.setName("TWRP-2.6.3.3");
		twrp_2630_180k.setDescription("This will install "+twrp_2630_180k.getName() + " and unlock your device as necessary.");
		twrp_2630_180k.setMd5sum("53983f2e6a4ac142a2390e7b6740d66c");
		twrp_2630_180k.setVersion("1");
		twrp_2630_180k.setZipFile("twrp-2.6.3.0-180k.zip");
		twrp_2630_180k.setZipFileLocation("LG-180K/twrp-2.6.3.0-180k.zip");
		ArrayList<Action> rdepse_twrp_2630_180k = new ArrayList<Action>();
		rdepse_twrp_2630_180k.add(ogMakounlock);
		twrp_2630_180k.setDependencies(rdepse_twrp_2630_180k);
		k180actions.add(twrp_2630_180k);

		k180.setActions(k180actions);
		
		partitions = new ArrayList<Partition>();
		partitions.add(new Partition("aboot","mmcblk0p5",true));
		partitions.add(new Partition("sbl1","mmcblk0p2",true));
		partitions.add(new Partition("sbl2","mmcblk0p3",true));
		partitions.add(new Partition("sbl3","mmcblk0p4",true));
		partitions.add(new Partition("recovery","mmcblk0p27",false));
		partitions.add(new Partition("boot","mmcblk0p7",false));
		partitions.add(new Partition("m9kefs1","mmcblk0p12",false));
		partitions.add(new Partition("m9kefs2","mmcblk0p13",false));
		partitions.add(new Partition("m9kefs3","mmcblk0p14",false));
		
		DeviceDetails k180Details = new DeviceDetails(partitions);

		File k180DetailsFile = new File("/mnt/Android/optimusg/freegee/2.0/devices/LG-180K/180k.xml");
		serializer.write(k180Details, k180DetailsFile);
		
		//LG-180L
		ArrayList<Action> l180actions = new ArrayList<Action>();
		Device l180 = new Device();
		l180.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		l180.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		l180.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-F180L");
		l180.setModel(model);
		l180.setProp_id("ro.product.model");
		l180.setSW_Prop_id("ro.lge.swversion");
		l180.setBootloaderExploit(0);
		l180.setDeviceDetailsLocation("LG-180l/180l.xml");
		l180actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_180l = new Action();
		cwm_6045_180l.setName("CWM-6.0.4.5");
		cwm_6045_180l.setDescription("This will install "+cwm_6045_180l.getName() + " and unlock your device as necessary.");
		cwm_6045_180l.setMd5sum("0a0e9fcfecd53b46e7963cce75a8b3cf");
		cwm_6045_180l.setVersion("1");
		cwm_6045_180l.setZipFile("cwm-6.0.4.5-180l.zip");
		cwm_6045_180l.setZipFileLocation("LG-180L/cwm-6.0.4.5-180l.zip");
		ArrayList<Action> rdepse_cwm_6045_180l = new ArrayList<Action>();
		rdepse_cwm_6045_180l.add(ogMakounlock);
		cwm_6045_180l.setDependencies(rdepse_cwm_6045_180l);
		//l180actions.add(cwm_6045_180l);
		
		Action cwm_6046_180l = new Action();
		cwm_6046_180l.setName("CWM-6.0.4.6");
		cwm_6046_180l.setDescription("This will install "+cwm_6046_180l.getName() + " and unlock your device as necessary.");
		cwm_6046_180l.setMd5sum("7498fece4db05f410764fb4c5e9d8192");
		cwm_6046_180l.setVersion("1");
		cwm_6046_180l.setZipFile("cwm-6.0.4.6-180l.zip");
		cwm_6046_180l.setZipFileLocation("LG-180L/cwm-6.0.4.6-180l.zip");
		ArrayList<Action> rdepse_cwm_6046_180l = new ArrayList<Action>();
		rdepse_cwm_6046_180l.add(ogMakounlock);
		cwm_6046_180l.setDependencies(rdepse_cwm_6046_180l);
		//l180actions.add(cwm_6046_180l);
		
		Action cwm_6047_180l = new Action();
		cwm_6047_180l.setName("CWM-6.0.4.7");
		cwm_6047_180l.setDescription("This will install "+cwm_6047_180l.getName() + " and unlock your device as necessary.");
		cwm_6047_180l.setMd5sum("2ec23929f69229910c7e42bc10f6a611");
		cwm_6047_180l.setVersion("1");
		cwm_6047_180l.setZipFile("cwm-6.0.4.7-180l.zip");
		cwm_6047_180l.setZipFileLocation("LG-180L/cwm-6.0.4.7-180l.zip");
		ArrayList<Action> rdepse_cwm_6047_180l = new ArrayList<Action>();
		rdepse_cwm_6047_180l.add(ogMakounlock);
		cwm_6047_180l.setDependencies(rdepse_cwm_6047_180l);
		l180actions.add(cwm_6047_180l);
		
		Action twrp_2630_180l = new Action();
		twrp_2630_180l.setName("TWRP-2.6.3.3");
		twrp_2630_180l.setDescription("This will install "+twrp_2630_180l.getName() + " and unlock your device as necessary.");
		twrp_2630_180l.setMd5sum("12d75351a4e907991c05e7aa3b026f3c");
		twrp_2630_180l.setVersion("1");
		twrp_2630_180l.setZipFile("twrp-2.6.3.0-180l.zip");
		twrp_2630_180l.setZipFileLocation("LG-180L/twrp-2.6.3.0-180l.zip");
		ArrayList<Action> rdepse_twrp_2630_180l = new ArrayList<Action>();
		rdepse_twrp_2630_180l.add(ogMakounlock);
		twrp_2630_180l.setDependencies(rdepse_twrp_2630_180l);
		l180actions.add(twrp_2630_180l);

		l180.setActions(l180actions);
		
		partitions = new ArrayList<Partition>();
		partitions.add(new Partition("aboot","mmcblk0p5",true));
		partitions.add(new Partition("sbl1","mmcblk0p2",true));
		partitions.add(new Partition("sbl2","mmcblk0p3",true));
		partitions.add(new Partition("sbl3","mmcblk0p4",true));
		partitions.add(new Partition("recovery","mmcblk0p27",false));
		partitions.add(new Partition("boot","mmcblk0p7",false));
		partitions.add(new Partition("m9kefs1","mmcblk0p12",false));
		partitions.add(new Partition("m9kefs2","mmcblk0p13",false));
		partitions.add(new Partition("m9kefs3","mmcblk0p14",false));
		
		DeviceDetails l180Details = new DeviceDetails(partitions);

		File l180DetailsFile = new File("/mnt/Android/optimusg/freegee/2.0/devices/LG-180L/180l.xml");
		serializer.write(l180Details, l180DetailsFile);
		
		//LG-180S
		ArrayList<Action> s180actions = new ArrayList<Action>();
		Device s180 = new Device();
		s180.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		s180.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		s180.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-F180S");
		s180.setModel(model);
		s180.setProp_id("ro.product.Model");
		s180.setSW_Prop_id("ro.lge.swversion");
		s180.setBootloaderExploit(0);
		s180.setDeviceDetailsLocation("LG-180S/180s.xml");
		s180actions.addAll(optimusgCommonActions);
		
		Action cwm_6045_180s = new Action();
		cwm_6045_180s.setName("CWM-6.0.4.5");
		cwm_6045_180s.setDescription("This will install "+cwm_6045_180s.getName() + " and unlock your device as necessary.");
		cwm_6045_180s.setMd5sum("544eff71a4f6e5403653f7cc7b0fbfd0");
		cwm_6045_180s.setVersion("1");
		cwm_6045_180s.setZipFile("cwm-6.0.4.5-180s.zip");
		cwm_6045_180s.setZipFileLocation("LG-180S/cwm-6.0.4.5-180s.zip");
		ArrayList<Action> rdepse_cwm_6045_180s = new ArrayList<Action>();
		rdepse_cwm_6045_180s.add(ogMakounlock);
		cwm_6045_180s.setDependencies(rdepse_cwm_6045_180s);
		//s180actions.add(cwm_6045_180s);
		
		Action cwm_6046_180s = new Action();
		cwm_6046_180s.setName("CWM-6.0.4.6");
		cwm_6046_180s.setDescription("This will install "+cwm_6046_180s.getName() + " and unlock your device as necessary.");
		cwm_6046_180s.setMd5sum("e22db5b9165a8599e85934d1dcf5aacc");
		cwm_6046_180s.setVersion("1");
		cwm_6046_180s.setZipFile("cwm-6.0.4.6-180s.zip");
		cwm_6046_180s.setZipFileLocation("LG-180S/cwm-6.0.4.6-180s.zip");
		ArrayList<Action> rdepse_cwm_6046_180s = new ArrayList<Action>();
		rdepse_cwm_6046_180s.add(ogMakounlock);
		cwm_6046_180s.setDependencies(rdepse_cwm_6046_180s);
		s180actions.add(cwm_6046_180s);
		
		Action cwm_6047_180s = new Action();
		cwm_6047_180s.setName("CWM-6.0.4.7");
		cwm_6047_180s.setDescription("This will install "+cwm_6047_180s.getName() + " and unlock your device as necessary.");
		cwm_6047_180s.setMd5sum("a7f5812cb102ec38d15df064ed306e81");
		cwm_6047_180s.setVersion("1");
		cwm_6047_180s.setZipFile("cwm-6.0.4.7-180s.zip");
		cwm_6047_180s.setZipFileLocation("LG-180S/cwm-6.0.4.7-180s.zip");
		ArrayList<Action> rdepse_cwm_6047_180s = new ArrayList<Action>();
		rdepse_cwm_6047_180s.add(ogMakounlock);
		cwm_6047_180s.setDependencies(rdepse_cwm_6047_180s);
		s180actions.add(cwm_6047_180s);
		
		Action twrp_2630_180s = new Action();
		twrp_2630_180s.setName("TWRP-2.6.3.3");
		twrp_2630_180s.setDescription("This will install "+twrp_2630_180s.getName() + " and unlock your device as necessary.");
		twrp_2630_180s.setMd5sum("a106834659fdcb19d4f04115f7ac1027");
		twrp_2630_180s.setVersion("1");
		twrp_2630_180s.setZipFile("twrp-2.6.3.0-180s.zip");
		twrp_2630_180s.setZipFileLocation("LG-180S/twrp-2.6.3.0-180s.zip");
		ArrayList<Action> rdepse_twrp_2630_180s = new ArrayList<Action>();
		rdepse_twrp_2630_180s.add(ogMakounlock);
		twrp_2630_180s.setDependencies(rdepse_twrp_2630_180s);
		s180actions.add(twrp_2630_180s);

		s180.setActions(s180actions);
		
		partitions = new ArrayList<Partition>();
		partitions.add(new Partition("aboot","mmcblk0p5",true));
		partitions.add(new Partition("sbl1","mmcblk0p2",true));
		partitions.add(new Partition("sbl2","mmcblk0p3",true));
		partitions.add(new Partition("sbl3","mmcblk0p4",true));
		partitions.add(new Partition("recovery","mmcblk0p27",false));
		partitions.add(new Partition("boot","mmcblk0p7",false));
		partitions.add(new Partition("m9kefs1","mmcblk0p12",false));
		partitions.add(new Partition("m9kefs2","mmcblk0p13",false));
		partitions.add(new Partition("m9kefs3","mmcblk0p14",false));
		
		DeviceDetails s180Details = new DeviceDetails(partitions);

		File s180DetailsFile = new File("/mnt/Android/optimusg/freegee/2.0/devices/LG-180S/180s.xml");
		serializer.write(s180Details, s180DetailsFile);
		
		//LG-E980
		ArrayList<Action> e980actions = new ArrayList<Action>();
		Device e980 = new Device();
		e980.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e980.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e980.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E980");
		model.add("Optimus G Pro");
		e980.setModel(model);
		e980.setProp_id("ro.product.Model");
		e980.setSW_Prop_id("ro.lge.swversion");
		e980.setBootloaderExploit(1);
		e980actions.addAll(optimusgproCommonActions);
		
		Action cwm_6045_e980 = new Action();
		cwm_6045_e980.setName("CWM-6.0.4.5");
		cwm_6045_e980.setDescription("This will install "+cwm_6045_e980.getName());
		cwm_6045_e980.setMd5sum("828dfb228fa0a3a5cc96de145fec7342");
		cwm_6045_e980.setVersion("1");
		cwm_6045_e980.setZipFile("cwm-6.0.4.5-e980.zip");
		cwm_6045_e980.setZipFileLocation("LG-E980/cwm-6.0.4.5-e980.zip");
		ArrayList<Action> rdepse_cwm_6045_e980 = new ArrayList<Action>();
		rdepse_cwm_6045_e980.add(loki_recovery);
		cwm_6045_e980.setDependencies(rdepse_cwm_6045_e980);
		//e980actions.add(cwm_6045_e980);
		
		Action cwm_6046_e980 = new Action();
		cwm_6046_e980.setName("CWM-6.0.4.6");
		cwm_6046_e980.setDescription("This will install "+cwm_6046_e980.getName());
		cwm_6046_e980.setMd5sum("f92c8a83cef536b39565bd8ac93bf920");
		cwm_6046_e980.setVersion("1");
		cwm_6046_e980.setZipFile("cwm-6.0.4.6-e980.zip");
		cwm_6046_e980.setZipFileLocation("LG-E980/cwm-6.0.4.6-e980.zip");
		ArrayList<Action> rdepse_cwm_6046_e980 = new ArrayList<Action>();
		rdepse_cwm_6046_e980.add(loki_recovery);
		cwm_6046_e980.setDependencies(rdepse_cwm_6046_e980);
		e980actions.add(cwm_6046_e980);
		
		Action cwm_6047_e980 = new Action();
		cwm_6047_e980.setName("CWM-6.0.4.7");
		cwm_6047_e980.setDescription("This will install "+cwm_6047_e980.getName());
		cwm_6047_e980.setMd5sum("fef03ea6d57ed7a70c02bd0762e63db4");
		cwm_6047_e980.setVersion("1");
		cwm_6047_e980.setZipFile("cwm-6.0.4.7-e980.zip");
		cwm_6047_e980.setZipFileLocation("LG-E980/cwm-6.0.4.7-e980.zip");
		ArrayList<Action> rdepse_cwm_6047_e980 = new ArrayList<Action>();
		rdepse_cwm_6047_e980.add(loki_recovery);
		cwm_6047_e980.setDependencies(rdepse_cwm_6047_e980);
		e980actions.add(cwm_6047_e980);
		
		Action twrp_2630_e980 = new Action();
		twrp_2630_e980.setName("TWRP-2.6.3.3");
		twrp_2630_e980.setDescription("This will install "+twrp_2630_e980.getName());
		twrp_2630_e980.setMd5sum("43b41bec4540b80494934db95532c450");
		twrp_2630_e980.setVersion("1");
		twrp_2630_e980.setZipFile("twrp-2.6.3.0-e980.zip");
		twrp_2630_e980.setZipFileLocation("LG-E980/twrp-2.6.3.0-e980.zip");
		ArrayList<Action> rdepse_twrp_2630_e980 = new ArrayList<Action>();
		rdepse_twrp_2630_e980.add(loki_recovery);
		twrp_2630_e980.setDependencies(rdepse_twrp_2630_e980);		
		e980actions.add(twrp_2630_e980);

		e980.setActions(e980actions);
		
		//LG-E980h
		Device e980h = new Device();
		e980h.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e980h.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e980h.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E980h");
		model.add("LG-E981h");
		e980h.setModel(model);
		e980h.setProp_id("ro.product.Model");
		e980h.setSW_Prop_id("ro.lge.swversion");
		e980h.setBootloaderExploit(1);
		e980h.setActions(e980actions);
		
		//LG-E986
		Device e986 = new Device();
		e986.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e986.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e986.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E986");
		e986.setModel(model);
		e986.setProp_id("ro.product.Model");
		e986.setSW_Prop_id("ro.lge.swversion");
		e986.setBootloaderExploit(1);
		e986.setActions(e980actions);
		
		//LG-E988
		Device e988 = new Device();
		e988.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e988.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e988.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E988");
		e988.setModel(model);
		e988.setProp_id("ro.product.Model");
		e988.setSW_Prop_id("ro.lge.swversion");
		e988.setBootloaderExploit(1);
		e988.setActions(e980actions);
		
		//LG-E989
		Device e989 = new Device();
		e989.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e989.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e989.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-E989");
		e989.setModel(model);
		e989.setProp_id("ro.product.Model");
		e989.setSW_Prop_id("ro.lge.swversion");
		e989.setBootloaderExploit(1);
		e989.setActions(e980actions);
		
		//LG-F240L
		Device f240l = new Device();
		f240l.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		f240l.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		f240l.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-F240L");
		f240l.setModel(model);
		f240l.setProp_id("ro.product.Model");
		f240l.setSW_Prop_id("ro.lge.swversion");
		f240l.setBootloaderExploit(1);
		f240l.setActions(e980actions);
		
		//LG-F240S
		Device f240s = new Device();
		f240s.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		f240s.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		f240s.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-F240S");
		f240s.setModel(model);
		f240s.setProp_id("ro.product.Model");
		f240s.setSW_Prop_id("ro.lge.swversion");
		f240s.setBootloaderExploit(1);
		f240s.setActions(e980actions);
		
		//LG-F240K
		Device f240k = new Device();
		f240k.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		f240k.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		f240k.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-F240K");
		f240k.setModel(model);
		f240k.setProp_id("ro.product.Model");
		f240k.setSW_Prop_id("ro.lge.swversion");
		f240k.setBootloaderExploit(1);
		f240k.setActions(e980actions);
		
		//LG-F220
		ArrayList<Action> f220kactions = new ArrayList<Action>();
		Device f220k = new Device();
		f220k.setName("LG Optimus GK");
		carrier = new ArrayList<String>();
		carrier.add("any");
		f220k.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		f220k.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-F220K");
		f220k.setModel(model);
		f220k.setProp_id("ro.product.Model");
		f220k.setSW_Prop_id("ro.lge.swversion");
		f220k.setBootloaderExploit(1);
		f220kactions.add(disable_lge_security_loki);
		f220kactions.add(loki_check);
		f220kactions.add(loki_boot);
		f220kactions.add(loki_recovery);
		
		Action cwm_6045_f220 = new Action();
		cwm_6045_f220.setName("CWM-6.0.4.5");
		cwm_6045_f220.setDescription("This will install "+cwm_6045_f220.getName());
		cwm_6045_f220.setMd5sum("1af780c9334dc5e254048e20a5cb2719");
		cwm_6045_f220.setVersion("1");
		cwm_6045_f220.setZipFile("cwm-6.0.4.5-f220.zip");
		cwm_6045_f220.setZipFileLocation("LG-F220/cwm-6.0.4.5-f220.zip");
		ArrayList<Action> rdepse_cwm_6045_f220 = new ArrayList<Action>();
		rdepse_cwm_6045_f220.add(loki_recovery);
		cwm_6045_f220.setDependencies(rdepse_cwm_6045_f220);
		//f220kactions.add(cwm_6045_f220);
		
		Action cwm_6046_f220 = new Action();
		cwm_6046_f220.setName("CWM-6.0.4.6");
		cwm_6046_f220.setDescription("This will install "+cwm_6046_f220.getName());
		cwm_6046_f220.setMd5sum("f92c8a83cef536b39565bd8ac93bf920");
		cwm_6046_f220.setVersion("1");
		cwm_6046_f220.setZipFile("cwm-6.0.4.6-f220.zip");
		cwm_6046_f220.setZipFileLocation("LG-F220/cwm-6.0.4.6-f220.zip");
		ArrayList<Action> rdepse_cwm_6046_f220 = new ArrayList<Action>();
		rdepse_cwm_6046_f220.add(loki_recovery);
		cwm_6046_f220.setDependencies(rdepse_cwm_6046_f220);
		f220kactions.add(cwm_6046_f220);
		
		Action cwm_6047_f220 = new Action();
		cwm_6047_f220.setName("CWM-6.0.4.7");
		cwm_6047_f220.setDescription("This will install "+cwm_6047_f220.getName());
		cwm_6047_f220.setMd5sum("1be361ba8b1feb2c4abee3cccd59eb97");
		cwm_6047_f220.setVersion("1");
		cwm_6047_f220.setZipFile("cwm-6.0.4.7-f220.zip");
		cwm_6047_f220.setZipFileLocation("LG-F220/cwm-6.0.4.7-f220.zip");
		ArrayList<Action> rdepse_cwm_6047_f220 = new ArrayList<Action>();
		rdepse_cwm_6047_f220.add(loki_recovery);
		cwm_6047_f220.setDependencies(rdepse_cwm_6047_f220);
		f220kactions.add(cwm_6047_f220);
		
		Action twrp_2630_f220 = new Action();
		twrp_2630_f220.setName("TWRP-2.6.3.3");
		twrp_2630_f220.setDescription("This will install "+twrp_2630_f220.getName());
		twrp_2630_f220.setMd5sum("12060c8ea7b7377b3c36047cc98f6325");
		twrp_2630_f220.setVersion("1");
		twrp_2630_f220.setZipFile("twrp-2.6.3.0-f220.zip");
		twrp_2630_f220.setZipFileLocation("LG-F220/twrp-2.6.3.0-f220.zip");
		ArrayList<Action> rdepse_twrp_2630_f220 = new ArrayList<Action>();
		rdepse_twrp_2630_f220.add(loki_recovery);
		twrp_2630_f220.setDependencies(rdepse_twrp_2630_f220);
		
		f220kactions.add(twrp_2630_f220);
		f220kactions.add(backup_efs_apq8064);
		f220kactions.add(restore_efs_apq8064);
		f220k.setActions(f220kactions);
		
		//LG-D800
		ArrayList<Action> d800actions = new ArrayList<Action>();
		Device d800 = new Device();
		d800.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Att");
		d800.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("d80010d");
		firmware.add("d80010o");
		firmware.add("any");
		d800.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-D800");
		d800.setModel(model);
		d800.setProp_id("ro.product.Model");
		d800.setSW_Prop_id("ro.lge.swversion");
		d800.setBootloaderExploit(1);
		d800actions.addAll(g2CommonActions);
		
		Action cwm_6045_d800 = new Action();
		cwm_6045_d800.setName("CWM-6.0.4.5");
		cwm_6045_d800.setDescription("This will install "+cwm_6045_d800.getName());
		cwm_6045_d800.setMd5sum("4e1ee600bc3853ffc431044788f5de85");
		cwm_6045_d800.setVersion("1");
		cwm_6045_d800.setZipFile("cwm-6.0.4.5-d800.zip");
		cwm_6045_d800.setZipFileLocation("LG-D800/cwm-6.0.4.5-d800.zip");
		ArrayList<Action> rdepse_cwm_6045_d800 = new ArrayList<Action>();
		rdepse_cwm_6045_d800.add(loki_recovery);
		cwm_6045_d800.setDependencies(rdepse_cwm_6045_d800);
		
		Action cwm_6046_d800 = new Action();
		cwm_6046_d800.setName("CWM-6.0.4.6");
		cwm_6046_d800.setDescription("This will install "+cwm_6046_d800.getName());
		cwm_6046_d800.setMd5sum("93909b9e4a90cbd6fe392a707b200342");
		cwm_6046_d800.setVersion("1");
		cwm_6046_d800.setZipFile("cwm-6.0.4.6-d800.zip");
		cwm_6046_d800.setZipFileLocation("LG-D800/cwm-6.0.4.6-d800.zip");
		ArrayList<Action> rdepse_cwm_6046_d800 = new ArrayList<Action>();
		rdepse_cwm_6046_d800.add(loki_recovery);
		cwm_6045_d800.setDependencies(rdepse_cwm_6046_d800);
		
		Action cwm_6047_d800 = new Action();
		cwm_6047_d800.setName("CWM-6.0.4.7");
		cwm_6047_d800.setDescription("This will install "+cwm_6047_d800.getName());
		cwm_6047_d800.setMd5sum("5d3430b36acd93c3aa3f7dd2d03b2693");
		cwm_6047_d800.setVersion("1");
		cwm_6047_d800.setZipFile("cwm-6.0.4.7-d800.zip");
		cwm_6047_d800.setZipFileLocation("LG-D800/cwm-6.0.4.7-d800.zip");
		ArrayList<Action> rdepse_cwm_6047_d800 = new ArrayList<Action>();
		rdepse_cwm_6047_d800.add(loki_recovery);
		cwm_6045_d800.setDependencies(rdepse_cwm_6047_d800);
		
		Action twrp_2630_d800 = new Action();
		twrp_2630_d800.setName("TWRP-2.6.3.3");
		twrp_2630_d800.setDescription("This will install "+twrp_2630_d800.getName());
		twrp_2630_d800.setMd5sum("629a19a4b0aa61ffb39f0eea1ff28a73");
		twrp_2630_d800.setVersion("1");
		twrp_2630_d800.setZipFile("twrp-2.6.3.3-d800.zip");
		twrp_2630_d800.setZipFileLocation("LG-D800/twrp-2.6.3.3-d800.zip");
		ArrayList<Action> rdepse_twrp_2630_d800 = new ArrayList<Action>();
		rdepse_twrp_2630_d800.add(loki_recovery);
		twrp_2630_d800.setDependencies(rdepse_twrp_2630_d800);
		
		//d800actions.add(cwm_6045_d800);
		d800actions.add(cwm_6046_d800);
		d800actions.add(cwm_6047_d800);
		d800actions.add(twrp_2630_d800);

		d800.setActions(d800actions);
		
		//LG-D801
		ArrayList<Action> d801actions = new ArrayList<Action>();
		Device d801 = new Device();
		d801.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Bell");
		carrier.add("Tmobile");
		d801.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("d80110d");
		firmware.add("d80110o");
		firmware.add("any");
		d801.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-D801");
		d801.setModel(model);
		d801.setProp_id("ro.product.Model");
		d801.setSW_Prop_id("ro.lge.swversion");
		d801.setBootloaderExploit(1);
		d801actions.addAll(g2CommonActions);
		
		Action cwm_6045_d801 = new Action();
		cwm_6045_d801.setName("CWM-6.0.4.5");
		cwm_6045_d801.setDescription("This will install "+cwm_6045_d801.getName());
		cwm_6045_d801.setMd5sum("e799786492a22546ff47894dbedd2edc");
		cwm_6045_d801.setVersion("1");
		cwm_6045_d801.setZipFile("cwm-6.0.4.5-d801.zip");
		cwm_6045_d801.setZipFileLocation("LG-D801/cwm-6.0.4.5-d801.zip");
		ArrayList<Action> rdepse_cwm_6045_d801 = new ArrayList<Action>();
		rdepse_cwm_6045_d801.add(loki_recovery);
		cwm_6045_d801.setDependencies(rdepse_cwm_6045_d801);
		
		Action cwm_6046_d801 = new Action();
		cwm_6046_d801.setName("CWM-6.0.4.6");
		cwm_6046_d801.setDescription("This will install "+cwm_6046_d801.getName());
		cwm_6046_d801.setMd5sum("ec20762ed4cee3035e5fa93d2524ff34");
		cwm_6046_d801.setVersion("1");
		cwm_6046_d801.setZipFile("cwm-6.0.4.6-d801.zip");
		cwm_6046_d801.setZipFileLocation("LG-D801/cwm-6.0.4.6-d801.zip");
		ArrayList<Action> rdepse_cwm_6046_d801 = new ArrayList<Action>();
		rdepse_cwm_6046_d801.add(loki_recovery);
		cwm_6046_d801.setDependencies(rdepse_cwm_6046_d801);
		
		Action cwm_6047_d801 = new Action();
		cwm_6047_d801.setName("CWM-6.0.4.7");
		cwm_6047_d801.setDescription("This will install "+cwm_6047_d801.getName());
		cwm_6047_d801.setMd5sum("8be1b34359b2dec1ee8336b2e778ea4e");
		cwm_6047_d801.setVersion("1");
		cwm_6047_d801.setZipFile("cwm-6.0.4.7-d801.zip");
		cwm_6047_d801.setZipFileLocation("LG-D801/cwm-6.0.4.7-d801.zip");
		ArrayList<Action> rdepse_cwm_6047_d801 = new ArrayList<Action>();
		rdepse_cwm_6047_d801.add(loki_recovery);
		cwm_6047_d801.setDependencies(rdepse_cwm_6047_d801);
		
		Action twrp_2630_d801 = new Action();
		twrp_2630_d801.setName("TWRP-2.6.3.3");
		twrp_2630_d801.setDescription("This will install "+twrp_2630_d801.getName());
		twrp_2630_d801.setMd5sum("e68e615ff81848fdd5783bb3698909ad");
		twrp_2630_d801.setVersion("1");
		twrp_2630_d801.setZipFile("twrp-2.6.3.3-d801.zip");
		twrp_2630_d801.setZipFileLocation("LG-D801/twrp-2.6.3.3-d801.zip");
		ArrayList<Action> rdepse_twrp_2630_d801 = new ArrayList<Action>();
		rdepse_twrp_2630_d801.add(loki_recovery);
		twrp_2630_d801.setDependencies(rdepse_twrp_2630_d801);
		
		//d801actions.add(cwm_6045_d801);
		d801actions.add(cwm_6046_d801);
		d801actions.add(cwm_6047_d801);
		d801actions.add(twrp_2630_d801);

		d801.setActions(d801actions);
		
		//LG-D802
		ArrayList<Action> d802actions = new ArrayList<Action>();
		Device d802 = new Device();
		d802.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("any");
		d802.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		d802.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-D802");
		d802.setModel(model);
		d802.setProp_id("ro.product.Model");
		d802.setSW_Prop_id("ro.lge.swversion");
		d802.setBootloaderExploit(1);
		d802actions.addAll(g2CommonActions);
		
		Action cwm_6045_d802 = new Action();
		cwm_6045_d802.setName("CWM-6.0.4.5");
		cwm_6045_d802.setDescription("This will install "+cwm_6045_d802.getName());
		cwm_6045_d802.setMd5sum("923490326fa0674754c21f1861e252ca");
		cwm_6045_d802.setVersion("1");
		cwm_6045_d802.setZipFile("cwm-6.0.4.5-d802.zip");
		cwm_6045_d802.setZipFileLocation("LG-D802/cwm-6.0.4.5-d802.zip");
		ArrayList<Action> rdepse_cwm_6045_d802 = new ArrayList<Action>();
		rdepse_cwm_6045_d802.add(loki_recovery);
		cwm_6045_d802.setDependencies(rdepse_cwm_6045_d802);
		//d802actions.add(cwm_6045_d802);
		
		Action cwm_6046_d802 = new Action();
		cwm_6046_d802.setName("CWM-6.0.4.6");
		cwm_6046_d802.setDescription("This will install "+cwm_6046_d802.getName());
		cwm_6046_d802.setMd5sum("b0d79d6f4d0ad6078a852bdef16b60d3");
		cwm_6046_d802.setVersion("1");
		cwm_6046_d802.setZipFile("cwm-6.0.4.6-d802.zip");
		cwm_6046_d802.setZipFileLocation("LG-D802/cwm-6.0.4.6-d802.zip");
		ArrayList<Action> rdepse_cwm_6046_d802 = new ArrayList<Action>();
		rdepse_cwm_6046_d802.add(loki_recovery);
		cwm_6046_d802.setDependencies(rdepse_cwm_6046_d802);
		d802actions.add(cwm_6046_d802);
		
		Action cwm_6047_d802 = new Action();
		cwm_6047_d802.setName("CWM-6.0.4.7");
		cwm_6047_d802.setDescription("This will install "+cwm_6047_d802.getName());
		cwm_6047_d802.setMd5sum("a4949ead13913fe9c0739fcdbc435d05");
		cwm_6047_d802.setVersion("1");
		cwm_6047_d802.setZipFile("cwm-6.0.4.7-d802.zip");
		cwm_6047_d802.setZipFileLocation("LG-D802/cwm-6.0.4.7-d802.zip");
		ArrayList<Action> rdepse_cwm_6047_d802 = new ArrayList<Action>();
		rdepse_cwm_6047_d802.add(loki_recovery);
		cwm_6047_d802.setDependencies(rdepse_cwm_6047_d802);
		d802actions.add(cwm_6047_d802);
				
		Action twrp_2630_d802 = new Action();
		twrp_2630_d802.setName("TWRP-2.6.3.3");
		twrp_2630_d802.setDescription("This will install "+twrp_2630_d802.getName());
		twrp_2630_d802.setMd5sum("0a4f4eed6290f5d0101498281f5c8f94");
		twrp_2630_d802.setVersion("1");
		twrp_2630_d802.setZipFile("twrp-2.6.3.3-d802.zip");
		twrp_2630_d802.setZipFileLocation("LG-D802/twrp-2.6.3.3-d802.zip");
		ArrayList<Action> rdepse_twrp_2630_d802 = new ArrayList<Action>();
		rdepse_twrp_2630_d802.add(loki_recovery);
		twrp_2630_d802.setDependencies(rdepse_twrp_2630_d802);
		d802actions.add(twrp_2630_d802);
		
		d802.setActions(d802actions);
		
		//LG-D803
		ArrayList<Action> d803actions = new ArrayList<Action>();
		Device d803 = new Device();
		d803.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Rogers");
		d803.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("d80310d");
		firmware.add("d80310o");
		firmware.add("any");
		d803.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-D803");
		d803.setModel(model);
		d803.setProp_id("ro.product.Model");
		d803.setSW_Prop_id("ro.lge.swversion");
		d803.setBootloaderExploit(1);
		d803actions.addAll(g2CommonActions);
		
		Action cwm_6045_d803 = new Action();
		cwm_6045_d803.setName("CWM-6.0.4.5");
		cwm_6045_d803.setDescription("This will install "+cwm_6045_d803.getName());
		cwm_6045_d803.setMd5sum("fd6dcf17739a063a625c7fd85eec58ad");
		cwm_6045_d803.setVersion("1");
		cwm_6045_d803.setZipFile("cwm-6.0.4.5-d803.zip");
		cwm_6045_d803.setZipFileLocation("LG-D803/cwm-6.0.4.5-d803.zip");
		ArrayList<Action> rdepse_cwm_6045_d803 = new ArrayList<Action>();
		rdepse_cwm_6045_d803.add(loki_recovery);
		cwm_6045_d803.setDependencies(rdepse_cwm_6045_d803);
		
		Action cwm_6046_d803 = new Action();
		cwm_6046_d803.setName("CWM-6.0.4.6");
		cwm_6046_d803.setDescription("This will install "+cwm_6046_d803.getName());
		cwm_6046_d803.setMd5sum("201fd4d9b26060b6ee72af31ae2384a5");
		cwm_6046_d803.setVersion("1");
		cwm_6046_d803.setZipFile("cwm-6.0.4.6-d803.zip");
		cwm_6046_d803.setZipFileLocation("LG-D803/cwm-6.0.4.6-d803.zip");
		ArrayList<Action> rdepse_cwm_6046_d803 = new ArrayList<Action>();
		rdepse_cwm_6046_d803.add(loki_recovery);
		cwm_6046_d803.setDependencies(rdepse_cwm_6046_d803);
		d803actions.add(cwm_6046_d803);
		
		Action cwm_6047_d803 = new Action();
		cwm_6047_d803.setName("CWM-6.0.4.7");
		cwm_6047_d803.setDescription("This will install "+cwm_6047_d803.getName());
		cwm_6047_d803.setMd5sum("812084f5f08765d0a583b36b441acb25");
		cwm_6047_d803.setVersion("1");
		cwm_6047_d803.setZipFile("cwm-6.0.4.7-d803.zip");
		cwm_6047_d803.setZipFileLocation("LG-D803/cwm-6.0.4.7-d803.zip");
		ArrayList<Action> rdepse_cwm_6047_d803 = new ArrayList<Action>();
		rdepse_cwm_6047_d803.add(loki_recovery);
		cwm_6047_d803.setDependencies(rdepse_cwm_6047_d803);
		d803actions.add(cwm_6047_d803);
		
		Action twrp_2630_d803 = new Action();
		twrp_2630_d803.setName("TWRP-2.6.3.3");
		twrp_2630_d803.setDescription("This will install "+twrp_2630_d803.getName());
		twrp_2630_d803.setMd5sum("65ac71b095c38f7ad298d5fa8e056144");
		twrp_2630_d803.setVersion("1");
		twrp_2630_d803.setZipFile("twrp-2.6.3.3-d803.zip");
		twrp_2630_d803.setZipFileLocation("LG-D803/twrp-2.6.3.3-d803.zip");
		ArrayList<Action> rdepse_twrp_2630_d803 = new ArrayList<Action>();
		rdepse_twrp_2630_d803.add(loki_recovery);
		twrp_2630_d803.setDependencies(rdepse_twrp_2630_d803);
		
		//d803actions.add(cwm_6045_d803);
		d803actions.add(twrp_2630_d803);

		d803.setActions(d803actions);
		
		//LG-D805 Same as LG-D802
		Device d805 = new Device();
		d805.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("any");
		d805.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		d805.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-D805");
		d805.setModel(model);
		d805.setProp_id("ro.product.Model");
		d805.setSW_Prop_id("ro.lge.swversion");
		d805.setBootloaderExploit(1);
		d805.setActions(d802actions);

		//LG-LS980
		ArrayList<Action> ls980actions = new ArrayList<Action>();
		Device ls980 = new Device();
		ls980.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Sprint");
		ls980.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("LS980ZV7");
		firmware.add("LS980ZV8");
		ls980.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-LS980");
		ls980.setModel(model);
		ls980.setProp_id("ro.product.Model");
		ls980.setSW_Prop_id("ro.lge.swversion");
		ls980.setBootloaderExploit(1);
		ls980actions.addAll(g2CommonActions);
		
		Action cwm_6045_ls980 = new Action();
		cwm_6045_ls980.setName("CWM-6.0.4.5");
		cwm_6045_ls980.setDescription("This will install "+cwm_6045_ls980.getName());
		cwm_6045_ls980.setMd5sum("d4581acedd233558751094915747e70c");
		cwm_6045_ls980.setVersion("1");
		cwm_6045_ls980.setZipFile("cwm-6.0.4.5-ls980.zip");
		cwm_6045_ls980.setZipFileLocation("LG-LS980/cwm-6.0.4.5-ls980.zip");
		ArrayList<Action> rdepse_cwm_6045_ls980 = new ArrayList<Action>();
		rdepse_cwm_6045_ls980.add(loki_recovery);
		cwm_6045_ls980.setDependencies(rdepse_cwm_6045_ls980);
		//ls980actions.add(cwm_6045_ls980);
		
		Action cwm_6046_ls980 = new Action();
		cwm_6046_ls980.setName("CWM-6.0.4.6");
		cwm_6046_ls980.setDescription("This will install "+cwm_6046_ls980.getName());
		cwm_6046_ls980.setMd5sum("a13e4816b5c755dbe7cb7c4cf7d65481");
		cwm_6046_ls980.setVersion("1");
		cwm_6046_ls980.setZipFile("cwm-6.0.4.6-ls980.zip");
		cwm_6046_ls980.setZipFileLocation("LG-LS980/cwm-6.0.4.6-ls980.zip");
		ArrayList<Action> rdepse_cwm_6046_ls980 = new ArrayList<Action>();
		rdepse_cwm_6046_ls980.add(loki_recovery);
		cwm_6046_ls980.setDependencies(rdepse_cwm_6046_ls980);
		ls980actions.add(cwm_6046_ls980);
		
		Action cwm_6047_ls980 = new Action();
		cwm_6047_ls980.setName("CWM-6.0.4.7");
		cwm_6047_ls980.setDescription("This will install "+cwm_6047_ls980.getName());
		cwm_6047_ls980.setMd5sum("f71d884e5148c5698a1cd97e8b05eef6");
		cwm_6047_ls980.setVersion("1");
		cwm_6047_ls980.setZipFile("cwm-6.0.4.7-ls980.zip");
		cwm_6047_ls980.setZipFileLocation("LG-LS980/cwm-6.0.4.7-ls980.zip");
		ArrayList<Action> rdepse_cwm_6047_ls980 = new ArrayList<Action>();
		rdepse_cwm_6047_ls980.add(loki_recovery);
		cwm_6047_ls980.setDependencies(rdepse_cwm_6047_ls980);
		ls980actions.add(cwm_6047_ls980);
		
		Action twrp_2630_ls980 = new Action();
		twrp_2630_ls980.setName("TWRP-2.6.3.3");
		twrp_2630_ls980.setDescription("This will install "+twrp_2630_ls980.getName());
		twrp_2630_ls980.setMd5sum("48537116e0c40336d17de113dba44f99");
		twrp_2630_ls980.setVersion("1");
		twrp_2630_ls980.setZipFile("twrp-2.6.3.3-ls980.zip");
		twrp_2630_ls980.setZipFileLocation("LG-LS980/twrp-2.6.3.3-ls980.zip");
		ArrayList<Action> rdepse_twrp_2630_ls980 = new ArrayList<Action>();
		rdepse_twrp_2630_ls980.add(loki_recovery);
		twrp_2630_ls980.setDependencies(rdepse_twrp_2630_ls980);
		ls980actions.add(twrp_2630_ls980);

		ls980.setActions(ls980actions);
		
		//LG-LS980_ZVA
		ArrayList<Action> ls980_zva_actions = new ArrayList<Action>();
		Device ls980_zva = new Device();
		ls980_zva.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Sprint");
		ls980_zva.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("LS980ZVA");
		firmware.add("OpTimuS DE V2.1");
		ls980_zva.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-LS980");
		ls980_zva.setModel(model);
		ls980_zva.setProp_id("ro.product.Model");
		ls980_zva.setSW_Prop_id("ro.lge.swversion");
		ls980_zva.setBootloaderExploit(1);
		ls980_zva_actions.addAll(g2CommonActions);
		
		Action cwm_6046_ls980_zva = cwm_6046_ls980;
		ArrayList<Action> rdepse_cwm_6046_ls980_zva = rdepse_cwm_6046_ls980;
		rdepse_cwm_6046_ls980_zva.add(revert_aboot_zva);
		cwm_6046_ls980_zva.setDependencies(rdepse_cwm_6046_ls980_zva);
		ls980_zva_actions.add(cwm_6046_ls980_zva);
		
		Action cwm_6047_ls980_zva = cwm_6047_ls980;
		ArrayList<Action> rdepse_cwm_6047_ls980_zva = rdepse_cwm_6047_ls980;
		rdepse_cwm_6047_ls980_zva.add(revert_aboot_zva);
		cwm_6047_ls980_zva.setDependencies(rdepse_cwm_6047_ls980_zva);
		ls980_zva_actions.add(cwm_6047_ls980_zva);
		
		Action twrp_2630_ls980_zva = twrp_2630_ls980;
		ArrayList<Action> rdepse_twrp_2630_ls980_zva = rdepse_twrp_2630_ls980;
		rdepse_twrp_2630_ls980_zva.add(revert_aboot_zva);
		twrp_2630_ls980.setDependencies(rdepse_twrp_2630_ls980_zva);
		ls980_zva_actions.add(twrp_2630_ls980_zva);

		ls980_zva.setActions(ls980_zva_actions);
		
		//LG-VS980
		ArrayList<Action> vs980actions = new ArrayList<Action>();
		Device vs980 = new Device();
		vs980.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Verizion");
		vs980.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("VS98010B");
		firmware.add("VS98011A");
		firmware.add("VS98012B");
		firmware.add("any");
		vs980.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("LG-VS980");
		vs980.setModel(model);
		vs980.setProp_id("ro.product.Model");
		vs980.setSW_Prop_id("ro.lge.swversion");
		vs980.setBootloaderExploit(1);
		vs980actions.addAll(g2CommonActions);
		
		Action cwm_6045_vs980 = new Action();
		cwm_6045_vs980.setName("CWM-6.0.4.5");
		cwm_6045_vs980.setDescription("This will install "+cwm_6045_vs980.getName());
		cwm_6045_vs980.setMd5sum("272d230082fadfdf4698db3e8ca9a015");
		cwm_6045_vs980.setVersion("1");
		cwm_6045_vs980.setZipFile("cwm-6.0.4.5-vs980.zip");
		cwm_6045_vs980.setZipFileLocation("LG-VS980/cwm-6.0.4.5-vs980.zip");
		ArrayList<Action> rdepse_cwm_6045_vs980 = new ArrayList<Action>();
		rdepse_cwm_6045_vs980.add(loki_recovery);
		cwm_6045_vs980.setDependencies(rdepse_cwm_6045_vs980);
		//vs980actions.add(cwm_6045_vs980);
		
		Action cwm_6046_vs980 = new Action();
		cwm_6046_vs980.setName("CWM-6.0.4.6");
		cwm_6046_vs980.setDescription("This will install "+cwm_6046_vs980.getName());
		cwm_6046_vs980.setMd5sum("6ab7aba051e4ee36c9167cc400e4d340");
		cwm_6046_vs980.setVersion("1");
		cwm_6046_vs980.setZipFile("cwm-6.0.4.6-vs980.zip");
		cwm_6046_vs980.setZipFileLocation("LG-VS980/cwm-6.0.4.6-vs980.zip");
		ArrayList<Action> rdepse_cwm_6046_vs980 = new ArrayList<Action>();
		rdepse_cwm_6046_vs980.add(loki_recovery);
		cwm_6046_vs980.setDependencies(rdepse_cwm_6046_vs980);
		vs980actions.add(cwm_6046_vs980);
		
		Action cwm_6047_vs980 = new Action();
		cwm_6047_vs980.setName("CWM-6.0.4.7");
		cwm_6047_vs980.setDescription("This will install "+cwm_6047_vs980.getName());
		cwm_6047_vs980.setMd5sum("a2f745e02e0ef86e89d9b88af6ae2093");
		cwm_6047_vs980.setVersion("1");
		cwm_6047_vs980.setZipFile("cwm-6.0.4.7-vs980.zip");
		cwm_6047_vs980.setZipFileLocation("LG-VS980/cwm-6.0.4.7-vs980.zip");
		ArrayList<Action> rdepse_cwm_6047_vs980 = new ArrayList<Action>();
		rdepse_cwm_6047_vs980.add(loki_recovery);
		cwm_6047_vs980.setDependencies(rdepse_cwm_6047_vs980);
		vs980actions.add(cwm_6047_vs980);
		
		Action twrp_2630_vs980 = new Action();
		twrp_2630_vs980.setName("TWRP-2.6.3.3");
		twrp_2630_vs980.setDescription("This will install "+twrp_2630_vs980.getName());
		twrp_2630_vs980.setMd5sum("c4658f06e5939532807fd2f0be483129");
		twrp_2630_vs980.setVersion("1");
		twrp_2630_vs980.setZipFile("twrp-2.6.3.3-vs980.zip");
		twrp_2630_vs980.setZipFileLocation("LG-VS980/twrp-2.6.3.3-vs980.zip");
		ArrayList<Action> rdepse_twrp_2630_vs980 = new ArrayList<Action>();
		rdepse_twrp_2630_vs980.add(loki_recovery);
		twrp_2630_vs980.setDependencies(rdepse_twrp_2630_vs980);
		vs980actions.add(twrp_2630_vs980);

		vs980.setActions(vs980actions);

		//VS980 4G
		Device vs980_12b = new Device();
		vs980_12b.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Verizion");
		vs980_12b.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("VS98010B");
		firmware.add("VS98011A");
		firmware.add("VS98012B");
		firmware.add("any");
		vs980_12b.setFirmware(firmware);
		model = new ArrayList<String>();
		model.add("VS980 4G");
		vs980_12b.setModel(model);
		vs980_12b.setProp_id("ro.product.Model");
		vs980_12b.setSW_Prop_id("ro.lge.swversion");
		vs980_12b.setBootloaderExploit(1);
		vs980_12b.setActions(vs980actions);
		
		/*System.out.println("Enter your Device name : ");
		myDevice.setName(br.readLine());
		
		System.out.println("Enter your Device Carrier : ");

		carrier.add(br.readLine());
		myDevice.setCarrier(carrier);
		
		System.out.println("Enter your Device model : ");
		myDevice.setModel(br.readLine());
		
		System.out.println("Enter your Device firmware : ");

		firmware.add(br.readLine());
		myDevice.setCarrier(firmware);
		
		System.out.println("Enter your prop_id name : ");
		myDevice.setProp_id(br.readLine());
		
		System.out.println("Enter your action name : ");
		action1.setName(br.readLine());
		
		System.out.println("Enter your action version : ");
		action1.setVersion(br.readLine());
		
		System.out.println("Enter your action zipfile : ");
		action1.setZipFile(br.readLine());
		
		System.out.println("Enter your action zipfilelocation : ");
		action1.setZipFileLocation(br.readLine());*/
		
/*		actions.add(action1);
		myDevice.setActions(actions);*/

		devices.add(e970);
		devices.add(e971);
		devices.add(e973);
		devices.add(e975);
		devices.add(e975k);
		//devices.add(e975w);
		devices.add(e976);
		devices.add(e977);
		devices.add(ls970);
		devices.add(l180);
		devices.add(s180);
		devices.add(k180);
		devices.add(e980);
		devices.add(e980h);
		devices.add(e986);
		devices.add(e987);
		devices.add(e988);
		devices.add(e989);
		devices.add(f240s);
		devices.add(f240l);
		devices.add(f240k);
		devices.add(f220k);
		devices.add(d800);
		devices.add(d801);
		devices.add(d802);
		devices.add(d803);
		devices.add(d805);
		devices.add(ls980);
		devices.add(ls980_zva);
		devices.add(vs980);
		devices.add(vs980_12b);
		ddevices.setDevices(devices);

		File devices2 = new File("/mnt/Android/optimusg/freegee/2.0/devices/devices2.xml");
		serializer.write(ddevices, devices2);
		
		Devices newDevices = serializer.read(Devices.class, devices2);
		for(Device a:newDevices.getDevices()){
			for(Action b:a.getActions()){
				System.out.println(b.getName());
			}
		}		
	}

}