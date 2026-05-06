package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TakeawayLine: ImageVector
    get() {
        if (_takeawayLine != null) return _takeawayLine!!
        _takeawayLine = remixIcon(
            name = "TakeawayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 1c.552 0 1 .448 1 1v.999L22 3v6L19.98 8.999l2.767 7.596c.164 .437 .253 .91 .253 1.404 0 2.209-1.791 4-4 4-1.863 0-3.429-1.274-3.873-2.998h-4.253C10.429 20.726 8.864 22 7 22 5.055 22 3.434 20.612 3.075 18.772 2.436 18.439 2 17.77 2 17v-13C2 3.448 2.448 3 3 3h7c.552 0 1 .448 1 1v8c0 .513 .386 .936 .883 .993L12 13h2c.513 0 .936-.386 .993-.883L15 12v-9h-3v-2h4ZM7 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 16.895 8.105 16 7 16ZM19 15.999c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2ZM17.852 8.999h-.852v3.001c0 1.657-1.343 3-3 3h-2C10.694 15 9.583 14.166 9.171 13.001L4 13v2.354C4.733 14.524 5.805 14 7 14c1.864 0 3.43 1.275 3.874 3h4.252c.444-1.726 2.01-3.001 3.874-3.001 .237 0 .47 .021 .696 .06L17.852 8.999ZM9 8h-5v3h5v-3ZM20 5h-3v2h3v-2ZM9 5h-5v1h5v-1Z"),
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
        return _takeawayLine!!
    }

private var _takeawayLine: ImageVector? = null
