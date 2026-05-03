package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorThinIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 211.890 119.090 C 211.587 117.786 210.653 116.721 209.400 116.250 L 148.590 93.450 L 163.920 16.780 C 164.264 15.030 163.408 13.264 161.821 12.450 C 160.235 11.636 158.301 11.971 157.080 13.270 L 45.080 133.270 C 44.159 134.240 43.784 135.606 44.080 136.910 C 44.383 138.214 45.317 139.279 46.570 139.750 L 107.380 162.550 L 92.080 239.220 C 91.736 240.970 92.592 242.736 94.179 243.550 C 95.765 244.364 97.699 244.029 98.920 242.730 L 210.920 122.730 C 211.830 121.754 212.194 120.389 211.890 119.090 ZM 102.680 227.000 L 115.920 160.800 C 116.304 158.876 115.237 156.958 113.400 156.270 L 55.000 134.360 L 153.320 29.000 L 140.080 95.200 C 139.696 97.124 140.763 99.042 142.600 99.730 L 201.000 121.640 Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
