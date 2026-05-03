package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RedPacketLine: ImageVector
    get() {
        if (_redPacketLine != null) return _redPacketLine!!
        _redPacketLine = remixIcon(
            name = "RedPacketLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.178 9.766 C 16.033 9.355 17.695 8.428 19.005 7.144 L 19.005 4.003 L 5.005 4.003 L 5.005 7.144 C 6.315 8.428 7.976 9.355 9.832 9.766 C 10.262 9.011 11.074 8.503 12.005 8.503 C 12.936 8.503 13.748 9.011 14.178 9.766 ZM 14.386 11.767 C 14.063 12.774 13.119 13.503 12.005 13.503 C 10.891 13.503 9.946 12.774 9.624 11.767 C 7.927 11.425 6.360 10.726 5.005 9.751 L 5.005 20.003 L 19.005 20.003 L 19.005 9.751 C 17.649 10.726 16.083 11.425 14.386 11.767 ZM 4.005 2.003 L 20.005 2.003 C 20.557 2.003 21.005 2.451 21.005 3.003 L 21.005 21.003 C 21.005 21.555 20.557 22.003 20.005 22.003 L 4.005 22.003 C 3.453 22.003 3.005 21.555 3.005 21.003 L 3.005 3.003 C 3.005 2.451 3.453 2.003 4.005 2.003 Z"),
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
        return _redPacketLine!!
    }

private var _redPacketLine: ImageVector? = null
