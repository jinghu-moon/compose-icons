package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorThinIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 124h-20v-52c0-6.627-5.373-12-12-12h-40c-6.627 0-12 5.373-12 12v52h-24v-76c0-6.627-5.373-12-12-12h-40C57.373 36 52 41.373 52 48v76h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v76c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-76h24v52c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-52h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM108 208c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM196 184c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4Z"),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
