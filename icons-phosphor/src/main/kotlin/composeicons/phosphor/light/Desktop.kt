package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Desktop: ImageVector
    get() {
        if (_desktop != null) return _desktop!!
        _desktop = phosphorLightIcon(
            name = "Desktop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 42h-160C35.85 42 26 51.85 26 64v112c0 12.15 9.85 22 22 22h74v20h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-20h74c12.15 0 22-9.85 22-22v-112C230 51.85 220.15 42 208 42ZM48 54h160c5.523 0 10 4.477 10 10v82h-180v-82C38 58.477 42.477 54 48 54ZM208 186h-160c-5.523 0-10-4.477-10-10v-18h180v18c0 5.523-4.477 10-10 10Z"),
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
        return _desktop!!
    }

private var _desktop: ImageVector? = null
