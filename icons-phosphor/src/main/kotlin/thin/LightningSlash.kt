package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorThinIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 86.770 88.600 L 45.080 133.270 C 44.171 134.246 43.808 135.612 44.113 136.911 C 44.419 138.209 45.351 139.271 46.600 139.740 L 107.410 162.550 L 92.080 239.220 C 91.736 240.970 92.592 242.736 94.179 243.550 C 95.765 244.364 97.699 244.029 98.920 242.730 L 163.750 173.270 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 102.680 227.000 L 115.920 160.800 C 116.304 158.876 115.237 156.958 113.400 156.270 L 55.000 134.360 L 92.170 94.540 L 158.350 167.330 ZM 111.390 68.100 C 109.776 66.594 109.686 64.066 111.190 62.450 L 157.080 13.290 C 158.301 11.991 160.235 11.656 161.821 12.470 C 163.408 13.284 164.264 15.050 163.920 16.800 L 148.590 93.450 L 209.400 116.250 C 210.653 116.721 211.587 117.786 211.890 119.090 C 212.186 120.394 211.811 121.760 210.890 122.730 L 188.590 146.620 C 187.067 148.146 184.609 148.191 183.032 146.722 C 181.454 145.252 181.325 142.797 182.740 141.170 L 201.000 121.640 L 142.600 99.740 C 140.767 99.053 139.701 97.140 140.080 95.220 L 153.320 29.000 L 117.000 67.890 C 115.496 69.475 112.998 69.560 111.390 68.080 Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
