package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ProhibitInset: ImageVector
    get() {
        if (_prohibitInset != null) return _prohibitInset!!
        _prohibitInset = phosphorLightIcon(
            name = "ProhibitInset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.240 155.760 C 165.845 157.256 166.506 159.508 165.963 161.634 C 165.420 163.760 163.760 165.420 161.634 165.963 C 159.508 166.506 157.256 165.845 155.760 164.240 L 91.760 100.240 C 89.557 97.876 89.622 94.192 91.907 91.907 C 94.192 89.622 97.876 89.557 100.240 91.760 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 218.000 78.294 177.706 38.000 128.000 38.000 C 78.294 38.000 38.000 78.294 38.000 128.000 C 38.000 177.706 78.294 218.000 128.000 218.000 C 177.683 217.945 217.945 177.683 218.000 128.000 Z"),
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
        return _prohibitInset!!
    }

private var _prohibitInset: ImageVector? = null
