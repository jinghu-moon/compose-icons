package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorThinIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 164.000 L 164.000 164.000 L 164.000 48.000 C 163.999 46.303 162.926 44.791 161.325 44.229 C 159.724 43.667 157.942 44.176 156.880 45.500 L 60.880 165.500 C 59.919 166.700 59.731 168.345 60.396 169.731 C 61.062 171.117 62.463 171.999 64.000 172.000 L 156.000 172.000 L 156.000 208.000 C 156.000 210.209 157.791 212.000 160.000 212.000 C 162.209 212.000 164.000 210.209 164.000 208.000 L 164.000 172.000 L 184.000 172.000 C 186.209 172.000 188.000 170.209 188.000 168.000 C 188.000 165.791 186.209 164.000 184.000 164.000 ZM 156.000 164.000 L 72.320 164.000 L 156.000 59.400 Z"),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
