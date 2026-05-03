package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPinRangeLine: ImageVector
    get() {
        if (_mapPinRangeLine != null) return _mapPinRangeLine!!
        _mapPinRangeLine = remixIcon(
            name = "MapPinRangeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 17.938 C 7.054 17.446 4.000 14.080 4.000 10.000 C 4.000 5.582 7.582 2.000 12.000 2.000 C 16.418 2.000 20.000 5.582 20.000 10.000 C 20.000 14.080 16.946 17.446 13.000 17.938 L 13.000 20.012 C 16.946 20.104 20.000 20.735 20.000 21.500 C 20.000 22.328 16.418 23.000 12.000 23.000 C 7.582 23.000 4.000 22.328 4.000 21.500 C 4.000 20.735 7.054 20.104 11.000 20.012 L 11.000 17.938 ZM 12.000 16.000 C 15.314 16.000 18.000 13.314 18.000 10.000 C 18.000 6.686 15.314 4.000 12.000 4.000 C 8.686 4.000 6.000 6.686 6.000 10.000 C 6.000 13.314 8.686 16.000 12.000 16.000 ZM 12.000 12.000 C 10.895 12.000 10.000 11.105 10.000 10.000 C 10.000 8.895 10.895 8.000 12.000 8.000 C 13.105 8.000 14.000 8.895 14.000 10.000 C 14.000 11.105 13.105 12.000 12.000 12.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _mapPinRangeLine!!
    }

private var _mapPinRangeLine: ImageVector? = null
