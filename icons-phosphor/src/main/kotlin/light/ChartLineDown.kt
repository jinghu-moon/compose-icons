package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChartLineDown: ImageVector
    get() {
        if (_chartLineDown != null) return _chartLineDown!!
        _chartLineDown = phosphorLightIcon(
            name = "ChartLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 32.000 214.000 C 28.686 214.000 26.000 211.314 26.000 208.000 L 26.000 48.000 C 26.000 44.686 28.686 42.000 32.000 42.000 C 35.314 42.000 38.000 44.686 38.000 48.000 L 38.000 61.520 L 96.000 119.520 L 123.760 91.770 C 126.103 89.430 129.897 89.430 132.240 91.770 L 194.000 153.520 L 194.000 128.000 C 194.000 124.686 196.686 122.000 200.000 122.000 C 203.314 122.000 206.000 124.686 206.000 128.000 L 206.000 168.000 C 206.000 168.369 205.963 168.738 205.890 169.100 L 205.890 169.160 C 205.813 169.517 205.709 169.868 205.580 170.210 L 205.580 170.280 C 205.438 170.629 205.264 170.963 205.060 171.280 L 205.060 171.340 C 204.613 172.002 204.042 172.573 203.380 173.020 L 203.320 173.020 C 203.003 173.224 202.669 173.398 202.320 173.540 L 202.250 173.540 C 201.908 173.669 201.557 173.773 201.200 173.850 L 201.140 173.850 C 200.778 173.923 200.409 173.960 200.040 173.960 L 160.000 173.960 C 156.686 173.960 154.000 171.274 154.000 167.960 C 154.000 164.646 156.686 161.960 160.000 161.960 L 185.520 161.960 L 128.000 104.490 L 100.240 132.240 C 97.897 134.580 94.103 134.580 91.760 132.240 L 38.000 78.480 L 38.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 Z"),
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
        return _chartLineDown!!
    }

private var _chartLineDown: ImageVector? = null
