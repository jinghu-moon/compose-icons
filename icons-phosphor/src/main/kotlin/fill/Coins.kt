package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorFillIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 89.570 L 184.000 84.000 C 184.000 58.920 146.170 40.000 96.000 40.000 C 45.830 40.000 8.000 58.920 8.000 84.000 L 8.000 124.000 C 8.000 144.890 34.250 161.490 72.000 166.460 L 72.000 172.000 C 72.000 197.080 109.830 216.000 160.000 216.000 C 210.170 216.000 248.000 197.080 248.000 172.000 L 248.000 132.000 C 248.000 111.300 222.580 94.680 184.000 89.570 ZM 56.000 146.870 C 36.410 141.400 24.000 132.390 24.000 124.000 L 24.000 109.930 C 32.160 115.710 43.090 120.370 56.000 123.500 ZM 136.000 123.500 C 148.910 120.370 159.840 115.710 168.000 109.930 L 168.000 124.000 C 168.000 132.390 155.590 141.400 136.000 146.870 ZM 120.000 194.870 C 100.410 189.400 88.000 180.390 88.000 172.000 L 88.000 167.830 C 90.630 167.930 93.290 168.000 96.000 168.000 C 99.880 168.000 103.670 167.870 107.390 167.650 C 111.523 169.129 115.732 170.385 120.000 171.410 ZM 120.000 150.250 C 112.054 151.424 104.032 152.009 96.000 152.000 C 87.968 152.009 79.946 151.424 72.000 150.250 L 72.000 126.460 C 79.958 127.497 87.975 128.011 96.000 128.000 C 104.025 128.011 112.042 127.497 120.000 126.460 ZM 184.000 198.250 C 168.085 200.583 151.915 200.583 136.000 198.250 L 136.000 174.400 C 143.955 175.469 151.973 176.004 160.000 176.000 C 168.025 176.011 176.042 175.497 184.000 174.460 ZM 232.000 172.000 C 232.000 180.390 219.590 189.400 200.000 194.870 L 200.000 171.500 C 212.910 168.370 223.840 163.710 232.000 157.930 Z"),
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
        return _coins!!
    }

private var _coins: ImageVector? = null
