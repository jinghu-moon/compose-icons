package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionInverse: ImageVector
    get() {
        if (_selectionInverse != null) return _selectionInverse!!
        _selectionInverse = phosphorDuotoneIcon(
            name = "SelectionInverse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v160c.002 2.122-.84 4.158-2.34 5.66L42.34 42.34C43.842 40.84 45.878 39.998 48 40h160c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M152 216c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM40 152c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8ZM72 208h-24v-24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24c0 8.837 7.163 16 16 16h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM224 48v160c0 8.837-7.163 16-16 16h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h12.69L48 59.31v12.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM208 48h-148.69L208 196.69Z"),
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
