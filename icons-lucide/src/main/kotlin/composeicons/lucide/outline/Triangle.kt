package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Triangle: ImageVector
    get() {
        if (_triangle != null) return _triangle!!
        _triangle = lucideOutlineIcon(
            name = "Triangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.73 4C13.372 3.383 12.713 3.004 12 3.004c-.713 0-1.372 .38-1.73 .996L2.27 18c-.357 .618-.357 1.38-.001 1.999C2.626 20.618 3.286 20.999 4 21h16c.714-.001 1.374-.382 1.731-1.001 .357-.619 .357-1.381-.001-1.999Z"),
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
        return _triangle!!
    }

private var _triangle: ImageVector? = null
