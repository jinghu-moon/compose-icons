package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) return _fileDoc!!
        _fileDoc = phosphorDuotoneIcon(
            name = "FileDoc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 52.000 144.000 L 36.000 144.000 C 31.582 144.000 28.000 147.582 28.000 152.000 L 28.000 208.000 C 28.000 212.418 31.582 216.000 36.000 216.000 L 52.000 216.000 C 71.882 216.000 88.000 199.882 88.000 180.000 C 88.000 160.118 71.882 144.000 52.000 144.000 ZM 52.000 200.000 L 44.000 200.000 L 44.000 160.000 L 52.000 160.000 C 63.046 160.000 72.000 168.954 72.000 180.000 C 72.000 191.046 63.046 200.000 52.000 200.000 ZM 221.530 195.090 C 224.722 198.144 224.834 203.208 221.780 206.400 C 216.150 212.460 208.272 215.933 200.000 216.000 C 182.350 216.000 168.000 199.850 168.000 180.000 C 168.000 160.150 182.350 144.000 200.000 144.000 C 208.272 144.067 216.150 147.540 221.780 153.600 C 224.765 156.802 224.622 161.809 221.459 164.836 C 218.296 167.862 213.287 167.784 210.220 164.660 C 207.596 161.772 203.901 160.087 200.000 160.000 C 191.180 160.000 184.000 169.000 184.000 180.000 C 184.000 191.000 191.180 200.000 200.000 200.000 C 203.903 199.920 207.600 198.234 210.220 195.340 C 213.274 192.148 218.338 192.036 221.530 195.090 ZM 128.000 144.000 C 110.360 144.000 96.000 160.150 96.000 180.000 C 96.000 199.850 110.360 216.000 128.000 216.000 C 145.640 216.000 160.000 199.850 160.000 180.000 C 160.000 160.150 145.640 144.000 128.000 144.000 ZM 128.000 200.000 C 119.180 200.000 112.000 191.000 112.000 180.000 C 112.000 169.000 119.180 160.000 128.000 160.000 C 136.820 160.000 144.000 169.000 144.000 180.000 C 144.000 191.000 136.820 200.000 128.000 200.000 ZM 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 112.000 C 200.000 116.418 203.582 120.000 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 Z"),
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
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
