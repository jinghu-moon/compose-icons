package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Devices: ImageVector
    get() {
        if (_devices != null) return _devices!!
        _devices = phosphorLightIcon(
            name = "Devices",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 74h-18v-10C206 51.85 196.15 42 184 42h-144C27.85 42 18 51.85 18 64v96c0 12.15 9.85 22 22 22h114v10c0 12.15 9.85 22 22 22h48c12.15 0 22-9.85 22-22v-96C246 83.85 236.15 74 224 74ZM40 170c-5.523 0-10-4.477-10-10v-96C30 58.477 34.477 54 40 54h144c5.523 0 10 4.477 10 10v10h-18c-12.15 0-22 9.85-22 22v74ZM234 192c0 5.523-4.477 10-10 10h-48c-5.523 0-10-4.477-10-10v-96c0-5.523 4.477-10 10-10h48c5.523 0 10 4.477 10 10ZM134 208c0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM214 112c0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6Z"),
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
        return _devices!!
    }

private var _devices: ImageVector? = null
