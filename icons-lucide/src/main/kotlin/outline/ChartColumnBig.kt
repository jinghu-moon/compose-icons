package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ChartColumnBig: ImageVector
    get() {
        if (_chartColumnBig != null) return _chartColumnBig!!
        _chartColumnBig = lucideOutlineIcon(
            name = "ChartColumnBig",
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
        pathData = parseSvgPathData("M 16.000 5.000 L 18.000 5.000 C 18.552 5.000 19.000 5.448 19.000 6.000 L 19.000 16.000 C 19.000 16.552 18.552 17.000 18.000 17.000 L 16.000 17.000 C 15.448 17.000 15.000 16.552 15.000 16.000 L 15.000 6.000 C 15.000 5.448 15.448 5.000 16.000 5.000 Z"),
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
        pathData = parseSvgPathData("M 8.000 8.000 L 10.000 8.000 C 10.552 8.000 11.000 8.448 11.000 9.000 L 11.000 16.000 C 11.000 16.552 10.552 17.000 10.000 17.000 L 8.000 17.000 C 7.448 17.000 7.000 16.552 7.000 16.000 L 7.000 9.000 C 7.000 8.448 7.448 8.000 8.000 8.000 Z"),
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
        return _chartColumnBig!!
    }

private var _chartColumnBig: ImageVector? = null
