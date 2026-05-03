package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TruckFill: ImageVector
    get() {
        if (_truckFill != null) return _truckFill!!
        _truckFill = remixIcon(
            name = "TruckFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 8.000 L 20.000 8.000 L 23.000 12.056 L 23.000 18.000 L 20.965 18.000 C 20.722 19.696 19.263 21.000 17.500 21.000 C 15.737 21.000 14.278 19.696 14.035 18.000 L 8.965 18.000 C 8.722 19.696 7.263 21.000 5.500 21.000 C 3.737 21.000 2.278 19.696 2.035 18.000 L 1.000 18.000 L 1.000 6.000 C 1.000 5.448 1.448 5.000 2.000 5.000 L 16.000 5.000 C 16.552 5.000 17.000 5.448 17.000 6.000 L 17.000 8.000 ZM 17.000 10.000 L 17.000 13.000 L 21.000 13.000 L 21.000 12.715 L 18.992 10.000 L 17.000 10.000 Z"),
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
        return _truckFill!!
    }

private var _truckFill: ImageVector? = null
