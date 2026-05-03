package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightbulbFilament: ImageVector
    get() {
        if (_lightbulbFilament != null) return _lightbulbFilament!!
        _lightbulbFilament = phosphorThinIcon(
            name = "LightbulbFilament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 232.000 C 172.000 234.209 170.209 236.000 168.000 236.000 L 88.000 236.000 C 85.791 236.000 84.000 234.209 84.000 232.000 C 84.000 229.791 85.791 228.000 88.000 228.000 L 168.000 228.000 C 170.209 228.000 172.000 229.791 172.000 232.000 ZM 212.000 104.000 C 212.063 129.795 200.213 154.174 179.890 170.060 C 174.936 173.867 172.023 179.752 172.000 186.000 L 172.000 192.000 C 172.000 198.627 166.627 204.000 160.000 204.000 L 96.000 204.000 C 89.373 204.000 84.000 198.627 84.000 192.000 L 84.000 186.000 C 83.998 179.813 81.133 173.976 76.240 170.190 C 55.961 154.405 44.072 130.168 44.000 104.470 C 43.750 59.000 80.520 21.090 126.000 20.000 C 148.623 19.461 170.506 28.073 186.694 43.885 C 202.882 59.696 212.006 81.371 212.000 104.000 ZM 204.000 104.000 C 204.006 83.521 195.747 63.906 181.094 49.599 C 166.440 35.292 146.633 27.504 126.160 28.000 C 85.000 29.000 51.770 63.270 52.000 104.430 C 52.075 127.670 62.831 149.585 81.170 163.860 C 88.009 169.169 92.007 177.343 92.000 186.000 L 92.000 192.000 C 92.000 194.209 93.791 196.000 96.000 196.000 L 124.000 196.000 L 124.000 145.660 L 93.170 114.830 C 91.607 113.267 91.607 110.733 93.170 109.170 C 94.733 107.607 97.267 107.607 98.830 109.170 L 128.000 138.340 L 157.170 109.170 C 158.733 107.607 161.267 107.607 162.830 109.170 C 164.393 110.733 164.393 113.267 162.830 114.830 L 132.000 145.660 L 132.000 196.000 L 160.000 196.000 C 162.209 196.000 164.000 194.209 164.000 192.000 L 164.000 186.000 C 164.022 177.307 168.060 169.113 174.940 163.800 C 193.340 149.423 204.066 127.351 204.000 104.000 Z"),
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
        return _lightbulbFilament!!
    }

private var _lightbulbFilament: ImageVector? = null
