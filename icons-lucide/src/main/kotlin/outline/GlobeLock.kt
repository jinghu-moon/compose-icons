package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GlobeLock: ImageVector
    get() {
        if (_globeLock != null) return _globeLock!!
        _globeLock = lucideOutlineIcon(
            name = "GlobeLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.686 15.000 C 15.130 17.630 13.854 20.053 12.000 22.000 C 6.667 16.400 6.667 7.600 12.000 2.000 C 6.870 2.001 2.573 5.884 2.054 10.988 C 1.535 16.091 4.962 20.760 9.986 21.795 C 15.011 22.829 20.003 19.894 21.542 15.000"),
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
        pathData = parseSvgPathData("M 2.000 12.000 L 10.500 12.000"),
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
        pathData = parseSvgPathData("M 20.000 6.000 L 20.000 4.000 C 20.000 2.895 19.105 2.000 18.000 2.000 C 16.895 2.000 16.000 2.895 16.000 4.000 L 16.000 6.000"),
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
        pathData = parseSvgPathData("M 15.000 6.000 L 21.000 6.000 C 21.552 6.000 22.000 6.448 22.000 7.000 L 22.000 10.000 C 22.000 10.552 21.552 11.000 21.000 11.000 L 15.000 11.000 C 14.448 11.000 14.000 10.552 14.000 10.000 L 14.000 7.000 C 14.000 6.448 14.448 6.000 15.000 6.000 Z"),
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
        return _globeLock!!
    }

private var _globeLock: ImageVector? = null
