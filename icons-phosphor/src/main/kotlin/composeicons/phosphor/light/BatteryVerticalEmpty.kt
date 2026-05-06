package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BatteryVerticalEmpty: ImageVector
    get() {
        if (_batteryVerticalEmpty != null) return _batteryVerticalEmpty!!
        _batteryVerticalEmpty = phosphorLightIcon(
            name = "BatteryVerticalEmpty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90 8C90 4.686 92.686 2 96 2h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-64C92.686 14 90 11.314 90 8ZM198 56v168c0 12.15-9.85 22-22 22h-96C67.85 246 58 236.15 58 224v-168C58 43.85 67.85 34 80 34h96c12.15 0 22 9.85 22 22ZM186 56c0-5.523-4.477-10-10-10h-96C74.477 46 70 50.477 70 56v168c0 5.523 4.477 10 10 10h96c5.523 0 10-4.477 10-10Z"),
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
        return _batteryVerticalEmpty!!
    }

private var _batteryVerticalEmpty: ImageVector? = null
