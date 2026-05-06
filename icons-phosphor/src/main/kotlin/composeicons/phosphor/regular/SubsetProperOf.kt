package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) return _subsetProperOf!!
        _subsetProperOf = phosphorRegularIcon(
            name = "SubsetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 208c0 4.418-3.582 8-8 8h-72C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72C88.235 56 56 88.235 56 128c0 39.764 32.235 72 72 72h72c4.418 0 8 3.582 8 8Z"),
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
        return _subsetProperOf!!
    }

private var _subsetProperOf: ImageVector? = null
