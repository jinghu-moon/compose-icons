package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextT: ImageVector
    get() {
        if (_textT != null) return _textT!!
        _textT = phosphorLightIcon(
            name = "TextT",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 56.000 L 206.000 88.000 C 206.000 91.314 203.314 94.000 200.000 94.000 C 196.686 94.000 194.000 91.314 194.000 88.000 L 194.000 62.000 L 134.000 62.000 L 134.000 194.000 L 160.000 194.000 C 163.314 194.000 166.000 196.686 166.000 200.000 C 166.000 203.314 163.314 206.000 160.000 206.000 L 96.000 206.000 C 92.686 206.000 90.000 203.314 90.000 200.000 C 90.000 196.686 92.686 194.000 96.000 194.000 L 122.000 194.000 L 122.000 62.000 L 62.000 62.000 L 62.000 88.000 C 62.000 91.314 59.314 94.000 56.000 94.000 C 52.686 94.000 50.000 91.314 50.000 88.000 L 50.000 56.000 C 50.000 52.686 52.686 50.000 56.000 50.000 L 200.000 50.000 C 203.314 50.000 206.000 52.686 206.000 56.000 Z"),
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
        return _textT!!
    }

private var _textT: ImageVector? = null
