package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorThinIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 84.000 152.000 L 84.000 200.000 C 84.000 202.209 82.209 204.000 80.000 204.000 C 77.791 204.000 76.000 202.209 76.000 200.000 L 76.000 152.000 C 76.000 149.791 77.791 148.000 80.000 148.000 C 82.209 148.000 84.000 149.791 84.000 152.000 ZM 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 C 42.209 204.000 44.000 202.209 44.000 200.000 L 44.000 192.000 C 44.000 189.791 42.209 188.000 40.000 188.000 ZM 211.000 213.310 L 51.000 37.310 C 49.514 35.653 46.967 35.514 45.310 37.000 C 43.653 38.486 43.514 41.033 45.000 42.690 L 116.000 120.750 L 116.000 200.000 C 116.000 202.209 117.791 204.000 120.000 204.000 C 122.209 204.000 124.000 202.209 124.000 200.000 L 124.000 129.550 L 156.000 164.750 L 156.000 200.000 C 156.000 202.209 157.791 204.000 160.000 204.000 C 162.209 204.000 164.000 202.209 164.000 200.000 L 164.000 173.550 L 205.000 218.690 C 205.956 219.768 207.417 220.248 208.826 219.948 C 210.235 219.647 211.374 218.613 211.807 217.239 C 212.240 215.865 211.902 214.364 210.920 213.310 ZM 160.000 119.630 C 162.209 119.630 164.000 117.839 164.000 115.630 L 164.000 72.000 C 164.000 69.791 162.209 68.000 160.000 68.000 C 157.791 68.000 156.000 69.791 156.000 72.000 L 156.000 115.630 C 156.000 117.839 157.791 119.630 160.000 119.630 ZM 200.000 163.630 C 202.209 163.630 204.000 161.839 204.000 159.630 L 204.000 32.000 C 204.000 29.791 202.209 28.000 200.000 28.000 C 197.791 28.000 196.000 29.791 196.000 32.000 L 196.000 159.630 C 196.000 161.839 197.791 163.630 200.000 163.630 Z"),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
