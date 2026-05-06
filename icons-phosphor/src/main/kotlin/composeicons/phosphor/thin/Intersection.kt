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
                pathData = parseSvgPathData("M204 120v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80C196 82.445 165.555 52 128 52 90.445 52 60 82.445 60 120v80c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-80C52 78.026 86.026 44 128 44c41.974 0 76 34.026 76 76Z"),
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
