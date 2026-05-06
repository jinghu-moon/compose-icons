package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorFillIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 194.34c2.291 2.288 2.976 5.731 1.737 8.722-1.239 2.991-4.159 4.94-7.397 4.938h-160c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L108.69 128h-60.69c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722L122.34 34.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l80 80c2.291 2.288 2.976 5.731 1.737 8.722-1.239 2.991-4.159 4.94-7.397 4.938h-60.69Z"),
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
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
