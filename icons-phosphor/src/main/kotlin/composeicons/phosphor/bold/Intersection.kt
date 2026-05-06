package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorBoldIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 120v80c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-80C188 86.863 161.137 60 128 60 94.863 60 68 86.863 68 120v80c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-80C44 73.608 81.608 36 128 36c46.392 0 84 37.608 84 84Z"),
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
        return _intersection!!
    }

private var _intersection: ImageVector? = null
