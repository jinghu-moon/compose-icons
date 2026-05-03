package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorFillIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 96.000 C 216.024 55.119 187.891 19.604 148.090 10.272 C 108.288 0.939 67.300 20.246 49.149 56.877 C 30.998 93.508 40.465 137.815 72.000 163.830 L 72.000 240.000 C 71.998 242.774 73.433 245.351 75.793 246.810 C 78.152 248.269 81.099 248.401 83.580 247.160 L 128.000 225.000 L 172.430 247.210 C 173.544 247.743 174.765 248.013 176.000 248.000 C 180.418 248.000 184.000 244.418 184.000 240.000 L 184.000 163.830 C 204.267 147.138 216.006 122.256 216.000 96.000 ZM 56.000 96.000 C 56.000 56.235 88.235 24.000 128.000 24.000 C 167.764 24.000 200.000 56.235 200.000 96.000 C 200.000 135.764 167.764 168.000 128.000 168.000 C 88.254 167.956 56.044 135.746 56.000 96.000 ZM 72.000 96.000 C 72.000 65.072 97.072 40.000 128.000 40.000 C 158.928 40.000 184.000 65.072 184.000 96.000 C 184.000 126.928 158.928 152.000 128.000 152.000 C 97.086 151.967 72.033 126.914 72.000 96.000 Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
