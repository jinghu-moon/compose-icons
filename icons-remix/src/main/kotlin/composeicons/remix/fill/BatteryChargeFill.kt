package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BatteryChargeFill: ImageVector
    get() {
        if (_batteryChargeFill != null) return _batteryChargeFill!!
        _batteryChargeFill = remixIcon(
            name = "BatteryChargeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 11v-6L7 13h3v6l5-8h-3ZM3 5h16c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-16C2.448 19 2 18.552 2 18v-12C2 5.448 2.448 5 3 5ZM21 9h2v6h-2v-6Z"),
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
        return _batteryChargeFill!!
    }

private var _batteryChargeFill: ImageVector? = null
