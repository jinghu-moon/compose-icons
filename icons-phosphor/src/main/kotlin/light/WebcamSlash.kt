package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WebcamSlash: ImageVector
    get() {
        if (_webcamSlash != null) return _webcamSlash!!
        _webcamSlash = phosphorLightIcon(
            name = "WebcamSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.440 212.000 L 52.440 36.000 C 50.163 33.887 46.650 33.861 44.342 35.940 C 42.034 38.019 41.695 41.516 43.560 44.000 L 61.310 63.560 C 47.272 86.726 46.258 115.516 58.632 139.612 C 71.005 163.708 94.993 179.660 122.000 181.750 L 122.000 202.000 L 32.000 202.000 C 28.686 202.000 26.000 204.686 26.000 208.000 C 26.000 211.314 28.686 214.000 32.000 214.000 L 198.070 214.000 L 203.560 220.000 C 205.791 222.452 209.588 222.631 212.040 220.400 C 214.492 218.169 214.671 214.372 212.440 211.920 ZM 120.770 129.000 C 111.363 126.261 104.288 118.475 102.460 108.850 ZM 62.000 104.000 C 61.978 93.143 64.651 82.450 69.780 72.880 L 90.850 96.060 C 88.453 107.277 91.251 118.976 98.463 127.894 C 105.676 136.813 116.530 141.997 128.000 142.000 C 129.464 141.999 130.926 141.912 132.380 141.740 L 153.440 164.910 C 133.066 173.421 109.787 171.180 91.411 158.939 C 73.035 146.699 61.997 126.080 62.000 104.000 ZM 134.000 202.000 L 134.000 181.760 C 143.696 181.013 153.167 178.467 161.930 174.250 L 187.160 202.000 ZM 87.260 44.320 C 86.475 42.936 86.272 41.296 86.696 39.762 C 87.119 38.228 88.135 36.925 89.520 36.140 C 121.241 18.137 161.202 24.519 185.737 51.508 C 210.271 78.497 212.827 118.884 191.890 148.750 C 190.684 150.567 188.587 151.586 186.414 151.412 C 184.240 151.239 182.332 149.900 181.429 147.915 C 180.527 145.930 180.772 143.612 182.070 141.860 C 199.798 116.588 197.640 82.402 176.874 59.560 C 156.108 36.719 122.282 31.323 95.440 46.570 C 92.560 48.207 88.898 47.200 87.260 44.320 ZM 152.730 112.050 C 155.626 103.167 153.532 93.412 147.246 86.500 C 140.960 79.587 131.448 76.579 122.330 78.620 C 119.094 79.338 115.888 77.296 115.170 74.060 C 114.452 70.824 116.494 67.618 119.730 66.900 C 133.053 63.926 146.948 68.326 156.130 78.428 C 165.312 88.530 168.369 102.781 164.140 115.760 C 163.072 118.852 159.724 120.518 156.613 119.507 C 153.503 118.496 151.775 115.179 152.730 112.050 Z"),
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
        return _webcamSlash!!
    }

private var _webcamSlash: ImageVector? = null
