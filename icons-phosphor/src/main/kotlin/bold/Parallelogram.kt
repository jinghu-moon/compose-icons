package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorBoldIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.780 45.140 C 245.108 39.434 238.785 35.990 232.000 36.000 L 88.810 36.000 C 80.940 35.999 73.801 40.614 70.570 47.790 L 5.770 191.790 C 2.984 197.978 3.526 205.156 7.209 210.855 C 10.892 216.554 17.214 219.998 24.000 220.000 L 167.190 220.000 C 175.060 220.001 182.199 215.386 185.430 208.210 L 250.230 64.210 C 253.033 58.022 252.486 50.833 248.780 45.140 ZM 164.600 196.000 L 30.200 196.000 L 91.400 60.000 L 225.800 60.000 Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
