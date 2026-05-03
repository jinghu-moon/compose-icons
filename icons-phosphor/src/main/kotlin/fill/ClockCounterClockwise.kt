package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ClockCounterClockwise: ImageVector
    get() {
        if (_clockCounterClockwise != null) return _clockCounterClockwise!!
        _clockCounterClockwise = phosphorFillIcon(
            name = "ClockCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 224.001 166.324 201.208 200.977 166.018 216.154 C 130.827 231.331 89.982 224.124 62.110 197.820 C 58.896 194.782 58.752 189.714 61.790 186.500 C 64.828 183.286 69.896 183.142 73.110 186.180 C 105.029 216.293 155.248 215.073 185.667 183.446 C 216.086 151.819 215.351 101.591 184.019 70.868 C 152.687 40.145 102.454 40.396 71.430 71.430 C 67.900 75.000 64.580 78.510 61.350 82.000 L 77.660 98.340 C 79.951 100.628 80.636 104.071 79.397 107.062 C 78.158 110.053 75.238 112.003 72.000 112.000 L 32.000 112.000 C 27.582 112.000 24.000 108.418 24.000 104.000 L 24.000 64.000 C 23.997 60.762 25.947 57.842 28.938 56.603 C 31.929 55.364 35.372 56.049 37.660 58.340 L 50.000 70.700 C 53.220 67.210 56.540 63.700 60.060 60.150 C 87.506 32.657 128.817 24.415 164.712 39.271 C 200.607 54.127 224.010 89.152 224.000 128.000 ZM 128.000 72.000 C 123.582 72.000 120.000 75.582 120.000 80.000 L 120.000 128.000 C 119.999 130.809 121.472 133.413 123.880 134.860 L 163.880 158.860 C 167.669 161.135 172.585 159.909 174.860 156.120 C 177.135 152.331 175.909 147.415 172.120 145.140 L 136.000 123.470 L 136.000 80.000 C 136.000 75.582 132.418 72.000 128.000 72.000 Z"),
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
        return _clockCounterClockwise!!
    }

private var _clockCounterClockwise: ImageVector? = null
