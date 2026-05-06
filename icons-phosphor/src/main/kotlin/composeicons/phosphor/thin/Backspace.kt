package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = phosphorThinIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-147.47c-4.213 .013-8.114 2.223-10.29 5.83L12.57 125.94c-.762 1.268-.762 2.852 0 4.12l45.67 76.11c2.176 3.607 6.077 5.817 10.29 5.83h147.47c6.627 0 12-5.373 12-12v-144c0-6.627-5.373-12-12-12ZM220 200c0 2.209-1.791 4-4 4h-147.47c-1.405 0-2.707-.736-3.43-1.94L20.67 128 65.1 53.94c.723-1.204 2.025-1.94 3.43-1.94h147.47c2.209 0 4 1.791 4 4ZM162.83 106.83 141.66 128l21.17 21.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L136 133.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L130.34 128 109.17 106.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L136 122.34l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
