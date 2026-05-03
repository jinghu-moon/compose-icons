package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = lucideOutlineIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.035 17.012 C 12.035 15.355 10.692 14.012 9.035 14.012 L 8.724 14.010 C 8.434 14.008 8.173 13.832 8.062 13.564 C 7.952 13.295 8.014 12.986 8.219 12.781 L 9.414 11.586 C 9.789 11.211 10.298 11.000 10.828 11.000 L 12.000 11.000 C 13.105 11.000 14.000 10.105 14.000 9.000 C 14.000 7.895 13.105 7.000 12.000 7.000 L 9.243 7.000 C 8.447 7.000 7.684 7.316 7.121 7.879 L 4.414 10.586 C 3.509 11.492 3.000 12.720 3.000 14.000 C 3.000 18.418 6.582 22.000 11.000 22.000 L 13.000 22.000 C 17.418 22.000 21.000 18.418 21.000 14.000 L 21.000 7.000 C 21.000 5.895 20.105 5.000 19.000 5.000 C 17.895 5.000 17.000 5.895 17.000 7.000 L 17.000 9.000 C 17.000 10.105 17.895 11.000 19.000 11.000 C 20.105 11.000 21.000 10.105 21.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 13.888 9.662 C 14.501 10.072 15.291 10.112 15.942 9.764 C 16.593 9.416 17.000 8.738 17.000 8.000 L 17.000 5.000 C 17.000 3.895 16.105 3.000 15.000 3.000 C 13.895 3.000 13.000 3.895 13.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 5.000 C 9.000 3.895 8.105 3.000 7.000 3.000 C 5.895 3.000 5.000 3.895 5.000 5.000 L 5.000 10.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 7.000 L 9.000 4.000 C 9.000 2.895 9.895 2.000 11.000 2.000 C 12.105 2.000 13.000 2.895 13.000 4.000 L 13.000 7.268"),
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
        return _handFist!!
    }

private var _handFist: ImageVector? = null
