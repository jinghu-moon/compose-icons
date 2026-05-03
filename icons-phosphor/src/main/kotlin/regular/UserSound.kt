package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorRegularIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 165.680 C 169.766 149.632 181.775 118.450 173.430 89.265 C 165.084 60.079 138.405 39.960 108.050 39.960 C 77.695 39.960 51.016 60.079 42.670 89.265 C 34.325 118.450 46.334 149.632 72.100 165.680 C 51.450 172.440 32.870 185.070 17.930 202.850 C 15.086 206.233 15.522 211.281 18.905 214.125 C 22.288 216.969 27.336 216.533 30.180 213.150 C 50.250 189.190 77.910 176.000 108.000 176.000 C 138.090 176.000 165.750 189.190 185.880 213.150 C 188.724 216.533 193.772 216.969 197.155 214.125 C 200.538 211.281 200.974 206.233 198.130 202.850 C 183.180 185.070 164.600 172.440 144.000 165.680 ZM 56.000 108.000 C 56.000 79.281 79.281 56.000 108.000 56.000 C 136.719 56.000 160.000 79.281 160.000 108.000 C 160.000 136.719 136.719 160.000 108.000 160.000 C 79.295 159.967 56.033 136.705 56.000 108.000 ZM 207.360 65.600 C 218.880 92.693 218.880 123.307 207.360 150.400 C 206.102 153.348 203.205 155.261 200.000 155.260 C 197.310 155.262 194.799 153.912 193.317 151.667 C 191.835 149.422 191.581 146.583 192.640 144.110 C 202.454 121.037 202.454 94.963 192.640 71.890 C 190.903 67.825 192.790 63.122 196.855 61.385 C 200.920 59.648 205.623 61.535 207.360 65.600 ZM 248.000 108.000 C 248.038 126.961 244.195 145.729 236.710 163.150 C 234.890 167.075 230.278 168.842 226.301 167.138 C 222.324 165.433 220.423 160.875 222.010 156.850 C 235.330 125.645 235.330 90.355 222.010 59.150 C 220.784 56.506 221.093 53.405 222.815 51.055 C 224.538 48.705 227.403 47.477 230.293 47.850 C 233.183 48.224 235.641 50.139 236.710 52.850 C 244.195 70.271 248.038 89.039 248.000 108.000 Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
