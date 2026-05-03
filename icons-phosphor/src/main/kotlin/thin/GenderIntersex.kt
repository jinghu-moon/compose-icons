package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorThinIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 168.000 28.000 C 165.791 28.000 164.000 29.791 164.000 32.000 C 164.000 34.209 165.791 36.000 168.000 36.000 L 198.340 36.000 L 163.550 70.790 C 145.095 51.241 115.888 46.354 92.074 58.831 C 68.261 71.308 55.654 98.103 61.221 124.405 C 66.789 150.706 89.173 170.093 116.000 171.850 L 116.000 196.000 L 88.000 196.000 C 85.791 196.000 84.000 197.791 84.000 200.000 C 84.000 202.209 85.791 204.000 88.000 204.000 L 116.000 204.000 L 116.000 232.000 C 116.000 234.209 117.791 236.000 120.000 236.000 C 122.209 236.000 124.000 234.209 124.000 232.000 L 124.000 204.000 L 152.000 204.000 C 154.209 204.000 156.000 202.209 156.000 200.000 C 156.000 197.791 154.209 196.000 152.000 196.000 L 124.000 196.000 L 124.000 171.850 C 145.740 170.414 164.989 157.294 174.274 137.584 C 183.559 117.873 181.417 94.677 168.680 77.000 L 204.000 41.660 L 204.000 72.000 C 204.000 74.209 205.791 76.000 208.000 76.000 C 210.209 76.000 212.000 74.209 212.000 72.000 L 212.000 32.000 C 212.000 29.791 210.209 28.000 208.000 28.000 ZM 120.000 164.000 C 91.281 164.000 68.000 140.719 68.000 112.000 C 68.000 83.281 91.281 60.000 120.000 60.000 C 148.719 60.000 172.000 83.281 172.000 112.000 C 171.967 140.705 148.705 163.967 120.000 164.000 Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
