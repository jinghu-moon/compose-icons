package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorThinIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 40.000 132.000 L 96.000 132.000 C 98.209 132.000 100.000 130.209 100.000 128.000 C 100.000 125.791 98.209 124.000 96.000 124.000 L 40.000 124.000 C 37.791 124.000 36.000 125.791 36.000 128.000 C 36.000 130.209 37.791 132.000 40.000 132.000 ZM 112.000 188.000 L 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 C 36.000 194.209 37.791 196.000 40.000 196.000 L 112.000 196.000 C 114.209 196.000 116.000 194.209 116.000 192.000 C 116.000 189.791 114.209 188.000 112.000 188.000 ZM 234.550 140.700 L 210.090 160.890 L 217.550 191.000 C 217.938 192.563 217.351 194.207 216.060 195.170 C 215.364 195.682 214.524 195.959 213.660 195.960 C 212.957 195.956 212.267 195.766 211.660 195.410 L 184.000 179.180 L 156.360 195.450 C 154.972 196.266 153.231 196.170 151.940 195.208 C 150.650 194.245 150.063 192.603 150.450 191.040 L 157.910 160.890 L 133.450 140.700 C 132.187 139.663 131.682 137.961 132.175 136.402 C 132.668 134.844 134.060 133.742 135.690 133.620 L 167.930 131.130 L 180.330 102.420 C 180.964 100.957 182.406 100.011 184.000 100.011 C 185.594 100.011 187.036 100.957 187.670 102.420 L 200.070 131.130 L 232.310 133.620 C 233.940 133.742 235.332 134.844 235.825 136.402 C 236.318 137.961 235.813 139.663 234.550 140.700 ZM 221.810 140.840 L 197.000 138.920 C 195.522 138.805 194.229 137.881 193.640 136.520 L 184.000 114.100 L 174.320 136.520 C 173.731 137.881 172.438 138.805 170.960 138.920 L 146.190 140.840 L 165.000 156.330 C 166.167 157.303 166.682 158.852 166.330 160.330 L 160.550 183.690 L 182.000 171.090 C 183.253 170.352 184.807 170.352 186.060 171.090 L 207.530 183.730 L 201.750 160.370 C 201.398 158.892 201.913 157.343 203.080 156.370 Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
