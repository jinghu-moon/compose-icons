package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Terminal: ImageVector
    get() {
        if (_terminal != null) return _terminal!!
        _terminal = phosphorRegularIcon(
            name = "Terminal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M117.31 134 45.31 198c-3.314 2.935-8.38 2.629-11.315-.685-2.935-3.314-2.629-8.38 .685-11.315L100 128 34.69 70C31.376 67.065 31.07 61.999 34.005 58.685 36.94 55.371 42.006 55.065 45.32 58l72 64c1.722 1.519 2.708 3.704 2.708 6 0 2.296-.986 4.481-2.708 6ZM216 184h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h96c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
