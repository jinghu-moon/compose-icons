package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BatteryChargeLine: ImageVector
    get() {
        if (_batteryChargeLine != null) return _batteryChargeLine!!
        _batteryChargeLine = remixIcon(
            name = "BatteryChargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 19h-5C2.448 19 2 18.552 2 18v-12C2 5.448 2.448 5 3 5h6.625L8.458 7h-4.458v10h4v2ZM12.375 19l1.167-2h4.458v-10h-4v-2h5c.552 0 1 .448 1 1v12c0 .552-.448 1-1 1h-6.625ZM21 9h2v6h-2v-6ZM12 11h3l-5 8v-6h-3L12 5v6Z"),
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
        return _batteryChargeLine!!
    }

private var _batteryChargeLine: ImageVector? = null
