package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HandHeartFill: ImageVector
    get() {
        if (_handHeartFill != null) return _handHeartFill!!
        _handHeartFill = remixIcon(
            name = "HandHeartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.335 11.502 L 11.505 11.503 C 13.990 11.503 16.005 13.517 16.005 16.003 L 9.004 16.002 L 9.005 17.003 L 17.005 17.002 L 17.005 16.003 C 17.005 14.920 16.687 13.900 16.119 13.002 L 19.005 13.003 C 20.997 13.003 22.717 14.168 23.521 15.854 C 21.156 18.975 17.327 21.003 13.005 21.003 C 10.244 21.003 7.904 20.412 6.004 19.378 L 6.006 10.074 C 7.251 10.252 8.391 10.758 9.335 11.502 ZM 4.005 9.003 C 4.518 9.003 4.940 9.389 4.998 9.886 L 5.005 10.002 L 5.005 19.003 C 5.005 19.555 4.557 20.003 4.005 20.003 L 2.005 20.003 C 1.453 20.003 1.005 19.555 1.005 19.003 L 1.005 10.003 C 1.005 9.450 1.453 9.003 2.005 9.003 L 4.005 9.003 ZM 13.651 3.578 L 14.005 3.932 L 14.358 3.578 C 15.335 2.602 16.918 2.602 17.894 3.578 C 18.870 4.554 18.870 6.137 17.894 7.114 L 14.005 11.003 L 10.116 7.114 C 9.139 6.137 9.139 4.554 10.116 3.578 C 11.092 2.602 12.675 2.602 13.651 3.578 Z"),
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
        return _handHeartFill!!
    }

private var _handHeartFill: ImageVector? = null
