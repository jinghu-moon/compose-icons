package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorBoldIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 137 48 201c-4.971 4.418-12.582 3.971-17-1-4.418-4.971-3.971-12.582 1-17L93.91 128 32 73C27.029 68.582 26.582 60.971 31 56c4.418-4.971 12.029-5.418 17-1l72 64c2.583 2.278 4.063 5.556 4.063 9 0 3.444-1.48 6.722-4.063 9ZM216 180h-96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _terminal!!
    }

private var _terminal: ImageVector? = null
