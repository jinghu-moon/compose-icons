package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorThinIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 48.000 L 92.000 16.000 C 92.000 13.791 93.791 12.000 96.000 12.000 C 98.209 12.000 100.000 13.791 100.000 16.000 L 100.000 48.000 C 100.000 50.209 98.209 52.000 96.000 52.000 C 93.791 52.000 92.000 50.209 92.000 48.000 ZM 128.000 52.000 C 130.209 52.000 132.000 50.209 132.000 48.000 L 132.000 16.000 C 132.000 13.791 130.209 12.000 128.000 12.000 C 125.791 12.000 124.000 13.791 124.000 16.000 L 124.000 48.000 C 124.000 50.209 125.791 52.000 128.000 52.000 ZM 160.000 52.000 C 162.209 52.000 164.000 50.209 164.000 48.000 L 164.000 16.000 C 164.000 13.791 162.209 12.000 160.000 12.000 C 157.791 12.000 156.000 13.791 156.000 16.000 L 156.000 48.000 C 156.000 50.209 157.791 52.000 160.000 52.000 ZM 250.400 99.200 L 220.000 122.000 L 220.000 184.000 C 220.000 199.464 207.464 212.000 192.000 212.000 L 64.000 212.000 C 48.536 212.000 36.000 199.464 36.000 184.000 L 36.000 122.000 L 5.600 99.200 C 3.833 97.875 3.475 95.367 4.800 93.600 C 6.125 91.833 8.633 91.475 10.400 92.800 L 36.000 112.000 L 36.000 80.000 C 36.000 77.791 37.791 76.000 40.000 76.000 L 216.000 76.000 C 218.209 76.000 220.000 77.791 220.000 80.000 L 220.000 112.000 L 245.600 92.800 C 247.367 91.475 249.875 91.833 251.200 93.600 C 252.525 95.367 252.167 97.875 250.400 99.200 ZM 212.000 84.000 L 44.000 84.000 L 44.000 184.000 C 44.000 195.046 52.954 204.000 64.000 204.000 L 192.000 204.000 C 203.046 204.000 212.000 195.046 212.000 184.000 Z"),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
