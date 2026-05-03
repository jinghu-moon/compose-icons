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
                pathData = parseSvgPathData("M 208.000 208.000 C 208.000 212.418 204.418 216.000 200.000 216.000 L 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 L 200.000 40.000 C 204.418 40.000 208.000 43.582 208.000 48.000 C 208.000 52.418 204.418 56.000 200.000 56.000 L 128.000 56.000 C 88.235 56.000 56.000 88.235 56.000 128.000 C 56.000 167.764 88.235 200.000 128.000 200.000 L 200.000 200.000 C 204.418 200.000 208.000 203.582 208.000 208.000 Z"),
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
