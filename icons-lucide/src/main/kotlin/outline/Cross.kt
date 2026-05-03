package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = lucideOutlineIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 9.000 C 2.895 9.000 2.000 9.895 2.000 11.000 L 2.000 13.000 C 2.000 14.105 2.895 15.000 4.000 15.000 L 8.000 15.000 C 8.552 15.000 9.000 15.448 9.000 16.000 L 9.000 20.000 C 9.000 21.105 9.895 22.000 11.000 22.000 L 13.000 22.000 C 14.105 22.000 15.000 21.105 15.000 20.000 L 15.000 16.000 C 15.000 15.448 15.448 15.000 16.000 15.000 L 20.000 15.000 C 21.105 15.000 22.000 14.105 22.000 13.000 L 22.000 11.000 C 22.000 9.895 21.105 9.000 20.000 9.000 L 16.000 9.000 C 15.448 9.000 15.000 8.552 15.000 8.000 L 15.000 4.000 C 15.000 2.895 14.105 2.000 13.000 2.000 L 11.000 2.000 C 9.895 2.000 9.000 2.895 9.000 4.000 L 9.000 8.000 C 9.000 8.552 8.552 9.000 8.000 9.000 Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
