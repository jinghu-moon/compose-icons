package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PenNib: ImageVector
    get() {
        if (_penNib != null) return _penNib!!
        _penNib = phosphorLightIcon(
            name = "PenNib",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.000 92.680 C 246.007 88.966 244.531 85.402 241.900 82.780 L 173.210 14.100 C 170.584 11.474 167.023 9.999 163.310 9.999 C 159.597 9.999 156.036 11.474 153.410 14.100 L 124.680 42.830 L 66.220 64.760 C 61.538 66.513 58.145 70.629 57.320 75.560 L 34.080 215.000 C 33.786 216.742 34.274 218.525 35.415 219.874 C 36.556 221.224 38.233 222.001 40.000 222.000 C 40.335 221.999 40.669 221.972 41.000 221.920 L 180.440 198.680 C 185.375 197.858 189.496 194.465 191.250 189.780 L 213.170 131.320 L 241.910 102.580 C 244.539 99.958 246.012 96.393 246.000 92.680 ZM 180.000 185.570 C 179.750 186.238 179.163 186.721 178.460 186.840 L 57.490 207.000 L 110.360 154.120 C 121.588 161.045 136.222 158.465 144.404 148.117 C 152.586 137.769 151.722 122.934 142.394 113.606 C 133.066 104.278 118.231 103.414 107.883 111.596 C 97.535 119.778 94.955 134.412 101.880 145.640 L 49.000 198.530 L 69.170 77.530 C 69.290 76.833 69.769 76.251 70.430 76.000 L 126.490 55.000 L 201.000 129.510 ZM 110.000 132.000 C 110.000 124.268 116.268 118.000 124.000 118.000 C 131.732 118.000 138.000 124.268 138.000 132.000 C 138.000 139.732 131.732 146.000 124.000 146.000 C 116.268 146.000 110.000 139.732 110.000 132.000 ZM 233.410 94.100 L 208.000 119.510 L 136.480 48.000 L 161.900 22.580 C 162.275 22.204 162.784 21.993 163.315 21.993 C 163.846 21.993 164.355 22.204 164.730 22.580 L 233.410 91.270 C 233.786 91.645 233.997 92.154 233.997 92.685 C 233.997 93.216 233.786 93.725 233.410 94.100 Z"),
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
