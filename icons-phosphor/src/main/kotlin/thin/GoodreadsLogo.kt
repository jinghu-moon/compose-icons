package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorThinIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 28.000 C 181.791 28.000 180.000 29.791 180.000 32.000 L 180.000 58.130 C 166.451 34.592 138.780 23.091 112.539 30.090 C 86.297 37.088 68.029 60.841 68.000 88.000 L 68.000 112.000 C 68.029 139.159 86.297 162.912 112.539 169.910 C 138.780 176.909 166.451 165.408 180.000 141.870 L 180.000 168.000 C 179.967 196.705 156.705 219.967 128.000 220.000 C 110.280 220.000 92.720 211.250 83.280 197.710 C 82.015 195.898 79.521 195.455 77.710 196.720 C 75.899 197.985 75.455 200.479 76.720 202.290 C 87.610 217.910 107.740 228.000 128.000 228.000 C 161.121 227.961 187.961 201.121 188.000 168.000 L 188.000 32.000 C 188.000 29.791 186.209 28.000 184.000 28.000 ZM 128.000 164.000 C 99.295 163.967 76.033 140.705 76.000 112.000 L 76.000 88.000 C 76.000 59.281 99.281 36.000 128.000 36.000 C 156.719 36.000 180.000 59.281 180.000 88.000 L 180.000 112.000 C 179.967 140.705 156.705 163.967 128.000 164.000 Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
