package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorThinIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 72v112c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM232 68h-56c-2.209 0-4 1.791-4 4v112c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-52h44c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-44v-48h52c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM96 124h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v20c0 15.464-12.536 28-28 28C48.536 180 36 167.464 36 152v-48C36 88.536 48.536 76 64 76c13 0 25 9 28.13 21 .312 1.432 1.383 2.578 2.79 2.988 1.407 .41 2.925 .017 3.957-1.023 1.032-1.04 1.413-2.561 .993-3.965C95.85 79.36 80.76 68 64 68 44.118 68 28 84.118 28 104v48c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36v-24c0-2.209-1.791-4-4-4Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
