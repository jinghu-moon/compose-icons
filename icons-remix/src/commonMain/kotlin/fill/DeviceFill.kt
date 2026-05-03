package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeviceFill: ImageVector
    get() {
        if (_deviceFill != null) return _deviceFill!!
        _deviceFill = remixIcon(
            name = "DeviceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 6.000 L 11.000 6.000 C 10.448 6.000 10.000 6.448 10.000 7.000 L 10.000 20.000 L 4.000 20.000 C 3.448 20.000 3.000 19.552 3.000 19.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 18.000 2.000 C 18.552 2.000 19.000 2.448 19.000 3.000 L 19.000 6.000 ZM 13.000 8.000 L 21.000 8.000 C 21.552 8.000 22.000 8.448 22.000 9.000 L 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 13.000 22.000 C 12.448 22.000 12.000 21.552 12.000 21.000 L 12.000 9.000 C 12.000 8.448 12.448 8.000 13.000 8.000 Z"),
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
        return _deviceFill!!
    }

private var _deviceFill: ImageVector? = null
