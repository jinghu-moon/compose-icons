package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorThinIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.91 214.51l-22-176C197.158 32.504 192.052 27.999 186 28h-116C63.948 27.999 58.842 32.504 58.09 38.51l-22 176c-.427 3.416 .633 6.851 2.911 9.432 2.279 2.581 5.556 4.059 8.999 4.058h40.69c5.497 .003 10.293-3.73 11.64-9.06L128 112l27.67 106.94c1.347 5.33 6.143 9.063 11.64 9.06h40.69c3.443 .001 6.72-1.477 8.999-4.058 2.279-2.581 3.339-6.016 2.911-9.432ZM197.52 99.9C180.176 98.7 166.168 85.277 164.23 68h29.3ZM70 36h116c2.028-.016 3.747 1.488 4 3.5L192.53 60h-129.06L66 39.5c.253-2.012 1.972-3.516 4-3.5ZM62.47 68h29.3C89.832 85.277 75.824 98.7 58.48 99.9ZM92.57 217c-.457 1.769-2.053 3.003-3.88 3h-40.69c-1.153 .009-2.255-.48-3.021-1.342-.766-.862-1.123-2.013-.979-3.158L57.47 108C79.643 107.231 97.784 90.093 99.81 68h24.19v27.49ZM211 218.65c-.76 .859-1.853 1.351-3 1.35h-40.69c-1.848 .001-3.456-1.264-3.89-3.06L132 95.49v-27.49h24.19c2.026 22.093 20.167 39.231 42.34 40L212 215.5c.136 1.145-.228 2.293-1 3.15Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
