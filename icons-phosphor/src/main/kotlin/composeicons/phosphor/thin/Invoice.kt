package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorThinIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 124c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h28c6.627 0 12-5.373 12-12C68 97.373 62.627 92 56 92h-16C28.954 92 20 83.046 20 72 20 60.954 28.954 52 40 52h4v-4c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v4h12c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-24C33.373 60 28 65.373 28 72c0 6.627 5.373 12 12 12h16c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h-4v4c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-4ZM228 56v136c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-40c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v40c0 2.209 1.791 4 4 4h124v-40h-84c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h84v-40h-60c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h116v-40h-124c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4ZM172 148h48v-40h-48ZM220 192v-36h-48v40h44c2.209 0 4-1.791 4-4Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
