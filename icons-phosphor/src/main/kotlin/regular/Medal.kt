package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorRegularIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 96.000 C 216.024 55.119 187.891 19.604 148.090 10.272 C 108.288 0.939 67.300 20.246 49.149 56.877 C 30.998 93.508 40.465 137.815 72.000 163.830 L 72.000 240.000 C 71.998 242.774 73.433 245.351 75.793 246.810 C 78.152 248.269 81.099 248.401 83.580 247.160 L 128.000 225.000 L 172.430 247.210 C 173.544 247.743 174.765 248.013 176.000 248.000 C 180.418 248.000 184.000 244.418 184.000 240.000 L 184.000 163.830 C 204.267 147.138 216.006 122.256 216.000 96.000 ZM 56.000 96.000 C 56.000 56.235 88.235 24.000 128.000 24.000 C 167.764 24.000 200.000 56.235 200.000 96.000 C 200.000 135.764 167.764 168.000 128.000 168.000 C 88.254 167.956 56.044 135.746 56.000 96.000 ZM 168.000 227.060 L 131.570 208.850 C 129.317 207.722 126.663 207.722 124.410 208.850 L 88.000 227.060 L 88.000 174.370 C 113.121 187.210 142.879 187.210 168.000 174.370 ZM 128.000 152.000 C 158.928 152.000 184.000 126.928 184.000 96.000 C 184.000 65.072 158.928 40.000 128.000 40.000 C 97.072 40.000 72.000 65.072 72.000 96.000 C 72.033 126.914 97.086 151.967 128.000 152.000 ZM 128.000 56.000 C 150.091 56.000 168.000 73.909 168.000 96.000 C 168.000 118.091 150.091 136.000 128.000 136.000 C 105.909 136.000 88.000 118.091 88.000 96.000 C 88.000 73.909 105.909 56.000 128.000 56.000 Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
