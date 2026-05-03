package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorFillIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.130 202.850 C 200.134 205.232 200.574 208.559 199.259 211.380 C 197.944 214.201 195.112 216.003 192.000 216.000 L 24.000 216.000 C 20.889 215.999 18.061 214.196 16.749 211.376 C 15.436 208.555 15.878 205.230 17.880 202.850 C 32.820 185.070 51.400 172.440 72.050 165.680 C 46.284 149.632 34.275 118.450 42.620 89.265 C 50.966 60.079 77.645 39.960 108.000 39.960 C 138.355 39.960 165.034 60.079 173.380 89.265 C 181.725 118.450 169.716 149.632 143.950 165.680 C 164.600 172.440 183.180 185.070 198.130 202.850 ZM 196.860 61.390 C 194.908 62.222 193.366 63.796 192.575 65.766 C 191.783 67.735 191.807 69.938 192.640 71.890 C 202.454 94.963 202.454 121.037 192.640 144.110 C 190.903 148.175 192.790 152.878 196.855 154.615 C 200.920 156.352 205.623 154.465 207.360 150.400 C 218.880 123.307 218.880 92.693 207.360 65.600 C 205.623 61.538 200.922 59.654 196.860 61.390 ZM 236.710 52.850 C 235.641 50.139 233.183 48.224 230.293 47.850 C 227.403 47.477 224.538 48.705 222.815 51.055 C 221.093 53.405 220.784 56.506 222.010 59.150 C 235.330 90.355 235.330 125.645 222.010 156.850 C 220.784 159.494 221.093 162.595 222.815 164.945 C 224.538 167.295 227.403 168.523 230.293 168.150 C 233.183 167.776 235.641 165.861 236.710 163.150 C 251.764 127.924 251.764 88.076 236.710 52.850 Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
