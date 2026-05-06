package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorThinIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36h-38.08C153.561 25.883 141.123 20.026 128 20.026c-13.123 0-25.561 5.858-33.92 15.974h-38.08C49.373 36 44 41.373 44 48v168c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-168c0-6.627-5.373-12-12-12ZM128 28c19.882 0 36 16.118 36 36v4h-72v-4C92 44.118 108.118 28 128 28ZM204 216c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-168c0-2.209 1.791-4 4-4h32.83C85.652 50.187 83.996 57.044 84 64v8c0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4v-8c.004-6.956-1.652-13.813-4.83-20h32.83c2.209 0 4 1.791 4 4Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
