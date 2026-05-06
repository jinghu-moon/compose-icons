package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorLightIcon(
            name = "SkipBackCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM162.91 82.75c-1.908-1.058-4.24-.997-6.09 .16L102 117.17v-29.17c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v80c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-29.17l54.82 34.26c1.85 1.156 4.182 1.217 6.089 .159 1.908-1.058 3.091-3.068 3.091-5.249v-80c.001-2.182-1.182-4.192-3.09-5.25ZM154 157.17 107.32 128 154 98.83Z"),
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
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
