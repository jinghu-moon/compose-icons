package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorLightIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 26.000 L 168.000 26.000 C 164.686 26.000 162.000 28.686 162.000 32.000 C 162.000 35.314 164.686 38.000 168.000 38.000 L 193.520 38.000 L 163.520 67.940 C 144.129 48.724 114.451 44.453 90.429 57.420 C 66.406 70.388 53.691 97.542 59.115 124.297 C 64.539 151.052 86.824 171.111 114.000 173.700 L 114.000 194.000 L 88.000 194.000 C 84.686 194.000 82.000 196.686 82.000 200.000 C 82.000 203.314 84.686 206.000 88.000 206.000 L 114.000 206.000 L 114.000 232.000 C 114.000 235.314 116.686 238.000 120.000 238.000 C 123.314 238.000 126.000 235.314 126.000 232.000 L 126.000 206.000 L 152.000 206.000 C 155.314 206.000 158.000 203.314 158.000 200.000 C 158.000 196.686 155.314 194.000 152.000 194.000 L 126.000 194.000 L 126.000 173.700 C 147.767 171.571 166.802 158.131 176.092 138.331 C 185.383 118.532 183.554 95.302 171.280 77.200 L 202.000 46.480 L 202.000 72.000 C 202.000 75.314 204.686 78.000 208.000 78.000 C 211.314 78.000 214.000 75.314 214.000 72.000 L 214.000 32.000 C 214.000 28.686 211.314 26.000 208.000 26.000 ZM 120.000 162.000 C 92.386 162.000 70.000 139.614 70.000 112.000 C 70.000 84.386 92.386 62.000 120.000 62.000 C 147.614 62.000 170.000 84.386 170.000 112.000 C 169.967 139.601 147.601 161.967 120.000 162.000 Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
