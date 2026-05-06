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
                pathData = parseSvgPathData("M19 6h-8c-.552 0-1 .448-1 1v13h-6C3.448 20 3 19.552 3 19v-16C3 2.448 3.448 2 4 2h14c.552 0 1 .448 1 1v3ZM13 8h8c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1v-12c0-.552 .448-1 1-1Z"),
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
