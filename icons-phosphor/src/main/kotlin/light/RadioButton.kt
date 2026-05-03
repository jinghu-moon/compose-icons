package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RadioButton: ImageVector
    get() {
        if (_radioButton != null) return _radioButton!!
        _radioButton = phosphorLightIcon(
            name = "RadioButton",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 128.000 74.000 C 98.177 74.000 74.000 98.177 74.000 128.000 C 74.000 157.823 98.177 182.000 128.000 182.000 C 157.823 182.000 182.000 157.823 182.000 128.000 C 181.967 98.190 157.810 74.033 128.000 74.000 ZM 128.000 170.000 C 104.804 170.000 86.000 151.196 86.000 128.000 C 86.000 104.804 104.804 86.000 128.000 86.000 C 151.196 86.000 170.000 104.804 170.000 128.000 C 170.000 151.196 151.196 170.000 128.000 170.000 Z"),
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
        return _radioButton!!
    }

private var _radioButton: ImageVector? = null
