package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartBarBig: ImageVector
    get() {
        if (_chartBarBig != null) return _chartBarBig!!
        _chartBarBig = lucideOutlineIcon(
            name = "ChartBarBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 21.000 21.000"),
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
        pathData = parseSvgPathData("M 8.000 13.000 L 15.000 13.000 C 15.552 13.000 16.000 13.448 16.000 14.000 L 16.000 16.000 C 16.000 16.552 15.552 17.000 15.000 17.000 L 8.000 17.000 C 7.448 17.000 7.000 16.552 7.000 16.000 L 7.000 14.000 C 7.000 13.448 7.448 13.000 8.000 13.000 Z"),
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
        pathData = parseSvgPathData("M 8.000 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 8.000 C 19.000 8.552 18.552 9.000 18.000 9.000 L 8.000 9.000 C 7.448 9.000 7.000 8.552 7.000 8.000 L 7.000 6.000 C 7.000 5.448 7.448 5.000 8.000 5.000 Z"),
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
        return _chartBarBig!!
    }

private var _chartBarBig: ImageVector? = null
