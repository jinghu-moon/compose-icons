package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Scroll: ImageVector
    get() {
        if (_scroll != null) return _scroll!!
        _scroll = phosphorRegularIcon(
            name = "Scroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 96.000 104.000 C 96.000 99.582 99.582 96.000 104.000 96.000 L 168.000 96.000 C 172.418 96.000 176.000 99.582 176.000 104.000 C 176.000 108.418 172.418 112.000 168.000 112.000 L 104.000 112.000 C 99.582 112.000 96.000 108.418 96.000 104.000 ZM 104.000 144.000 L 168.000 144.000 C 172.418 144.000 176.000 140.418 176.000 136.000 C 176.000 131.582 172.418 128.000 168.000 128.000 L 104.000 128.000 C 99.582 128.000 96.000 131.582 96.000 136.000 C 96.000 140.418 99.582 144.000 104.000 144.000 ZM 232.000 192.000 C 232.000 209.673 217.673 224.000 200.000 224.000 L 88.000 224.000 C 70.327 224.000 56.000 209.673 56.000 192.000 L 56.000 64.000 C 56.000 55.163 48.837 48.000 40.000 48.000 C 31.163 48.000 24.000 55.163 24.000 64.000 C 24.000 69.740 28.830 73.620 28.880 73.660 L 28.880 73.660 C 31.595 75.749 32.678 79.335 31.574 82.577 C 30.471 85.820 27.425 88.000 24.000 88.000 C 22.270 88.003 20.587 87.437 19.210 86.390 L 19.210 86.390 C 18.050 85.540 8.000 77.610 8.000 64.000 C 8.000 46.327 22.327 32.000 40.000 32.000 L 176.000 32.000 C 193.673 32.000 208.000 46.327 208.000 64.000 L 208.000 168.000 L 216.000 168.000 C 217.731 168.000 219.415 168.561 220.800 169.600 C 222.000 170.460 232.000 178.390 232.000 192.000 ZM 96.260 173.480 C 97.381 170.170 100.506 167.958 104.000 168.000 L 192.000 168.000 L 192.000 64.000 C 192.000 55.163 184.837 48.000 176.000 48.000 L 67.690 48.000 C 70.519 52.857 72.007 58.379 72.000 64.000 L 72.000 192.000 C 72.000 200.837 79.163 208.000 88.000 208.000 C 96.837 208.000 104.000 200.837 104.000 192.000 C 104.000 186.260 99.170 182.380 99.120 182.340 C 96.321 180.338 95.160 176.741 96.260 173.480 ZM 216.000 192.000 C 215.900 189.036 214.756 186.203 212.770 184.000 L 118.770 184.000 C 119.574 186.590 119.982 189.288 119.980 192.000 C 119.988 197.619 118.508 203.139 115.690 208.000 L 200.000 208.000 C 208.837 208.000 216.000 200.837 216.000 192.000 Z"),
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
        return _scroll!!
    }

private var _scroll: ImageVector? = null
