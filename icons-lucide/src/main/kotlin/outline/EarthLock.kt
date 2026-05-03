package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.EarthLock: ImageVector
    get() {
        if (_earthLock != null) return _earthLock!!
        _earthLock = lucideOutlineIcon(
            name = "EarthLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.340 L 7.000 5.000 C 7.000 6.657 8.343 8.000 10.000 8.000"),
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
        pathData = parseSvgPathData("M 11.000 21.950 L 11.000 18.000 C 11.000 16.895 10.105 16.000 9.000 16.000 C 7.895 16.000 7.000 15.105 7.000 14.000 L 7.000 13.000 C 7.000 11.895 6.105 11.000 5.000 11.000 L 2.050 11.000"),
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
        pathData = parseSvgPathData("M 21.540 15.000 L 17.000 15.000 C 15.895 15.000 15.000 15.895 15.000 17.000 L 15.000 21.540"),
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
        pathData = parseSvgPathData("M 12.000 2.000 C 6.870 2.000 2.572 5.883 2.052 10.987 C 1.532 16.090 4.959 20.760 9.983 21.794 C 15.008 22.829 20.001 19.894 21.540 15.000"),
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
        return _earthLock!!
    }

private var _earthLock: ImageVector? = null
