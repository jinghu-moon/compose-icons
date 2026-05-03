package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorThinIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 44.000 C 127.118 44.030 97.269 63.218 83.590 93.120 C 79.771 92.376 75.890 92.001 72.000 92.000 C 38.863 92.000 12.000 118.863 12.000 152.000 C 12.000 185.137 38.863 212.000 72.000 212.000 L 160.000 212.000 C 206.392 212.000 244.000 174.392 244.000 128.000 C 244.000 81.608 206.392 44.000 160.000 44.000 ZM 160.000 204.000 L 72.000 204.000 C 52.407 203.982 34.487 192.953 25.644 175.469 C 16.801 157.985 18.537 137.014 30.134 121.222 C 41.731 105.429 61.220 97.496 80.550 100.700 C 77.528 109.484 75.990 118.711 76.000 128.000 C 76.000 130.209 77.791 132.000 80.000 132.000 C 82.209 132.000 84.000 130.209 84.000 128.000 C 84.000 86.026 118.026 52.000 160.000 52.000 C 201.974 52.000 236.000 86.026 236.000 128.000 C 236.000 169.974 201.974 204.000 160.000 204.000 ZM 186.830 114.830 L 165.660 136.000 L 186.830 157.170 C 188.393 158.733 188.393 161.267 186.830 162.830 C 185.267 164.393 182.733 164.393 181.170 162.830 L 160.000 141.660 L 138.830 162.830 C 137.267 164.393 134.733 164.393 133.170 162.830 C 131.607 161.267 131.607 158.733 133.170 157.170 L 154.340 136.000 L 133.170 114.830 C 131.607 113.267 131.607 110.733 133.170 109.170 C 134.733 107.607 137.267 107.607 138.830 109.170 L 160.000 130.340 L 181.170 109.170 C 182.733 107.607 185.267 107.607 186.830 109.170 C 188.393 110.733 188.393 113.267 186.830 114.830 Z"),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
