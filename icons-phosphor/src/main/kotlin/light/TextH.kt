package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextH: ImageVector
    get() {
        if (_textH != null) return _textH!!
        _textH = phosphorLightIcon(
            name = "TextH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 56.000 L 206.000 200.000 C 206.000 203.314 203.314 206.000 200.000 206.000 C 196.686 206.000 194.000 203.314 194.000 200.000 L 194.000 134.000 L 62.000 134.000 L 62.000 200.000 C 62.000 203.314 59.314 206.000 56.000 206.000 C 52.686 206.000 50.000 203.314 50.000 200.000 L 50.000 56.000 C 50.000 52.686 52.686 50.000 56.000 50.000 C 59.314 50.000 62.000 52.686 62.000 56.000 L 62.000 122.000 L 194.000 122.000 L 194.000 56.000 C 194.000 52.686 196.686 50.000 200.000 50.000 C 203.314 50.000 206.000 52.686 206.000 56.000 Z"),
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
        return _textH!!
    }

private var _textH: ImageVector? = null
