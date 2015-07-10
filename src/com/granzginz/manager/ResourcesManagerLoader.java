package com.granzginz.manager;

import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource;
import org.andengine.opengl.texture.atlas.buildable.builder.BlackPawnTextureAtlasBuilder;
import org.andengine.opengl.texture.atlas.buildable.builder.ITextureAtlasBuilder.TextureAtlasBuilderException;
import org.andengine.util.debug.Debug;

public class ResourcesManagerLoader {

	public static ResourcesManagerLoader getInstance() {

		return INSTANCE;
	}

	private static final ResourcesManagerLoader INSTANCE = new ResourcesManagerLoader();

	private void loadCaraBermainGraphics() {

		ResourcesManagerAsset.getInstance().latarCaraBermain_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		BitmapTextureAtlasTextureRegionFactory
				.setAssetBasePath("gfx/Cara_Bermain/");

		ResourcesManagerAsset.getInstance().latarCaraBermain_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().latarCaraBermain_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"CaraBermain.png");

		try {
			ResourcesManagerAsset.getInstance().latarCaraBermain_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));

			ResourcesManagerAsset.getInstance().latarCaraBermain_menuTextureAtlas
					.load();
		} catch (TextureAtlasBuilderException e) {
			// Implementasikan Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loadCaraBermainResources() {

		loadCaraBermainGraphics();
	}

	private void loadInformasiPengembangGraphics() {

		ResourcesManagerAsset.getInstance().latarInPeng_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		BitmapTextureAtlasTextureRegionFactory
				.setAssetBasePath("gfx/Informasi_Pengembang/");

		ResourcesManagerAsset.getInstance().latarInpeng_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().latarInPeng_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Tentang.png");

		try {
			ResourcesManagerAsset.getInstance().latarInPeng_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));

			ResourcesManagerAsset.getInstance().latarInPeng_menuTextureAtlas
					.load();
		} catch (TextureAtlasBuilderException e) {
			// Implementasikan Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void loadInformasiPengembanResources() {

		loadInformasiPengembangGraphics();
	}

	public void loadSceneKamarResources() {

		loadKamarGraphics();
		//loadKamarAudio();
		//loadKamarFont();
	}
	
	public void loadSceneRuangTengahResources(){
		
		loadRuangTengahGraphics();
	}
	
	public void loadSceneLotengResource(){
		loadLotengGraphics();
	}
	
	public void loadSceneHalamanSekolahResource(){
		loadHalamanSekolahGraphics();
	}
	private void loadHalamanSekolahGraphics() {
		

		
		ResourcesManagerAsset.getInstance().gedungSekolah_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
				.getTextureManager(),
		1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().LatarHalaman_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().pagarHalaman_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().PohonLuarSekolah_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().sungai_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().tanahHalaman_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().tembokHalaman_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		
		ResourcesManagerAsset.getInstance().animAnakBola_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().animAyunanPerempuan_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().animGuru_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().animPedagang_HalamanTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		
		
		BitmapTextureAtlasTextureRegionFactory
		.setAssetBasePath("gfx/Halaman_Sekolah/Anim_Object/");
		
		ResourcesManagerAsset.getInstance().animAnakBola_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animAnakBola_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"AnimAnakBola256x256.png", 2, 1);
		ResourcesManagerAsset.getInstance().animAyunanPerempuan_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animAyunanPerempuan_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"AyunanPerempuan256x256.png", 2, 1);
		ResourcesManagerAsset.getInstance().animGuru_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animGuru_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Guru256x256.png", 2, 1);
		ResourcesManagerAsset.getInstance().animPedagang_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animPedagang_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"PedagangEs256x256.png", 2, 1);
		
		
		BitmapTextureAtlasTextureRegionFactory
		.setAssetBasePath("gfx/Halaman_Sekolah/");
		
		ResourcesManagerAsset.getInstance().gedungSekolah_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().gedungSekolah_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"GedungSekolah1024x768.png");
		ResourcesManagerAsset.getInstance().latarHalaman_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().LatarHalaman_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"LatarHalamanSekolah.png");
		ResourcesManagerAsset.getInstance().pagarHalamanSekolah_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().pagarHalaman_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"PagarHalamanSekolah.png");
		ResourcesManagerAsset.getInstance().pohonLuarSekolah_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().PohonLuarSekolah_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"PohonLuarSekolah512x512.png");
		ResourcesManagerAsset.getInstance().sungai_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().sungai_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Sungai.png");
		ResourcesManagerAsset.getInstance().tanahHalaman_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().tanahHalaman_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"TanahHalaman1024x768.png");
		ResourcesManagerAsset.getInstance().tembokHalaman_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().tembokHalaman_HalamanTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Tembok1024x768.png");
		
		try {
			ResourcesManagerAsset.getInstance().animAnakBola_HalamanTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animAyunanPerempuan_HalamanTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animGuru_HalamanTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animPedagang_HalamanTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			
			ResourcesManagerAsset.getInstance().animAnakBola_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().animAyunanPerempuan_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().animGuru_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().animPedagang_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().gedungSekolah_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().LatarHalaman_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().pagarHalaman_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().PohonLuarSekolah_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().sungai_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().tanahHalaman_HalamanTextureAtlas.load();
			ResourcesManagerAsset.getInstance().tembokHalaman_HalamanTextureAtlas.load();
		} catch (TextureAtlasBuilderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	private void loadLotengGraphics() {
		

		
		ResourcesManagerAsset.getInstance().lantaiLoteng_LotengTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
				.getTextureManager(),
		1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().latarLoteng_LotengTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().tanggaTurunLoteng_LotengTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		
		ResourcesManagerAsset.getInstance().animHanduk_LotengTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().animRak_LotengTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		
		BitmapTextureAtlasTextureRegionFactory
		.setAssetBasePath("gfx/Loteng/Anim_Object/");
		
		ResourcesManagerAsset.getInstance().animHanduk_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animHanduk_LotengTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Handuk256x256.png", 2, 1);
		ResourcesManagerAsset.getInstance().animRak_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animRak_LotengTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Rak256x256.png", 2, 1);
		
		
		BitmapTextureAtlasTextureRegionFactory
		.setAssetBasePath("gfx/Loteng/");
		
		ResourcesManagerAsset.getInstance().lantaiLoteng_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().lantaiLoteng_LotengTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"LantaiLoteng.png");
		ResourcesManagerAsset.getInstance().latarLoteng_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().latarLoteng_LotengTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"LatarLoteng.png");
		ResourcesManagerAsset.getInstance().tanggaRuangTengah_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().tangga_RuangTengahTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"TanggaTurun256x256.png");
		
		try {
			ResourcesManagerAsset.getInstance().animHanduk_LotengTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animRak_LotengTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			
			ResourcesManagerAsset.getInstance().animHanduk_LotengTextureAtlas.load();
			ResourcesManagerAsset.getInstance().animRak_LotengTextureAtlas.load();
			ResourcesManagerAsset.getInstance().lantaiLoteng_LotengTextureAtlas.load();
			ResourcesManagerAsset.getInstance().latarLoteng_LotengTextureAtlas.load();
			ResourcesManagerAsset.getInstance().latarLoteng_LotengTextureAtlas.load();
			ResourcesManagerAsset.getInstance().tanggaTurunLoteng_LotengTextureAtlas.load();
			
		} catch (TextureAtlasBuilderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}

	private void loadRuangTengahGraphics() {
		

			
			ResourcesManagerAsset.getInstance().lantaiRuangTengah_RuangTengahTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
					.getTextureManager(),
			1024, 768, TextureOptions.BILINEAR);
			ResourcesManagerAsset.getInstance().latarRuangTengah_RuangTengahTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
							.getTextureManager(),
					1024, 768, TextureOptions.BILINEAR);
			ResourcesManagerAsset.getInstance().tangga_RuangTengahTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
							.getTextureManager(),
					1024, 768, TextureOptions.BILINEAR);
			
			ResourcesManagerAsset.getInstance().animPintuKeluar_RuangTengahTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
							.getTextureManager(),
					1024, 768, TextureOptions.BILINEAR);
			ResourcesManagerAsset.getInstance().animAyah_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
							.getTextureManager(),
					1024, 768, TextureOptions.BILINEAR);
			ResourcesManagerAsset.getInstance().animIbu_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
							.getTextureManager(),
					1024, 768, TextureOptions.BILINEAR);
			ResourcesManagerAsset.getInstance().animPintuTengah_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
							.getTextureManager(),
					1024, 768, TextureOptions.BILINEAR);
			ResourcesManagerAsset.getInstance().animTV_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
					ResourcesManagerAsset.getInstance().layoutgame_activity
							.getTextureManager(),
					1024, 768, TextureOptions.BILINEAR);
			
			BitmapTextureAtlasTextureRegionFactory
			.setAssetBasePath("gfx/RuangTengah/Anim_Object/");
			
			ResourcesManagerAsset.getInstance().animKomputer_Region = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(
							ResourcesManagerAsset.getInstance().animKomputer_KamarTextureAtlas,
							ResourcesManagerAsset.getInstance().layoutgame_activity,
							"AnimKomputer256x256.png", 2, 1);
			ResourcesManagerAsset.getInstance().animLemari_Region = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(
							ResourcesManagerAsset.getInstance().animLemari_KamarTextureAtlas,
							ResourcesManagerAsset.getInstance().layoutgame_activity,
							"AnimLemari256x256.png", 2, 1);
			ResourcesManagerAsset.getInstance().animBingkaiFoto_Region = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(
							ResourcesManagerAsset.getInstance().animBingkaiFoto_KamarTextureAtlas,
							ResourcesManagerAsset.getInstance().layoutgame_activity,
							"BingkaiFoto256x256.png", 2, 1);
			ResourcesManagerAsset.getInstance().animKasur_Region = BitmapTextureAtlasTextureRegionFactory
					.createTiledFromAsset(
							ResourcesManagerAsset.getInstance().animKasur_KamarTextureAtlas,
							ResourcesManagerAsset.getInstance().layoutgame_activity,
							"Kasur256x256.png", 2, 1);
			
			
			BitmapTextureAtlasTextureRegionFactory
			.setAssetBasePath("gfx/Ruang_Tengah/");
			
			ResourcesManagerAsset.getInstance().lantaiRuangTengah_region = BitmapTextureAtlasTextureRegionFactory
					.createFromAsset(
							ResourcesManagerAsset.getInstance().lantaiRuangTengah_RuangTengahTextureAtlas,
							ResourcesManagerAsset.getInstance().layoutgame_activity,
							"LantaiKamar.png");
			ResourcesManagerAsset.getInstance().latarRuangTengah_region = BitmapTextureAtlasTextureRegionFactory
					.createFromAsset(
							ResourcesManagerAsset.getInstance().latarRuangTengah_RuangTengahTextureAtlas,
							ResourcesManagerAsset.getInstance().layoutgame_activity,
							"LatarKamar.png");
			ResourcesManagerAsset.getInstance().tanggaRuangTengah_region = BitmapTextureAtlasTextureRegionFactory
					.createFromAsset(
							ResourcesManagerAsset.getInstance().tangga_RuangTengahTextureAtlas,
							ResourcesManagerAsset.getInstance().layoutgame_activity,
							"LatarKamar.png");
			
			try {
				ResourcesManagerAsset.getInstance().animPintuKeluar_RuangTengahTextureAtlas
				.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
						0, 1, 0));
				ResourcesManagerAsset.getInstance().animAyah_KamarTextureAtlas
				.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
						0, 1, 0));
				ResourcesManagerAsset.getInstance().animIbu_KamarTextureAtlas
				.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
						0, 1, 0));
				ResourcesManagerAsset.getInstance().animPintuTengah_KamarTextureAtlas
				.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
						0, 1, 0));
				ResourcesManagerAsset.getInstance().animTV_KamarTextureAtlas
				.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
						0, 1, 0));
				ResourcesManagerAsset.getInstance().animPintuKeluar_RuangTengahTextureAtlas.load();
				ResourcesManagerAsset.getInstance().animAyah_KamarTextureAtlas.load();
				ResourcesManagerAsset.getInstance().animIbu_KamarTextureAtlas.load();
				ResourcesManagerAsset.getInstance().animPintuTengah_KamarTextureAtlas.load();
				ResourcesManagerAsset.getInstance().animTV_KamarTextureAtlas.load();
				ResourcesManagerAsset.getInstance().lantaiRuangTengah_RuangTengahTextureAtlas.load();
				ResourcesManagerAsset.getInstance().latarRuangTengah_RuangTengahTextureAtlas.load();
				ResourcesManagerAsset.getInstance().tangga_RuangTengahTextureAtlas.load();
			} catch (TextureAtlasBuilderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	private void loadKamarGraphics() {

		
		ResourcesManagerAsset.getInstance().lantaiKamar_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
				.getTextureManager(),
		1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().latarKamar_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
	
		ResourcesManagerAsset.getInstance().animKomputer_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().animLemari_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().animBingkaiFoto_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().animKasur_KamarTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		
		
		BitmapTextureAtlasTextureRegionFactory
		.setAssetBasePath("gfx/Kamar/Anim_Object/");
		
		ResourcesManagerAsset.getInstance().animKomputer_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animKomputer_KamarTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"AnimKomputer256x256.png", 2, 1);
		ResourcesManagerAsset.getInstance().animLemari_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animLemari_KamarTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"AnimLemari256x256.png", 2, 1);
		ResourcesManagerAsset.getInstance().animBingkaiFoto_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animBingkaiFoto_KamarTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"BingkaiFoto256x256.png", 2, 1);
		ResourcesManagerAsset.getInstance().animKasur_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().animKasur_KamarTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Kasur256x256.png", 2, 1);
		
		
		BitmapTextureAtlasTextureRegionFactory
		.setAssetBasePath("gfx/Kamar/");
		
		ResourcesManagerAsset.getInstance().lantaiKamar_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().lantaiKamar_KamarTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"LantaiKamar.png");
		ResourcesManagerAsset.getInstance().latarKamar_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().latarKamar_KamarTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"LatarKamar.png");
		
		try {
			ResourcesManagerAsset.getInstance().animKomputer_KamarTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animLemari_KamarTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animBingkaiFoto_KamarTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animKasur_KamarTextureAtlas
			.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
					0, 1, 0));
			ResourcesManagerAsset.getInstance().animKomputer_KamarTextureAtlas.load();
			ResourcesManagerAsset.getInstance().animLemari_KamarTextureAtlas.load();
			ResourcesManagerAsset.getInstance().animBingkaiFoto_KamarTextureAtlas.load();
			ResourcesManagerAsset.getInstance().animKasur_KamarTextureAtlas.load();
			ResourcesManagerAsset.getInstance().lantaiKamar_KamarTextureAtlas.load();
			ResourcesManagerAsset.getInstance().latarKamar_KamarTextureAtlas.load();
		} catch (TextureAtlasBuilderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadMenuAudio() {

		// TODO Auto-generated method stub

	}

	private void loadMenuFonts() {

		// TODO Auto-generated method stub

	}

	private void loadMenuGraphics() {

		ResourcesManagerAsset.getInstance().template_menuTextureAtlas = new BitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768);

		ResourcesManagerAsset.getInstance().caraBermain_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().inpeng_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().mulai_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().pohonA_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().pohonB_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().gedungSD_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);

		ResourcesManagerAsset.getInstance().judul_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().latar_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().pagar_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().rumput_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().tanah_menuTextureAtlas = new BuildableBitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768, TextureOptions.BILINEAR);

		ResourcesManagerAsset.getInstance().awanA_menuTextureAtlas = new BitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768);
		ResourcesManagerAsset.getInstance().awanB_menuTextureAtlas = new BitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768);
		ResourcesManagerAsset.getInstance().awanC_menuTextureAtlas = new BitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 768);

		// ### persiapkan Anim object
		BitmapTextureAtlasTextureRegionFactory
				.setAssetBasePath("gfx/Menu/Anim_Object/");
		ResourcesManagerAsset.getInstance().pohonA_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().pohonA_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"PohonA512x512.png", 2, 1);
		ResourcesManagerAsset.getInstance().pohonB_Region = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(
						ResourcesManagerAsset.getInstance().pohonB_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"PohonB512x512.png", 2, 1);

		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/Menu/UI/");

		ResourcesManagerAsset.getInstance().cara_bermain_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().caraBermain_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"CaraBermain.png");
		ResourcesManagerAsset.getInstance().inpeng_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().inpeng_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"InPeng.png");
		ResourcesManagerAsset.getInstance().mulai_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().mulai_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Mulai.png");

		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/Menu/");
		ResourcesManagerAsset.getInstance().awanA_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().awanA_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"AwanA256x256.png", 0, 0);

		ResourcesManagerAsset.getInstance().awanB_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().awanB_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"AwanB256x256.png", 0, 0);

		ResourcesManagerAsset.getInstance().awanC_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().awanC_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"AwanC512x512.png", 0, 0);

		ResourcesManagerAsset.getInstance().gedungSD_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().gedungSD_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"GedungSD1024x768.png");
		ResourcesManagerAsset.getInstance().judul_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().judul_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Judul658x248.png");
		ResourcesManagerAsset.getInstance().latarMenu_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().latar_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Latar1024x768.png");
		ResourcesManagerAsset.getInstance().pagarMenu_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().pagar_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Pagar1024x768.png");
		ResourcesManagerAsset.getInstance().rumputMenu_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().rumput_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"RumputBelakang1024x768.png");
		ResourcesManagerAsset.getInstance().tanahMenu_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().tanah_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Tanah1024x768.png");

		BitmapTextureAtlasTextureRegionFactory
				.setAssetBasePath("gfx/Template/");
		ResourcesManagerAsset.getInstance().template_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().template_menuTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"Menu.png", 0, 0);
		try {

			ResourcesManagerAsset.getInstance().caraBermain_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().inpeng_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().mulai_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().pohonA_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().pohonB_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().gedungSD_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().judul_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().latar_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().pagar_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().rumput_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));
			ResourcesManagerAsset.getInstance().tanah_menuTextureAtlas
					.build(new BlackPawnTextureAtlasBuilder<IBitmapTextureAtlasSource, BitmapTextureAtlas>(
							0, 1, 0));

			ResourcesManagerAsset.getInstance().caraBermain_menuTextureAtlas
					.load();

			ResourcesManagerAsset.getInstance().inpeng_menuTextureAtlas.load();

			ResourcesManagerAsset.getInstance().mulai_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().pohonA_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().pohonB_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().gedungSD_menuTextureAtlas
					.load();
			ResourcesManagerAsset.getInstance().judul_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().latar_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().pagar_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().rumput_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().tanah_menuTextureAtlas.load();

			ResourcesManagerAsset.getInstance().awanA_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().awanB_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().awanC_menuTextureAtlas.load();
			ResourcesManagerAsset.getInstance().template_menuTextureAtlas
					.load();
		} catch (final TextureAtlasBuilderException e) {
			Debug.e(e);
		}

	}

	public void loadMenuResources() {

		loadMenuGraphics();
		loadMenuAudio();
		loadMenuFonts();
	}

	public void loadSplashScreen() {

		// loadMusicSplashScreen();
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/splash/");
		ResourcesManagerAsset.getInstance().splashTextureAtlas = new BitmapTextureAtlas(
				ResourcesManagerAsset.getInstance().layoutgame_activity
						.getTextureManager(),
				1024, 1024, TextureOptions.BILINEAR);
		ResourcesManagerAsset.getInstance().splash_region = BitmapTextureAtlasTextureRegionFactory
				.createFromAsset(
						ResourcesManagerAsset.getInstance().splashTextureAtlas,
						ResourcesManagerAsset.getInstance().layoutgame_activity,
						"splash.png", 0, 0);
		ResourcesManagerAsset.getInstance().splashTextureAtlas.load();
	}

	public void unloadCaraBermainScreen() {

		ResourcesManagerAsset.getInstance().latarCaraBermain_menuTextureAtlas
				.unload();
	}

	public void unloadInformasiPengembangScreen() {

		ResourcesManagerAsset.getInstance().latarInPeng_menuTextureAtlas
				.unload();
	}

	public void unloadMenuScreen() {

		ResourcesManagerAsset.getInstance().caraBermain_menuTextureAtlas
				.unload();

		ResourcesManagerAsset.getInstance().inpeng_menuTextureAtlas.unload();

		ResourcesManagerAsset.getInstance().mulai_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().pohonA_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().pohonB_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().gedungSD_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().judul_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().latar_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().pagar_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().rumput_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().tanah_menuTextureAtlas.unload();

		ResourcesManagerAsset.getInstance().awanA_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().awanB_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().awanC_menuTextureAtlas.unload();
		ResourcesManagerAsset.getInstance().template_menuTextureAtlas.unload();
	}

	public void unloadSplashScreen() {

		// ResourcesManagerAsset.getInstance().splashMusic.release();
		ResourcesManagerAsset.getInstance().splashTextureAtlas
				.clearTextureAtlasSources();
		ResourcesManagerAsset.getInstance().splash_region = null;
	}
}
