package com.granzginz.manager;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BuildableBitmapTextureAtlas;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.texture.region.TextureRegion;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.ui.activity.LayoutGameActivity;

import android.content.SharedPreferences;

public class ResourcesManagerAsset {

	public static ResourcesManagerAsset getInstance() {

		return INSTANCE;
	}

	
	public static void prepareManagerLayoutGameActivity(Engine engine,
			LayoutGameActivity layoutgame_activity, Camera camera,
			VertexBufferObjectManager vbom, SharedPreferences sp) {

		getInstance().layout_engine = engine;
		getInstance().layoutgame_activity = layoutgame_activity;
		getInstance().layoutcamera = camera;
		getInstance().layoutgame_vbom = vbom;
		getInstance().sp = sp;
	}

	// ---------------------------------------------
	// VARIABLES
	// ---------------------------------------------
	private static final ResourcesManagerAsset INSTANCE = new ResourcesManagerAsset();

	public Engine base_engine;

	
	public VertexBufferObjectManager bsgame_vbom;

	public Camera bsgame_amera;

	public SharedPreferences sp;

	public Engine layout_engine;

	public LayoutGameActivity layoutgame_activity;

	public VertexBufferObjectManager layoutgame_vbom;

	public Camera layoutcamera;

	// variable kelas

	public ITextureRegion splash_region;

	public BitmapTextureAtlas splashTextureAtlas;

	public BuildableBitmapTextureAtlas caraBermain_menuTextureAtlas;

	public BitmapTextureAtlas awanA_menuTextureAtlas;

	public TiledTextureRegion pohonA_Region;

	public TiledTextureRegion pohonB_Region;

	public TextureRegion cara_bermain_region;

	public TextureRegion inpeng_region;

	public TextureRegion mulai_region;

	public TextureRegion awanA_region;

	public TextureRegion awanB_region;

	public TextureRegion awanC_region;

	public TextureRegion gedungSD_region;

	public TextureRegion judul_region;

	public TextureRegion latarMenu_region;

	public TextureRegion pagarMenu_region;

	public TextureRegion rumputMenu_region;

	public TextureRegion tanahMenu_region;

	public BuildableBitmapTextureAtlas inpeng_menuTextureAtlas;

	public BuildableBitmapTextureAtlas mulai_menuTextureAtlas;

	public BuildableBitmapTextureAtlas pohonA_menuTextureAtlas;

	public BuildableBitmapTextureAtlas pohonB_menuTextureAtlas;

	public BuildableBitmapTextureAtlas gedungSD_menuTextureAtlas;

	public BitmapTextureAtlas awanB_menuTextureAtlas;

	public BitmapTextureAtlas awanC_menuTextureAtlas;

	public BuildableBitmapTextureAtlas judul_menuTextureAtlas;

	public BuildableBitmapTextureAtlas latar_menuTextureAtlas;

	public BuildableBitmapTextureAtlas pagar_menuTextureAtlas;

	public BuildableBitmapTextureAtlas rumput_menuTextureAtlas;

	public BuildableBitmapTextureAtlas tanah_menuTextureAtlas;

	public BitmapTextureAtlas template_menuTextureAtlas;

	public TextureRegion template_region;

	public BuildableBitmapTextureAtlas latarCaraBermain_menuTextureAtlas;

	public TextureRegion latarCaraBermain_region;

	public BuildableBitmapTextureAtlas latarInPeng_menuTextureAtlas;

	public TextureRegion latarInpeng_region;

	public BuildableBitmapTextureAtlas latarKamar_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas lantaiKamar_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas animKomputer_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas animLemari_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas animBingkaiFoto_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas animKasur_KamarTextureAtlas;

	public TiledTextureRegion animKomputer_Region;

	public TiledTextureRegion animLemari_Region;

	public TiledTextureRegion animBingkaiFoto_Region;

	public TiledTextureRegion animKasur_Region;

	public TextureRegion lantaiKamar_region;

	public TextureRegion latarKamar_region;

	public BuildableBitmapTextureAtlas lantaiRuangTengah_RuangTengahTextureAtlas;

	public BuildableBitmapTextureAtlas latarRuangTengah_RuangTengahTextureAtlas;

	public BuildableBitmapTextureAtlas tangga_RuangTengahTextureAtlas;

	public BuildableBitmapTextureAtlas animPintuKeluar_RuangTengahTextureAtlas;

	public BuildableBitmapTextureAtlas animAyah_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas animIbu_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas animPintuTengah_KamarTextureAtlas;

	public BuildableBitmapTextureAtlas animTV_KamarTextureAtlas;

	public TextureRegion lantaiRuangTengah_region;

	public TextureRegion latarRuangTengah_region;

	public TextureRegion tanggaRuangTengah_region;

	public BuildableBitmapTextureAtlas lantaiLoteng_LotengTextureAtlas;

	public BuildableBitmapTextureAtlas latarLoteng_LotengTextureAtlas;

	public BuildableBitmapTextureAtlas tanggaTurunLoteng_LotengTextureAtlas;

	public BuildableBitmapTextureAtlas animHanduk_LotengTextureAtlas;

	public BuildableBitmapTextureAtlas animRak_LotengTextureAtlas;

	public TiledTextureRegion animHanduk_Region;

	public TiledTextureRegion animRak_Region;

	public TextureRegion lantaiLoteng_region;

	public TextureRegion latarLoteng_region;

	public BuildableBitmapTextureAtlas gedungSekolah_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas LatarHalaman_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas pagarHalaman_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas PohonLuarSekolah_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas sungai_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas tanahHalaman_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas tembokHalaman_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas animAnakBola_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas animAyunanPerempuan_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas animGuru_HalamanTextureAtlas;

	public BuildableBitmapTextureAtlas animPedagang_HalamanTextureAtlas;

	public TiledTextureRegion animAnakBola_Region;

	public TiledTextureRegion animAyunanPerempuan_Region;

	public TiledTextureRegion animGuru_Region;

	public TiledTextureRegion animPedagang_Region;

	public TextureRegion gedungSekolah_region;

	public TextureRegion latarHalaman_region;

	public TextureRegion pagarHalamanSekolah_region;

	public TextureRegion pohonLuarSekolah_region;

	public TextureRegion sungai_region;

	public TextureRegion tanahHalaman_region;

	public TextureRegion tembokHalaman_region;

}
