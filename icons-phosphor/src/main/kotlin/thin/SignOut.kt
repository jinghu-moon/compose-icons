package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorThinIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 216.000 C 116.000 218.209 114.209 220.000 112.000 220.000 L 48.000 220.000 C 45.791 220.000 44.000 218.209 44.000 216.000 L 44.000 40.000 C 44.000 37.791 45.791 36.000 48.000 36.000 L 112.000 36.000 C 114.209 36.000 116.000 37.791 116.000 40.000 C 116.000 42.209 114.209 44.000 112.000 44.000 L 52.000 44.000 L 52.000 212.000 L 112.000 212.000 C 114.209 212.000 116.000 213.791 116.000 216.000 ZM 226.830 125.170 L 186.830 85.170 C 185.267 83.607 182.733 83.607 181.170 85.170 C 179.607 86.733 179.607 89.267 181.170 90.830 L 214.340 124.000 L 112.000 124.000 C 109.791 124.000 108.000 125.791 108.000 128.000 C 108.000 130.209 109.791 132.000 112.000 132.000 L 214.340 132.000 L 181.170 165.170 C 179.607 166.733 179.607 169.267 181.170 170.830 C 182.733 172.393 185.267 172.393 186.830 170.830 L 226.830 130.830 C 227.581 130.080 228.003 129.062 228.003 128.000 C 228.003 126.938 227.581 125.920 226.830 125.170 Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null
