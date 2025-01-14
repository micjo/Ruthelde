package com.ruthelde.IBA.CalculationSetup;

import com.ruthelde.Stopping.*;

public class CalculationSetup {

    public static final StoppingCalculationMode DEFAULT_STOPPING_MODE            = StoppingCalculationMode.ZB    ;
    public static final CompoundCalculationMode DEFAULT_COMPOUND_CORRECTION_MODE = CompoundCalculationMode.BRAGG ;
    public static final StragglingMode          DEFAULT_STRAGGLING_MODE          = StragglingMode.CHU            ;
    public static final ScreeningMode           DEFAULT_SCREENING_MODE           = ScreeningMode.ANDERSON        ;
    public static final ChargeFractionMode      DEFAULT_CHARGE_FRACTION_MODE     = ChargeFractionMode.LINEAR     ;
    public static final boolean                 DEFAULT_USE_LOOK_UP_TABLE        = true                          ;
    public static final boolean                 DEFAULT_SIMULATE_ISOTOPES        = true                          ;

    private StoppingCalculationMode stoppingPowerCalculationMode ;
    private CompoundCalculationMode compoundCalculationMode      ;
    private ScreeningMode           screeningMode                ;
    private StragglingMode          stragglingMode               ;
    private ChargeFractionMode      chargeFractionMode           ;

    private double[]                correctionFactors            ;

    public boolean isShowIsotopes() {
        return showIsotopes;
    }

    private boolean useLookUpTable, simulateIsotopes, showIsotopes, showLayers, showElements;

    public CalculationSetup() {
        this.stoppingPowerCalculationMode = DEFAULT_STOPPING_MODE            ;
        this.compoundCalculationMode      = DEFAULT_COMPOUND_CORRECTION_MODE ;
        this.screeningMode                = DEFAULT_SCREENING_MODE           ;
        this.stragglingMode               = DEFAULT_STRAGGLING_MODE          ;
        this.chargeFractionMode           = DEFAULT_CHARGE_FRACTION_MODE     ;
        this.useLookUpTable               = DEFAULT_USE_LOOK_UP_TABLE        ;
        this.simulateIsotopes             = DEFAULT_SIMULATE_ISOTOPES        ;
        this.correctionFactors            = null                             ;
    }

    public void setUseLookUpTable(boolean useLookUpTable) {
        this.useLookUpTable = useLookUpTable;
    }

    public boolean isUseLookUpTable() {
        return this.useLookUpTable;
    }

    public void setSimulateIsotopes(boolean simulateIsotopes) {
        this.simulateIsotopes = simulateIsotopes;
    }

    public boolean isSimulateIsotopes() {
        return this.simulateIsotopes;
    }

    public void setShowIsotopes(boolean showIsotopes) {
        this.showIsotopes = showIsotopes;
    }

    public boolean isShowLayers() {
        return showLayers;
    }

    public void setShowLayers(boolean showLayers) {
        this.showLayers = showLayers;
    }

    public boolean isShowElements() {
        return showElements;
    }

    public void setShowElements(boolean showElements) {
        this.showElements = showElements;
    }

    public void setStoppingPowerCalculationMode(StoppingCalculationMode stoppingPowerCalculationMode) {
        if (stoppingPowerCalculationMode != null) {
            this.stoppingPowerCalculationMode = stoppingPowerCalculationMode;
        }
    }

    public StoppingCalculationMode getStoppingPowerCalculationMode() {
        return stoppingPowerCalculationMode;
    }

    public void setCompoundCalculationMode(CompoundCalculationMode compoundCalculationMode) {
        if (compoundCalculationMode != null) {
            this.compoundCalculationMode = compoundCalculationMode;
        }
    }

    public CompoundCalculationMode getCompoundCalculationMode() {
        return compoundCalculationMode;
    }

    public void setScreeningMode(ScreeningMode screeningMode) {
        if (screeningMode != null) {
            this.screeningMode = screeningMode;
        }
    }

    public ScreeningMode getScreeningMode() {
        return screeningMode;
    }

    public void setStragglingMode(StragglingMode stragglingMode) {
        if (stragglingMode != null) {
            this.stragglingMode = stragglingMode;
        }
    }

    public StragglingMode getStragglingMode() {
        return stragglingMode;
    }

    public void setChargeFractionMode(ChargeFractionMode chargeFractionMode) {
        if (chargeFractionMode != null) {
            this.chargeFractionMode = chargeFractionMode;
        }
    }

    public ChargeFractionMode getChargeFractionMode() {
        return chargeFractionMode;
    }

    public double[] getCorrectionFactors(){
        return correctionFactors;
    }

    public void setCorrectionFactors(double[] correctionFactors) {

        if (correctionFactors != null){

            this.correctionFactors = new double[correctionFactors.length];
            for (int i=0; i< correctionFactors.length; i++) this.correctionFactors[i] = correctionFactors[i];
        }

    }

    public CalculationSetup getDeepCopy(){

        CalculationSetup result = new CalculationSetup();

        result.setStoppingPowerCalculationMode(this.stoppingPowerCalculationMode);
        result.setCompoundCalculationMode(this.compoundCalculationMode);
        result.setScreeningMode(this.screeningMode);
        result.setStragglingMode(this.stragglingMode);
        result.setChargeFractionMode(this.chargeFractionMode);
        result.setUseLookUpTable(this.useLookUpTable);
        result.setSimulateIsotopes(this.simulateIsotopes);
        result.setShowIsotopes(this.showIsotopes);
        result.setShowLayers(this.showLayers);
        result.setShowElements(this.showElements);
        result.setCorrectionFactors(this.correctionFactors);

        return result;
    }
}
