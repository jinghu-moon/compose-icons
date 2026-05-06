package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) return _subsetProperOf!!
        _subsetProperOf = phosphorThinIcon(
            name = "SubsetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 208c0 2.209-1.791 4-4 4h-72C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44h72c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-72C86.026 52 52 86.026 52 128c0 41.974 34.026 76 76 76h72c2.209 0 4 1.791 4 4Z"),
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
