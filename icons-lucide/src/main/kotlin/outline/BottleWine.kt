package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BottleWine: ImageVector
    get() {
        if (_bottleWine != null) return _bottleWine!!
        _bottleWine = lucideOutlineIcon(
            name = "BottleWine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 3.000 C 10.000 2.448 10.448 2.000 11.000 2.000 L 13.000 2.000 C 13.552 2.000 14.000 2.448 14.000 3.000 L 14.000 5.000 C 14.000 6.298 14.421 7.561 15.200 8.600 L 15.800 9.400 C 16.579 10.439 17.000 11.702 17.000 13.000 L 17.000 21.000 C 17.000 21.552 16.552 22.000 16.000 22.000 L 8.000 22.000 C 7.448 22.000 7.000 21.552 7.000 21.000 L 7.000 13.000 C 7.000 11.702 7.421 10.439 8.200 9.400 L 8.800 8.600 C 9.579 7.561 10.000 6.298 10.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 17.000 13.000 L 13.000 13.000 C 12.448 13.000 12.000 13.448 12.000 14.000 L 12.000 17.000 C 12.000 17.552 12.448 18.000 13.000 18.000 L 17.000 18.000"),
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
        return _bottleWine!!
    }

private var _bottleWine: ImageVector? = null
