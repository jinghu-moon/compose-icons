package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileBracesCorner: ImageVector
    get() {
        if (_fileBracesCorner != null) return _fileBracesCorner!!
        _fileBracesCorner = lucideOutlineIcon(
            name = "FileBracesCorner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 22.000 L 18.000 22.000 C 19.105 22.000 20.000 21.105 20.000 20.000 L 20.000 8.000 C 20.002 7.360 19.747 6.746 19.294 6.294 L 15.706 2.706 C 15.254 2.253 14.640 1.998 14.000 2.000 L 6.000 2.000 C 4.895 2.000 4.000 2.895 4.000 4.000 L 4.000 10.000"),
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
        pathData = parseSvgPathData("M 14.000 2.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 20.000 8.000"),
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
        pathData = parseSvgPathData("M 5.000 14.000 C 4.448 14.000 4.000 14.448 4.000 15.000 L 4.000 17.000 C 4.000 17.552 3.552 18.000 3.000 18.000 C 3.552 18.000 4.000 18.448 4.000 19.000 L 4.000 21.000 C 4.000 21.552 4.448 22.000 5.000 22.000"),
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
        pathData = parseSvgPathData("M 9.000 22.000 C 9.552 22.000 10.000 21.552 10.000 21.000 L 10.000 19.000 C 10.000 18.448 10.448 18.000 11.000 18.000 C 10.448 18.000 10.000 17.552 10.000 17.000 L 10.000 15.000 C 10.000 14.448 9.552 14.000 9.000 14.000"),
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
        return _fileBracesCorner!!
    }

private var _fileBracesCorner: ImageVector? = null
