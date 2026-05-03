package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileZip: ImageVector
    get() {
        if (_fileZip != null) return _fileZip!!
        _fileZip = phosphorFillIcon(
            name = "FileZip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 144.000 L 168.000 144.000 C 163.582 144.000 160.000 147.582 160.000 152.000 L 160.000 207.730 C 159.942 212.013 163.202 215.613 167.470 215.980 C 169.682 216.127 171.856 215.349 173.473 213.833 C 175.090 212.316 176.005 210.197 176.000 207.980 L 176.000 199.980 L 183.400 199.980 C 198.640 199.980 211.540 188.060 211.990 172.830 C 212.214 165.263 209.365 157.927 204.092 152.496 C 198.818 147.064 191.570 143.999 184.000 144.000 ZM 183.650 184.000 L 176.000 184.000 L 176.000 160.000 L 184.000 160.000 C 187.394 159.984 190.636 161.406 192.923 163.914 C 195.210 166.422 196.328 169.782 196.000 173.160 C 195.277 179.408 189.939 184.093 183.650 184.000 ZM 136.000 152.000 L 136.000 207.730 C 136.058 212.013 132.798 215.613 128.530 215.980 C 126.318 216.127 124.144 215.349 122.527 213.833 C 120.910 212.316 119.995 210.197 120.000 207.980 L 120.000 152.270 C 119.942 147.987 123.202 144.387 127.470 144.020 C 129.678 143.873 131.849 144.648 133.465 146.160 C 135.082 147.672 135.999 149.787 136.000 152.000 ZM 96.000 208.530 C 95.633 212.805 92.021 216.068 87.730 216.000 L 56.230 216.000 C 53.973 216.021 51.805 215.117 50.230 213.500 C 47.776 210.944 47.296 207.079 49.050 204.000 L 74.210 160.000 L 56.270 160.000 C 51.979 160.068 48.367 156.805 48.000 152.530 C 47.853 150.318 48.631 148.144 50.147 146.527 C 51.664 144.910 53.783 143.995 56.000 144.000 L 87.770 144.000 C 90.027 143.979 92.195 144.883 93.770 146.500 C 96.240 149.044 96.741 152.911 95.000 156.000 L 69.790 200.000 L 88.000 200.000 C 90.217 199.995 92.336 200.910 93.853 202.527 C 95.369 204.144 96.147 206.318 96.000 208.530 ZM 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 116.000 C 40.000 118.209 41.791 120.000 44.000 120.000 L 212.000 120.000 C 214.209 120.000 216.000 118.209 216.000 116.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 ZM 152.000 88.000 L 152.000 44.000 L 196.000 88.000 Z"),
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
        return _fileZip!!
    }

private var _fileZip: ImageVector? = null
