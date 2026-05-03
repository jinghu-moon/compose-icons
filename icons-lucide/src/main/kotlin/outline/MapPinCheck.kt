package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MapPinCheck: ImageVector
    get() {
        if (_mapPinCheck != null) return _mapPinCheck!!
        _mapPinCheck = lucideOutlineIcon(
            name = "MapPinCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.430 12.935 C 19.787 11.968 20.000 10.980 20.000 10.000 C 20.000 5.582 16.418 2.000 12.000 2.000 C 7.582 2.000 4.000 5.582 4.000 10.000 C 4.000 14.993 9.539 20.193 11.399 21.799 C 11.755 22.067 12.245 22.067 12.601 21.799 C 12.876 21.561 13.147 21.318 13.414 21.071"),
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
                pathData = parseSvgPathData("M 15.000 10.000 C 15.000 11.657 13.657 13.000 12.000 13.000 C 10.343 13.000 9.000 11.657 9.000 10.000 C 9.000 8.343 10.343 7.000 12.000 7.000 C 13.657 7.000 15.000 8.343 15.000 10.000 Z"),
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
                pathData = parseSvgPathData("M 16.000 18.000 L 18.000 20.000 L 22.000 16.000"),
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
        return _mapPinCheck!!
    }

private var _mapPinCheck: ImageVector? = null
