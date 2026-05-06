package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorLightIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206 120v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80C194 83.549 164.451 54 128 54 91.549 54 62 83.549 62 120v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-80C50 76.922 84.922 42 128 42c43.078 0 78 34.922 78 78Z"),
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
