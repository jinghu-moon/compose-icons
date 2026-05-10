package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorFillIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 155.91c-.04-1.784-.378-3.548-1-5.22L219.94 98.48C216.884 90.24 207.753 86.007 199.49 89l-67.81 24.57 12.08-69C145.318 35.875 139.535 27.562 130.84 26L76.17 16.25c-4.174-.734-8.469 .225-11.935 2.664-3.466 2.439-5.818 6.159-6.535 10.336l-25 143.12c-2.314 12.774 1.156 25.916 9.473 35.884 8.317 9.968 20.626 15.735 33.607 15.746h148.22c8.837 0 16-7.163 16-16ZM76 196c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM118.72 187.62l9.78-55.92L204.92 104 224 156.11 116.78 195c.855-2.4 1.504-4.869 1.94-7.38ZM224 208h-96.26L224 173.11Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
