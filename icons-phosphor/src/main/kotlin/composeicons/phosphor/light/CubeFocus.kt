package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CubeFocus: ImageVector
    get() {
        if (_cubeFocus != null) return _cubeFocus!!
        _cubeFocus = phosphorLightIcon(
            name = "CubeFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 48v40c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-34h-34c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h40c3.314 0 6 2.686 6 6ZM72 202h-34v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM224 162c-3.314 0-6 2.686-6 6v34h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM32 94c3.314 0 6-2.686 6-6v-34h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-40c-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6ZM187 165.21l-56 32c-1.856 1.072-4.144 1.072-6 0l-56-32C67.139 164.136 65.995 162.149 66 160v-64c-.005-2.149 1.139-4.136 3-5.21l56-32c1.856-1.072 4.144-1.072 6 0l56 32c1.861 1.074 3.005 3.061 3 5.21v64c.005 2.149-1.139 4.136-3 5.21ZM84.09 96 128 121.09 171.91 96 128 70.91ZM78 156.52l44 25.14v-50.18L78 106.34ZM178 156.52v-50.18l-44 25.14v50.18Z"),
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
        return _cubeFocus!!
    }

private var _cubeFocus: ImageVector? = null
