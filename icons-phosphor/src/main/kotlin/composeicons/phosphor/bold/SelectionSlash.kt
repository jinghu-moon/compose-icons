package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorBoldIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 40c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12ZM144 204h-32c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM208 28h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-24C228 36.954 219.046 28 208 28ZM216 100c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM40 156c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12ZM72 204h-20v-20c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v24c0 11.046 8.954 20 20 20h24c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L199.12 224.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844Z"),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
