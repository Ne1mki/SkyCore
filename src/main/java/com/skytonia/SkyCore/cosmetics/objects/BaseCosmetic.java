package com.skytonia.SkyCore.cosmetics.objects;

import com.skytonia.SkyCore.cosmetics.objects.options.CosmeticModifier;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by Chris Brown (OhBlihv) on 6/08/2016.
 */
@RequiredArgsConstructor
public abstract class BaseCosmetic implements ICosmetic
{
	
	@Getter
	private final String cosmeticName;
	
	@Getter
	private final int updateRate;
	
	public abstract boolean supportsModifier(CosmeticModifier cosmeticModifier);
	
}
