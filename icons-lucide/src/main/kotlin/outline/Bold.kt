package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bold: ImageVector
    get() {
        if (_bold != null) return _bold!!
        _bold = lucideOutlineIcon(
            name = "Bold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 12.000 L 15.000 12.000 C 17.209 12.000 19.000 13.791 19.000 16.000 C 19.000 18.209 17.209 20.000 15.000 20.000 L 7.000 20.000 C 6.448 20.000 6.000 19.552 6.000 19.000 L 6.000 5.000 C 6.000 4.448 6.448 4.000 7.000 4.000 L 14.000 4.000 C 16.209 4.000 18.000 5.791 18.000 8.000 C 18.000 10.209 16.209 12.000 14.000 12.000"),
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
        return _bold!!
    }

private var _bold: ImageVector? = null
