package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorThinIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 64.000 L 204.000 144.000 C 204.000 185.974 169.974 220.000 128.000 220.000 C 86.026 220.000 52.000 185.974 52.000 144.000 L 52.000 64.000 C 52.000 61.791 53.791 60.000 56.000 60.000 C 58.209 60.000 60.000 61.791 60.000 64.000 L 60.000 144.000 C 60.000 181.555 90.445 212.000 128.000 212.000 C 165.555 212.000 196.000 181.555 196.000 144.000 L 196.000 64.000 C 196.000 61.791 197.791 60.000 200.000 60.000 C 202.209 60.000 204.000 61.791 204.000 64.000 Z"),
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
        return _union!!
    }

private var _union: ImageVector? = null
