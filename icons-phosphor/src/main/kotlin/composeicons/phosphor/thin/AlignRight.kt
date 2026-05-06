package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignRight: ImageVector
    get() {
        if (_alignRight != null) return _alignRight!!
        _alignRight = phosphorThinIcon(
            name = "AlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 40v176c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM188 64v40c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12v-40C68 57.373 73.373 52 80 52h96c6.627 0 12 5.373 12 12ZM180 64c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h96c2.209 0 4-1.791 4-4ZM188 152v40c0 6.627-5.373 12-12 12h-136c-6.627 0-12-5.373-12-12v-40c0-6.627 5.373-12 12-12h136c6.627 0 12 5.373 12 12ZM180 152c0-2.209-1.791-4-4-4h-136c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h136c2.209 0 4-1.791 4-4Z"),
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
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
