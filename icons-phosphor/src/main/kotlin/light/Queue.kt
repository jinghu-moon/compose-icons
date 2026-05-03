package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorLightIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 34.000 64.000 C 34.000 60.686 36.686 58.000 40.000 58.000 L 216.000 58.000 C 219.314 58.000 222.000 60.686 222.000 64.000 C 222.000 67.314 219.314 70.000 216.000 70.000 L 40.000 70.000 C 36.686 70.000 34.000 67.314 34.000 64.000 ZM 136.000 122.000 L 40.000 122.000 C 36.686 122.000 34.000 124.686 34.000 128.000 C 34.000 131.314 36.686 134.000 40.000 134.000 L 136.000 134.000 C 139.314 134.000 142.000 131.314 142.000 128.000 C 142.000 124.686 139.314 122.000 136.000 122.000 ZM 136.000 186.000 L 40.000 186.000 C 36.686 186.000 34.000 188.686 34.000 192.000 C 34.000 195.314 36.686 198.000 40.000 198.000 L 136.000 198.000 C 139.314 198.000 142.000 195.314 142.000 192.000 C 142.000 188.686 139.314 186.000 136.000 186.000 ZM 246.000 160.000 C 246.001 162.069 244.935 163.993 243.180 165.090 L 179.180 205.090 C 177.330 206.246 174.998 206.307 173.091 205.249 C 171.183 204.192 169.999 202.182 170.000 200.000 L 170.000 120.000 C 169.999 117.818 171.183 115.808 173.091 114.751 C 174.998 113.693 177.330 113.754 179.180 114.910 L 243.180 154.910 C 244.935 156.007 246.001 157.931 246.000 160.000 ZM 228.680 160.000 L 182.000 130.830 L 182.000 189.170 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _queue!!
    }

private var _queue: ImageVector? = null
