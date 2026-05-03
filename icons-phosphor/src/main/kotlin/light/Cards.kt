package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cards: ImageVector
    get() {
        if (_cards != null) return _cards!!
        _cards = phosphorLightIcon(
            name = "Cards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 74.000 L 40.000 74.000 C 32.268 74.000 26.000 80.268 26.000 88.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 184.000 214.000 C 191.732 214.000 198.000 207.732 198.000 200.000 L 198.000 88.000 C 198.000 80.268 191.732 74.000 184.000 74.000 ZM 186.000 200.000 C 186.000 201.105 185.105 202.000 184.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 88.000 C 38.000 86.895 38.895 86.000 40.000 86.000 L 184.000 86.000 C 185.105 86.000 186.000 86.895 186.000 88.000 ZM 230.000 56.000 L 230.000 176.000 C 230.000 179.314 227.314 182.000 224.000 182.000 C 220.686 182.000 218.000 179.314 218.000 176.000 L 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 64.000 54.000 C 60.686 54.000 58.000 51.314 58.000 48.000 C 58.000 44.686 60.686 42.000 64.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 Z"),
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
        return _cards!!
    }

private var _cards: ImageVector? = null
