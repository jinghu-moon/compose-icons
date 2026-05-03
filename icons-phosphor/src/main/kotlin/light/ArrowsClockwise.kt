package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorLightIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 48.000 L 222.000 96.000 C 222.000 99.314 219.314 102.000 216.000 102.000 L 168.000 102.000 C 164.686 102.000 162.000 99.314 162.000 96.000 C 162.000 92.686 164.686 90.000 168.000 90.000 L 201.520 90.000 L 183.470 72.000 C 168.231 56.694 147.539 48.062 125.940 48.000 L 125.480 48.000 C 104.067 47.932 83.487 56.295 68.190 71.280 C 66.674 72.862 64.416 73.492 62.300 72.924 C 60.184 72.355 58.546 70.678 58.028 68.549 C 57.509 66.420 58.192 64.178 59.810 62.700 C 77.330 45.492 100.923 35.878 125.480 35.940 L 126.000 35.940 C 150.780 36.003 174.520 45.906 192.000 63.470 L 210.000 81.470 L 210.000 48.000 C 210.000 44.686 212.686 42.000 216.000 42.000 C 219.314 42.000 222.000 44.686 222.000 48.000 ZM 187.810 184.720 C 172.523 199.727 151.942 208.112 130.520 208.060 L 130.060 208.060 C 108.461 207.998 87.769 199.366 72.530 184.060 L 54.480 166.000 L 88.000 166.000 C 91.314 166.000 94.000 163.314 94.000 160.000 C 94.000 156.686 91.314 154.000 88.000 154.000 L 40.000 154.000 C 36.686 154.000 34.000 156.686 34.000 160.000 L 34.000 208.000 C 34.000 211.314 36.686 214.000 40.000 214.000 C 43.314 214.000 46.000 211.314 46.000 208.000 L 46.000 174.480 L 64.000 192.530 C 81.480 210.094 105.220 219.997 130.000 220.060 L 130.520 220.060 C 155.077 220.122 178.670 210.508 196.190 193.300 C 197.808 191.822 198.491 189.580 197.972 187.451 C 197.454 185.322 195.816 183.645 193.700 183.076 C 191.584 182.508 189.326 183.138 187.810 184.720 Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
