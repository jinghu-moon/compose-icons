package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorThinIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-144C65.373 44 60 49.373 60 56v20h-20C33.373 76 28 81.373 28 88v112c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-20h20c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM68 56c0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4v72.4L203.11 111.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-22.83 22.83L116.49 87.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L68 119ZM188 200c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h20v84c0 6.627 5.373 12 12 12h116ZM216 172h-144c-2.209 0-4-1.791-4-4v-37.66L105.17 93.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l49.66 49.66c1.561 1.558 4.089 1.558 5.65 0l25.66-25.66c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173L220 139.71v28.29c0 2.209-1.791 4-4 4ZM164 84c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
