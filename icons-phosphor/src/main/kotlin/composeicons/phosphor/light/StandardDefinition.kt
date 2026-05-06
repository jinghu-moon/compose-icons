package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorLightIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 74c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6h24c29.823 0 54-24.177 54-54C222 98.177 197.823 74 168 74ZM210 128c0 23.196-18.804 42-42 42h-18v-84h18c23.196 0 42 18.804 42 42ZM26 48c0-3.314 2.686-6 6-6h192c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6ZM230 208c0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h192c3.314 0 6 2.686 6 6ZM106 152C106 140.79 95.3 136.9 77.67 131.82 61.78 127.24 43.78 122.05 43.78 104 43.78 86.9 59.35 74 80 74c15 0 27.74 6.88 33.34 18 1.497 2.957 .312 6.568-2.645 8.065-2.957 1.497-6.568 .312-8.065-2.645C99.08 90.36 90.41 86 80 86 66.19 86 55.78 93.74 55.78 104c0 8.41 9.52 11.76 25.21 16.29C97.48 125 118 131 118 152c0 16.54-17 30-38 30C59 182 42 168.54 42 152c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 9.76 11.91 18 26 18 14.09 0 26-8.24 26-18Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
