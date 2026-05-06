package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SupersetProperOf: ImageVector
    get() {
        if (_supersetProperOf != null) return _supersetProperOf!!
        _supersetProperOf = phosphorThinIcon(
            name = "SupersetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c-.05 46.371-37.629 83.95-84 84h-72c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h72c41.974 0 76-34.026 76-76C212 86.026 177.974 52 136 52h-72c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h72c46.371 .05 83.95 37.629 84 84Z"),
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
        return _supersetProperOf!!
    }

private var _supersetProperOf: ImageVector? = null
