package com.aliumujib.flightyy.domain.usecases.airports


import com.aliumujib.flightyy.domain.executor.PostExecutionThread
import com.aliumujib.flightyy.domain.usecases.base.ObservableUseCase
import com.aliumujib.flightyy.domain.models.Airport
import com.aliumujib.flightyy.domain.repositories.airports.IAirportsRepository
import io.reactivex.Observable
import javax.inject.Inject

class FetchAirports @Inject constructor(
    private val repository: IAirportsRepository,
    postExecutionThread: PostExecutionThread
) : ObservableUseCase<Unit, List<Airport>>(postExecutionThread) {


    override fun buildUseCaseObservable(params: Unit?): Observable<List<Airport>> {
        return repository.searchAirports()
    }


}