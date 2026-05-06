package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorRegularIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 87 47.81 49.64 84.66 32.73c4.015-1.845 8.765-.085 10.61 3.93 1.845 4.015 .085 8.765-3.93 10.61C60.15 61.59 40 93.27 40 128c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 93.27 195.85 61.59 164.66 47.27c-4.015-1.845-5.775-6.595-3.93-10.61 1.845-4.015 6.595-5.775 10.61-3.93C208.19 49.64 232 87 232 128Z"),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
