package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorLightIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.810 59.720 C 218.340 57.274 212.893 57.450 208.590 60.180 L 126.000 112.790 L 126.000 71.840 C 125.996 66.790 123.240 62.144 118.810 59.720 C 114.340 57.274 108.893 57.450 104.590 60.180 L 16.410 116.350 C 12.418 118.878 9.998 123.275 9.998 128.000 C 9.998 132.725 12.418 137.122 16.410 139.650 L 104.590 195.820 C 108.893 198.550 114.340 198.726 118.810 196.280 C 123.240 193.856 125.996 189.210 126.000 184.160 L 126.000 143.210 L 208.590 195.820 C 212.893 198.550 218.340 198.726 222.810 196.280 C 227.240 193.856 229.996 189.210 230.000 184.160 L 230.000 71.840 C 229.996 66.790 227.240 62.144 222.810 59.720 ZM 114.000 184.160 C 114.008 184.841 113.617 185.463 113.000 185.750 C 112.376 186.111 111.601 186.088 111.000 185.690 L 22.850 129.530 C 22.320 129.202 21.998 128.623 21.998 128.000 C 21.998 127.377 22.320 126.798 22.850 126.470 L 111.000 70.310 C 111.296 70.110 111.643 69.999 112.000 69.990 C 112.350 69.988 112.695 70.077 113.000 70.250 C 113.617 70.537 114.008 71.159 114.000 71.840 ZM 218.000 184.160 C 218.008 184.841 217.617 185.463 217.000 185.750 C 216.376 186.111 215.601 186.088 215.000 185.690 L 126.810 129.530 C 126.280 129.202 125.958 128.623 125.958 128.000 C 125.958 127.377 126.280 126.798 126.810 126.470 L 215.000 70.310 C 215.296 70.110 215.643 69.999 216.000 69.990 C 216.350 69.988 216.695 70.077 217.000 70.250 C 217.617 70.537 218.008 71.159 218.000 71.840 Z"),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
