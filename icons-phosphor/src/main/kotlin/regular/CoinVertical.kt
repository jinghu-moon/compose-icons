package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorRegularIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.510 56.090 C 186.440 35.400 169.920 24.000 152.000 24.000 L 104.000 24.000 C 86.080 24.000 69.560 35.400 57.490 56.090 C 46.210 75.420 40.000 101.000 40.000 128.000 C 40.000 155.000 46.210 180.580 57.490 199.910 C 69.560 220.600 86.080 232.000 104.000 232.000 L 152.000 232.000 C 169.920 232.000 186.440 220.600 198.510 199.910 C 209.790 180.580 216.000 155.000 216.000 128.000 C 216.000 101.000 209.790 75.420 198.510 56.090 ZM 199.790 120.000 L 167.790 120.000 C 167.165 103.584 163.896 87.375 158.110 72.000 L 188.700 72.000 C 194.820 85.380 198.860 102.000 199.790 120.000 ZM 179.190 56.000 L 150.460 56.000 C 147.118 50.203 143.089 44.831 138.460 40.000 L 152.000 40.000 C 162.000 40.000 171.400 46.000 179.190 56.000 ZM 56.000 128.000 C 56.000 80.300 78.000 40.000 104.000 40.000 C 130.000 40.000 152.000 80.300 152.000 128.000 C 152.000 175.700 130.000 216.000 104.000 216.000 C 78.000 216.000 56.000 175.700 56.000 128.000 ZM 152.000 216.000 L 138.490 216.000 C 143.119 211.169 147.148 205.797 150.490 200.000 L 179.220 200.000 C 171.400 210.000 162.000 216.000 152.000 216.000 ZM 188.700 184.000 L 158.120 184.000 C 163.906 168.624 167.175 152.416 167.800 136.000 L 199.800 136.000 C 198.860 154.000 194.820 170.620 188.700 184.000 Z"),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
