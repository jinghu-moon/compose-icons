package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorThinIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 136v64c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12v-64c0-6.627 5.373-12 12-12h48c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-48c-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4v-64c0-2.209-1.791-4-4-4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c6.627 0 12 5.373 12 12ZM82.83 74.83 124 33.66v94.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-94.34l41.17 41.17c1.563 1.563 4.097 1.563 5.66 0 1.563-1.563 1.563-4.097 0-5.66l-48-48c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173l-48 48c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0ZM196 168c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8Z"),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
