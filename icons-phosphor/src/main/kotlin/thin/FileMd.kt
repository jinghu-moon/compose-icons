package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileMd: ImageVector
    get() {
        if (_fileMd != null) return _fileMd!!
        _fileMd = phosphorThinIcon(
            name = "FileMd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 85.170 L 154.830 29.170 C 154.079 28.420 153.061 27.999 152.000 28.000 L 56.000 28.000 C 49.373 28.000 44.000 33.373 44.000 40.000 L 44.000 112.000 C 44.000 114.209 45.791 116.000 48.000 116.000 C 50.209 116.000 52.000 114.209 52.000 112.000 L 52.000 40.000 C 52.000 37.791 53.791 36.000 56.000 36.000 L 148.000 36.000 L 148.000 88.000 C 148.000 90.209 149.791 92.000 152.000 92.000 L 204.000 92.000 L 204.000 224.000 C 204.000 226.209 205.791 228.000 208.000 228.000 C 210.209 228.000 212.000 226.209 212.000 224.000 L 212.000 88.000 C 212.001 86.939 211.580 85.921 210.830 85.170 ZM 156.000 41.650 L 198.340 84.000 L 156.000 84.000 ZM 144.000 148.000 L 128.000 148.000 C 125.791 148.000 124.000 149.791 124.000 152.000 L 124.000 208.000 C 124.000 210.209 125.791 212.000 128.000 212.000 L 144.000 212.000 C 161.673 212.000 176.000 197.673 176.000 180.000 C 176.000 162.327 161.673 148.000 144.000 148.000 ZM 144.000 204.000 L 132.000 204.000 L 132.000 156.000 L 144.000 156.000 C 157.255 156.000 168.000 166.745 168.000 180.000 C 168.000 193.255 157.255 204.000 144.000 204.000 ZM 100.000 152.000 L 100.000 208.000 C 100.000 210.209 98.209 212.000 96.000 212.000 C 93.791 212.000 92.000 210.209 92.000 208.000 L 92.000 164.690 L 71.280 194.290 C 70.532 195.362 69.307 196.001 68.000 196.001 C 66.693 196.001 65.468 195.362 64.720 194.290 L 44.000 164.690 L 44.000 208.000 C 44.000 210.209 42.209 212.000 40.000 212.000 C 37.791 212.000 36.000 210.209 36.000 208.000 L 36.000 152.000 C 36.000 150.253 37.133 148.708 38.800 148.184 C 40.466 147.660 42.280 148.277 43.280 149.710 L 68.000 185.000 L 92.720 149.690 C 93.722 148.254 95.541 147.637 97.210 148.167 C 98.879 148.696 100.009 150.249 100.000 152.000 Z"),
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
        return _fileMd!!
    }

private var _fileMd: ImageVector? = null
