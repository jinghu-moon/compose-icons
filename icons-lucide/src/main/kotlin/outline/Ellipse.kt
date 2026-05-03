package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ellipse: ImageVector
    get() {
        if (_ellipse != null) return _ellipse!!
        _ellipse = lucideOutlineIcon(
            name = "Ellipse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 12.000 C 22.000 15.314 17.523 18.000 12.000 18.000 C 6.477 18.000 2.000 15.314 2.000 12.000 C 2.000 8.686 6.477 6.000 12.000 6.000 C 17.523 6.000 22.000 8.686 22.000 12.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _ellipse!!
    }

private var _ellipse: ImageVector? = null
