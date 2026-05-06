package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorRegularIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 72c4.418 0 8 3.582 8 8v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8ZM116 172c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12ZM240 128c.012 4.233-1.67 8.294-4.67 11.28l-96.05 96.06c-6.241 6.204-16.319 6.204-22.56 0h0L20.72 139.28c-6.204-6.241-6.204-16.319 0-22.56L116.77 20.66c6.241-6.204 16.319-6.204 22.56 0l96.05 96.06c2.982 2.994 4.645 7.054 4.62 11.28ZM224 128 128 32 32 128l96 96h0Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
