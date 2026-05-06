package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorLightIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM218 128c.026 16.426-4.472 32.542-13 46.58L134 124.88v-86.68c47.244 3.216 83.941 42.447 84 89.8ZM122 38.2v86.68L51 174.58C34.744 147.705 33.674 114.299 48.178 86.44 62.682 58.58 90.661 40.297 122 38.2ZM57.92 184.4 122 139.53v78.27C96.91 216.116 73.671 204.003 57.92 184.4ZM134 217.8v-78.27l64.08 44.87C182.329 204.003 159.09 216.116 134 217.8Z"),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
