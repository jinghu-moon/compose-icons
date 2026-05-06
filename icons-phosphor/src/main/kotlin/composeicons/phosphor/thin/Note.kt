package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorThinIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 96c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4ZM96 132h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM128 156h-32c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM220 48v108.69c.008 3.184-1.26 6.238-3.52 8.48l-51.31 51.32c-2.246 2.254-5.298 3.518-8.48 3.51h-108.69c-6.627 0-12-5.373-12-12v-160C36 41.373 41.373 36 48 36h160c6.627 0 12 5.373 12 12ZM48 212h108v-52c0-2.209 1.791-4 4-4h52v-108c0-2.209-1.791-4-4-4h-160c-2.209 0-4 1.791-4 4v160c0 2.209 1.791 4 4 4ZM206.35 164h-42.35v42.35Z"),
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
        return _note!!
    }

private var _note: ImageVector? = null
