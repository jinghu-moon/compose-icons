package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Monitor: ImageVector
    get() {
        if (_monitor != null) return _monitor!!
        _monitor = phosphorLightIcon(
            name = "Monitor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 42h-160C35.85 42 26 51.85 26 64v112c0 12.15 9.85 22 22 22h160c12.15 0 22-9.85 22-22v-112C230 51.85 220.15 42 208 42ZM218 176c0 5.523-4.477 10-10 10h-160c-5.523 0-10-4.477-10-10v-112C38 58.477 42.477 54 48 54h160c5.523 0 10 4.477 10 10ZM166 224c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6Z"),
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
        return _monitor!!
    }

private var _monitor: ImageVector? = null
