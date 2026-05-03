package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorBoldIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 20.000 L 72.000 20.000 C 60.954 20.000 52.000 28.954 52.000 40.000 L 52.000 56.000 L 36.000 56.000 C 24.954 56.000 16.000 64.954 16.000 76.000 L 16.000 180.000 C 16.000 191.046 24.954 200.000 36.000 200.000 L 52.000 200.000 L 52.000 216.000 C 52.000 227.046 60.954 236.000 72.000 236.000 L 200.000 236.000 C 211.046 236.000 220.000 227.046 220.000 216.000 L 220.000 40.000 C 220.000 28.954 211.046 20.000 200.000 20.000 ZM 168.000 108.000 L 196.000 108.000 L 196.000 148.000 L 168.000 148.000 ZM 76.000 44.000 L 196.000 44.000 L 196.000 84.000 L 168.000 84.000 L 168.000 76.000 C 168.000 64.954 159.046 56.000 148.000 56.000 L 76.000 56.000 ZM 40.000 80.000 L 144.000 80.000 L 144.000 176.000 L 40.000 176.000 ZM 76.000 212.000 L 76.000 200.000 L 148.000 200.000 C 159.046 200.000 168.000 191.046 168.000 180.000 L 168.000 172.000 L 196.000 172.000 L 196.000 212.000 ZM 64.360 154.910 L 52.360 106.910 C 51.236 102.722 52.460 98.253 55.560 95.221 C 58.660 92.190 63.154 91.066 67.316 92.282 C 71.478 93.499 74.661 96.866 75.640 101.090 L 79.770 117.620 L 81.270 114.620 C 83.304 110.558 87.457 107.993 92.000 107.993 C 96.543 107.993 100.696 110.558 102.730 114.620 L 104.230 117.620 L 108.360 101.090 C 110.057 94.766 116.509 90.970 122.861 92.558 C 129.212 94.146 133.119 100.532 131.640 106.910 L 119.640 154.910 C 118.416 159.774 114.296 163.364 109.310 163.910 C 108.875 163.965 108.438 163.995 108.000 164.000 C 103.457 163.999 99.303 161.433 97.270 157.370 L 92.000 146.830 L 86.730 157.370 C 84.482 161.858 79.678 164.472 74.689 163.924 C 69.700 163.375 65.579 159.779 64.360 154.910 Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
