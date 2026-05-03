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
                pathData = parseSvgPathData("M 212.000 208.000 C 212.000 214.627 206.627 220.000 200.000 220.000 L 48.000 220.000 C 41.373 220.000 36.000 214.627 36.000 208.000 C 36.000 201.373 41.373 196.000 48.000 196.000 L 200.000 196.000 C 206.627 196.000 212.000 201.373 212.000 208.000 ZM 200.000 156.000 L 104.000 156.000 C 79.699 156.000 60.000 136.301 60.000 112.000 C 60.000 87.699 79.699 68.000 104.000 68.000 L 200.000 68.000 C 206.627 68.000 212.000 62.627 212.000 56.000 C 212.000 49.373 206.627 44.000 200.000 44.000 L 104.000 44.000 C 66.445 44.000 36.000 74.445 36.000 112.000 C 36.000 149.555 66.445 180.000 104.000 180.000 L 200.000 180.000 C 206.627 180.000 212.000 174.627 212.000 168.000 C 212.000 161.373 206.627 156.000 200.000 156.000 Z"),
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
