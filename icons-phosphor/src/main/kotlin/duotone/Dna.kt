package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = phosphorDuotoneIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 103.800 140.100 L 128.000 128.000 L 152.200 140.100 C 176.593 152.297 192.001 177.228 192.000 204.500 L 192.000 208.000 L 64.000 208.000 L 64.000 204.500 C 63.999 177.228 79.407 152.297 103.800 140.100 ZM 192.000 51.500 L 192.000 48.000 L 64.000 48.000 L 64.000 51.500 C 63.999 78.772 79.407 103.703 103.800 115.900 L 128.000 128.000 L 152.200 115.900 C 176.593 103.703 192.001 78.772 192.000 51.500 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 200.000 204.500 L 200.000 232.000 C 200.000 236.418 196.418 240.000 192.000 240.000 C 187.582 240.000 184.000 236.418 184.000 232.000 L 184.000 204.500 C 184.080 180.234 170.359 158.032 148.620 147.250 L 100.220 123.060 C 73.047 109.583 55.898 81.831 56.000 51.500 L 56.000 24.000 C 56.000 19.582 59.582 16.000 64.000 16.000 C 68.418 16.000 72.000 19.582 72.000 24.000 L 72.000 51.500 C 71.920 75.766 85.641 97.968 107.380 108.750 L 155.780 132.940 C 182.953 146.417 200.102 174.169 200.000 204.500 ZM 160.000 200.000 L 72.170 200.000 C 72.555 194.550 73.640 189.172 75.400 184.000 L 148.110 184.000 C 152.528 184.000 156.110 180.418 156.110 176.000 C 156.110 171.582 152.528 168.000 148.110 168.000 L 83.460 168.000 C 87.475 162.197 92.425 157.101 98.110 152.920 C 101.678 150.305 102.450 145.293 99.835 141.725 C 97.220 138.157 92.208 137.385 88.640 140.000 C 68.147 155.107 56.035 179.040 56.000 204.500 L 56.000 232.000 C 56.000 236.418 59.582 240.000 64.000 240.000 C 68.418 240.000 72.000 236.418 72.000 232.000 L 72.000 216.000 L 160.000 216.000 C 164.418 216.000 168.000 212.418 168.000 208.000 C 168.000 203.582 164.418 200.000 160.000 200.000 ZM 192.000 16.000 C 187.582 16.000 184.000 19.582 184.000 24.000 L 184.000 40.000 L 96.000 40.000 C 91.582 40.000 88.000 43.582 88.000 48.000 C 88.000 52.418 91.582 56.000 96.000 56.000 L 183.830 56.000 C 183.445 61.450 182.360 66.828 180.600 72.000 L 107.890 72.000 C 103.472 72.000 99.890 75.582 99.890 80.000 C 99.890 84.418 103.472 88.000 107.890 88.000 L 172.540 88.000 C 168.525 93.803 163.575 98.899 157.890 103.080 C 154.328 105.695 153.560 110.703 156.175 114.265 C 158.790 117.827 163.798 118.595 167.360 115.980 C 187.848 100.877 199.958 76.953 200.000 51.500 L 200.000 24.000 C 200.000 19.582 196.418 16.000 192.000 16.000 Z"),
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
        return _dna!!
    }

private var _dna: ImageVector? = null
