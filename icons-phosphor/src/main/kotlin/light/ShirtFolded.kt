package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorLightIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 42.000 L 178.480 42.000 L 164.250 27.760 C 163.123 26.632 161.594 25.999 160.000 26.000 L 96.000 26.000 C 94.406 25.999 92.877 26.632 91.750 27.760 L 77.520 42.000 L 56.000 42.000 C 48.268 42.000 42.000 48.268 42.000 56.000 L 42.000 208.000 C 42.000 215.732 48.268 222.000 56.000 222.000 L 200.000 222.000 C 207.732 222.000 214.000 215.732 214.000 208.000 L 214.000 56.000 C 214.000 48.268 207.732 42.000 200.000 42.000 ZM 128.000 69.180 L 107.210 38.000 L 148.790 38.000 ZM 160.930 41.420 L 170.000 50.490 L 170.000 104.000 C 170.000 104.769 169.558 105.469 168.865 105.802 C 168.172 106.134 167.350 106.040 166.750 105.560 L 135.930 78.920 ZM 86.000 50.490 L 95.070 41.420 L 120.070 78.920 L 89.250 105.540 C 88.653 106.018 87.835 106.114 87.143 105.786 C 86.452 105.459 86.008 104.765 86.000 104.000 ZM 54.000 208.000 L 54.000 56.000 C 54.000 54.895 54.895 54.000 56.000 54.000 L 74.000 54.000 L 74.000 104.000 C 73.966 109.442 77.118 114.401 82.060 116.680 C 83.920 117.547 85.948 117.997 88.000 118.000 C 91.292 118.016 94.482 116.860 97.000 114.740 L 97.080 114.670 L 122.080 93.110 L 122.080 210.000 L 56.000 210.000 C 54.895 210.000 54.000 209.105 54.000 208.000 ZM 202.000 208.000 C 202.000 209.105 201.105 210.000 200.000 210.000 L 134.000 210.000 L 134.000 93.110 L 159.000 114.670 L 159.080 114.740 C 161.577 116.842 164.736 117.997 168.000 118.000 C 170.075 117.998 172.124 117.537 174.000 116.650 C 178.908 114.357 182.033 109.417 182.000 104.000 L 182.000 54.000 L 200.000 54.000 C 201.105 54.000 202.000 54.895 202.000 56.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
