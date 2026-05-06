package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeviceLine: ImageVector
    get() {
        if (_deviceLine != null) return _deviceLine!!
        _deviceLine = remixIcon(
            name = "DeviceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 8h2c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-8c-.552 0-1-.448-1-1v-1h-8C3.448 20 3 19.552 3 19v-16C3 2.448 3.448 2 4 2h14c.552 0 1 .448 1 1v5ZM17 8v-4h-12v14h7v-9c0-.552 .448-1 1-1h4ZM14 10v10h6v-10h-6Z"),
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
        return _deviceLine!!
    }

private var _deviceLine: ImageVector? = null
