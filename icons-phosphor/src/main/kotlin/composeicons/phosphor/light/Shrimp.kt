package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorLightIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138 116c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10ZM221.9 84c-2.179 41.447-36.396 73.951-77.9 74h-32c-7.732 0-14 6.268-14 14 0 7.732 6.268 14 14 14h56c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-50v20h34c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-56C52.922 230 18 195.078 18 152 18 108.922 52.922 74 96 74h116c7.732 0 14-6.268 14-14 0-7.732-6.268-14-14-14h-84C115.85 46 106 36.15 106 24c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 5.523 4.477 10 10 10h84c12.375 .047 23.002 8.81 25.405 20.95C239.809 67.089 233.323 79.241 221.9 84ZM50.65 199.88 86.13 174.54c-.089-.844-.132-1.692-.13-2.54 .001-2.918 .494-5.816 1.46-8.57L31.51 138c-4.917 22.556 2.347 46.039 19.14 61.88ZM90.3 186.3 60.49 207.59C71.081 214.398 83.409 218.012 96 218h10v-20.71C99.56 195.755 93.947 191.825 90.3 186.3ZM106 146.71v-60.71h-10c-26.578 .028-50.554 15.971-60.86 40.47L94 153.24c3.342-3.213 7.487-5.468 12-6.53ZM209.73 86h-91.73v60h26c34.111-.041 62.587-26.034 65.73-60Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
