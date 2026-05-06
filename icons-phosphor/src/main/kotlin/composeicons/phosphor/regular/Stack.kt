package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorRegularIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.91 172c2.2 3.818 .899 8.695-2.91 10.91l-96 56c-2.49 1.452-5.57 1.452-8.06 0l-96-56c-3.752-2.255-4.995-7.106-2.79-10.888 2.205-3.781 7.04-5.088 10.85-2.932l92 53.65 92-53.65c3.818-2.2 8.695-.899 10.91 2.91ZM220 121.09l-92 53.65L36 121.09c-3.781-1.882-8.373-.502-10.489 3.154-2.116 3.655-1.026 8.325 2.489 10.666l96 56c2.49 1.452 5.57 1.452 8.06 0l96-56c2.509-1.42 4.061-4.08 4.061-6.963-0-2.883-1.551-5.543-4.061-6.963-2.509-1.42-5.589-1.379-8.06 .106ZM24 80c.006-2.852 1.53-5.484 4-6.91L124 17.09c2.49-1.452 5.57-1.452 8.06 0l96 56c2.458 1.434 3.969 4.065 3.969 6.91 0 2.845-1.511 5.476-3.969 6.91l-96 56c-2.49 1.452-5.57 1.452-8.06 0l-96-56C25.53 85.484 24.006 82.852 24 80ZM47.88 80 128 126.74 208.12 80 128 33.26Z"),
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
        return _stack!!
    }

private var _stack: ImageVector? = null
