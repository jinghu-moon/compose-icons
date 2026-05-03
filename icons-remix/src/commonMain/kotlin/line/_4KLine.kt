package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line._4KLine: ImageVector
    get() {
        if (__4KLine != null) return __4KLine!!
        __4KLine = remixIcon(
            name = "_4KLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 ZM 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 ZM 11.500 13.500 L 10.500 13.500 L 10.500 15.000 L 9.000 15.000 L 9.000 13.500 L 6.000 13.500 L 6.000 9.000 L 7.500 9.000 L 7.500 12.000 L 9.000 12.000 L 9.000 9.000 L 10.500 9.000 L 10.500 12.000 L 11.500 12.000 L 11.500 13.500 ZM 18.000 15.000 L 16.250 15.000 L 14.500 12.750 L 14.500 15.000 L 13.000 15.000 L 13.000 9.000 L 14.500 9.000 L 14.500 11.250 L 16.250 9.000 L 18.000 9.000 L 15.750 12.000 L 18.000 15.000 Z"),
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
        return __4KLine!!
    }

private var __4KLine: ImageVector? = null
