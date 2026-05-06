package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorLightIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M26 104c0-3.314 2.686-6 6-6h80c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-80c-3.314 0-6-2.686-6-6ZM224 98h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM72 138h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 138h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM98 144c0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6ZM56 178h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM112 178h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM168 178h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 178h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM32 70h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-192c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6Z"),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
