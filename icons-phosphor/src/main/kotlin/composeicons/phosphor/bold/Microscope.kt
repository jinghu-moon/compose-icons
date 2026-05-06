package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorBoldIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 204h-12c18.027-26.416 21.06-60.292 8.012-89.49C206.965 85.312 179.705 64.973 148 60.78v-28.78C148 20.954 139.046 12 128 12h-48C68.954 12 60 20.954 60 32v96c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-42.92c32.383 5.847 55.953 34.013 56 66.92 .085 20.069-8.779 39.132-24.18 52h-147.82c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM124 124h-40v-88h40ZM72 188c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
