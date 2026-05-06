package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorFillIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 32h-96C66.745 32 56 42.745 56 56v168c0 13.255 10.745 24 24 24h96c13.255 0 24-10.745 24-24v-168C200 42.745 189.255 32 176 32ZM151.16 139.58l-16 32c-1.977 3.954-6.786 5.557-10.74 3.58-3.954-1.977-5.557-6.786-3.58-10.74L131.06 144h-19.06c-2.774 .002-5.351-1.433-6.81-3.793-1.459-2.359-1.591-5.306-.35-7.787l16-32c1.977-3.954 6.786-5.557 10.74-3.58 3.954 1.977 5.557 6.786 3.58 10.74L124.94 128h19.06c2.774-.002 5.351 1.433 6.81 3.793 1.459 2.359 1.591 5.306 .35 7.787ZM88 8C88 3.582 91.582 0 96 0h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64C91.582 16 88 12.418 88 8Z"),
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
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
