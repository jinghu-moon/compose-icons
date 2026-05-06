package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorThinIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 156h-4v-20C219.896 96.008 194.061 60.627 156 48.35v-8.35c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v8.35C61.939 60.627 36.104 96.008 36 136v20h-4c-6.627 0-12 5.373-12 12v24c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-24c0-6.627-5.373-12-12-12ZM212 136v20h-56v-99.2c33.501 11.949 55.903 43.632 56 79.2ZM112 36h32c2.209 0 4 1.791 4 4v116h-40v-116c0-2.209 1.791-4 4-4ZM44 136c.097-35.568 22.499-67.251 56-79.2v99.2h-56ZM228 192c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
