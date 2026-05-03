package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = lucideOutlineIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 17.000 L 21.000 17.000 C 21.600 17.000 22.000 16.600 22.000 16.000 L 22.000 13.000 C 22.000 12.100 21.300 11.300 20.500 11.100 C 18.700 10.600 16.000 10.000 16.000 10.000 C 16.000 10.000 14.700 8.600 13.800 7.700 C 13.300 7.300 12.700 7.000 12.000 7.000 L 5.000 7.000 C 4.400 7.000 3.900 7.400 3.600 7.900 L 2.200 10.800 C 2.068 11.186 2.000 11.592 2.000 12.000 L 2.000 16.000 C 2.000 16.600 2.400 17.000 3.000 17.000 L 5.000 17.000"),
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
                pathData = parseSvgPathData("M 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 C 5.895 19.000 5.000 18.105 5.000 17.000 C 5.000 15.895 5.895 15.000 7.000 15.000 C 8.105 15.000 9.000 15.895 9.000 17.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 17.000 L 15.000 17.000"),
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
                pathData = parseSvgPathData("M 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 C 15.895 19.000 15.000 18.105 15.000 17.000 C 15.000 15.895 15.895 15.000 17.000 15.000 C 18.105 15.000 19.000 15.895 19.000 17.000 Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null
