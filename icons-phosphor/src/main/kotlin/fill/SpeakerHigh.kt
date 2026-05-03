package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorFillIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 32.250 L 160.000 223.690 C 160.050 226.604 158.565 229.330 156.090 230.870 C 153.261 232.553 149.689 232.331 147.090 230.310 L 81.520 179.310 C 80.557 178.549 79.996 177.388 80.000 176.160 L 80.000 79.840 C 80.004 78.607 80.576 77.445 81.550 76.690 L 147.120 25.690 C 150.080 23.396 154.235 23.463 157.120 25.850 C 158.982 27.450 160.038 29.795 160.000 32.250 ZM 60.000 80.000 L 32.000 80.000 C 23.163 80.000 16.000 87.163 16.000 96.000 L 16.000 160.000 C 16.000 168.837 23.163 176.000 32.000 176.000 L 60.000 176.000 C 62.209 176.000 64.000 174.209 64.000 172.000 L 64.000 84.000 C 64.000 81.791 62.209 80.000 60.000 80.000 ZM 186.770 100.840 C 185.175 102.242 184.202 104.221 184.067 106.341 C 183.932 108.460 184.645 110.547 186.050 112.140 C 194.033 121.207 194.033 134.793 186.050 143.860 C 184.106 145.996 183.464 149.014 184.371 151.756 C 185.278 154.498 187.592 156.539 190.426 157.095 C 193.261 157.651 196.174 156.636 198.050 154.440 C 211.363 139.327 211.363 116.673 198.050 101.560 C 196.648 99.962 194.667 98.987 192.544 98.852 C 190.422 98.717 188.334 99.432 186.740 100.840 ZM 227.660 74.670 C 225.786 72.430 222.839 71.389 219.974 71.955 C 217.108 72.521 214.779 74.604 213.897 77.389 C 213.016 80.174 213.722 83.218 215.740 85.330 C 237.474 109.625 237.474 146.375 215.740 170.670 C 213.722 172.782 213.016 175.826 213.897 178.611 C 214.779 181.396 217.108 183.479 219.974 184.045 C 222.839 184.611 225.786 183.570 227.660 181.330 C 254.818 150.963 254.818 105.037 227.660 74.670 Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
