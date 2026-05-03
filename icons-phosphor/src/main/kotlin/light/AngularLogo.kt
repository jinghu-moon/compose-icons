package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AngularLogo: ImageVector
    get() {
        if (_angularLogo != null) return _angularLogo!!
        _angularLogo = phosphorLightIcon(
            name = "AngularLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.310 66.460 L 130.310 26.460 C 128.830 25.850 127.170 25.850 125.690 26.460 L 29.690 66.460 C 27.185 67.504 25.692 70.100 26.050 72.790 L 42.050 192.790 C 42.312 194.765 43.537 196.481 45.320 197.370 L 125.320 237.370 C 127.007 238.212 128.993 238.212 130.680 237.370 L 210.680 197.370 C 212.463 196.481 213.688 194.765 213.950 192.790 L 229.950 72.790 C 230.308 70.100 228.815 67.504 226.310 66.460 ZM 202.470 188.060 L 128.000 225.290 L 53.530 188.060 L 38.530 75.770 L 128.000 38.500 L 217.440 75.770 ZM 122.750 85.060 L 82.750 157.060 C 81.143 159.959 82.191 163.613 85.090 165.220 C 87.989 166.827 91.643 165.779 93.250 162.880 L 104.860 142.000 L 151.140 142.000 L 162.750 162.910 C 163.808 164.818 165.818 166.001 168.000 166.000 C 169.016 166.001 170.015 165.740 170.900 165.240 C 173.795 163.634 174.842 159.987 173.240 157.090 L 133.240 85.090 C 132.183 83.180 130.173 81.995 127.990 81.995 C 125.807 81.995 123.797 83.180 122.740 85.090 ZM 144.470 130.000 L 111.530 130.000 L 128.000 100.350 Z"),
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
        return _angularLogo!!
    }

private var _angularLogo: ImageVector? = null
