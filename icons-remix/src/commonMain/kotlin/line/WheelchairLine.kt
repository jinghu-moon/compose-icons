package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WheelchairLine: ImageVector
    get() {
        if (_wheelchairLine != null) return _wheelchairLine!!
        _wheelchairLine = remixIcon(
            name = "WheelchairLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.998 10.341 L 7.998 12.535 C 6.802 13.227 5.998 14.519 5.998 16.000 C 5.998 18.209 7.789 20.000 9.998 20.000 C 11.479 20.000 12.771 19.196 13.463 18.000 L 15.656 18.000 C 14.833 20.331 12.610 22.000 9.998 22.000 C 6.684 22.000 3.998 19.314 3.998 16.000 C 3.998 13.387 5.668 11.165 7.998 10.341 ZM 11.998 17.000 C 10.341 17.000 8.998 15.657 8.998 14.000 L 8.998 10.000 C 8.998 8.956 9.532 8.036 10.341 7.499 C 9.532 6.964 8.998 6.044 8.998 5.000 C 8.998 3.343 10.341 2.000 11.998 2.000 C 13.655 2.000 14.998 3.343 14.998 5.000 C 14.998 6.044 14.464 6.964 13.655 7.501 C 14.464 8.036 14.998 8.956 14.998 10.000 L 14.998 14.999 L 16.432 15.000 C 17.080 15.000 17.685 15.314 18.058 15.836 L 18.147 15.971 L 20.855 20.486 L 19.141 21.514 L 16.432 17.000 L 14.998 16.999 L 11.998 17.000 ZM 11.998 9.000 C 11.446 9.000 10.998 9.448 10.998 10.000 L 10.998 14.000 C 10.998 14.552 11.446 15.000 11.998 15.000 L 12.997 15.000 L 12.998 10.000 C 12.998 9.448 12.550 9.000 11.998 9.000 ZM 11.998 4.000 C 11.446 4.000 10.998 4.448 10.998 5.000 C 10.998 5.552 11.446 6.000 11.998 6.000 C 12.550 6.000 12.998 5.552 12.998 5.000 C 12.998 4.448 12.550 4.000 11.998 4.000 Z"),
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
        return _wheelchairLine!!
    }

private var _wheelchairLine: ImageVector? = null
