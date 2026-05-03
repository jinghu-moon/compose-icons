package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GiftLine: ImageVector
    get() {
        if (_giftLine != null) return _giftLine!!
        _giftLine = remixIcon(
            name = "GiftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.005 2.003 C 17.214 2.003 19.005 3.794 19.005 6.003 C 19.005 6.732 18.810 7.415 18.469 8.004 L 23.005 8.003 L 23.005 10.003 L 21.005 10.003 L 21.005 20.003 C 21.005 20.555 20.557 21.003 20.005 21.003 L 4.005 21.003 C 3.453 21.003 3.005 20.555 3.005 20.003 L 3.005 10.003 L 1.005 10.003 L 1.005 8.003 L 5.541 8.004 C 5.200 7.415 5.005 6.732 5.005 6.003 C 5.005 3.794 6.796 2.003 9.005 2.003 C 10.200 2.003 11.273 2.527 12.006 3.358 C 12.737 2.527 13.810 2.003 15.005 2.003 ZM 11.005 10.003 L 5.005 10.003 L 5.005 19.003 L 11.005 19.003 L 11.005 10.003 ZM 19.005 10.003 L 13.005 10.003 L 13.005 19.003 L 19.005 19.003 L 19.005 10.003 ZM 9.005 4.003 C 7.900 4.003 7.005 4.898 7.005 6.003 C 7.005 7.057 7.821 7.921 8.856 7.997 L 9.005 8.003 L 11.005 8.003 L 11.005 6.003 C 11.005 5.001 10.269 4.172 9.308 4.026 L 9.154 4.008 L 9.005 4.003 ZM 15.005 4.003 C 13.950 4.003 13.087 4.819 13.010 5.854 L 13.005 6.003 L 13.005 8.003 L 15.005 8.003 C 16.059 8.003 16.923 7.187 16.999 6.152 L 17.005 6.003 C 17.005 4.898 16.110 4.003 15.005 4.003 Z"),
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
        return _giftLine!!
    }

private var _giftLine: ImageVector? = null
