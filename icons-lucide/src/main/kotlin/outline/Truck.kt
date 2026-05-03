package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = lucideOutlineIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 18.000 L 14.000 6.000 C 14.000 4.895 13.105 4.000 12.000 4.000 L 4.000 4.000 C 2.895 4.000 2.000 4.895 2.000 6.000 L 2.000 17.000 C 2.000 17.552 2.448 18.000 3.000 18.000 L 5.000 18.000"),
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
        pathData = parseSvgPathData("M 15.000 18.000 L 9.000 18.000"),
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
        pathData = parseSvgPathData("M 19.000 18.000 L 21.000 18.000 C 21.552 18.000 22.000 17.552 22.000 17.000 L 22.000 13.350 C 22.000 13.123 21.922 12.903 21.780 12.726 L 18.300 8.376 C 18.111 8.139 17.824 8.000 17.520 8.000 L 14.000 8.000"),
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
        pathData = parseSvgPathData("M 19.000 18.000 C 19.000 19.105 18.105 20.000 17.000 20.000 C 15.895 20.000 15.000 19.105 15.000 18.000 C 15.000 16.895 15.895 16.000 17.000 16.000 C 18.105 16.000 19.000 16.895 19.000 18.000 Z"),
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
        pathData = parseSvgPathData("M 9.000 18.000 C 9.000 19.105 8.105 20.000 7.000 20.000 C 5.895 20.000 5.000 19.105 5.000 18.000 C 5.000 16.895 5.895 16.000 7.000 16.000 C 8.105 16.000 9.000 16.895 9.000 18.000 Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
