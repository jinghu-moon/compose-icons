package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorLightIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.000 80.000 L 134.000 124.600 L 171.090 146.850 C 173.934 148.557 174.857 152.246 173.150 155.090 C 171.443 157.934 167.754 158.857 164.910 157.150 L 124.910 133.150 C 123.102 132.064 121.998 130.109 122.000 128.000 L 122.000 80.000 C 122.000 76.686 124.686 74.000 128.000 74.000 C 131.314 74.000 134.000 76.686 134.000 80.000 ZM 224.000 58.000 C 220.686 58.000 218.000 60.686 218.000 64.000 L 218.000 87.360 C 210.520 78.530 203.060 70.230 194.470 61.530 C 158.011 25.071 98.987 24.786 62.178 60.892 C 25.368 96.998 24.515 156.016 60.265 193.172 C 96.014 230.327 155.022 231.750 192.520 196.360 C 194.845 194.068 194.911 190.339 192.669 187.966 C 190.427 185.593 186.699 185.448 184.280 187.640 C 151.561 218.497 100.092 217.242 68.917 184.826 C 37.741 152.410 38.494 100.931 70.604 69.440 C 102.714 37.950 154.197 38.199 186.000 70.000 C 195.240 79.360 203.180 88.300 211.310 98.000 L 184.000 98.000 C 180.686 98.000 178.000 100.686 178.000 104.000 C 178.000 107.314 180.686 110.000 184.000 110.000 L 224.000 110.000 C 227.314 110.000 230.000 107.314 230.000 104.000 L 230.000 64.000 C 230.000 60.686 227.314 58.000 224.000 58.000 Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
