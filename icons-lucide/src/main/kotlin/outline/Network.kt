package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = lucideOutlineIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 16.000 L 21.000 16.000 C 21.552 16.000 22.000 16.448 22.000 17.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 17.000 22.000 C 16.448 22.000 16.000 21.552 16.000 21.000 L 16.000 17.000 C 16.000 16.448 16.448 16.000 17.000 16.000 Z"),
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
        pathData = parseSvgPathData("M 3.000 16.000 L 7.000 16.000 C 7.552 16.000 8.000 16.448 8.000 17.000 L 8.000 21.000 C 8.000 21.552 7.552 22.000 7.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 L 2.000 17.000 C 2.000 16.448 2.448 16.000 3.000 16.000 Z"),
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
        pathData = parseSvgPathData("M 10.000 2.000 L 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 7.000 C 15.000 7.552 14.552 8.000 14.000 8.000 L 10.000 8.000 C 9.448 8.000 9.000 7.552 9.000 7.000 L 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 Z"),
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
        pathData = parseSvgPathData("M 5.000 16.000 L 5.000 13.000 C 5.000 12.448 5.448 12.000 6.000 12.000 L 18.000 12.000 C 18.552 12.000 19.000 12.448 19.000 13.000 L 19.000 16.000"),
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
        pathData = parseSvgPathData("M 12.000 12.000 L 12.000 8.000"),
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
        return _network!!
    }

private var _network: ImageVector? = null
