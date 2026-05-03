package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorThinIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 140.000 C 245.791 140.000 244.000 141.791 244.000 144.000 L 244.000 164.000 L 195.310 164.000 C 194.252 163.998 193.238 163.578 192.490 162.830 L 171.310 141.660 L 224.490 88.490 C 226.749 86.238 228.019 83.180 228.019 79.990 C 228.019 76.800 226.749 73.742 224.490 71.490 L 168.490 15.490 C 166.238 13.231 163.180 11.961 159.990 11.961 C 156.800 11.961 153.742 13.231 151.490 15.490 L 5.760 161.760 C 4.046 163.476 3.534 166.055 4.462 168.295 C 5.389 170.536 7.575 171.998 10.000 172.000 L 51.000 172.000 L 87.480 208.490 C 89.732 210.749 92.790 212.019 95.980 212.019 C 99.170 212.019 102.228 210.749 104.480 208.490 L 165.660 147.310 L 186.830 168.480 C 189.072 170.740 192.126 172.008 195.310 172.000 L 244.000 172.000 L 244.000 192.000 C 244.000 194.209 245.791 196.000 248.000 196.000 C 250.209 196.000 252.000 194.209 252.000 192.000 L 252.000 144.000 C 252.000 141.791 250.209 140.000 248.000 140.000 ZM 157.170 21.170 C 158.754 19.659 161.246 19.659 162.830 21.170 L 178.340 36.690 L 51.000 164.000 L 14.820 164.000 ZM 98.830 202.830 C 97.246 204.341 94.754 204.341 93.170 202.830 L 58.340 168.000 L 184.000 42.340 L 218.830 77.170 C 219.581 77.920 220.003 78.938 220.003 80.000 C 220.003 81.062 219.581 82.080 218.830 82.830 Z"),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
