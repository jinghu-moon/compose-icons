package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorFillIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 160.000 175.090 L 160.000 223.690 C 160.050 226.604 158.565 229.330 156.090 230.870 C 153.261 232.553 149.689 232.331 147.090 230.310 L 81.540 179.310 C 80.575 178.557 80.007 177.404 80.000 176.180 L 80.000 87.090 L 42.080 45.380 C 40.117 43.271 39.439 40.270 40.306 37.522 C 41.173 34.775 43.450 32.706 46.267 32.105 C 49.085 31.504 52.008 32.465 53.920 34.620 ZM 186.710 155.160 C 190.021 158.084 195.075 157.770 198.000 154.460 C 211.313 139.347 211.313 116.693 198.000 101.580 C 196.142 99.326 193.204 98.264 190.335 98.809 C 187.465 99.353 185.121 101.418 184.218 104.196 C 183.316 106.974 183.999 110.023 186.000 112.150 C 193.983 121.217 193.983 134.803 186.000 143.870 C 183.079 147.184 183.397 152.238 186.710 155.160 ZM 227.630 74.670 C 225.756 72.430 222.809 71.389 219.944 71.955 C 217.078 72.521 214.749 74.604 213.867 77.389 C 212.986 80.174 213.692 83.218 215.710 85.330 C 237.444 109.625 237.444 146.375 215.710 170.670 C 213.692 172.782 212.986 175.826 213.867 178.611 C 214.749 181.396 217.078 183.479 219.944 184.045 C 222.809 184.611 225.756 183.570 227.630 181.330 C 254.788 150.963 254.788 105.037 227.630 74.670 ZM 153.000 119.870 C 154.107 121.125 155.878 121.559 157.440 120.957 C 159.001 120.354 160.023 118.844 160.000 117.170 L 160.000 32.250 C 160.038 29.795 158.982 27.450 157.120 25.850 C 154.235 23.463 150.080 23.396 147.120 25.690 L 103.830 59.330 C 102.951 60.015 102.397 61.035 102.302 62.146 C 102.207 63.256 102.579 64.356 103.330 65.180 ZM 60.000 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 60.000 176.000 C 62.209 176.000 64.000 174.209 64.000 172.000 L 64.000 84.000 C 64.000 81.791 62.209 80.000 60.000 80.000 Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
