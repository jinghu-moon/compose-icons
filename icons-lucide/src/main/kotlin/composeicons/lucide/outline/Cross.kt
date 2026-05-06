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
                pathData = parseSvgPathData("M4 9C2.895 9 2 9.895 2 11v2c0 1.105 .895 2 2 2h4c.552 0 1 .448 1 1v4c0 1.105 .895 2 2 2h2c1.105 0 2-.895 2-2v-4c0-.552 .448-1 1-1h4c1.105 0 2-.895 2-2v-2C22 9.895 21.105 9 20 9h-4C15.448 9 15 8.552 15 8v-4C15 2.895 14.105 2 13 2h-2C9.895 2 9 2.895 9 4v4C9 8.552 8.552 9 8 9Z"),
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
