package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorLightIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 88.000 102.000 L 40.000 102.000 C 36.686 102.000 34.000 99.314 34.000 96.000 L 34.000 48.000 C 34.000 44.686 36.686 42.000 40.000 42.000 C 43.314 42.000 46.000 44.686 46.000 48.000 L 46.000 81.520 L 64.000 63.520 C 81.480 45.956 105.220 36.053 130.000 35.990 L 130.520 35.990 C 155.070 35.916 178.662 45.511 196.190 62.700 C 198.429 65.037 198.411 68.728 196.150 71.043 C 193.889 73.358 190.199 73.463 187.810 71.280 C 155.670 39.910 104.275 40.231 72.530 72.000 L 54.480 90.000 L 88.000 90.000 C 91.314 90.000 94.000 92.686 94.000 96.000 C 94.000 99.314 91.314 102.000 88.000 102.000 ZM 216.000 154.000 L 168.000 154.000 C 164.686 154.000 162.000 156.686 162.000 160.000 C 162.000 163.314 164.686 166.000 168.000 166.000 L 201.520 166.000 L 183.470 184.000 C 168.231 199.306 147.539 207.938 125.940 208.000 L 125.480 208.000 C 104.058 208.052 83.477 199.667 68.190 184.660 C 65.801 182.477 62.111 182.582 59.850 184.897 C 57.589 187.212 57.571 190.903 59.810 193.240 C 77.330 210.447 100.923 220.061 125.480 220.000 L 126.000 220.000 C 150.780 219.937 174.520 210.034 192.000 192.470 L 210.000 174.420 L 210.000 208.000 C 210.000 211.314 212.686 214.000 216.000 214.000 C 219.314 214.000 222.000 211.314 222.000 208.000 L 222.000 160.000 C 222.000 156.686 219.314 154.000 216.000 154.000 Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
