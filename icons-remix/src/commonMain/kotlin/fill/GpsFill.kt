package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GpsFill: ImageVector
    get() {
        if (_gpsFill != null) return _gpsFill!!
        _gpsFill = remixIcon(
            name = "GpsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 16.000 L 15.000 22.000 L 9.000 22.000 L 12.000 16.000 ZM 9.373 16.255 C 7.949 15.374 7.000 13.798 7.000 12.000 C 7.000 9.239 9.239 7.000 12.000 7.000 C 14.761 7.000 17.000 9.239 17.000 12.000 C 17.000 13.798 16.051 15.374 14.627 16.255 L 13.272 13.544 C 13.717 13.177 14.000 12.622 14.000 12.000 C 14.000 10.895 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000 C 10.000 12.622 10.283 13.177 10.728 13.544 L 9.373 16.255 ZM 7.132 20.737 C 4.070 19.027 2.000 15.755 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 15.755 19.930 19.027 16.868 20.737 L 15.525 18.049 C 17.603 16.835 19.000 14.581 19.000 12.000 C 19.000 8.134 15.866 5.000 12.000 5.000 C 8.134 5.000 5.000 8.134 5.000 12.000 C 5.000 14.581 6.397 16.835 8.475 18.049 L 7.132 20.737 Z"),
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
        return _gpsFill!!
    }

private var _gpsFill: ImageVector? = null
