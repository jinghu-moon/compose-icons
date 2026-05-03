package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bulb: ImageVector
    get() {
        if (_bulb != null) return _bulb!!
        _bulb = tablerFilledIcon(
            name = "Bulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 11.000 C 4.529 11.001 4.966 11.413 4.997 11.941 C 5.028 12.470 4.642 12.931 4.117 12.993 L 4.000 13.000 L 3.000 13.000 C 2.471 12.999 2.034 12.587 2.003 12.059 C 1.972 11.530 2.358 11.069 2.883 11.007 L 3.000 11.000 L 4.000 11.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.507 2.000 12.934 2.380 12.993 2.883 L 13.000 3.000 L 13.000 4.000 C 12.999 4.529 12.587 4.966 12.059 4.997 C 11.530 5.028 11.069 4.642 11.007 4.117 L 11.000 4.000 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 21.000 11.000 C 21.529 11.001 21.966 11.413 21.997 11.941 C 22.028 12.470 21.642 12.931 21.117 12.993 L 21.000 13.000 L 20.000 13.000 C 19.471 12.999 19.034 12.587 19.003 12.059 C 18.972 11.530 19.358 11.069 19.883 11.007 L 20.000 11.000 L 21.000 11.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 4.893 4.893 C 5.249 4.537 5.815 4.501 6.213 4.810 L 6.307 4.893 L 7.007 5.593 C 7.379 5.966 7.397 6.565 7.049 6.960 C 6.700 7.356 6.104 7.413 5.687 7.090 L 5.593 7.007 L 4.893 6.307 C 4.503 5.917 4.503 5.283 4.893 4.893 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 17.693 4.893 C 18.066 4.521 18.665 4.503 19.060 4.851 C 19.456 5.200 19.513 5.796 19.190 6.213 L 19.107 6.307 L 18.407 7.007 C 18.034 7.379 17.435 7.397 17.040 7.049 C 16.644 6.700 16.587 6.104 16.910 5.687 L 16.993 5.593 L 17.693 4.893 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 18.000 C 14.552 18.000 15.000 18.448 15.000 19.000 C 15.000 20.657 13.657 22.000 12.000 22.000 C 10.343 22.000 9.000 20.657 9.000 19.000 C 9.000 18.493 9.380 18.066 9.883 18.007 L 10.000 18.000 L 14.000 18.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 6.000 C 14.583 6.000 16.875 7.653 17.692 10.103 C 18.509 12.553 17.666 15.250 15.600 16.800 C 15.462 16.904 15.300 16.970 15.129 16.992 L 15.000 17.000 L 9.000 17.000 C 8.784 17.000 8.573 16.930 8.400 16.800 C 6.334 15.250 5.491 12.553 6.308 10.103 C 7.125 7.653 9.417 6.000 12.000 6.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bulb!!
    }

private var _bulb: ImageVector? = null
