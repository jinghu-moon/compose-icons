package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Layout: ImageVector
    get() {
        if (_layout != null) return _layout!!
        _layout = phosphorLightIcon(
            name = "Layout",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 216.000 214.000 C 223.732 214.000 230.000 207.732 230.000 200.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 L 218.000 98.000 L 38.000 98.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 ZM 38.000 200.000 L 38.000 110.000 L 98.000 110.000 L 98.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 ZM 216.000 202.000 L 110.000 202.000 L 110.000 110.000 L 218.000 110.000 L 218.000 200.000 C 218.000 201.105 217.105 202.000 216.000 202.000 Z"),
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
        return _layout!!
    }

private var _layout: ImageVector? = null
