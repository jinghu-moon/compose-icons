package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorThinIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-176C33.373 44 28 49.373 28 56v160c-.001 1.387 .717 2.676 1.896 3.405 1.18 .729 2.653 .796 3.894 .175L64 204.47l30.21 15.11c1.127 .564 2.453 .564 3.58 0L128 204.47l30.21 15.11c1.127 .564 2.453 .564 3.58 0L192 204.47l30.21 15.11c.557 .275 1.169 .419 1.79 .42 2.209 0 4-1.791 4-4v-160c0-6.627-5.373-12-12-12ZM220 209.53 193.79 196.42c-1.127-.564-2.453-.564-3.58 0L160 211.53 129.79 196.42c-1.127-.564-2.453-.564-3.58 0L96 211.53 65.79 196.42c-1.127-.564-2.453-.564-3.58 0L36 209.53v-153.53c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM196 112c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM196 144c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4ZM112 92h-48c-2.209 0-4 1.791-4 4v64c0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4v-64c0-2.209-1.791-4-4-4ZM108 156h-40v-56h40Z"),
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
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
