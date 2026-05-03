package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.KeyReturn: ImageVector
    get() {
        if (_keyReturn != null) return _keyReturn!!
        _keyReturn = phosphorThinIcon(
            name = "KeyReturn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 104.000 L 180.000 136.000 C 180.000 138.209 178.209 140.000 176.000 140.000 L 89.660 140.000 L 106.830 157.170 C 108.393 158.733 108.393 161.267 106.830 162.830 C 105.267 164.393 102.733 164.393 101.170 162.830 L 77.170 138.830 C 76.419 138.080 75.997 137.062 75.997 136.000 C 75.997 134.938 76.419 133.920 77.170 133.170 L 101.170 109.170 C 102.733 107.607 105.267 107.607 106.830 109.170 C 108.393 110.733 108.393 113.267 106.830 114.830 L 89.660 132.000 L 172.000 132.000 L 172.000 104.000 C 172.000 101.791 173.791 100.000 176.000 100.000 C 178.209 100.000 180.000 101.791 180.000 104.000 ZM 228.000 56.000 L 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 40.000 212.000 C 33.373 212.000 28.000 206.627 28.000 200.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 ZM 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 Z"),
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
        return _keyReturn!!
    }

private var _keyReturn: ImageVector? = null
