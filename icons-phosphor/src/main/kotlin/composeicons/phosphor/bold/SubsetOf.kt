package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorBoldIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 208c0 6.627-5.373 12-12 12h-152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h152c6.627 0 12 5.373 12 12ZM200 156h-96C79.699 156 60 136.301 60 112 60 87.699 79.699 68 104 68h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-96C66.445 44 36 74.445 36 112c0 37.555 30.445 68 68 68h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null
