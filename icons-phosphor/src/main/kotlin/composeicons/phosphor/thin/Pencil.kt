package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pencil: ImageVector
    get() {
        if (_pencil != null) return _pencil!!
        _pencil = phosphorThinIcon(
            name = "Pencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 76.2 179.8 31.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L39.52 154.83c-2.26 2.242-3.528 5.296-3.52 8.48v44.69c0 6.627 5.373 12 12 12h44.69c3.18-0 6.23-1.263 8.48-3.51L224.48 93.17c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5ZM45.66 160 136 69.65 158.34 92 68 182.34ZM44 208v-38.34l21.17 21.17h0L86.34 212h-38.34c-2.209 0-4-1.791-4-4ZM96 210.34 73.66 188 164 97.65 186.34 120ZM218.83 87.51 192 114.34 141.66 64 168.48 37.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l44.69 44.68c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83Z"),
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
        return _pencil!!
    }

private var _pencil: ImageVector? = null
