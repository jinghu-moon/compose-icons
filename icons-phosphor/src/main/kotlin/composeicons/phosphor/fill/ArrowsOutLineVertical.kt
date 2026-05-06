package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutLineVertical: ImageVector
    get() {
        if (_arrowsOutLineVertical != null) return _arrowsOutLineVertical!!
        _arrowsOutLineVertical = phosphorFillIcon(
            name = "ArrowsOutLineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88.61 51.06c-1.24-2.989-.557-6.431 1.73-8.72l32-32C123.841 8.838 125.877 7.994 128 7.994c2.123 0 4.159 .844 5.66 2.346l32 32c2.291 2.288 2.976 5.731 1.737 8.722C166.158 54.053 163.238 56.003 160 56h-24v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-24c-3.236-.001-6.152-1.95-7.39-4.94ZM216 120h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM160 200h-24v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40h-24c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l32 32c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c2.291-2.288 2.976-5.731 1.737-8.722C166.158 201.947 163.238 199.997 160 200Z"),
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
        return _arrowsOutLineVertical!!
    }

private var _arrowsOutLineVertical: ImageVector? = null
