package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Strategy: ImageVector
    get() {
        if (_strategy != null) return _strategy!!
        _strategy = phosphorFillIcon(
            name = "Strategy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 108.000 188.000 C 108.000 205.673 93.673 220.000 76.000 220.000 C 58.327 220.000 44.000 205.673 44.000 188.000 C 44.000 170.327 58.327 156.000 76.000 156.000 C 93.673 156.000 108.000 170.327 108.000 188.000 ZM 53.660 117.660 L 68.000 103.310 L 82.340 117.660 C 85.466 120.786 90.534 120.786 93.660 117.660 C 96.786 114.534 96.786 109.466 93.660 106.340 L 79.310 92.000 L 93.660 77.660 C 96.786 74.534 96.786 69.466 93.660 66.340 C 90.534 63.214 85.466 63.214 82.340 66.340 L 68.000 80.690 L 53.660 66.340 C 50.534 63.214 45.466 63.214 42.340 66.340 C 39.214 69.466 39.214 74.534 42.340 77.660 L 56.690 92.000 L 42.340 106.340 C 39.214 109.466 39.214 114.534 42.340 117.660 C 45.466 120.786 50.534 120.786 53.660 117.660 ZM 215.310 188.000 L 229.660 173.660 C 232.786 170.534 232.786 165.466 229.660 162.340 C 226.534 159.214 221.466 159.214 218.340 162.340 L 204.000 176.690 L 189.660 162.340 C 186.534 159.214 181.466 159.214 178.340 162.340 C 175.214 165.466 175.214 170.534 178.340 173.660 L 192.690 188.000 L 178.340 202.340 C 175.214 205.466 175.214 210.534 178.340 213.660 C 181.466 216.786 186.534 216.786 189.660 213.660 L 204.000 199.310 L 218.340 213.660 C 221.466 216.786 226.534 216.786 229.660 213.660 C 232.786 210.534 232.786 205.466 229.660 202.340 ZM 165.660 50.340 L 163.310 48.000 L 184.000 48.000 C 188.418 48.000 192.000 44.418 192.000 40.000 C 192.000 35.582 188.418 32.000 184.000 32.000 L 144.000 32.000 C 139.582 32.000 136.000 35.582 136.000 40.000 L 136.000 80.000 C 136.000 84.418 139.582 88.000 144.000 88.000 C 148.418 88.000 152.000 84.418 152.000 80.000 L 152.000 59.310 L 154.340 61.660 C 172.270 79.590 172.240 97.060 169.050 108.560 C 164.410 125.330 149.690 140.330 134.050 144.240 C 130.131 145.222 127.559 148.973 128.055 152.982 C 128.552 156.992 131.960 160.003 136.000 160.000 C 136.657 159.999 137.312 159.919 137.950 159.760 C 159.160 154.460 178.300 135.160 184.480 112.830 C 190.580 90.780 183.900 68.590 165.660 50.340 Z"),
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
        return _strategy!!
    }

private var _strategy: ImageVector? = null
