package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = phosphorRegularIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 136.000 136.000 L 136.000 216.000 C 136.000 220.418 132.418 224.000 128.000 224.000 C 123.582 224.000 120.000 220.418 120.000 216.000 L 120.000 136.000 L 40.000 136.000 C 35.582 136.000 32.000 132.418 32.000 128.000 C 32.000 123.582 35.582 120.000 40.000 120.000 L 120.000 120.000 L 120.000 40.000 C 120.000 35.582 123.582 32.000 128.000 32.000 C 132.418 32.000 136.000 35.582 136.000 40.000 L 136.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 Z"),
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
        return _plus!!
    }

private var _plus: ImageVector? = null
