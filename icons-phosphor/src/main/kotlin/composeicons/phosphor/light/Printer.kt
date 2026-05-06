package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Printer: ImageVector
    get() {
        if (_printer != null) return _printer!!
        _printer = phosphorLightIcon(
            name = "Printer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.67 74h-16.67v-34c0-3.314-2.686-6-6-6h-128c-3.314 0-6 2.686-6 6v34h-16.67C28.47 74 18 83.87 18 96v80c0 3.314 2.686 6 6 6h34v34c0 3.314 2.686 6 6 6h128c3.314 0 6-2.686 6-6v-34h34c3.314 0 6-2.686 6-6v-80C238 83.87 227.53 74 214.67 74ZM70 46h116v28h-116ZM186 210h-116v-52h116ZM226 170h-28v-18c0-3.314-2.686-6-6-6h-128c-3.314 0-6 2.686-6 6v18h-28v-74C30 90.49 35.08 86 41.33 86h173.34C220.92 86 226 90.49 226 96ZM198 116c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _printer!!
    }

private var _printer: ImageVector? = null
