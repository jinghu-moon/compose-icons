package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BatteryShareFill: ImageVector
    get() {
        if (_batteryShareFill != null) return _batteryShareFill!!
        _batteryShareFill = remixIcon(
            name = "BatteryShareFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c.552 0 1 .448 1 1v1h3c.552 0 1 .448 1 1v6.2L15 8v3h-1c-2.142 0-4 1.79-4 4v3h2v-3c0-1.05 .95-2 2-2h1v3l4-3.2v8.2c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21v-16C5 4.448 5.448 4 6 4h3v-1C9 2.448 9.448 2 10 2h4Z"),
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
        return _batteryShareFill!!
    }

private var _batteryShareFill: ImageVector? = null
