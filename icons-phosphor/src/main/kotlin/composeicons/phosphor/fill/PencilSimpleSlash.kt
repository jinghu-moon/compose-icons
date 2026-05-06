package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilSimpleSlash: ImageVector
    get() {
        if (_pencilSimpleSlash != null) return _pencilSimpleSlash!!
        _pencilSimpleSlash = phosphorFillIcon(
            name = "PencilSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.32 73.37 182.63 28.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688L115.64 73.05c-1.513 1.508-1.574 3.938-.14 5.52l58.73 64.6c.737 .809 1.773 1.281 2.867 1.305 1.094 .025 2.15-.4 2.923-1.175L227.32 96c3.001-3.001 4.688-7.071 4.688-11.315 0-4.244-1.686-8.314-4.688-11.315ZM192 108.69 147.32 64l24-24L216 84.69ZM213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L154.4 168.92 104 219.31c-2.99 3.014-7.064 4.704-11.31 4.69h-44.69c-8.837 0-16-7.163-16-16v-44.69c-.013-4.244 1.672-8.316 4.68-11.31L90.28 98.4l-48-52.82C39.487 42.593 39.329 38.002 41.91 34.83c1.488-1.749 3.656-2.774 5.953-2.814 2.296-.04 4.499 .908 6.047 2.604Z"),
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
        return _pencilSimpleSlash!!
    }

private var _pencilSimpleSlash: ImageVector? = null
