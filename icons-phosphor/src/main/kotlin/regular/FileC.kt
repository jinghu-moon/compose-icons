package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorRegularIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 48.000 180.000 C 48.000 191.000 55.180 200.000 64.000 200.000 C 67.901 199.913 71.596 198.228 74.220 195.340 C 77.287 192.216 82.296 192.138 85.459 195.164 C 88.622 198.191 88.765 203.198 85.780 206.400 C 80.150 212.460 72.272 215.933 64.000 216.000 C 46.350 216.000 32.000 199.850 32.000 180.000 C 32.000 160.150 46.350 144.000 64.000 144.000 C 72.272 144.067 80.150 147.540 85.780 153.600 C 88.765 156.802 88.622 161.809 85.459 164.836 C 82.296 167.862 77.287 167.784 74.220 164.660 C 71.596 161.772 67.901 160.087 64.000 160.000 C 55.180 160.000 48.000 169.000 48.000 180.000 ZM 216.000 88.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 120.000 232.000 C 115.582 232.000 112.000 228.418 112.000 224.000 C 112.000 219.582 115.582 216.000 120.000 216.000 L 200.000 216.000 L 200.000 96.000 L 152.000 96.000 C 147.582 96.000 144.000 92.418 144.000 88.000 L 144.000 40.000 L 56.000 40.000 L 56.000 112.000 C 56.000 116.418 52.418 120.000 48.000 120.000 C 43.582 120.000 40.000 116.418 40.000 112.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 160.000 80.000 L 188.690 80.000 L 160.000 51.310 Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
