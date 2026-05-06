package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) return _batteryCharging!!
        _batteryCharging = phosphorLightIcon(
            name = "BatteryCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 58h-168C19.85 58 10 67.85 10 80v96c0 12.15 9.85 22 22 22h168c12.15 0 22-9.85 22-22v-96C222 67.85 212.15 58 200 58ZM210 176c0 5.523-4.477 10-10 10h-168c-5.523 0-10-4.477-10-10v-96C22 74.477 26.477 70 32 70h168c5.523 0 10 4.477 10 10ZM254 96v64c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM137.1 124.85c1.093 1.766 1.195 3.971 .27 5.83l-16 32c-1.48 2.966-5.084 4.17-8.05 2.69-2.966-1.48-4.17-5.084-2.69-8.05L122.29 134h-22.29c-2.079 .001-4.01-1.075-5.104-2.843-1.094-1.768-1.194-3.977-.266-5.837l16-32c1.48-2.966 5.084-4.17 8.05-2.69 2.966 1.48 4.17 5.084 2.69 8.05L109.71 122h22.29c2.079 .002 4.009 1.081 5.1 2.85Z"),
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
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
