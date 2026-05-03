package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TriangleRight: ImageVector
    get() {
        if (_triangleRight != null) return _triangleRight!!
        _triangleRight = lucideOutlineIcon(
            name = "TriangleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 18.000 C 22.000 19.105 21.105 20.000 20.000 20.000 L 3.000 20.000 C 1.900 20.000 1.700 19.400 2.600 18.700 L 20.400 4.300 C 21.300 3.600 22.000 3.900 22.000 5.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _triangleRight!!
    }

private var _triangleRight: ImageVector? = null
