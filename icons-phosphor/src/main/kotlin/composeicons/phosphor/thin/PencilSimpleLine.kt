package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorThinIcon(
            name = "PencilSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 76.2 179.8 31.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L39.51 154.83c-2.247 2.25-3.51 5.3-3.51 8.48v44.69c0 6.627 5.373 12 12 12h168c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-110.34L224.49 93.17c4.686-4.686 4.686-12.284 0-16.97ZM94.34 212h-46.34c-2.209 0-4-1.791-4-4v-44.69c.002-1.058 .422-2.072 1.17-2.82L136 69.66 186.35 120ZM218.83 87.51 192 114.34 141.66 64 168.49 37.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l44.68 44.69c1.558 1.561 1.558 4.089 0 5.65Z"),
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
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
