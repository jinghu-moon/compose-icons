package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinMinus: ImageVector
    get() {
        if (_mapPinMinus != null) return _mapPinMinus!!
        _mapPinMinus = lucideOutlineIcon(
            name = "MapPinMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.977 14.000 C 19.600 12.701 20.000 11.343 20.000 10.000 C 20.000 5.582 16.418 2.000 12.000 2.000 C 7.582 2.000 4.000 5.582 4.000 10.000 C 4.000 14.993 9.539 20.193 11.399 21.799 C 11.755 22.067 12.245 22.067 12.601 21.799 C 12.880 21.558 13.155 21.312 13.425 21.061"),
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
        pathData = parseSvgPathData("M 15.000 10.000 C 15.000 11.657 13.657 13.000 12.000 13.000 C 10.343 13.000 9.000 11.657 9.000 10.000 C 9.000 8.343 10.343 7.000 12.000 7.000 C 13.657 7.000 15.000 8.343 15.000 10.000 Z"),
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
        pathData = parseSvgPathData("M 16.000 18.000 L 22.000 18.000"),
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
        return _mapPinMinus!!
    }

private var _mapPinMinus: ImageVector? = null
