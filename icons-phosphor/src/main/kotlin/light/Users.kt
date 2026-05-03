package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorLightIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 112.600 158.430 C 135.512 145.443 146.798 118.649 140.083 93.183 C 133.368 67.717 110.337 49.972 84.000 49.972 C 57.663 49.972 34.632 67.717 27.917 93.183 C 21.202 118.649 32.488 145.443 55.400 158.430 C 34.750 165.013 17.015 178.543 5.210 196.720 C 3.399 199.495 4.180 203.214 6.955 205.025 C 9.730 206.836 13.449 206.055 15.260 203.280 C 30.388 180.020 56.253 165.988 84.000 165.988 C 111.747 165.988 137.612 180.020 152.740 203.280 C 154.661 205.742 158.150 206.319 160.761 204.606 C 163.373 202.893 164.233 199.463 162.740 196.720 C 150.947 178.552 133.232 165.024 112.600 158.430 ZM 38.000 108.000 C 38.000 82.595 58.595 62.000 84.000 62.000 C 109.405 62.000 130.000 82.595 130.000 108.000 C 130.000 133.405 109.405 154.000 84.000 154.000 C 58.609 153.967 38.033 133.391 38.000 108.000 ZM 249.000 205.000 C 246.227 206.809 242.513 206.031 240.700 203.260 C 225.598 179.996 199.736 165.970 172.000 166.000 C 168.686 166.000 166.000 163.314 166.000 160.000 C 166.000 156.686 168.686 154.000 172.000 154.000 C 190.525 153.981 207.231 142.852 214.385 125.764 C 221.539 108.676 217.745 88.964 204.758 75.753 C 191.772 62.542 172.128 58.410 154.920 65.270 C 152.926 66.086 150.647 65.771 148.950 64.443 C 147.253 63.116 146.398 60.980 146.710 58.848 C 147.022 56.716 148.453 54.915 150.460 54.130 C 178.779 42.840 211.004 55.401 224.213 82.877 C 237.421 110.353 227.104 143.365 200.600 158.430 C 221.250 165.013 238.985 178.543 250.790 196.720 C 252.576 199.502 251.776 203.204 249.000 205.000 Z"),
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
