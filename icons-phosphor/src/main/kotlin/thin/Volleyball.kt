package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Volleyball: ImageVector
    get() {
        if (_volleyball != null) return _volleyball!!
        _volleyball = phosphorThinIcon(
            name = "Volleyball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 213.000 163.190 C 182.593 184.629 142.266 185.643 110.820 165.760 L 130.310 132.000 L 219.910 132.000 C 219.451 142.721 217.112 153.278 213.000 163.190 ZM 85.520 46.420 C 95.033 41.439 105.352 38.179 116.000 36.790 C 149.762 52.412 170.792 86.830 169.290 124.000 L 130.290 124.000 ZM 219.910 124.000 L 177.290 124.000 C 178.595 88.616 161.101 55.176 131.290 36.070 C 179.217 37.839 217.766 76.089 219.910 124.000 ZM 78.590 50.420 L 99.890 87.310 C 68.604 103.868 48.390 135.721 46.730 171.080 C 24.238 128.708 38.112 76.165 78.590 50.420 ZM 55.000 183.940 C 51.670 146.912 70.952 111.519 103.870 94.240 L 123.380 128.000 L 78.590 205.580 C 69.532 199.788 61.550 192.466 55.000 183.940 ZM 128.000 220.000 C 113.205 220.017 98.628 216.441 85.520 209.580 L 106.820 172.690 C 136.794 191.502 174.475 193.083 205.920 176.850 C 189.105 203.686 159.669 219.986 128.000 220.000 Z"),
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
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
