package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorBoldIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 186.790 84.060 C 191.653 60.213 181.629 35.790 161.414 22.236 C 141.200 8.683 114.800 8.683 94.586 22.236 C 74.371 35.790 64.347 60.213 69.210 84.060 C 46.198 85.174 25.856 99.367 16.867 120.581 C 7.879 141.794 11.830 166.281 27.036 183.589 C 42.242 200.898 66.016 207.971 88.210 201.790 L 84.210 221.650 C 83.505 225.179 84.421 228.837 86.706 231.618 C 88.990 234.398 92.402 236.007 96.000 236.000 L 160.000 236.000 C 163.595 236.001 167.001 234.390 169.281 231.610 C 171.560 228.831 172.474 225.175 171.770 221.650 L 167.770 201.790 C 189.964 207.971 213.738 200.898 228.944 183.589 C 244.150 166.281 248.101 141.794 239.113 120.581 C 230.124 99.367 209.782 85.174 186.770 84.060 ZM 184.000 180.000 C 174.777 180.014 165.903 176.476 159.220 170.120 C 155.423 166.544 149.750 165.830 145.186 168.354 C 140.621 170.879 138.210 176.063 139.220 181.180 L 145.360 212.000 L 110.640 212.000 L 116.800 181.180 C 117.810 176.063 115.399 170.879 110.834 168.354 C 106.270 165.830 100.597 166.544 96.800 170.120 C 83.945 182.324 64.120 183.356 50.069 172.551 C 36.017 161.746 31.922 142.321 40.415 126.763 C 48.908 111.205 67.462 104.144 84.150 110.120 C 89.032 111.869 94.485 110.284 97.669 106.190 C 100.852 102.097 101.047 96.421 98.150 92.120 C 94.124 86.184 91.981 79.172 92.000 72.000 C 92.000 56.566 101.839 42.849 116.459 37.901 C 131.078 32.953 147.225 37.874 156.599 50.136 C 165.974 62.397 166.489 79.270 157.880 92.080 C 154.983 96.381 155.178 102.057 158.361 106.150 C 161.545 110.244 166.998 111.829 171.880 110.080 C 185.382 105.280 200.446 108.945 210.234 119.411 C 220.022 129.878 222.670 145.154 216.976 158.304 C 211.282 171.455 198.330 179.976 184.000 180.000 Z"),
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
        return _club!!
    }

private var _club: ImageVector? = null
