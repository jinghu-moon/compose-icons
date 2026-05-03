package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BikeFill: ImageVector
    get() {
        if (_bikeFill != null) return _bikeFill!!
        _bikeFill = remixIcon(
            name = "BikeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.500 12.000 L 4.000 12.000 L 4.000 7.000 L 2.000 7.000 L 2.000 5.000 L 8.000 5.000 L 8.000 7.000 L 6.000 7.000 L 6.000 9.795 L 15.813 7.166 L 15.233 5.000 L 12.000 5.000 L 12.000 3.000 L 15.978 3.000 C 16.429 2.990 16.844 3.287 16.966 3.741 L 18.519 9.537 L 16.587 10.054 L 16.331 9.098 L 5.500 12.000 ZM 5.000 21.000 C 2.791 21.000 1.000 19.209 1.000 17.000 C 1.000 14.791 2.791 13.000 5.000 13.000 C 7.209 13.000 9.000 14.791 9.000 17.000 C 9.000 19.209 7.209 21.000 5.000 21.000 ZM 5.000 18.000 C 5.552 18.000 6.000 17.552 6.000 17.000 C 6.000 16.448 5.552 16.000 5.000 16.000 C 4.448 16.000 4.000 16.448 4.000 17.000 C 4.000 17.552 4.448 18.000 5.000 18.000 ZM 18.000 21.000 C 15.239 21.000 13.000 18.761 13.000 16.000 C 13.000 13.239 15.239 11.000 18.000 11.000 C 20.761 11.000 23.000 13.239 23.000 16.000 C 23.000 18.761 20.761 21.000 18.000 21.000 ZM 18.000 17.000 C 18.552 17.000 19.000 16.552 19.000 16.000 C 19.000 15.448 18.552 15.000 18.000 15.000 C 17.448 15.000 17.000 15.448 17.000 16.000 C 17.000 16.552 17.448 17.000 18.000 17.000 Z"),
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
        return _bikeFill!!
    }

private var _bikeFill: ImageVector? = null
