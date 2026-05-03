package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = lucideOutlineIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 11.000 L 18.000 11.000 C 19.657 11.000 21.000 12.343 21.000 14.000 C 21.000 15.657 19.657 17.000 18.000 17.000 L 17.000 17.000"),
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
                pathData = parseSvgPathData("M 9.000 12.000 L 9.000 18.000"),
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
                pathData = parseSvgPathData("M 13.000 12.000 L 13.000 18.000"),
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
                pathData = parseSvgPathData("M 14.000 7.500 C 13.000 7.500 12.560 8.000 11.000 8.000 C 9.440 8.000 9.000 7.500 8.000 7.500 C 7.000 7.500 6.280 8.000 5.500 8.000 C 4.119 8.000 3.000 6.881 3.000 5.500 C 3.000 4.119 4.119 3.000 5.500 3.000 C 6.280 3.000 7.070 3.500 8.000 3.500 C 8.930 3.500 9.440 2.000 11.000 2.000 C 12.560 2.000 13.000 3.500 14.000 3.500 C 15.000 3.500 15.720 3.000 16.500 3.000 C 17.881 3.000 19.000 4.119 19.000 5.500 C 19.000 6.881 17.881 8.000 16.500 8.000 C 15.720 8.000 15.000 7.500 14.000 7.500 Z"),
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
                pathData = parseSvgPathData("M 5.000 8.000 L 5.000 20.000 C 5.000 21.105 5.895 22.000 7.000 22.000 L 15.000 22.000 C 16.105 22.000 17.000 21.105 17.000 20.000 L 17.000 8.000"),
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
        return _beer!!
    }

private var _beer: ImageVector? = null
