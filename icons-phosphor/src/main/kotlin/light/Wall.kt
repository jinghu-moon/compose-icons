package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorLightIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 28.686 50.000 26.000 52.686 26.000 56.000 L 26.000 200.000 C 26.000 203.314 28.686 206.000 32.000 206.000 L 224.000 206.000 C 227.314 206.000 230.000 203.314 230.000 200.000 L 230.000 56.000 C 230.000 52.686 227.314 50.000 224.000 50.000 ZM 86.000 146.000 L 86.000 110.000 L 170.000 110.000 L 170.000 146.000 ZM 38.000 146.000 L 38.000 110.000 L 74.000 110.000 L 74.000 146.000 ZM 182.000 110.000 L 218.000 110.000 L 218.000 146.000 L 182.000 146.000 ZM 218.000 98.000 L 134.000 98.000 L 134.000 62.000 L 218.000 62.000 ZM 122.000 62.000 L 122.000 98.000 L 38.000 98.000 L 38.000 62.000 ZM 38.000 158.000 L 122.000 158.000 L 122.000 194.000 L 38.000 194.000 ZM 134.000 194.000 L 134.000 158.000 L 218.000 158.000 L 218.000 194.000 Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
