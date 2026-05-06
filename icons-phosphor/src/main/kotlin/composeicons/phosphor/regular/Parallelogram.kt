package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorRegularIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.43 47.31C242.49 42.745 237.429 39.99 232 40h-143.19c-6.295-0-12.005 3.69-14.59 9.43L9.42 193.43c-2.229 4.95-1.796 10.692 1.149 15.252 2.946 4.56 8.002 7.315 13.431 7.318h143.19c6.295 0 12.005-3.69 14.59-9.43L246.58 62.57c2.232-4.952 1.799-10.698-1.15-15.26ZM167.19 200h-143.19L88.81 56h143.19Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
