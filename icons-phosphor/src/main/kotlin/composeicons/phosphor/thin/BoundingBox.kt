package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorThinIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 92c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v12h-72v-12C92 41.373 86.627 36 80 36h-32C41.373 36 36 41.373 36 48v32c0 6.627 5.373 12 12 12h12v72h-12c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-12h72v12c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-12v-72ZM172 48c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM44 80v-32c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM84 208c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM212 176v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM188 164h-12c-6.627 0-12 5.373-12 12v12h-72v-12c0-6.627-5.373-12-12-12h-12v-72h12c6.627 0 12-5.373 12-12v-12h72v12c0 6.627 5.373 12 12 12h12Z"),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
