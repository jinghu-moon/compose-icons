package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorThinIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 120.000 L 204.000 200.000 C 204.000 202.209 202.209 204.000 200.000 204.000 C 197.791 204.000 196.000 202.209 196.000 200.000 L 196.000 120.000 C 196.000 82.445 165.555 52.000 128.000 52.000 C 90.445 52.000 60.000 82.445 60.000 120.000 L 60.000 200.000 C 60.000 202.209 58.209 204.000 56.000 204.000 C 53.791 204.000 52.000 202.209 52.000 200.000 L 52.000 120.000 C 52.000 78.026 86.026 44.000 128.000 44.000 C 169.974 44.000 204.000 78.026 204.000 120.000 Z"),
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
        return _intersection!!
    }

private var _intersection: ImageVector? = null
