package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorLightIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 26.000 L 72.000 26.000 C 59.850 26.000 50.000 35.850 50.000 48.000 L 50.000 216.000 C 50.000 223.732 56.268 230.000 64.000 230.000 L 176.000 230.000 C 183.732 230.000 190.000 223.732 190.000 216.000 L 190.000 48.000 C 190.000 42.477 194.477 38.000 200.000 38.000 C 205.523 38.000 210.000 42.477 210.000 48.000 L 210.000 152.000 C 210.000 155.314 212.686 158.000 216.000 158.000 C 219.314 158.000 222.000 155.314 222.000 152.000 L 222.000 48.000 C 222.000 35.850 212.150 26.000 200.000 26.000 ZM 72.000 38.000 L 180.410 38.000 C 178.822 41.094 177.996 44.522 178.000 48.000 L 178.000 186.000 L 62.000 186.000 L 62.000 48.000 C 62.000 42.477 66.477 38.000 72.000 38.000 ZM 176.000 218.000 L 64.000 218.000 C 62.895 218.000 62.000 217.105 62.000 216.000 L 62.000 198.000 L 178.000 198.000 L 178.000 216.000 C 178.000 217.105 177.105 218.000 176.000 218.000 Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
