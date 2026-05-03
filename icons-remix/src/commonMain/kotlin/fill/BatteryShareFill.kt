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
                pathData = parseSvgPathData("M 14.000 2.000 C 14.552 2.000 15.000 2.448 15.000 3.000 L 15.000 4.000 L 18.000 4.000 C 18.552 4.000 19.000 4.448 19.000 5.000 L 19.000 11.200 L 15.000 8.000 L 15.000 11.000 L 14.000 11.000 C 11.858 11.000 10.000 12.790 10.000 15.000 L 10.000 18.000 L 12.000 18.000 L 12.000 15.000 C 12.000 13.950 12.950 13.000 14.000 13.000 L 15.000 13.000 L 15.000 16.000 L 19.000 12.800 L 19.000 21.000 C 19.000 21.552 18.552 22.000 18.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 5.000 C 5.000 4.448 5.448 4.000 6.000 4.000 L 9.000 4.000 L 9.000 3.000 C 9.000 2.448 9.448 2.000 10.000 2.000 L 14.000 2.000 Z"),
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
