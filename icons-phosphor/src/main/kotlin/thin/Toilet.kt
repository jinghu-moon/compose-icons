package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorThinIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.000 64.000 C 116.000 66.209 114.209 68.000 112.000 68.000 L 96.000 68.000 C 93.791 68.000 92.000 66.209 92.000 64.000 C 92.000 61.791 93.791 60.000 96.000 60.000 L 112.000 60.000 C 114.209 60.000 116.000 61.791 116.000 64.000 ZM 168.000 194.860 L 171.920 222.300 C 172.414 225.751 171.382 229.247 169.094 231.877 C 166.806 234.507 163.486 236.012 160.000 236.000 L 96.000 236.000 C 92.521 236.000 89.212 234.490 86.933 231.862 C 84.653 229.233 83.627 225.744 84.120 222.300 L 88.000 194.860 C 56.220 179.487 36.022 147.303 36.000 112.000 C 36.000 109.791 37.791 108.000 40.000 108.000 L 60.000 108.000 L 60.000 40.000 C 60.000 33.373 65.373 28.000 72.000 28.000 L 184.000 28.000 C 190.627 28.000 196.000 33.373 196.000 40.000 L 196.000 108.000 L 216.000 108.000 C 218.209 108.000 220.000 109.791 220.000 112.000 C 219.978 147.303 199.780 179.487 168.000 194.860 ZM 68.000 108.000 L 188.000 108.000 L 188.000 40.000 C 188.000 37.791 186.209 36.000 184.000 36.000 L 72.000 36.000 C 69.791 36.000 68.000 37.791 68.000 40.000 ZM 160.340 198.130 C 139.491 205.959 116.509 205.959 95.660 198.130 L 92.000 223.430 C 91.836 224.579 92.179 225.743 92.940 226.620 C 93.702 227.514 94.825 228.021 96.000 228.000 L 160.000 228.000 C 161.154 228.003 162.251 227.498 163.000 226.620 C 163.761 225.743 164.104 224.579 163.940 223.430 ZM 211.910 116.000 L 44.090 116.000 C 46.167 160.832 83.120 196.113 128.000 196.113 C 172.880 196.113 209.833 160.832 211.910 116.000 Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
