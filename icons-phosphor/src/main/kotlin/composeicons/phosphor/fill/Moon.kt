package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorFillIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.54 150.21c-6.46 21.09-19.408 39.605-37 52.91-31.503 23.71-73.705 27.567-108.983 9.959C54.278 195.472 31.99 159.428 32 120 31.93 97.437 39.266 75.473 52.88 57.48c13.305-17.592 31.82-30.54 52.91-37 2.833-.872 5.915-.107 8.011 1.989 2.096 2.096 2.861 5.178 1.989 8.011-9.396 31.081-.93 64.811 22.029 87.771 22.96 22.96 56.69 31.426 87.771 22.029 2.833-.872 5.915-.107 8.011 1.989 2.096 2.096 2.861 5.178 1.989 8.011Z"),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
