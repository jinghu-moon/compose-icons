package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorFillIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 136.000 L 199.540 136.000 C 195.758 169.401 169.401 195.758 136.000 199.540 L 136.000 176.000 C 136.000 171.582 132.418 168.000 128.000 168.000 C 123.582 168.000 120.000 171.582 120.000 176.000 L 120.000 199.540 C 86.599 195.758 60.242 169.401 56.460 136.000 L 80.000 136.000 C 84.418 136.000 88.000 132.418 88.000 128.000 C 88.000 123.582 84.418 120.000 80.000 120.000 L 56.460 120.000 C 60.242 86.599 86.599 60.242 120.000 56.460 L 120.000 80.000 C 120.000 84.418 123.582 88.000 128.000 88.000 C 132.418 88.000 136.000 84.418 136.000 80.000 L 136.000 56.460 C 169.401 60.242 195.758 86.599 199.540 120.000 L 176.000 120.000 C 171.582 120.000 168.000 123.582 168.000 128.000 C 168.000 132.418 171.582 136.000 176.000 136.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 C 40.000 176.601 79.399 216.000 128.000 216.000 C 176.578 215.945 215.945 176.578 216.000 128.000 Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
