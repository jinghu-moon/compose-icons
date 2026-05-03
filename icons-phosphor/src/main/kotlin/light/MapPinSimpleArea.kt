package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorLightIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 122.000 101.520 L 122.000 176.000 C 122.000 179.314 124.686 182.000 128.000 182.000 C 131.314 182.000 134.000 179.314 134.000 176.000 L 134.000 101.520 C 153.571 98.391 167.450 80.745 165.881 60.987 C 164.311 41.230 147.820 25.997 128.000 25.997 C 108.180 25.997 91.689 41.230 90.119 60.987 C 88.550 80.745 102.429 98.391 122.000 101.520 ZM 128.000 38.000 C 142.359 38.000 154.000 49.641 154.000 64.000 C 154.000 78.359 142.359 90.000 128.000 90.000 C 113.641 90.000 102.000 78.359 102.000 64.000 C 102.000 49.641 113.641 38.000 128.000 38.000 ZM 238.000 176.000 C 238.000 189.340 225.820 201.380 203.690 209.880 C 183.380 217.700 156.500 222.000 128.000 222.000 C 99.500 222.000 72.620 217.700 52.310 209.880 C 30.180 201.380 18.000 189.340 18.000 176.000 C 18.000 156.400 44.460 140.000 87.050 133.140 C 90.325 132.602 93.417 134.820 93.955 138.095 C 94.493 141.370 92.275 144.462 89.000 145.000 C 71.000 147.890 55.730 152.660 44.910 158.780 C 35.280 164.200 30.000 170.320 30.000 176.000 C 30.000 192.080 70.250 210.000 128.000 210.000 C 185.750 210.000 226.000 192.080 226.000 176.000 C 226.000 170.320 220.720 164.200 211.140 158.770 C 200.320 152.650 185.070 147.880 167.050 144.990 C 163.778 144.465 161.550 141.387 162.075 138.115 C 162.600 134.843 165.678 132.615 168.950 133.140 C 211.540 140.000 238.000 156.400 238.000 176.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
