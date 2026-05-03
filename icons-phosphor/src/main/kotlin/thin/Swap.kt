package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorThinIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 220.000 48.000 L 220.000 152.000 C 220.000 158.627 214.627 164.000 208.000 164.000 L 89.660 164.000 L 106.830 181.170 C 108.393 182.733 108.393 185.267 106.830 186.830 C 105.267 188.393 102.733 188.393 101.170 186.830 L 77.170 162.830 C 76.419 162.080 75.997 161.062 75.997 160.000 C 75.997 158.938 76.419 157.920 77.170 157.170 L 101.170 133.170 C 102.733 131.607 105.267 131.607 106.830 133.170 C 108.393 134.733 108.393 137.267 106.830 138.830 L 89.660 156.000 L 208.000 156.000 C 210.209 156.000 212.000 154.209 212.000 152.000 L 212.000 48.000 C 212.000 45.791 210.209 44.000 208.000 44.000 L 96.000 44.000 C 93.791 44.000 92.000 45.791 92.000 48.000 L 92.000 56.000 C 92.000 58.209 90.209 60.000 88.000 60.000 C 85.791 60.000 84.000 58.209 84.000 56.000 L 84.000 48.000 C 84.000 41.373 89.373 36.000 96.000 36.000 L 208.000 36.000 C 214.627 36.000 220.000 41.373 220.000 48.000 ZM 168.000 196.000 C 165.791 196.000 164.000 197.791 164.000 200.000 L 164.000 208.000 C 164.000 210.209 162.209 212.000 160.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 104.000 C 44.000 101.791 45.791 100.000 48.000 100.000 L 166.340 100.000 L 149.170 117.170 C 147.607 118.733 147.607 121.267 149.170 122.830 C 150.733 124.393 153.267 124.393 154.830 122.830 L 178.830 98.830 C 179.581 98.080 180.003 97.062 180.003 96.000 C 180.003 94.938 179.581 93.920 178.830 93.170 L 154.830 69.170 C 153.267 67.607 150.733 67.607 149.170 69.170 C 147.607 70.733 147.607 73.267 149.170 74.830 L 166.340 92.000 L 48.000 92.000 C 41.373 92.000 36.000 97.373 36.000 104.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 160.000 220.000 C 166.627 220.000 172.000 214.627 172.000 208.000 L 172.000 200.000 C 172.000 197.791 170.209 196.000 168.000 196.000 Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
