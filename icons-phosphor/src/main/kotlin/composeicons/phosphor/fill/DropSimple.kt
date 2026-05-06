package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorFillIcon(
            name = "DropSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 47.75C161.648 33.484 147.745 20.639 132.55 9.45c-2.756-1.93-6.424-1.93-9.18 0C108.203 20.643 94.327 33.489 82 47.75 54.51 79.32 40 112.6 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 112.6 201.49 79.32 174 47.75Z"),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
