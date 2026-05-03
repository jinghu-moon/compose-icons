package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorThinIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.000 99.770 L 124.000 176.000 C 124.000 178.209 125.791 180.000 128.000 180.000 C 130.209 180.000 132.000 178.209 132.000 176.000 L 132.000 99.770 C 150.986 97.647 165.007 81.064 163.944 61.990 C 162.881 42.915 147.104 27.993 128.000 27.993 C 108.896 27.993 93.119 42.915 92.056 61.990 C 90.993 81.064 105.014 97.647 124.000 99.770 ZM 128.000 36.000 C 143.464 36.000 156.000 48.536 156.000 64.000 C 156.000 79.464 143.464 92.000 128.000 92.000 C 112.536 92.000 100.000 79.464 100.000 64.000 C 100.000 48.536 112.536 36.000 128.000 36.000 ZM 236.000 176.000 C 236.000 188.460 224.270 199.830 203.000 208.000 C 182.910 215.730 156.280 220.000 128.000 220.000 C 99.720 220.000 73.110 215.750 53.000 208.000 C 31.710 199.810 20.000 188.440 20.000 176.000 C 20.000 157.450 45.810 141.780 87.370 135.120 C 88.827 134.780 90.353 135.282 91.323 136.421 C 92.294 137.560 92.547 139.146 91.980 140.531 C 91.413 141.916 90.121 142.868 88.630 143.000 C 52.930 148.740 28.000 162.300 28.000 176.000 C 28.000 193.390 68.180 212.000 128.000 212.000 C 187.820 212.000 228.000 193.390 228.000 176.000 C 228.000 162.300 203.070 148.740 167.370 143.000 C 165.902 142.840 164.641 141.885 164.091 140.514 C 163.540 139.144 163.790 137.582 164.739 136.451 C 165.689 135.320 167.185 134.804 168.630 135.110 C 210.190 141.780 236.000 157.450 236.000 176.000 Z"),
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
