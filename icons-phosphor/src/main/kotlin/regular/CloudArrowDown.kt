package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorRegularIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 128.000 C 248.050 147.052 241.869 165.597 230.400 180.810 C 227.744 184.345 222.725 185.056 219.190 182.400 C 215.655 179.744 214.944 174.725 217.600 171.190 C 226.988 158.752 232.046 143.583 232.000 128.000 C 232.000 88.235 199.764 56.000 160.000 56.000 C 120.235 56.000 88.000 88.235 88.000 128.000 C 88.000 132.418 84.418 136.000 80.000 136.000 C 75.582 136.000 72.000 132.418 72.000 128.000 C 71.996 119.927 73.103 111.891 75.290 104.120 C 74.200 104.000 73.100 104.000 72.000 104.000 C 45.490 104.000 24.000 125.490 24.000 152.000 C 24.000 178.510 45.490 200.000 72.000 200.000 L 96.000 200.000 C 100.418 200.000 104.000 203.582 104.000 208.000 C 104.000 212.418 100.418 216.000 96.000 216.000 L 72.000 216.000 C 48.018 216.006 26.045 202.603 15.074 181.276 C 4.103 159.950 5.976 134.280 19.927 114.773 C 33.877 95.265 57.562 85.193 81.290 88.680 C 99.539 52.182 140.485 33.017 180.201 42.384 C 219.918 51.752 247.984 87.194 248.000 128.000 ZM 178.340 170.340 L 160.000 188.690 L 160.000 128.000 C 160.000 123.582 156.418 120.000 152.000 120.000 C 147.582 120.000 144.000 123.582 144.000 128.000 L 144.000 188.690 L 125.660 170.340 C 122.534 167.214 117.466 167.214 114.340 170.340 C 111.214 173.466 111.214 178.534 114.340 181.660 L 146.340 213.660 C 147.841 215.162 149.877 216.006 152.000 216.006 C 154.123 216.006 156.159 215.162 157.660 213.660 L 189.660 181.660 C 192.786 178.534 192.786 173.466 189.660 170.340 C 186.534 167.214 181.466 167.214 178.340 170.340 Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
