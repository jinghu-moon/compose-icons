package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Brain2Fill: ImageVector
    get() {
        if (_brain2Fill != null) return _brain2Fill!!
        _brain2Fill = remixIcon(
            name = "Brain2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.5 2C6.567 2 5 3.567 5 5.5c0 .18 .014 .357 .04 .53C3.324 6.255 2 7.723 2 9.5c0 .979 .402 1.865 1.051 2.5C2.402 12.635 2 13.521 2 14.5c0 1.402 .824 2.61 2.014 3.169C4.005 17.778 4 17.889 4 18c0 2.209 1.791 4 4 4 1.195 0 2.267-.524 3-1.354v-17.595C10.365 2.402 9.479 2 8.5 2ZM13 3.051v17.595c.733 .83 1.805 1.354 3 1.354 2.209 0 4-1.791 4-4 0-.111-.005-.222-.014-.331C21.176 17.11 22 15.902 22 14.5 22 13.521 21.598 12.635 20.949 12 21.598 11.365 22 10.479 22 9.5 22 7.723 20.676 6.255 18.96 6.03 18.986 5.857 19 5.68 19 5.5 19 3.567 17.433 2 15.5 2 14.521 2 13.635 2.402 13 3.051Z"),
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
        return _brain2Fill!!
    }

private var _brain2Fill: ImageVector? = null
