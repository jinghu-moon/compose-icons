package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorLightIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 195.510 62.660 L 212.440 44.000 C 214.105 42.455 214.754 40.101 214.118 37.921 C 213.481 35.740 211.667 34.106 209.432 33.699 C 207.197 33.293 204.924 34.183 203.560 36.000 L 186.630 54.580 C 147.868 24.079 92.123 28.725 58.945 65.222 C 25.768 101.719 26.442 157.653 60.490 193.340 L 43.560 212.000 C 41.695 214.484 42.034 217.981 44.342 220.060 C 46.650 222.139 50.163 222.113 52.440 220.000 L 69.370 201.380 C 108.132 231.754 163.765 227.064 196.895 190.630 C 230.025 154.196 229.421 98.369 195.510 62.660 ZM 46.000 128.000 C 45.972 96.626 63.863 67.992 92.072 54.261 C 120.281 40.530 153.855 44.114 178.530 63.490 L 68.590 184.430 C 54.082 169.226 45.991 149.015 46.000 128.000 ZM 128.000 210.000 C 109.670 210.013 91.870 203.852 77.470 192.510 L 187.410 71.570 C 210.011 95.317 216.282 130.250 203.353 160.376 C 190.424 190.502 160.783 210.022 128.000 210.000 Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
