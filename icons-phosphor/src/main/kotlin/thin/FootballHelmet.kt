package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorThinIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 92.000 164.000 C 92.000 168.418 88.418 172.000 84.000 172.000 C 79.582 172.000 76.000 168.418 76.000 164.000 C 76.000 159.582 79.582 156.000 84.000 156.000 C 88.418 156.000 92.000 159.582 92.000 164.000 ZM 228.000 176.000 L 228.000 208.000 C 228.000 214.627 222.627 220.000 216.000 220.000 L 180.000 220.000 C 174.690 219.975 170.020 216.485 168.490 211.400 L 156.830 172.000 L 126.550 172.000 L 131.640 189.130 C 131.669 189.218 131.693 189.309 131.710 189.400 C 132.498 192.952 131.633 196.670 129.356 199.508 C 127.080 202.346 123.638 203.999 120.000 204.000 L 72.140 204.000 C 71.333 204.000 70.546 203.756 69.880 203.300 C 43.673 185.412 27.997 155.730 28.000 124.000 C 28.000 71.810 70.470 28.770 122.630 28.000 C 148.327 27.633 173.099 37.585 191.400 55.629 C 209.701 73.672 220.003 98.300 220.000 124.000 L 220.000 128.000 C 220.000 130.209 218.209 132.000 216.000 132.000 L 153.350 132.000 L 162.810 164.000 L 216.000 164.000 C 222.627 164.000 228.000 169.373 228.000 176.000 ZM 123.930 191.250 L 108.360 138.880 C 108.332 138.788 108.309 138.694 108.290 138.600 C 107.502 135.048 108.367 131.330 110.644 128.492 C 112.920 125.654 116.362 124.002 120.000 124.000 L 212.000 124.000 C 212.002 100.443 202.560 77.868 185.785 61.328 C 169.010 44.789 146.305 35.665 122.750 36.000 C 74.930 36.670 36.000 76.130 36.000 124.000 C 35.997 152.656 49.947 179.519 73.390 196.000 L 120.000 196.000 C 121.192 196.000 122.323 195.469 123.083 194.550 C 123.843 193.631 124.154 192.421 123.930 191.250 ZM 154.460 164.000 L 145.000 132.000 L 120.000 132.000 C 118.808 132.000 117.677 132.531 116.917 133.450 C 116.157 134.369 115.846 135.579 116.070 136.750 L 124.170 164.000 ZM 220.000 176.000 C 220.000 173.791 218.209 172.000 216.000 172.000 L 165.170 172.000 L 176.170 209.130 C 176.670 210.829 178.229 211.997 180.000 212.000 L 216.000 212.000 C 218.209 212.000 220.000 210.209 220.000 208.000 Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
