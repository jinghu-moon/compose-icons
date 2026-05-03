package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorFillIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.310 81.360 L 174.630 12.680 C 171.629 9.679 167.559 7.992 163.315 7.992 C 159.071 7.992 155.001 9.679 152.000 12.680 L 123.560 41.120 L 65.560 62.880 C 60.196 64.876 56.306 69.585 55.360 75.230 L 34.590 199.830 C 34.304 201.544 35.158 203.247 36.703 204.043 C 38.247 204.839 40.129 204.547 41.360 203.320 L 98.360 146.320 C 96.554 142.563 95.764 138.398 96.070 134.240 C 96.833 123.741 104.349 114.964 114.607 112.596 C 124.864 110.227 135.467 114.819 140.757 123.920 C 146.047 133.022 144.788 144.508 137.652 152.248 C 130.517 159.988 119.171 162.174 109.670 157.640 L 52.670 214.640 C 51.443 215.871 51.151 217.753 51.947 219.297 C 52.743 220.842 54.446 221.696 56.160 221.410 L 180.770 200.640 C 186.405 199.701 191.112 195.829 193.120 190.480 L 214.890 132.410 L 243.310 104.000 C 246.311 100.999 247.998 96.929 247.998 92.685 C 247.998 88.441 246.311 84.371 243.310 81.370 ZM 208.000 116.680 L 139.320 48.000 L 163.320 24.000 L 232.000 92.680 Z"),
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
        return _penNib!!
    }

private var _penNib: ImageVector? = null
