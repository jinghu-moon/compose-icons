package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorDuotoneIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 237.660 85.260 L 109.260 213.660 C 107.759 215.162 105.723 216.006 103.600 216.006 C 101.477 216.006 99.441 215.162 97.940 213.660 L 26.340 141.660 C 23.218 138.536 23.218 133.474 26.340 130.350 L 50.340 106.350 C 51.841 104.848 53.877 104.004 56.000 104.004 C 58.123 104.004 60.159 104.848 61.660 106.350 L 104.000 147.430 L 202.340 50.340 C 203.841 48.838 205.877 47.994 208.000 47.994 C 210.123 47.994 212.159 48.838 213.660 50.340 L 237.660 73.940 C 239.162 75.441 240.006 77.477 240.006 79.600 C 240.006 81.723 239.162 83.759 237.660 85.260 Z"),
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
