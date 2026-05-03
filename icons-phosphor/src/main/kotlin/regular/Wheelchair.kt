package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) return _wheelchair!!
        _wheelchair = phosphorRegularIcon(
            name = "Wheelchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 255.590 189.470 C 254.919 187.457 253.476 185.793 251.578 184.844 C 249.680 183.895 247.483 183.739 245.470 184.410 L 228.050 190.220 L 199.150 132.420 C 197.795 129.712 195.028 128.002 192.000 128.000 L 112.000 128.000 L 112.000 104.000 L 168.000 104.000 C 172.418 104.000 176.000 100.418 176.000 96.000 C 176.000 91.582 172.418 88.000 168.000 88.000 L 112.000 88.000 L 112.000 79.000 C 127.602 74.971 137.775 59.970 135.745 43.984 C 133.714 27.998 120.114 16.016 104.000 16.016 C 87.886 16.016 74.285 27.998 72.255 43.984 C 70.225 59.970 80.398 74.971 96.000 79.000 L 96.000 89.810 C 60.288 97.972 36.398 131.648 40.494 168.051 C 44.590 204.454 75.367 231.978 112.000 232.000 C 145.520 232.000 175.690 209.290 183.750 178.000 C 184.855 173.720 182.280 169.355 178.000 168.250 C 173.720 167.145 169.355 169.720 168.250 174.000 C 162.090 198.000 137.910 216.000 112.000 216.000 C 84.202 215.991 60.619 195.592 56.606 168.085 C 52.592 140.579 69.364 114.292 96.000 106.340 L 96.000 136.000 C 96.000 140.418 99.582 144.000 104.000 144.000 L 187.050 144.000 L 216.840 203.580 C 218.625 207.139 222.755 208.843 226.530 207.580 L 250.530 199.580 C 254.717 198.183 256.981 193.659 255.590 189.470 ZM 88.000 48.000 C 88.000 39.163 95.163 32.000 104.000 32.000 C 112.837 32.000 120.000 39.163 120.000 48.000 C 120.000 56.837 112.837 64.000 104.000 64.000 C 95.163 64.000 88.000 56.837 88.000 48.000 Z"),
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
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
