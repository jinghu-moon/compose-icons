package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorLightIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.18 173c1.666 2.861 .699 6.531-2.16 8.2l-96 56c-1.856 1.072-4.144 1.072-6 0l-96-56c-2.616-1.764-3.419-5.252-1.838-7.982 1.581-2.73 5.006-3.769 7.838-2.378l93 54.23 93-54.23c2.852-1.638 6.492-.675 8.16 2.16ZM221 122.82l-93 54.23L35 122.82c-2.832-1.391-6.257-.352-7.838 2.378-1.581 2.73-.778 6.218 1.838 7.982l96 56c1.856 1.072 4.144 1.072 6 0l96-56c2.616-1.764 3.419-5.252 1.838-7.982-1.581-2.73-5.006-3.769-7.838-2.378ZM26 80c.006-2.138 1.149-4.111 3-5.18l96-56c1.856-1.072 4.144-1.072 6 0l96 56c1.841 1.076 2.972 3.048 2.972 5.18 0 2.132-1.131 4.104-2.972 5.18l-96 56c-1.856 1.072-4.144 1.072-6 0L29 85.18C27.149 84.111 26.006 82.138 26 80ZM43.91 80 128 129.05 212.09 80 128 31Z"),
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
