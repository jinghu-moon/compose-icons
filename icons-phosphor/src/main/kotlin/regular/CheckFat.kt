package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorRegularIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.280 68.240 L 219.280 44.680 C 213.036 38.457 202.934 38.457 196.690 44.680 L 104.000 136.230 L 67.310 100.630 C 61.053 94.427 50.959 94.449 44.730 100.680 L 20.730 124.680 C 14.493 130.926 14.493 141.044 20.730 147.290 L 92.350 219.290 C 95.351 222.291 99.421 223.978 103.665 223.978 C 107.909 223.978 111.979 222.291 114.980 219.290 L 243.330 90.910 C 246.337 87.901 248.022 83.819 248.013 79.565 C 248.003 75.311 246.300 71.236 243.280 68.240 ZM 103.620 208.000 L 32.000 136.000 L 56.000 112.000 C 56.029 112.024 56.056 112.051 56.080 112.080 L 98.430 153.170 C 101.540 156.213 106.510 156.213 109.620 153.170 L 208.060 56.000 L 232.000 79.600 Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
