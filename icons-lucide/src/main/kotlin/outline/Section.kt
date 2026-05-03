package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = lucideOutlineIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 5.000 C 16.000 3.343 14.209 2.000 12.000 2.000 C 9.791 2.000 8.000 3.343 8.000 5.000 C 8.000 9.000 16.000 8.000 16.000 12.000 C 16.000 13.657 14.209 15.000 12.000 15.000 C 9.791 15.000 8.000 13.657 8.000 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 19.000 C 8.000 20.657 9.791 22.000 12.000 22.000 C 14.209 22.000 16.000 20.657 16.000 19.000 C 16.000 15.000 8.000 16.000 8.000 12.000 C 8.000 10.343 9.791 9.000 12.000 9.000 C 14.209 9.000 16.000 10.343 16.000 12.000"),
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
        return _section!!
    }

private var _section: ImageVector? = null
