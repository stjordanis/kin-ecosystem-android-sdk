package com.kin.ecosystem.core.data.offer;

import android.support.annotation.NonNull;
import com.kin.ecosystem.common.Callback;
import com.kin.ecosystem.common.KinCallback;
import com.kin.ecosystem.common.ObservableData;
import com.kin.ecosystem.common.Observer;
import com.kin.ecosystem.common.model.NativeOffer;
import com.kin.ecosystem.common.model.NativeSpendOffer;
import com.kin.ecosystem.core.network.ApiException;
import com.kin.ecosystem.core.network.model.OfferList;


public interface OfferDataSource {

	OfferList getCachedOfferList();

	void getOffers(KinCallback<OfferList> callback);

	void addNativeOfferClickedObserver(@NonNull Observer<NativeSpendOffer> observer);

	void removeNativeOfferClickedObserver(@NonNull Observer<NativeSpendOffer> observer);

	ObservableData<NativeSpendOffer> getNativeSpendOfferObservable();

	boolean addNativeOffer(@NonNull NativeOffer nativeOffer);

	boolean removeNativeOffer(@NonNull NativeOffer nativeOffer);

	interface Remote {

		void getOffers(Callback<OfferList, ApiException> callback);
	}
}