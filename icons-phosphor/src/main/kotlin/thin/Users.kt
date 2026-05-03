package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorThinIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 107.190 159.000 C 131.180 148.086 144.313 121.921 138.729 96.163 C 133.145 70.405 110.356 52.027 84.000 52.027 C 57.644 52.027 34.855 70.405 29.271 96.163 C 23.687 121.921 36.820 148.086 60.810 159.000 C 38.619 164.752 19.382 178.595 6.880 197.810 C 6.075 199.007 5.976 200.545 6.623 201.835 C 7.269 203.125 8.560 203.967 10.000 204.038 C 11.441 204.110 12.809 203.400 13.580 202.180 C 29.077 178.350 55.574 163.973 84.000 163.973 C 112.426 163.973 138.923 178.350 154.420 202.180 C 155.191 203.400 156.559 204.110 157.999 204.038 C 159.440 203.967 160.731 203.125 161.377 201.835 C 162.024 200.545 161.925 199.007 161.120 197.810 C 148.618 178.595 129.381 164.752 107.190 159.000 ZM 36.000 108.000 C 36.000 81.490 57.490 60.000 84.000 60.000 C 110.510 60.000 132.000 81.490 132.000 108.000 C 132.000 134.510 110.510 156.000 84.000 156.000 C 57.502 155.972 36.028 134.498 36.000 108.000 ZM 248.000 203.350 C 246.150 204.552 243.675 204.029 242.470 202.180 C 226.982 178.318 200.447 163.942 172.000 164.000 C 169.791 164.000 168.000 162.209 168.000 160.000 C 168.000 157.791 169.791 156.000 172.000 156.000 C 191.336 155.989 208.777 144.378 216.247 126.544 C 223.717 108.709 219.757 88.134 206.200 74.347 C 192.644 60.559 172.138 56.252 154.180 63.420 C 152.128 64.248 149.793 63.257 148.965 61.205 C 148.137 59.153 149.128 56.818 151.180 55.990 C 179.623 43.840 212.530 57.047 224.680 85.490 C 236.830 113.933 223.623 146.840 195.180 158.990 C 217.379 164.754 236.617 178.617 249.110 197.850 C 250.303 199.679 249.809 202.127 248.000 203.350 Z"),
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
        return _users!!
    }

private var _users: ImageVector? = null
