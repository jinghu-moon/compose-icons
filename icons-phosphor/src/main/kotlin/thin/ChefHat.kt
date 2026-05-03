package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChefHat: ImageVector
    get() {
        if (_chefHat != null) return _chefHat!!
        _chefHat = phosphorThinIcon(
            name = "ChefHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 112.000 C 235.967 83.295 212.705 60.033 184.000 60.000 C 181.399 60.006 178.802 60.203 176.230 60.590 C 168.300 40.915 149.213 28.029 128.000 28.029 C 106.787 28.029 87.700 40.915 79.770 60.590 C 77.198 60.203 74.601 60.006 72.000 60.000 C 47.213 60.000 25.871 77.496 21.010 101.802 C 16.149 126.108 29.119 150.466 52.000 160.000 L 52.000 208.000 C 52.000 214.627 57.373 220.000 64.000 220.000 L 192.000 220.000 C 198.627 220.000 204.000 214.627 204.000 208.000 L 204.000 160.000 C 223.365 151.911 235.981 132.987 236.000 112.000 ZM 196.000 208.000 C 196.000 210.209 194.209 212.000 192.000 212.000 L 64.000 212.000 C 61.791 212.000 60.000 210.209 60.000 208.000 L 60.000 162.590 C 63.932 163.524 67.959 163.997 72.000 164.000 L 184.000 164.000 C 188.041 163.997 192.068 163.524 196.000 162.590 ZM 184.000 156.000 L 165.120 156.000 L 171.880 129.000 C 172.373 126.874 171.071 124.745 168.954 124.216 C 166.836 123.687 164.686 124.952 164.120 127.060 L 156.880 156.060 L 132.000 156.060 L 132.000 128.000 C 132.000 125.791 130.209 124.000 128.000 124.000 C 125.791 124.000 124.000 125.791 124.000 128.000 L 124.000 156.000 L 99.120 156.000 L 91.880 127.000 C 91.328 124.857 89.143 123.568 87.000 124.120 C 84.857 124.672 83.568 126.857 84.120 129.000 L 90.880 156.000 L 72.000 156.000 C 47.699 156.000 28.000 136.301 28.000 112.000 C 28.000 87.699 47.699 68.000 72.000 68.000 C 73.785 68.005 75.568 68.115 77.340 68.330 C 76.451 72.156 76.002 76.072 76.000 80.000 C 76.000 82.209 77.791 84.000 80.000 84.000 C 82.209 84.000 84.000 82.209 84.000 80.000 C 84.000 55.699 103.699 36.000 128.000 36.000 C 152.301 36.000 172.000 55.699 172.000 80.000 C 172.000 82.209 173.791 84.000 176.000 84.000 C 178.209 84.000 180.000 82.209 180.000 80.000 C 179.998 76.072 179.549 72.156 178.660 68.330 C 180.432 68.115 182.215 68.005 184.000 68.000 C 208.301 68.000 228.000 87.699 228.000 112.000 C 228.000 136.301 208.301 156.000 184.000 156.000 Z"),
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
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
