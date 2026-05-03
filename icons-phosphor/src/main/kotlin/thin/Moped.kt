package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorThinIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 132.000 C 213.026 131.998 210.063 132.367 207.180 133.100 L 171.750 38.600 C 171.165 37.035 169.670 35.999 168.000 36.000 L 136.000 36.000 C 133.791 36.000 132.000 37.791 132.000 40.000 C 132.000 42.209 133.791 44.000 136.000 44.000 L 165.230 44.000 L 199.700 135.920 C 188.906 141.416 181.592 151.964 180.230 164.000 L 133.770 164.000 L 107.770 94.600 C 107.183 93.029 105.678 91.990 104.000 92.000 L 24.000 92.000 C 21.791 92.000 20.000 93.791 20.000 96.000 C 20.000 98.209 21.791 100.000 24.000 100.000 L 36.000 100.000 L 36.000 120.000 C 16.640 128.096 4.027 147.016 4.000 168.000 C 4.000 170.209 5.791 172.000 8.000 172.000 L 20.230 172.000 C 22.296 190.193 37.690 203.937 56.000 203.937 C 74.310 203.937 89.704 190.193 91.770 172.000 L 180.230 172.000 C 182.381 191.243 199.369 205.338 218.679 203.901 C 237.989 202.463 252.703 186.009 251.982 166.659 C 251.261 147.310 235.363 131.996 216.000 132.000 ZM 41.330 126.500 C 42.929 125.936 43.999 124.426 44.000 122.730 L 44.000 100.000 L 101.230 100.000 L 125.230 164.000 L 12.230 164.000 C 13.802 146.901 25.156 132.269 41.330 126.500 ZM 56.000 196.000 C 42.082 195.999 30.278 185.775 28.290 172.000 L 83.710 172.000 C 81.722 185.775 69.918 195.999 56.000 196.000 ZM 216.000 196.000 C 203.219 195.994 192.064 187.334 188.890 174.954 C 185.716 162.573 191.328 149.614 202.530 143.460 L 212.250 169.400 C 213.023 171.471 215.329 172.523 217.400 171.750 C 219.471 170.977 220.523 168.671 219.750 166.600 L 210.000 140.650 C 220.478 138.352 231.347 142.242 237.988 150.666 C 244.628 159.090 245.872 170.568 241.191 180.219 C 236.510 189.870 226.727 195.999 216.000 196.000 Z"),
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
        return _moped!!
    }

private var _moped: ImageVector? = null
