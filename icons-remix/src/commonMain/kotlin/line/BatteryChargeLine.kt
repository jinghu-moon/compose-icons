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
                pathData = parseSvgPathData("M 8.000 19.000 L 3.000 19.000 C 2.448 19.000 2.000 18.552 2.000 18.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 9.625 5.000 L 8.458 7.000 L 4.000 7.000 L 4.000 17.000 L 8.000 17.000 L 8.000 19.000 ZM 12.375 19.000 L 13.542 17.000 L 18.000 17.000 L 18.000 7.000 L 14.000 7.000 L 14.000 5.000 L 19.000 5.000 C 19.552 5.000 20.000 5.448 20.000 6.000 L 20.000 18.000 C 20.000 18.552 19.552 19.000 19.000 19.000 L 12.375 19.000 ZM 21.000 9.000 L 23.000 9.000 L 23.000 15.000 L 21.000 15.000 L 21.000 9.000 ZM 12.000 11.000 L 15.000 11.000 L 10.000 19.000 L 10.000 13.000 L 7.000 13.000 L 12.000 5.000 L 12.000 11.000 Z"),
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
