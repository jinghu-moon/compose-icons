package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) return _lightbulb!!
        _lightbulb = phosphorThinIcon(
            name = "Lightbulb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 232.000 C 172.000 234.209 170.209 236.000 168.000 236.000 L 88.000 236.000 C 85.791 236.000 84.000 234.209 84.000 232.000 C 84.000 229.791 85.791 228.000 88.000 228.000 L 168.000 228.000 C 170.209 228.000 172.000 229.791 172.000 232.000 ZM 212.000 104.000 C 212.063 129.795 200.213 154.174 179.890 170.060 C 174.936 173.867 172.023 179.752 172.000 186.000 L 172.000 192.000 C 172.000 198.627 166.627 204.000 160.000 204.000 L 96.000 204.000 C 89.373 204.000 84.000 198.627 84.000 192.000 L 84.000 186.000 C 83.998 179.813 81.133 173.976 76.240 170.190 C 55.961 154.405 44.072 130.168 44.000 104.470 C 43.750 59.000 80.520 21.090 126.000 20.000 C 148.623 19.461 170.506 28.073 186.694 43.885 C 202.882 59.696 212.006 81.371 212.000 104.000 ZM 204.000 104.000 C 204.006 83.522 195.748 63.909 181.097 49.602 C 166.446 35.296 146.642 27.507 126.170 28.000 C 85.000 29.000 51.770 63.270 52.000 104.430 C 52.075 127.670 62.831 149.585 81.170 163.860 C 88.009 169.169 92.007 177.343 92.000 186.000 L 92.000 192.000 C 92.000 194.209 93.791 196.000 96.000 196.000 L 160.000 196.000 C 162.209 196.000 164.000 194.209 164.000 192.000 L 164.000 186.000 C 164.022 177.307 168.060 169.113 174.940 163.800 C 193.340 149.423 204.066 127.351 204.000 104.000 ZM 136.660 52.060 C 134.544 51.815 132.606 53.271 132.254 55.373 C 131.902 57.474 133.259 59.482 135.340 59.940 C 153.530 63.000 169.000 78.450 172.060 96.670 C 172.387 98.592 174.051 99.998 176.000 100.000 C 176.225 99.999 176.449 99.979 176.670 99.940 C 178.845 99.568 180.308 97.506 179.940 95.330 C 175.999 73.266 158.725 55.996 136.660 52.060 Z"),
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
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
