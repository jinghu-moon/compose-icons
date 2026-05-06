package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorLightIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 112c0 3.314-2.686 6-6 6h-80c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h80c3.314 0 6 2.686 6 6ZM176 138h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 64v120c0 12.15-9.85 22-22 22h-176c-12.115 0-21.95-9.795-22-21.91v-96.09c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v96c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10v-120C42 56.268 48.268 50 56 50h160c7.732 0 14 6.268 14 14ZM218 64c0-1.105-.895-2-2-2h-160c-1.105 0-2 .895-2 2v120c.004 3.478-.822 6.906-2.41 10h156.41c5.523 0 10-4.477 10-10Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
