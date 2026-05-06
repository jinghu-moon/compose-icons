package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorRegularIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 120v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80C192 84.654 163.346 56 128 56 92.654 56 64 84.654 64 120v80c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-80C48 75.817 83.817 40 128 40c44.183 0 80 35.817 80 80Z"),
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
