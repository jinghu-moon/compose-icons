package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HandMetal: ImageVector
    get() {
        if (_handMetal != null) return _handMetal!!
        _handMetal = lucideOutlineIcon(
            name = "HandMetal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 12.500 L 18.000 10.000 C 18.000 8.895 17.105 8.000 16.000 8.000 C 14.895 8.000 14.000 8.895 14.000 10.000 L 14.000 11.400"),
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
        pathData = parseSvgPathData("M 14.000 11.000 L 14.000 9.000 C 14.000 7.895 13.105 7.000 12.000 7.000 C 10.895 7.000 10.000 7.895 10.000 9.000 L 10.000 11.000"),
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
        pathData = parseSvgPathData("M 10.000 10.500 L 10.000 5.000 C 10.000 3.895 9.105 3.000 8.000 3.000 C 6.895 3.000 6.000 3.895 6.000 5.000 L 6.000 14.000"),
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
        pathData = parseSvgPathData("M 7.000 15.000 L 5.240 13.240 C 4.451 12.523 3.238 12.550 2.483 13.303 C 1.727 14.056 1.695 15.269 2.410 16.060 L 6.010 19.660 C 7.500 21.140 9.200 22.000 12.000 22.000 L 14.000 22.000 C 18.418 22.000 22.000 18.418 22.000 14.000 L 22.000 7.000 C 22.000 5.895 21.105 5.000 20.000 5.000 C 18.895 5.000 18.000 5.895 18.000 7.000 L 18.000 12.000"),
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
        return _handMetal!!
    }

private var _handMetal: ImageVector? = null
