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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.005 5.940 C 19.266 7.911 16.889 9.306 14.199 9.803 C 13.774 9.028 12.951 8.503 12.005 8.503 C 11.059 8.503 10.236 9.028 9.811 9.803 C 7.120 9.306 4.744 7.911 3.005 5.940 L 3.005 3.003 C 3.005 2.451 3.453 2.003 4.005 2.003 L 20.005 2.003 C 20.557 2.003 21.005 2.451 21.005 3.003 L 21.005 5.940 ZM 21.005 8.727 L 21.005 21.003 C 21.005 21.555 20.557 22.003 20.005 22.003 L 4.005 22.003 C 3.453 22.003 3.005 21.555 3.005 21.003 L 3.005 8.727 C 4.865 10.290 7.138 11.377 9.636 11.803 C 9.969 12.791 10.904 13.503 12.005 13.503 C 13.106 13.503 14.040 12.791 14.374 11.803 C 16.872 11.377 19.145 10.290 21.005 8.727 Z"),
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
        return _redPacketFill!!
    }

private var _redPacketFill: ImageVector? = null
