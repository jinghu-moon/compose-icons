package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = lucideOutlineIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 14.000 L 6.000 14.000 C 7.105 14.000 8.000 14.895 8.000 16.000 L 8.000 19.000 C 8.000 20.105 7.105 21.000 6.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 12.000 C 3.000 7.029 7.029 3.000 12.000 3.000 C 16.971 3.000 21.000 7.029 21.000 12.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 18.000 21.000 C 16.895 21.000 16.000 20.105 16.000 19.000 L 16.000 16.000 C 16.000 14.895 16.895 14.000 18.000 14.000 L 21.000 14.000"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
