package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorBoldIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 80.490 L 104.490 208.490 C 102.238 210.749 99.180 212.019 95.990 212.019 C 92.800 212.019 89.742 210.749 87.490 208.490 L 31.490 152.490 C 26.796 147.796 26.796 140.184 31.490 135.490 C 36.184 130.796 43.796 130.796 48.490 135.490 L 96.000 183.000 L 215.510 63.510 C 220.204 58.816 227.816 58.816 232.510 63.510 C 237.204 68.204 237.204 75.816 232.510 80.510 Z"),
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
        return _check!!
    }

private var _check: ImageVector? = null
