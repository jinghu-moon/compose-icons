package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EarthquakeLine: ImageVector
    get() {
        if (_earthquakeLine != null) return _earthquakeLine!!
        _earthquakeLine = remixIcon(
            name = "EarthquakeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 21.000 C 4.487 21.000 4.064 20.614 4.007 20.117 L 4.000 20.000 L 4.000 11.000 L 1.000 11.000 L 11.327 1.612 C 11.677 1.294 12.196 1.267 12.573 1.532 L 12.673 1.612 L 23.000 11.000 L 20.000 11.000 L 20.000 20.000 C 20.000 20.513 19.614 20.935 19.117 20.993 L 19.000 21.000 L 5.000 21.000 ZM 12.000 3.702 L 6.000 9.156 L 6.000 19.000 L 10.357 18.999 L 11.750 17.500 L 8.000 14.000 L 13.000 11.000 L 10.500 9.000 L 13.500 6.000 L 13.000 9.000 L 15.500 11.000 L 11.500 14.000 L 15.000 17.000 L 13.750 18.999 L 18.000 19.000 L 18.000 9.157 L 12.000 3.702 Z"),
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
        return _earthquakeLine!!
    }

private var _earthquakeLine: ImageVector? = null
