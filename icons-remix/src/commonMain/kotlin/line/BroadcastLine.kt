package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BroadcastLine: ImageVector
    get() {
        if (_broadcastLine != null) return _broadcastLine!!
        _broadcastLine = remixIcon(
            name = "BroadcastLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.929 2.929 L 6.343 4.343 C 4.895 5.791 4.000 7.791 4.000 10.000 C 4.000 12.209 4.895 14.209 6.343 15.657 L 4.929 17.071 C 3.119 15.261 2.000 12.761 2.000 10.000 C 2.000 7.239 3.119 4.739 4.929 2.929 ZM 19.071 2.929 C 20.881 4.739 22.000 7.239 22.000 10.000 C 22.000 12.761 20.881 15.261 19.071 17.071 L 17.657 15.657 C 19.105 14.209 20.000 12.209 20.000 10.000 C 20.000 7.791 19.105 5.791 17.657 4.343 L 19.071 2.929 ZM 7.757 5.757 L 9.172 7.172 C 8.448 7.895 8.000 8.895 8.000 10.000 C 8.000 11.105 8.448 12.105 9.172 12.828 L 7.757 14.243 C 6.672 13.157 6.000 11.657 6.000 10.000 C 6.000 8.343 6.672 6.843 7.757 5.757 ZM 16.243 5.757 C 17.328 6.843 18.000 8.343 18.000 10.000 C 18.000 11.657 17.328 13.157 16.243 14.243 L 14.828 12.828 C 15.552 12.105 16.000 11.105 16.000 10.000 C 16.000 8.895 15.552 7.895 14.828 7.172 L 16.243 5.757 ZM 12.000 12.000 C 10.895 12.000 10.000 11.105 10.000 10.000 C 10.000 8.895 10.895 8.000 12.000 8.000 C 13.105 8.000 14.000 8.895 14.000 10.000 C 14.000 11.105 13.105 12.000 12.000 12.000 ZM 11.000 14.000 L 13.000 14.000 L 13.000 22.000 L 11.000 22.000 L 11.000 14.000 Z"),
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
        return _broadcastLine!!
    }

private var _broadcastLine: ImageVector? = null
