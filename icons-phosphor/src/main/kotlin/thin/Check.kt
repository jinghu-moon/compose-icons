package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorThinIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.830 74.830 L 98.830 202.830 C 98.080 203.581 97.062 204.003 96.000 204.003 C 94.938 204.003 93.920 203.581 93.170 202.830 L 37.170 146.830 C 35.607 145.267 35.607 142.733 37.170 141.170 C 38.733 139.607 41.267 139.607 42.830 141.170 L 96.000 194.340 L 221.170 69.170 C 222.733 67.607 225.267 67.607 226.830 69.170 C 228.393 70.733 228.393 73.267 226.830 74.830 Z"),
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
