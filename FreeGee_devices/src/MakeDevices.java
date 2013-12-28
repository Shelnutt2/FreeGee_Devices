import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class MakeDevices {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Devices ddevices = new Devices();
		Serializer serializer = new Persister();
		
		ArrayList<Partition> partitions;
		ArrayList<String> firmware = new ArrayList<String>();
		ArrayList<String> carrier = new ArrayList<String>();
		ArrayList<Device> devices = new ArrayList<Device>();
		

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
		
		Action disable_lge_security_msm8974 = new Action();
		disable_lge_security_msm8974.setName("Disable LGE Security");
		disable_lge_security_msm8974.setDescription("This will Disable LGE Security and enable you to uninstall system apps");
		disable_lge_security_msm8974.setMd5sum("e8524ee0ec96d73dbc34ae46916ec12a");
		disable_lge_security_msm8974.setVersion("1");
		disable_lge_security_msm8974.setStockOnly(true);
		disable_lge_security_msm8974.setHidden(true);
		disable_lge_security_msm8974.setZipFile("disable_lge_security_msm8974.zip");
		disable_lge_security_msm8974.setZipFileLocation("disable_lge_security_msm8974.zip");
		
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
		
		
		Action test = new Action();
		test.setName("test");
		test.setDescription("Test");
		test.setMd5sum("0f1dd04f082d31733576da01c772e1b2");
		test.setVersion("1");
		test.setZipFile("test2.zip");
		test.setZipFileLocation("test2.zip");
		
		
		//LG-LS970
		ArrayList<Action> ls970actions = new ArrayList<Action>();
		Device ls970 = new Device();
		ls970.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("Sprint");
		ls970.setCarrier(carrier);
/*		partitions  = new ArrayList<String>();
		partitions.add("sbl1");
		partitions.add("sbl2");
		partitions.add("sbl3");
		partitions.add("aboot");
		ls970.setPartitions(partitions);*/
		firmware = new ArrayList<String>();
		firmware.add("any");
		ls970.setFirmware(firmware);
		ls970.setModel("LG-LS970");
		ls970.setProp_id("ro.product.Model");
		ls970.setSW_Prop_id("ro.lge.swversion");
		ls970.setDeviceDetailsLocation("LG-LS970/ls970.xml");
		ls970actions.add(ogunlock);
		ls970actions.add(ogMakounlock);
		ls970actions.add(disable_lge_security_og);
		ls970actions.add(fix_stock_recovery_og);
		
		Action cwm_6045_ls970 = new Action();
		cwm_6045_ls970.setName("CWM-6.0.4.5");
		cwm_6045_ls970.setDescription("This will install "+cwm_6045_ls970.getName() + " and unlock your device as necessary.");
		cwm_6045_ls970.setMd5sum("6931a1d6a527fb46f1cfbb6ec000250f");
		cwm_6045_ls970.setVersion("1");
		cwm_6045_ls970.setZipFile("cwm-6.0.4.5-ls970.zip");
		cwm_6045_ls970.setZipFileLocation("LG-LS970/cwm-6.0.4.5-ls970.zip");
		ArrayList<Action> rdepse_cwm_6045_ls970 = new ArrayList<Action>();
		rdepse_cwm_6045_ls970.add(ogMakounlock);
		cwm_6045_ls970.setDependencies(rdepse_cwm_6045_ls970);
		ls970actions.add(cwm_6045_ls970);
		
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
		
		ls970actions.add(backup_efs_apq8064);
		ls970actions.add(restore_efs_apq8064);
		ls970actions.add(restore_backups_og);
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
		e970.setModel("LG-E970");
		e970.setProp_id("ro.product.Model");
		e970.setSW_Prop_id("ro.lge.swversion");
		e970.setDeviceDetailsLocation("LG-E970/e970.xml");
		e970actions.add(ogunlock);
		e970actions.add(ogMakounlock);
		e970actions.add(disable_lge_security_og);
		e970actions.add(fix_stock_recovery_og);
		
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
		e970actions.add(cwm_6045_e970);
		
		
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
		
		e970actions.add(backup_efs_apq8064);
		e970actions.add(restore_efs_apq8064);
		e970actions.add(restore_backups_og);
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
		e971.setModel("LG-E971");
		e971.setProp_id("ro.product.Model");
		e971.setSW_Prop_id("ro.lge.swversion");
		e971.setDeviceDetailsLocation("LG-E973/e973.xml");
		e971actions.add(ogunlock);
		e971actions.add(ogMakounlock);
		e971actions.add(disable_lge_security_og);
		e971actions.add(fix_stock_recovery_og);
		
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
		e971actions.add(cwm_6045_e971);
		
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
		e971actions.add(backup_efs_apq8064);
		e971actions.add(restore_efs_apq8064);
		e971actions.add(restore_backups_og);
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
		e973.setModel("LG-E973");
		e973.setProp_id("ro.product.Model");
		e973.setSW_Prop_id("ro.lge.swversion");
		e973.setDeviceDetailsLocation("LG-E973/e973.xml");
		e973actions.add(ogunlock);
		e973actions.add(ogMakounlock);
		e973actions.add(disable_lge_security_og);
		e973actions.add(fix_stock_recovery_og);
		
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
		e973actions.add(cwm_6045_e973);
		
		e973actions.add(twrp_2630_e973);
		e973actions.add(backup_efs_apq8064);
		e973actions.add(restore_efs_apq8064);
		e973actions.add(restore_backups_og);
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
		e975.setModel("LG-E975");
		e975.setProp_id("ro.product.Model");
		e975.setSW_Prop_id("ro.lge.swversion");
		e975.setDeviceDetailsLocation("LG-E975/e975.xml");
		e975actions.add(ogunlock);
		e975actions.add(ogMakounlock);
		e975actions.add(disable_lge_security_og);
		e975actions.add(fix_stock_recovery_og);
		
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
		e975actions.add(cwm_6045_e975);
		
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
		
		e975actions.add(backup_efs_apq8064);
		e975actions.add(restore_efs_apq8064);
		e975actions.add(restore_backups_og);
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
		e975k.setModel("LG-E975K");
		e975k.setProp_id("ro.product.Model");
		e975k.setSW_Prop_id("ro.lge.swversion");
		e975k.setDeviceDetailsLocation("LG-E975/e975.xml");
		e975k.setActions(e975actions);

		//LG-E976
		ArrayList<Action> e976actions = new ArrayList<Action>();
		Device e976 = new Device();
		e976.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e976.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e976.setFirmware(firmware);
		e976.setModel("LG-E976");
		e976.setProp_id("ro.product.Model");
		e976.setSW_Prop_id("ro.lge.swversion");
		e976.setDeviceDetailsLocation("LG-E975/e975.xml");
		e976actions.add(ogunlock);
		e976actions.add(ogMakounlock);
		e976actions.add(disable_lge_security_og);
		e976actions.add(fix_stock_recovery_og);
		e976actions.add(cwm_6045_e975);
		e976actions.add(twrp_2630_e975);
		e976actions.add(backup_efs_apq8064);
		e976actions.add(restore_efs_apq8064);
		e976actions.add(restore_backups_og);
		e976.setActions(e976actions);
		
		//LG-E977
		ArrayList<Action> e977actions = new ArrayList<Action>();
		Device e977 = new Device();
		e977.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e977.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e977.setFirmware(firmware);
		e977.setModel("LG-E977");
		e977.setProp_id("ro.product.Model");
		e977.setSW_Prop_id("ro.lge.swversion");
		e977.setDeviceDetailsLocation("LG-E975/e975.xml");
		e977actions.add(ogunlock);
		e977actions.add(ogMakounlock);
		e977actions.add(disable_lge_security_og);
		e977actions.add(fix_stock_recovery_og);
		e977actions.add(cwm_6045_e975);
		e977actions.add(twrp_2630_e975);
		e977actions.add(backup_efs_apq8064);
		e977actions.add(restore_efs_apq8064);
		e977actions.add(restore_backups_og);
		e977.setActions(e977actions);
		
		//LG-E987
		ArrayList<Action> e987actions = new ArrayList<Action>();
		Device e987 = new Device();
		e987.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e987.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e987.setFirmware(firmware);
		e987.setModel("LG-E987");
		e987.setProp_id("ro.product.Model");
		e987.setSW_Prop_id("ro.lge.swversion");
		e987.setDeviceDetailsLocation("LG-E975/e975.xml");
		e987actions.add(ogunlock);
		e987actions.add(ogMakounlock);
		e987actions.add(disable_lge_security_og);
		e987actions.add(fix_stock_recovery_og);
		e987actions.add(cwm_6045_e975);
		e987actions.add(twrp_2630_e975);
		e987actions.add(backup_efs_apq8064);
		e987actions.add(restore_efs_apq8064);
		e987actions.add(restore_backups_og);
		e987.setActions(e987actions);
		
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
		k180.setModel("LG-F180K");
		k180.setProp_id("ro.product.Model");
		k180.setSW_Prop_id("ro.lge.swversion");
		k180.setDeviceDetailsLocation("LG-180K/180k.xml");
		k180actions.add(ogunlock);
		k180actions.add(ogMakounlock);
		k180actions.add(disable_lge_security_og);
		k180actions.add(fix_stock_recovery_og);
		
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
		k180actions.add(cwm_6045_180k);
		
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
		
		k180actions.add(backup_efs_apq8064);
		k180actions.add(restore_efs_apq8064);
		k180actions.add(restore_backups_og);
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
		l180.setModel("LG-F180L");
		l180.setProp_id("ro.product.model");
		l180.setSW_Prop_id("ro.lge.swversion");
		l180.setDeviceDetailsLocation("LG-180l/180l.xml");
		l180actions.add(ogunlock);
		l180actions.add(ogMakounlock);
		l180actions.add(disable_lge_security_og);
		l180actions.add(fix_stock_recovery_og);
		
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
		l180actions.add(cwm_6045_180l);
		
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
		
		l180actions.add(backup_efs_apq8064);
		l180actions.add(restore_efs_apq8064);
		l180actions.add(restore_backups_og);
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
		
		//LG-180L
		ArrayList<Action> s180actions = new ArrayList<Action>();
		Device s180 = new Device();
		s180.setName("LG Optimus G");
		carrier = new ArrayList<String>();
		carrier.add("any");
		s180.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		s180.setFirmware(firmware);
		s180.setModel("LG-F180S");
		s180.setProp_id("ro.product.Model");
		s180.setSW_Prop_id("ro.lge.swversion");
		s180.setDeviceDetailsLocation("LG-180S/180s.xml");
		s180actions.add(ogunlock);
		s180actions.add(ogMakounlock);
		s180actions.add(disable_lge_security_og);
		s180actions.add(fix_stock_recovery_og);
		
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
		k180actions.add(cwm_6045_180s);
		
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
		
		s180actions.add(backup_efs_apq8064);
		s180actions.add(restore_efs_apq8064);
		s180actions.add(restore_backups_og);
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
		e980.setModel("LG-E980");
		e980.setProp_id("ro.product.Model");
		e980.setSW_Prop_id("ro.lge.swversion");
		e980actions.add(disable_lge_security_loki);
		
		Action cwm_6045_e980 = new Action();
		cwm_6045_e980.setName("CWM-6.0.4.5");
		cwm_6045_e980.setDescription("This will install "+cwm_6045_e980.getName());
		cwm_6045_e980.setMd5sum("828dfb228fa0a3a5cc96de145fec7342");
		cwm_6045_e980.setVersion("1");
		cwm_6045_e980.setZipFile("cwm-6.0.4.5-e980.zip");
		cwm_6045_e980.setZipFileLocation("LG-E980/cwm-6.0.4.5-e980.zip");
/*		ArrayList<Action> rdepse_cwm_6045_e980 = new ArrayList<Action>();
		cwm_6045_e980.setDependencies(rdepse_cwm_6045_e980);*/
		e980actions.add(cwm_6045_e980);
		
		Action twrp_2630_e980 = new Action();
		twrp_2630_e980.setName("TWRP-2.6.3.3");
		twrp_2630_e980.setDescription("This will install "+twrp_2630_e980.getName());
		twrp_2630_e980.setMd5sum("43b41bec4540b80494934db95532c450");
		twrp_2630_e980.setVersion("1");
		twrp_2630_e980.setZipFile("twrp-2.6.3.0-e980.zip");
		twrp_2630_e980.setZipFileLocation("LG-E980/twrp-2.6.3.0-e980.zip");
		
		e980actions.add(twrp_2630_e980);
		e980actions.add(backup_efs_apq8064);
		e980actions.add(restore_efs_apq8064);
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
		e980h.setModel("LG-E980h");
		e980h.setProp_id("ro.product.Model");
		e980h.setSW_Prop_id("ro.lge.swversion");
		e980h.setActions(e980actions);
		
		//LG-E986
		ArrayList<Action> e986actions = new ArrayList<Action>();
		Device e986 = new Device();
		e986.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e986.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e986.setFirmware(firmware);
		e986.setModel("LG-E986");
		e986.setProp_id("ro.product.Model");
		e986.setSW_Prop_id("ro.lge.swversion");
		e986actions.add(disable_lge_security_loki);
		e986actions.add(cwm_6045_e980);
		e986actions.add(twrp_2630_e980);
		e986actions.add(backup_efs_apq8064);
		e986actions.add(restore_efs_apq8064);
		e986.setActions(e986actions);
		
		//LG-E988
		ArrayList<Action> e988actions = new ArrayList<Action>();
		Device e988 = new Device();
		e988.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e988.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e988.setFirmware(firmware);
		e988.setModel("LG-E988");
		e988.setProp_id("ro.product.Model");
		e988.setSW_Prop_id("ro.lge.swversion");
		e988actions.add(disable_lge_security_loki);
		e988actions.add(cwm_6045_e980);
		e988actions.add(twrp_2630_e980);
		e988actions.add(backup_efs_apq8064);
		e988actions.add(restore_efs_apq8064);
		e988.setActions(e988actions);
		
		//LG-E988
		ArrayList<Action> e989actions = new ArrayList<Action>();
		Device e989 = new Device();
		e989.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		e989.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		e989.setFirmware(firmware);
		e989.setModel("LG-E989");
		e989.setProp_id("ro.product.Model");
		e989.setSW_Prop_id("ro.lge.swversion");
		e989actions.add(disable_lge_security_loki);
		e989actions.add(cwm_6045_e980);
		e989actions.add(twrp_2630_e980);
		e989actions.add(backup_efs_apq8064);
		e989actions.add(restore_efs_apq8064);
		e989.setActions(e989actions);
		
		//LG-F240L
		ArrayList<Action> f240lactions = new ArrayList<Action>();
		Device f240l = new Device();
		f240l.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		f240l.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		f240l.setFirmware(firmware);
		f240l.setModel("LG-F240L");
		f240l.setProp_id("ro.product.Model");
		f240l.setSW_Prop_id("ro.lge.swversion");
		f240lactions.add(disable_lge_security_loki);
		f240lactions.add(cwm_6045_e980);
		f240lactions.add(twrp_2630_e980);
		f240lactions.add(backup_efs_apq8064);
		f240lactions.add(restore_efs_apq8064);
		f240l.setActions(f240lactions);
		
		//LG-F240S
		ArrayList<Action> f240sactions = new ArrayList<Action>();
		Device f240s = new Device();
		f240s.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		f240s.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		f240s.setFirmware(firmware);
		f240s.setModel("LG-F240S");
		f240s.setProp_id("ro.product.Model");
		f240s.setSW_Prop_id("ro.lge.swversion");
		f240sactions.add(disable_lge_security_loki);
		f240sactions.add(cwm_6045_e980);
		f240sactions.add(twrp_2630_e980);
		f240sactions.add(backup_efs_apq8064);
		f240sactions.add(restore_efs_apq8064);
		f240s.setActions(f240sactions);
		
		//LG-F240K
		ArrayList<Action> f240kactions = new ArrayList<Action>();
		Device f240k = new Device();
		f240k.setName("LG Optimus G Pro");
		carrier = new ArrayList<String>();
		carrier.add("any");
		f240k.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		f240k.setFirmware(firmware);
		f240k.setModel("LG-F240K");
		f240k.setProp_id("ro.product.Model");
		f240k.setSW_Prop_id("ro.lge.swversion");
		f240kactions.add(disable_lge_security_loki);
		f240kactions.add(cwm_6045_e980);
		f240kactions.add(twrp_2630_e980);
		f240kactions.add(backup_efs_apq8064);
		f240kactions.add(restore_efs_apq8064);
		f240k.setActions(f240kactions);
		
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
		f220k.setModel("LG-F220K");
		f220k.setProp_id("ro.product.Model");
		f220k.setSW_Prop_id("ro.lge.swversion");
		f220kactions.add(disable_lge_security_loki);
		
		Action cwm_6045_f220 = new Action();
		cwm_6045_f220.setName("CWM-6.0.4.5");
		cwm_6045_f220.setDescription("This will install "+cwm_6045_f220.getName());
		cwm_6045_f220.setMd5sum("1af780c9334dc5e254048e20a5cb2719");
		cwm_6045_f220.setVersion("1");
		cwm_6045_f220.setZipFile("cwm-6.0.4.5-f220.zip");
		cwm_6045_f220.setZipFileLocation("LG-F220/cwm-6.0.4.5-f220.zip");
/*		ArrayList<Action> rdepse_cwm_6045_e980 = new ArrayList<Action>();
		cwm_6045_e980.setDependencies(rdepse_cwm_6045_e980);*/
		f220kactions.add(cwm_6045_f220);
		
		Action twrp_2630_f220 = new Action();
		twrp_2630_f220.setName("TWRP-2.6.3.3");
		twrp_2630_f220.setDescription("This will install "+twrp_2630_f220.getName());
		twrp_2630_f220.setMd5sum("12060c8ea7b7377b3c36047cc98f6325");
		twrp_2630_f220.setVersion("1");
		twrp_2630_f220.setZipFile("twrp-2.6.3.0-f220.zip");
		twrp_2630_f220.setZipFileLocation("LG-F220/twrp-2.6.3.0-f220.zip");
		
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
		d800.setModel("LG-D800");
		d800.setProp_id("ro.product.Model");
		d800.setSW_Prop_id("ro.lge.swversion");
		d800actions.add(disable_lge_security_msm8974);
		d800actions.add(restore_backups_msm8974);
		
		
		Action cwm_6045_d800 = new Action();
		cwm_6045_d800.setName("CWM-6.0.4.5");
		cwm_6045_d800.setDescription("This will install "+cwm_6045_d800.getName());
		cwm_6045_d800.setMd5sum("4e1ee600bc3853ffc431044788f5de85");
		cwm_6045_d800.setVersion("1");
		cwm_6045_d800.setZipFile("cwm-6.0.4.5-d800.zip");
		cwm_6045_d800.setZipFileLocation("LG-D800/cwm-6.0.4.5-d800.zip");
		
		Action twrp_2630_d800 = new Action();
		twrp_2630_d800.setName("TWRP-2.6.3.3");
		twrp_2630_d800.setDescription("This will install "+twrp_2630_d800.getName());
		twrp_2630_d800.setMd5sum("629a19a4b0aa61ffb39f0eea1ff28a73");
		twrp_2630_d800.setVersion("1");
		twrp_2630_d800.setZipFile("twrp-2.6.3.0-d800.zip");
		twrp_2630_d800.setZipFileLocation("LG-D800/twrp-2.6.3.0-d800.zip");		
		
		d800actions.add(cwm_6045_d800);
		d800actions.add(twrp_2630_d800);
		d800actions.add(backup_efs_msm8974);
		d800actions.add(restore_efs_msm8974);
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
		d801.setModel("LG-D801");
		d801.setProp_id("ro.product.Model");
		d801.setSW_Prop_id("ro.lge.swversion");
		d801actions.add(disable_lge_security_msm8974);
		d801actions.add(restore_backups_msm8974);
		
		Action cwm_6045_d801 = new Action();
		cwm_6045_d801.setName("CWM-6.0.4.5");
		cwm_6045_d801.setDescription("This will install "+cwm_6045_d801.getName());
		cwm_6045_d801.setMd5sum("e799786492a22546ff47894dbedd2edc");
		cwm_6045_d801.setVersion("1");
		cwm_6045_d801.setZipFile("cwm-6.0.4.5-d801.zip");
		cwm_6045_d801.setZipFileLocation("LG-D801/cwm-6.0.4.5-d801.zip");
		
		Action twrp_2630_d801 = new Action();
		twrp_2630_d801.setName("TWRP-2.6.3.3");
		twrp_2630_d801.setDescription("This will install "+twrp_2630_d801.getName());
		twrp_2630_d801.setMd5sum("e68e615ff81848fdd5783bb3698909ad");
		twrp_2630_d801.setVersion("1");
		twrp_2630_d801.setZipFile("twrp-2.6.3.0-d801.zip");
		twrp_2630_d801.setZipFileLocation("LG-D801/twrp-2.6.3.0-d801.zip");		
		
		d801actions.add(cwm_6045_d801);
		d801actions.add(twrp_2630_d801);
		d801actions.add(backup_efs_msm8974);
		d801actions.add(restore_efs_msm8974);
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
		d802.setModel("LG-D802");
		d802.setProp_id("ro.product.Model");
		d802.setSW_Prop_id("ro.lge.swversion");
		d802actions.add(disable_lge_security_msm8974);
		d802actions.add(restore_backups_msm8974);
		
		Action cwm_6045_d802 = new Action();
		cwm_6045_d802.setName("CWM-6.0.4.5");
		cwm_6045_d802.setDescription("This will install "+cwm_6045_d802.getName());
		cwm_6045_d802.setMd5sum("923490326fa0674754c21f1861e252ca");
		cwm_6045_d802.setVersion("1");
		cwm_6045_d802.setZipFile("cwm-6.0.4.5-d802.zip");
		cwm_6045_d802.setZipFileLocation("LG-D802/cwm-6.0.4.5-d802.zip");
		d802actions.add(cwm_6045_d802);
				
		Action twrp_2630_d802 = new Action();
		twrp_2630_d802.setName("TWRP-2.6.3.3");
		twrp_2630_d802.setDescription("This will install "+twrp_2630_d802.getName());
		twrp_2630_d802.setMd5sum("0a4f4eed6290f5d0101498281f5c8f94");
		twrp_2630_d802.setVersion("1");
		twrp_2630_d802.setZipFile("twrp-2.6.3.0-d802.zip");
		twrp_2630_d802.setZipFileLocation("LG-D802/twrp-2.6.3.0-d802.zip");
		d802actions.add(twrp_2630_d802);
		
		d802actions.add(backup_efs_msm8974);
		d802actions.add(restore_efs_msm8974);		
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
		d803.setModel("LG-D803");
		d803.setProp_id("ro.product.Model");
		d803.setSW_Prop_id("ro.lge.swversion");
		d803actions.add(disable_lge_security_msm8974);
		d803actions.add(restore_backups_msm8974);
		
		Action cwm_6045_d803 = new Action();
		cwm_6045_d803.setName("CWM-6.0.4.5");
		cwm_6045_d803.setDescription("This will install "+cwm_6045_d803.getName());
		cwm_6045_d803.setMd5sum("fd6dcf17739a063a625c7fd85eec58ad");
		cwm_6045_d803.setVersion("1");
		cwm_6045_d803.setZipFile("cwm-6.0.4.5-d803.zip");
		cwm_6045_d803.setZipFileLocation("LG-D803/cwm-6.0.4.5-d803.zip");
		
		Action twrp_2630_d803 = new Action();
		twrp_2630_d803.setName("TWRP-2.6.3.3");
		twrp_2630_d803.setDescription("This will install "+twrp_2630_d803.getName());
		twrp_2630_d803.setMd5sum("65ac71b095c38f7ad298d5fa8e056144");
		twrp_2630_d803.setVersion("1");
		twrp_2630_d803.setZipFile("twrp-2.6.3.0-d803.zip");
		twrp_2630_d803.setZipFileLocation("LG-D803/twrp-2.6.3.0-d803.zip");		
		
		d803actions.add(cwm_6045_d803);
		d803actions.add(twrp_2630_d803);
		d803actions.add(backup_efs_msm8974);
		d803actions.add(restore_efs_msm8974);
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
		d805.setModel("LG-D805");
		d805.setProp_id("ro.product.Model");
		d805.setSW_Prop_id("ro.lge.swversion");
		d805.setActions(d802actions);

		//LG-LS980
		ArrayList<Action> ls980actions = new ArrayList<Action>();
		Device ls980 = new Device();
		ls980.setName("LG G2");
		carrier = new ArrayList<String>();
		carrier.add("Sprint");
		ls980.setCarrier(carrier);
		firmware = new ArrayList<String>();
		firmware.add("any");
		ls980.setFirmware(firmware);
		ls980.setModel("LG-LS980");
		ls980.setProp_id("ro.product.Model");
		ls980.setSW_Prop_id("ro.lge.swversion");
		ls980actions.add(disable_lge_security_msm8974);
		ls980actions.add(restore_backups_msm8974);
		
		Action cwm_6045_ls980 = new Action();
		cwm_6045_ls980.setName("CWM-6.0.4.5");
		cwm_6045_ls980.setDescription("This will install "+cwm_6045_ls980.getName());
		cwm_6045_ls980.setMd5sum("d4581acedd233558751094915747e70c");
		cwm_6045_ls980.setVersion("1");
		cwm_6045_ls980.setZipFile("cwm-6.0.4.5-ls980.zip");
		cwm_6045_ls980.setZipFileLocation("LG-LS980/cwm-6.0.4.5-ls980.zip");
		ls980actions.add(cwm_6045_ls980);
		
		Action twrp_2630_ls980 = new Action();
		twrp_2630_ls980.setName("TWRP-2.6.3.3");
		twrp_2630_ls980.setDescription("This will install "+twrp_2630_ls980.getName());
		twrp_2630_ls980.setMd5sum("48537116e0c40336d17de113dba44f99");
		twrp_2630_ls980.setVersion("1");
		twrp_2630_ls980.setZipFile("twrp-2.6.3.0-ls980.zip");
		twrp_2630_ls980.setZipFileLocation("LG-LS980/twrp-2.6.3.0-ls980.zip");
		ls980actions.add(twrp_2630_ls980);
		
		ls980actions.add(backup_efs_msm8974);
		ls980actions.add(restore_efs_msm8974);
		ls980.setActions(ls980actions);
		
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
		vs980.setModel("LG-VS980");
		vs980.setProp_id("ro.product.Model");
		vs980.setSW_Prop_id("ro.lge.swversion");
		vs980actions.add(disable_lge_security_msm8974);
		vs980actions.add(restore_backups_msm8974);
		
		
		Action cwm_6045_vs980 = new Action();
		cwm_6045_vs980.setName("CWM-6.0.4.5");
		cwm_6045_vs980.setDescription("This will install "+cwm_6045_vs980.getName());
		cwm_6045_vs980.setMd5sum("272d230082fadfdf4698db3e8ca9a015");
		cwm_6045_vs980.setVersion("1");
		cwm_6045_vs980.setZipFile("cwm-6.0.4.5-vs980.zip");
		cwm_6045_vs980.setZipFileLocation("LG-VS980/cwm-6.0.4.5-vs980.zip");
		vs980actions.add(cwm_6045_vs980);
		
		Action twrp_2630_vs980 = new Action();
		twrp_2630_vs980.setName("TWRP-2.6.3.3");
		twrp_2630_vs980.setDescription("This will install "+twrp_2630_vs980.getName());
		twrp_2630_vs980.setMd5sum("c4658f06e5939532807fd2f0be483129");
		twrp_2630_vs980.setVersion("1");
		twrp_2630_vs980.setZipFile("twrp-2.6.3.0-vs980.zip");
		twrp_2630_vs980.setZipFileLocation("LG-VS980/twrp-2.6.3.0-vs980.zip");
		vs980actions.add(twrp_2630_vs980);
		
		vs980actions.add(backup_efs_msm8974);
		vs980actions.add(restore_efs_msm8974);
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
		vs980_12b.setModel("VS980 4G");
		vs980_12b.setProp_id("ro.product.Model");
		vs980_12b.setSW_Prop_id("ro.lge.swversion");
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
		devices.add(vs980);
		devices.add(vs980_12b);
		ddevices.setDevices(devices);

		File devices2 = new File("/mnt/Android/optimusg/freegee/2.0/devices2.xml");
		serializer.write(ddevices, devices2);
		
		Devices newDevices = serializer.read(Devices.class, devices2);
		for(Device a:newDevices.getDevices()){
			for(Action b:a.getActions()){
				System.out.println(b.getName());
			}
		}		
	}

}
