package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) return _subsetProperOf!!
        _subsetProperOf = phosphorBoldIcon(
            name = "SubsetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 208c0 6.627-5.373 12-12 12h-72C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36h72c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-72C90.445 60 60 90.445 60 128c0 37.555 30.445 68 68 68h72c6.627 0 12 5.373 12 12Z"),
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
