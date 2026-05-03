package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandGrab: ImageVector
    get() {
        if (_handGrab != null) return _handGrab!!
        _handGrab = lucideOutlineIcon(
            name = "HandGrab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 11.500 L 18.000 9.000 C 18.000 7.895 17.105 7.000 16.000 7.000 C 14.895 7.000 14.000 7.895 14.000 9.000 L 14.000 10.400"),
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
        pathData = parseSvgPathData("M 14.000 10.000 L 14.000 8.000 C 14.000 6.895 13.105 6.000 12.000 6.000 C 10.895 6.000 10.000 6.895 10.000 8.000 L 10.000 10.000"),
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
        pathData = parseSvgPathData("M 10.000 9.900 L 10.000 9.000 C 10.000 7.895 9.105 7.000 8.000 7.000 C 6.895 7.000 6.000 7.895 6.000 9.000 L 6.000 14.000"),
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
        pathData = parseSvgPathData("M 6.000 14.000 C 6.000 12.895 5.105 12.000 4.000 12.000 C 2.895 12.000 2.000 12.895 2.000 14.000"),
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
        pathData = parseSvgPathData("M 18.000 11.000 C 18.000 9.895 18.895 9.000 20.000 9.000 C 21.105 9.000 22.000 9.895 22.000 11.000 L 22.000 14.000 C 22.000 18.418 18.418 22.000 14.000 22.000 L 10.000 22.000 C 5.582 22.000 2.000 18.418 2.000 14.000 C 2.000 12.895 2.895 12.000 4.000 12.000 C 5.105 12.000 6.000 12.895 6.000 14.000"),
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
        return _handGrab!!
    }

private var _handGrab: ImageVector? = null
