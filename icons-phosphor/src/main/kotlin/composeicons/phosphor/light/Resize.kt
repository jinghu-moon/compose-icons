package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = phosphorLightIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 114h-88c-3.314 0-6 2.686-6 6v88c0 3.314 2.686 6 6 6h88c3.314 0 6-2.686 6-6v-88c0-3.314-2.686-6-6-6ZM130 202h-76v-76h76ZM214 184v16c0 7.732-6.268 14-14 14h-24c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c1.105 0 2-.895 2-2v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM214 112v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM214 56v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-1.105-.895-2-2-2h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c7.732 0 14 6.268 14 14ZM150 48c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM42 80v-24C42 48.268 48.268 42 56 42h16c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-16c-1.105 0-2 .895-2 2v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6Z"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
