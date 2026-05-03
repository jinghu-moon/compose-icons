package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorBoldIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 208.000 C 180.000 214.627 174.627 220.000 168.000 220.000 L 88.000 220.000 C 83.455 220.000 79.300 217.432 77.267 213.367 C 75.234 209.301 75.673 204.436 78.400 200.800 L 150.350 104.880 C 156.877 96.269 157.867 84.670 152.893 75.078 C 147.920 65.485 137.870 59.610 127.071 59.983 C 116.272 60.355 106.651 66.908 102.350 76.820 C 99.694 82.895 92.615 85.666 86.540 83.010 C 80.465 80.354 77.694 73.275 80.350 67.200 C 81.979 63.477 84.036 59.957 86.480 56.710 C 103.764 33.774 136.369 29.191 159.305 46.475 C 182.241 63.759 186.824 96.364 169.540 119.300 L 112.000 196.000 L 168.000 196.000 C 174.627 196.000 180.000 201.373 180.000 208.000 Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
