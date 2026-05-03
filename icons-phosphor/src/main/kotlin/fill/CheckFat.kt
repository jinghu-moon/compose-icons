package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorFillIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.310 90.910 L 114.910 219.310 C 108.662 225.553 98.538 225.553 92.290 219.310 L 20.670 147.310 C 14.433 141.064 14.433 130.946 20.670 124.700 L 40.670 104.700 C 46.913 98.483 57.007 98.483 63.250 104.700 L 104.000 144.220 L 200.760 48.650 C 207.004 42.427 217.106 42.427 223.350 48.650 L 243.300 68.190 C 246.330 71.193 248.036 75.282 248.038 79.548 C 248.040 83.814 246.338 87.904 243.310 90.910 Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
