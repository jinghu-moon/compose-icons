package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorThinIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 72.000 L 188.000 52.000 L 72.320 52.000 L 131.120 125.500 C 132.290 126.961 132.290 129.039 131.120 130.500 L 72.320 204.000 L 188.000 204.000 L 188.000 184.000 C 188.000 181.791 189.791 180.000 192.000 180.000 C 194.209 180.000 196.000 181.791 196.000 184.000 L 196.000 208.000 C 196.000 210.209 194.209 212.000 192.000 212.000 L 64.000 212.000 C 62.463 211.999 61.062 211.117 60.396 209.731 C 59.731 208.345 59.919 206.700 60.880 205.500 L 122.880 128.000 L 60.880 50.500 C 59.919 49.300 59.731 47.655 60.396 46.269 C 61.062 44.883 62.463 44.001 64.000 44.000 L 192.000 44.000 C 194.209 44.000 196.000 45.791 196.000 48.000 L 196.000 72.000 C 196.000 74.209 194.209 76.000 192.000 76.000 C 189.791 76.000 188.000 74.209 188.000 72.000 Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
