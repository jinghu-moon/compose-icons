package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorBoldIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v160c0 4.159 2.155 8.022 5.693 10.208 3.539 2.186 7.957 2.384 11.677 .522L64 213.42l26.63 13.31c3.38 1.691 7.36 1.691 10.74 0L128 213.42l26.63 13.31c3.38 1.691 7.36 1.691 10.74 0L192 213.42l26.63 13.31c3.72 1.861 8.138 1.664 11.677-.522 3.539-2.186 5.693-6.048 5.693-10.208v-160C236 44.954 227.046 36 216 36ZM212 196.58l-14.63-7.31c-3.38-1.691-7.36-1.691-10.74 0L160 202.58 133.37 189.27c-3.38-1.691-7.36-1.691-10.74 0L96 202.58 69.37 189.27c-3.38-1.691-7.36-1.691-10.74 0L44 196.58v-136.58h168ZM136 108c0-6.627 5.373-12 12-12h36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-36c-6.627 0-12-5.373-12-12ZM136 148c0-6.627 5.373-12 12-12h36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-36c-6.627 0-12-5.373-12-12ZM72 172h40c6.627 0 12-5.373 12-12v-64c0-6.627-5.373-12-12-12h-40C65.373 84 60 89.373 60 96v64c0 6.627 5.373 12 12 12ZM84 108h16v40h-16Z"),
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
