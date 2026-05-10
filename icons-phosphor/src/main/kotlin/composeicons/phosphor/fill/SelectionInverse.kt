package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorFillIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 216c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM40 152c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM72 208h-24v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24c0 8.837 7.163 16 16 16h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 48c0-8.837-7.163-16-16-16h-160c-3.94-.001-7.74 1.464-10.66 4.11-.455 .362-.868 .775-1.23 1.23C33.464 40.26 31.999 44.06 32 48v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-12.69L196.69 208h-12.69c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c3.938-0 7.737-1.461 10.66-4.1 .228-.184 .445-.381 .65-.59 .209-.202 .403-.42 .58-.65 2.646-2.92 4.111-6.72 4.11-10.66Z"),
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
        return _selectionInverse!!
    }

private var _selectionInverse: ImageVector? = null
