package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorRegularIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150.81 131.79c1.46 2.36 1.592 5.308 .35 7.79l-16 32c-1.977 3.954-6.786 5.557-10.74 3.58-3.954-1.977-5.557-6.786-3.58-10.74L131.06 144h-19.06c-2.774 .002-5.351-1.433-6.81-3.793-1.459-2.359-1.591-5.306-.35-7.787l16-32c1.977-3.954 6.786-5.557 10.74-3.58 3.954 1.977 5.557 6.786 3.58 10.74L124.94 128h19.06c2.773-.003 5.35 1.432 6.81 3.79ZM96 16h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-64C91.582 0 88 3.582 88 8c0 4.418 3.582 8 8 8ZM200 56v168c0 13.255-10.745 24-24 24h-96C66.745 248 56 237.255 56 224v-168C56 42.745 66.745 32 80 32h96c13.255 0 24 10.745 24 24ZM184 56c0-4.418-3.582-8-8-8h-96c-4.418 0-8 3.582-8 8v168c0 4.418 3.582 8 8 8h96c4.418 0 8-3.582 8-8Z"),
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
