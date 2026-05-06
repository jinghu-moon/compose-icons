package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RedPacketFill: ImageVector
    get() {
        if (_redPacketFill != null) return _redPacketFill!!
        _redPacketFill = remixIcon(
            name = "RedPacketFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.005 5.94C19.266 7.911 16.889 9.306 14.199 9.803 13.774 9.028 12.951 8.503 12.005 8.503c-.946 0-1.769 .525-2.194 1.3C7.12 9.306 4.744 7.911 3.005 5.94v-2.937c0-.552 .448-1 1-1h16c.552 0 1 .448 1 1v2.937ZM21.005 8.727v12.276c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-12.276c1.86 1.563 4.133 2.65 6.631 3.076 .334 .988 1.268 1.7 2.369 1.7 1.101 0 2.035-.711 2.369-1.7 2.498-.426 4.771-1.514 6.631-3.076Z"),
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
        return _redPacketFill!!
    }

private var _redPacketFill: ImageVector? = null
