package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorLightIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 74h-24c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6h24c29.823 0 54-24.177 54-54C230 98.177 205.823 74 176 74ZM176 170h-18v-84h18c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42ZM114 176v-42h-60v42c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-96c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v42h60v-42c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM26 48c0-3.314 2.686-6 6-6h192c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6ZM230 208c0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h192c3.314 0 6 2.686 6 6Z"),
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
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
