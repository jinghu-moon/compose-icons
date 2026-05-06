package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) return _pencilSlash!!
        _pencilSlash = phosphorThinIcon(
            name = "PencilSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L95.81 98.54 39.51 154.83c-2.247 2.25-3.51 5.3-3.51 8.48v44.69c0 6.627 5.373 12 12 12h44.69c3.182 .008 6.234-1.256 8.48-3.51l53.36-53.36L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM122.52 127.87 68 182.34 45.66 160l55.54-55.54ZM44 208v-38.34L86.34 212h-38.34c-2.209 0-4-1.791-4-4ZM96 210.34 73.66 188l54.2-54.21 21.28 23.41ZM224.49 76.2 179.8 31.52c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L121.16 73.19c-1.493 1.574-1.459 4.051 .076 5.583 1.535 1.533 4.012 1.562 5.584 .067L136 69.66 158.35 92l-10.52 10.52c-1.055 1-1.484 2.494-1.121 3.901 .363 1.407 1.461 2.507 2.868 2.873 1.407 .365 2.901-.061 3.903-1.114L164 97.66 186.35 120l-11.85 11.85c-1.055 1-1.484 2.494-1.121 3.901 .363 1.407 1.461 2.507 2.868 2.873 1.407 .365 2.901-.061 3.903-1.114L224.49 93.17c4.686-4.686 4.686-12.284 0-16.97ZM218.83 87.51 192 114.34 141.66 64 168.49 37.17c1.584-1.511 4.076-1.511 5.66 0l44.68 44.69c1.558 1.561 1.558 4.089 0 5.65Z"),
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
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
