package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorLightIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 136v-40c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM128 162c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM96 14h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-64C92.686 2 90 4.686 90 8c0 3.314 2.686 6 6 6ZM198 56v168c0 12.15-9.85 22-22 22h-96C67.85 246 58 236.15 58 224v-168C58 43.85 67.85 34 80 34h96c12.15 0 22 9.85 22 22ZM186 56c0-5.523-4.477-10-10-10h-96C74.477 46 70 50.477 70 56v168c0 5.523 4.477 10 10 10h96c5.523 0 10-4.477 10-10Z"),
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
        return _batteryWarningVertical!!
    }

private var _batteryWarningVertical: ImageVector? = null
