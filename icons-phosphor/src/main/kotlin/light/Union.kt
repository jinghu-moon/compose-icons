package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorLightIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 64.000 L 206.000 144.000 C 206.000 187.078 171.078 222.000 128.000 222.000 C 84.922 222.000 50.000 187.078 50.000 144.000 L 50.000 64.000 C 50.000 60.686 52.686 58.000 56.000 58.000 C 59.314 58.000 62.000 60.686 62.000 64.000 L 62.000 144.000 C 62.000 180.451 91.549 210.000 128.000 210.000 C 164.451 210.000 194.000 180.451 194.000 144.000 L 194.000 64.000 C 194.000 60.686 196.686 58.000 200.000 58.000 C 203.314 58.000 206.000 60.686 206.000 64.000 Z"),
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
        return _union!!
    }

private var _union: ImageVector? = null
