package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorLightIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M150 128c0 3.314-2.686 6-6 6h-22v22c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-22h-22c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h22v-22c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v22h22c3.314 0 6 2.686 6 6ZM222 80v96c0 12.15-9.85 22-22 22h-168C19.85 198 10 188.15 10 176v-96C10 67.85 19.85 58 32 58h168c12.15 0 22 9.85 22 22ZM210 80c0-5.523-4.477-10-10-10h-168C26.477 70 22 74.477 22 80v96c0 5.523 4.477 10 10 10h168c5.523 0 10-4.477 10-10ZM248 90c-3.314 0-6 2.686-6 6v64c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-64c0-3.314-2.686-6-6-6Z"),
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
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
