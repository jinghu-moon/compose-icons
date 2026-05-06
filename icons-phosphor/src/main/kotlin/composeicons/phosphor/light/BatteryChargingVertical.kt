package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) return _batteryChargingVertical!!
        _batteryChargingVertical = phosphorLightIcon(
            name = "BatteryChargingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M149.1 132.85c1.093 1.766 1.195 3.971 .27 5.83l-16 32c-1.48 2.966-5.084 4.17-8.05 2.69-2.966-1.48-4.17-5.084-2.69-8.05L134.29 142h-22.29c-2.079 .001-4.01-1.075-5.104-2.843-1.094-1.768-1.194-3.977-.266-5.837l16-32c1.48-2.966 5.084-4.17 8.05-2.69 2.966 1.48 4.17 5.084 2.69 8.05L121.71 130h22.29c2.079 .002 4.009 1.081 5.1 2.85ZM96 14h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64C92.686 2 90 4.686 90 8c0 3.314 2.686 6 6 6ZM198 56v168c0 12.15-9.85 22-22 22h-96C67.85 246 58 236.15 58 224v-168C58 43.85 67.85 34 80 34h96c12.15 0 22 9.85 22 22ZM186 56c0-5.523-4.477-10-10-10h-96C74.477 46 70 50.477 70 56v168c0 5.523 4.477 10 10 10h96c5.523 0 10-4.477 10-10Z"),
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
