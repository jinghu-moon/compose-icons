package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) return _numberCircleFive!!
        _numberCircleFive = phosphorLightIcon(
            name = "NumberCircleFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM117.08 86l-5 30c3.832-1.334 7.862-2.01 11.92-2 18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34-9.089 .154-17.852-3.382-24.29-9.8-2.32-2.369-2.279-6.17 .09-8.49 2.369-2.32 6.17-2.279 8.49 .09 4.181 4.108 9.85 6.345 15.71 6.2 12.15 0 22-9.85 22-22 0-12.15-9.85-22-22-22-5.86-.145-11.529 2.092-15.71 6.2-1.834 1.881-4.678 2.35-7.019 1.158C98.93 132.166 97.637 129.589 98.08 127l8-48c.488-2.888 2.991-5.002 5.92-5h40c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6Z"),
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
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
