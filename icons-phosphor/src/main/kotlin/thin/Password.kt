package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorThinIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 44.000 56.000 L 44.000 200.000 C 44.000 202.209 42.209 204.000 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 C 42.209 52.000 44.000 53.791 44.000 56.000 ZM 141.200 114.310 L 116.000 122.490 L 116.000 96.000 C 116.000 93.791 114.209 92.000 112.000 92.000 C 109.791 92.000 108.000 93.791 108.000 96.000 L 108.000 122.490 L 82.800 114.310 C 80.699 113.628 78.442 114.779 77.760 116.880 C 77.078 118.981 78.229 121.238 80.330 121.920 L 105.530 130.100 L 90.000 151.540 C 89.112 152.693 88.921 154.238 89.501 155.573 C 90.081 156.908 91.340 157.823 92.789 157.961 C 94.238 158.100 95.648 157.441 96.470 156.240 L 112.000 134.810 L 127.570 156.240 C 128.323 157.277 129.528 157.891 130.810 157.890 C 132.313 157.887 133.687 157.043 134.368 155.704 C 135.050 154.364 134.923 152.756 134.040 151.540 L 118.470 130.100 L 143.670 121.920 C 145.771 121.238 146.922 118.981 146.240 116.880 C 145.558 114.779 143.301 113.628 141.200 114.310 ZM 242.200 116.880 C 241.518 114.799 239.289 113.654 237.200 114.310 L 212.000 122.490 L 212.000 96.000 C 212.000 93.791 210.209 92.000 208.000 92.000 C 205.791 92.000 204.000 93.791 204.000 96.000 L 204.000 122.490 L 178.800 114.310 C 176.699 113.628 174.442 114.779 173.760 116.880 C 173.078 118.981 174.229 121.238 176.330 121.920 L 201.530 130.100 L 186.000 151.540 C 185.112 152.693 184.921 154.238 185.501 155.573 C 186.081 156.908 187.340 157.823 188.789 157.961 C 190.238 158.100 191.648 157.441 192.470 156.240 L 208.000 134.810 L 223.570 156.240 C 224.323 157.277 225.528 157.891 226.810 157.890 C 228.313 157.887 229.687 157.043 230.368 155.704 C 231.050 154.364 230.923 152.756 230.040 151.540 L 214.470 130.100 L 239.670 121.920 C 240.679 121.593 241.517 120.878 241.999 119.932 C 242.481 118.987 242.568 117.889 242.240 116.880 Z"),
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
        return _password!!
    }

private var _password: ImageVector? = null
